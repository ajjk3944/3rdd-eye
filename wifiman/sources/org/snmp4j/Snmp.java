package org.snmp4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimerTask;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.PduHandleCallback;
import org.snmp4j.mp.RequestStatistics;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.security.SecurityModel;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.USM;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.ConnectionOrientedTransportMapping;
import org.snmp4j.transport.TransportMappings;
import org.snmp4j.util.CommonTimer;

/* loaded from: classes2.dex */
public class Snmp implements Session, CommandResponder {
    private static final int DEFAULT_MAX_REQUEST_STATUS = 2;
    private static final int ENGINE_ID_DISCOVERY_MAX_REQUEST_STATUS = 0;
    private static final LogAdapter logger = LogFactory.getLogger(Snmp.class);
    private final Map<Object, PduHandle> asyncRequests;
    private List<CommandResponder> commandResponderListeners;
    private Map<Address, OctetString> contextEngineIDs;
    private boolean contextEngineIdDiscoveryDisabled;
    private CounterSupport counterSupport;
    private MessageDispatcher messageDispatcher;
    private NotificationDispatcher notificationDispatcher;
    private final Map<PduHandle, PendingRequest> pendingRequests;
    private ReportHandler reportHandler;
    private TimeoutModel timeoutModel;
    private CommonTimer timer;

    class AsyncPendingRequest extends PendingRequest {
        public AsyncPendingRequest(ResponseListener responseListener, Object obj, PDU pdu, Target target, TransportMapping transportMapping) {
            super(responseListener, obj, pdu, target, transportMapping);
        }

        @Override // org.snmp4j.Snmp.PendingRequest
        protected void registerRequest(PduHandle pduHandle) {
            Snmp.this.asyncRequests.put(new AsyncRequestKey(this.pdu, this.listener), pduHandle);
        }
    }

    static class AsyncRequestKey {
        private ResponseListener listener;
        private PDU request;

        public AsyncRequestKey(PDU pdu, ResponseListener responseListener) {
            this.request = pdu;
            this.listener = responseListener;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AsyncRequestKey)) {
                return false;
            }
            AsyncRequestKey asyncRequestKey = (AsyncRequestKey) obj;
            return this.request.equals(asyncRequestKey.request) && this.listener.equals(asyncRequestKey.listener);
        }

        public int hashCode() {
            return this.request.hashCode();
        }
    }

    class NotificationDispatcher implements CommandResponder {
        private Hashtable<Address, TransportMapping> notificationListeners = new Hashtable<>(10);
        private Hashtable<TransportMapping, CommandResponder> notificationTransports = new Hashtable<>(10);

        protected NotificationDispatcher() {
        }

        public synchronized void addNotificationListener(Address address, TransportMapping transportMapping, CommandResponder commandResponder) {
            this.notificationListeners.put(address, transportMapping);
            this.notificationTransports.put(transportMapping, commandResponder);
        }

        public synchronized void closeAll() {
            try {
                this.notificationTransports.clear();
                Iterator<TransportMapping> it = this.notificationListeners.values().iterator();
                while (it.hasNext()) {
                    Snmp.this.closeTransportMapping(it.next());
                }
                this.notificationListeners.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public TransportMapping getTransportMapping(Address address) {
            return this.notificationListeners.get(address);
        }

        @Override // org.snmp4j.CommandResponder
        public void processPdu(CommandResponderEvent commandResponderEvent) {
            CommandResponder commandResponder;
            synchronized (this) {
                commandResponder = this.notificationTransports.get(commandResponderEvent.getTransportMapping());
            }
            if (commandResponderEvent.getPDU() != null && commandResponderEvent.getPDU().getType() == -90) {
                try {
                    sendInformResponse(commandResponderEvent);
                } catch (MessageException e10) {
                    if (Snmp.logger.isWarnEnabled()) {
                        Snmp.logger.warn("Failed to send response on INFORM PDU event (" + commandResponderEvent + "): " + e10.getMessage());
                    }
                }
            }
            if (commandResponder != null) {
                commandResponder.processPdu(commandResponderEvent);
            }
        }

        public synchronized boolean removeNotificationListener(Address address) {
            TransportMapping transportMappingRemove = this.notificationListeners.remove(address);
            if (transportMappingRemove == null) {
                return false;
            }
            transportMappingRemove.removeTransportListener(Snmp.this.messageDispatcher);
            this.notificationTransports.remove(transportMappingRemove);
            Snmp.this.closeTransportMapping(transportMappingRemove);
            return true;
        }

        protected void sendInformResponse(CommandResponderEvent commandResponderEvent) throws MessageException {
            PDU pdu = (PDU) commandResponderEvent.getPDU().clone();
            pdu.setType(-94);
            pdu.setErrorStatus(0);
            pdu.setErrorIndex(0);
            Snmp.this.messageDispatcher.returnResponsePdu(commandResponderEvent.getMessageProcessingModel(), commandResponderEvent.getSecurityModel(), commandResponderEvent.getSecurityName(), commandResponderEvent.getSecurityLevel(), pdu, commandResponderEvent.getMaxSizeResponsePDU(), commandResponderEvent.getStateReference(), new StatusInformation());
        }
    }

    class PendingRequest extends TimerTask implements PduHandleCallback<PDU>, Cloneable {
        private volatile boolean cancelled;
        private volatile boolean finished;
        private PduHandle key;
        protected ResponseListener listener;
        private int maxRequestStatus;
        private PDU nextPDU;
        protected PDU pdu;
        private volatile boolean pendingRetry;
        private int requestStatus;
        private volatile boolean responseReceived;
        protected int retryCount;
        protected Target target;
        protected TransportMapping transport;
        protected Object userObject;
        private CounterEvent waitTime;
        private CounterEvent waitTimeTarget;

        public PendingRequest(ResponseListener responseListener, Object obj, PDU pdu, Target target, TransportMapping transportMapping) {
            this.requestStatus = 0;
            this.maxRequestStatus = 2;
            this.finished = false;
            this.responseReceived = false;
            this.pendingRetry = false;
            this.cancelled = false;
            this.userObject = obj;
            this.listener = responseListener;
            this.retryCount = target.getRetries();
            this.pdu = pdu;
            this.target = target.duplicate();
            this.transport = transportMapping;
            if (SNMP4JSettings.getSnmp4jStatistics() != SNMP4JSettings.Snmp4jStatistics.none) {
                this.waitTime = new CounterEvent(this, SnmpConstants.snmp4jStatsRequestWaitTime, System.nanoTime());
                if (SNMP4JSettings.getSnmp4jStatistics() == SNMP4JSettings.Snmp4jStatistics.extended) {
                    this.waitTimeTarget = new CounterEvent(Snmp.this, SnmpConstants.snmp4jStatsReqTableWaitTime, target.getAddress(), System.nanoTime());
                }
            }
            if (Snmp.this.isEmptyContextEngineID(pdu)) {
                OctetString octetString = (OctetString) Snmp.this.contextEngineIDs.get(target.getAddress());
                if (octetString != null) {
                    ((ScopedPDU) pdu).setContextEngineID(octetString);
                } else {
                    if (Snmp.this.contextEngineIdDiscoveryDisabled) {
                        return;
                    }
                    discoverContextEngineID();
                }
            }
        }

        static /* synthetic */ int access$708(PendingRequest pendingRequest) {
            int i10 = pendingRequest.requestStatus;
            pendingRequest.requestStatus = i10 + 1;
            return i10;
        }

        private void discoverContextEngineID() {
            SecurityModel securityModel;
            MessageProcessingModel messageProcessingModel = Snmp.this.messageDispatcher.getMessageProcessingModel(this.target.getVersion());
            if (messageProcessingModel instanceof MPv3) {
                Target target = this.target;
                if (!(target instanceof SecureTarget) || (securityModel = ((MPv3) messageProcessingModel).getSecurityModel(((SecureTarget) target).getSecurityModel())) == null || securityModel.supportsEngineIdDiscovery()) {
                    return;
                }
                if (Snmp.logger.isInfoEnabled()) {
                    Snmp.logger.info("Performing RFC 5343 contextEngineID discovery on " + this.target);
                }
                ScopedPDU scopedPDU = new ScopedPDU();
                scopedPDU.setContextEngineID(MPv3.LOCAL_ENGINE_ID);
                scopedPDU.add(new VariableBinding(SnmpConstants.snmpEngineID));
                insertFirstPDU(scopedPDU);
            }
        }

        @Override // java.util.TimerTask
        public boolean cancel() {
            CounterSupport counterSupport;
            this.cancelled = true;
            boolean zCancel = super.cancel();
            Target target = this.target;
            if (this.waitTime != null && !isResponseReceived() && (counterSupport = Snmp.this.getCounterSupport()) != null) {
                counterSupport.fireIncrementCounter(new CounterEvent(Snmp.this, SnmpConstants.snmp4jStatsRequestTimeouts));
                if (SNMP4JSettings.getSnmp4jStatistics() == SNMP4JSettings.Snmp4jStatistics.extended && target != null) {
                    counterSupport.fireIncrementCounter(new CounterEvent(Snmp.this, SnmpConstants.snmp4jStatsReqTableTimeouts, target.getAddress(), 1L));
                }
            }
            if (!this.pendingRetry) {
                this.key = null;
                this.pdu = null;
                this.target = null;
                this.transport = null;
                this.listener = null;
                this.userObject = null;
            }
            return zCancel;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public int getMaxRequestStatus() {
            return this.maxRequestStatus;
        }

        public PDU getNextPDU() {
            return this.nextPDU;
        }

        public void insertFirstPDU(PDU pdu) {
            this.nextPDU = this.pdu;
            this.pdu = pdu;
        }

        public boolean isResponseReceived() {
            return this.responseReceived;
        }

        protected void registerRequest(PduHandle pduHandle) {
        }

        public void responseReceived() {
            CounterSupport counterSupport;
            this.responseReceived = true;
            if (this.waitTime == null || (counterSupport = Snmp.this.getCounterSupport()) == null) {
                return;
            }
            long jNanoTime = (System.nanoTime() - this.waitTime.getIncrement()) / 1000000;
            this.waitTime.setIncrement(jNanoTime);
            counterSupport.fireIncrementCounter(this.waitTime);
            CounterEvent counterEvent = this.waitTimeTarget;
            if (counterEvent != null) {
                counterEvent.setIncrement(jNanoTime);
                counterSupport.fireIncrementCounter(this.waitTimeTarget);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public synchronized void run() {
            CounterSupport counterSupport;
            PduHandle pduHandle = this.key;
            PDU pdu = this.pdu;
            Target target = this.target;
            TransportMapping transportMapping = this.transport;
            ResponseListener responseListener = this.listener;
            Object obj = this.userObject;
            if (pduHandle == null || pdu == null || target == null || responseListener == null) {
                if (Snmp.logger.isDebugEnabled()) {
                    Snmp.logger.debug("PendingRequest canceled key=" + pduHandle + ", pdu=" + pdu + ", target=" + target + ", transport=" + transportMapping + ", listener=" + responseListener);
                }
                return;
            }
            try {
                synchronized (Snmp.this.pendingRequests) {
                    try {
                        this.pendingRetry = (this.finished || this.retryCount <= 0 || this.responseReceived) ? false : true;
                    } finally {
                    }
                }
                if (this.pendingRetry) {
                    try {
                        Snmp.this.sendMessage(pdu, target, transportMapping, Snmp.this.new PendingRequest(this));
                        this.pendingRetry = false;
                        if (this.waitTime != null && (counterSupport = Snmp.this.getCounterSupport()) != null) {
                            counterSupport.fireIncrementCounter(new CounterEvent(Snmp.this, SnmpConstants.snmp4jStatsRequestRetries));
                            if (SNMP4JSettings.getSnmp4jStatistics() == SNMP4JSettings.Snmp4jStatistics.extended) {
                                counterSupport.fireIncrementCounter(new CounterEvent(Snmp.this, SnmpConstants.snmp4jStatsReqTableRetries, target.getAddress(), 1L));
                            }
                        }
                    } catch (IOException e10) {
                        ResponseListener responseListener2 = this.listener;
                        this.finished = true;
                        Snmp.logger.error("Failed to send SNMP message to " + target + ": " + e10.getMessage());
                        Snmp.this.messageDispatcher.releaseStateReference(target.getVersion(), pduHandle);
                        if (responseListener2 != null) {
                            this.listener.onResponse(new ResponseEvent(Snmp.this, null, pdu, null, obj, e10));
                        }
                    }
                } else if (this.finished) {
                    Snmp.this.pendingRequests.remove(pduHandle);
                } else {
                    this.finished = true;
                    Snmp.this.pendingRequests.remove(pduHandle);
                    if (!this.cancelled) {
                        if (Snmp.logger.isDebugEnabled()) {
                            Snmp.logger.debug("Request timed out: " + pduHandle.getTransactionID());
                        }
                        Snmp.this.messageDispatcher.releaseStateReference(target.getVersion(), pduHandle);
                        responseListener.onResponse(new ResponseEvent(Snmp.this, null, pdu, null, obj));
                    }
                }
            } catch (Error e11) {
                Snmp.logger.fatal("Failed to process pending request " + pduHandle + " because " + e11.getMessage(), e11);
                throw e11;
            } catch (RuntimeException e12) {
                Snmp.logger.error("Failed to process pending request " + pduHandle + " because " + e12.getMessage(), e12);
                throw e12;
            }
        }

        public boolean setFinished() {
            boolean z10 = this.finished;
            this.finished = true;
            return z10;
        }

        public void setMaxRequestStatus(int i10) {
            this.maxRequestStatus = i10;
        }

        public void setNextPDU(PDU pdu) {
            this.nextPDU = pdu;
        }

        public boolean useNextPDU() {
            PDU pdu = this.nextPDU;
            if (pdu == null) {
                return false;
            }
            this.pdu = pdu;
            this.nextPDU = null;
            return true;
        }

        @Override // org.snmp4j.mp.PduHandleCallback
        public synchronized void pduHandleAssigned(PduHandle pduHandle, PDU pdu) {
            try {
                if (this.key == null) {
                    this.key = pduHandle;
                    Target target = this.target;
                    if (target != null && !this.cancelled) {
                        Snmp.this.pendingRequests.put(pduHandle, this);
                        registerRequest(pduHandle);
                        if (Snmp.logger.isDebugEnabled()) {
                            LogAdapter logAdapter = Snmp.logger;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Running pending ");
                            sb2.append(this.listener instanceof SyncResponseListener ? "sync" : "async");
                            sb2.append(" request with handle ");
                            sb2.append(pduHandle);
                            sb2.append(" and retry count left ");
                            sb2.append(this.retryCount);
                            logAdapter.debug(sb2.toString());
                        }
                        long retryTimeout = Snmp.this.timeoutModel.getRetryTimeout(target.getRetries() - this.retryCount, target.getRetries(), target.getTimeout());
                        if (this.finished || this.responseReceived || this.cancelled) {
                            Snmp.this.pendingRequests.remove(pduHandle);
                        } else {
                            try {
                                CommonTimer commonTimer = Snmp.this.timer;
                                if (commonTimer != null) {
                                    commonTimer.schedule(this, retryTimeout);
                                }
                            } catch (IllegalStateException unused) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private PendingRequest(PendingRequest pendingRequest) {
            this.requestStatus = 0;
            this.maxRequestStatus = 2;
            this.finished = false;
            this.responseReceived = false;
            this.pendingRetry = false;
            this.cancelled = false;
            this.userObject = pendingRequest.userObject;
            this.listener = pendingRequest.listener;
            this.retryCount = pendingRequest.retryCount - 1;
            this.pdu = pendingRequest.pdu;
            this.target = pendingRequest.target;
            this.requestStatus = pendingRequest.requestStatus;
            this.responseReceived = pendingRequest.responseReceived;
            this.transport = pendingRequest.transport;
            this.nextPDU = pendingRequest.nextPDU;
            this.waitTime = pendingRequest.waitTime;
        }
    }

    public interface ReportHandler {
        void processReport(PduHandle pduHandle, CommandResponderEvent commandResponderEvent);
    }

    class ReportProcessor implements ReportHandler {
        ReportProcessor() {
        }

        protected VariableBinding checkReport(CommandResponderEvent commandResponderEvent, PDU pdu, PendingRequest pendingRequest) {
            if (pendingRequest == null) {
                Snmp.logger.warn("Unmatched report PDU received from " + commandResponderEvent.getPeerAddress());
                return null;
            }
            if (pdu.size() == 0) {
                Snmp.logger.error("Illegal report PDU received from " + commandResponderEvent.getPeerAddress() + " missing report variable binding");
                return null;
            }
            VariableBinding variableBinding = pdu.get(0);
            if (variableBinding == null) {
                Snmp.logger.error("Received illegal REPORT PDU from " + commandResponderEvent.getPeerAddress());
                return null;
            }
            if (commandResponderEvent.getSecurityModel() != pendingRequest.target.getSecurityModel()) {
                Snmp.logger.warn("RFC3412 §7.2.11.b: Received REPORT PDU with different security model than cached one: " + commandResponderEvent);
                return null;
            }
            if (commandResponderEvent.getSecurityLevel() != 1 || SNMP4JSettings.getReportSecurityLevelStrategy() == SNMP4JSettings.ReportSecurityLevelStrategy.noAuthNoPrivIfNeeded || commandResponderEvent.getSecurityLevel() == pendingRequest.target.getSecurityLevel() || SnmpConstants.usmStatsUnknownUserNames.equals(variableBinding.getOid()) || SnmpConstants.usmStatsUnknownEngineIDs.equals(variableBinding.getOid())) {
                return variableBinding;
            }
            Snmp.logger.warn("RFC3412 §7.2.11.b:Received REPORT PDU with security level noAuthNoPriv from '" + commandResponderEvent + "'. Ignoring it, because report strategy is set to " + SNMP4JSettings.getReportSecurityLevelStrategy());
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (org.snmp4j.mp.SnmpConstants.usmStatsNotInTimeWindows.equals(r1) == false) goto L27;
         */
        @Override // org.snmp4j.Snmp.ReportHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void processReport(org.snmp4j.mp.PduHandle r8, org.snmp4j.CommandResponderEvent r9) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.Snmp.ReportProcessor.processReport(org.snmp4j.mp.PduHandle, org.snmp4j.CommandResponderEvent):void");
        }
    }

    static class SyncResponseListener implements ResponseListener {
        private ResponseEvent response = null;

        SyncResponseListener() {
        }

        public ResponseEvent getResponse() {
            return this.response;
        }

        @Override // org.snmp4j.event.ResponseListener
        public synchronized void onResponse(ResponseEvent responseEvent) {
            this.response = responseEvent;
            notify();
        }
    }

    public Snmp() {
        this.pendingRequests = new Hashtable(50);
        this.asyncRequests = new Hashtable(50);
        this.timeoutModel = new DefaultTimeoutModel();
        this.notificationDispatcher = null;
        this.reportHandler = new ReportProcessor();
        this.contextEngineIDs = Collections.synchronizedMap(new HashMap());
        this.messageDispatcher = new MessageDispatcherImpl();
        if (SNMP4JSettings.getSnmp4jStatistics() != SNMP4JSettings.Snmp4jStatistics.none) {
            this.counterSupport = CounterSupport.getInstance();
        }
    }

    private synchronized void createPendingTimer() {
        if (this.timer == null) {
            this.timer = SNMP4JSettings.getTimerFactory().createTimer();
        }
    }

    private MPv3 getMPv3() {
        MPv3 mPv3 = (MPv3) getMessageProcessingModel(3);
        if (mPv3 != null) {
            return mPv3;
        }
        throw new NoSuchElementException("MPv3 not available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEmptyContextEngineID(PDU pdu) {
        if (!(pdu instanceof ScopedPDU)) {
            return false;
        }
        ScopedPDU scopedPDU = (ScopedPDU) pdu;
        return scopedPDU.getContextEngineID() == null || scopedPDU.getContextEngineID().length() == 0;
    }

    public synchronized void addCommandResponder(CommandResponder commandResponder) {
        try {
            ArrayList arrayList = this.commandResponderListeners == null ? new ArrayList(2) : new ArrayList(this.commandResponderListeners);
            if (!arrayList.contains(commandResponder)) {
                arrayList.add(commandResponder);
                this.commandResponderListeners = arrayList;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean addNotificationListener(TransportMapping transportMapping, Address address, CommandResponder commandResponder) {
        try {
            if (transportMapping instanceof ConnectionOrientedTransportMapping) {
                ((ConnectionOrientedTransportMapping) transportMapping).setConnectionTimeout(0L);
            }
            transportMapping.addTransportListener(this.messageDispatcher);
            if (this.notificationDispatcher == null) {
                NotificationDispatcher notificationDispatcher = new NotificationDispatcher();
                this.notificationDispatcher = notificationDispatcher;
                addCommandResponder(notificationDispatcher);
            }
            this.notificationDispatcher.addNotificationListener(address, transportMapping, commandResponder);
            try {
                transportMapping.listen();
                LogAdapter logAdapter = logger;
                if (logAdapter.isInfoEnabled()) {
                    logAdapter.info("Added notification listener for address: " + address);
                }
            } catch (IOException e10) {
                logger.warn("Failed to initialize notification listener for address '" + address + "': " + e10.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    public void addTransportMapping(TransportMapping<? extends Address> transportMapping) {
        this.messageDispatcher.addTransportMapping(transportMapping);
        transportMapping.addTransportListener(this.messageDispatcher);
    }

    @Override // org.snmp4j.Session
    public void cancel(PDU pdu, ResponseListener responseListener) {
        PendingRequest pendingRequestRemove;
        PduHandle pduHandleRemove = this.asyncRequests.remove(new AsyncRequestKey(pdu, responseListener));
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Cancelling pending request with handle " + pduHandleRemove);
        }
        if (pduHandleRemove == null || (pendingRequestRemove = this.pendingRequests.remove(pduHandleRemove)) == null) {
            return;
        }
        synchronized (pendingRequestRemove) {
            pendingRequestRemove.setFinished();
            pendingRequestRemove.cancel();
        }
    }

    @Override // org.snmp4j.Session
    public void close() throws IOException {
        ArrayList<PendingRequest> arrayList;
        Iterator<TransportMapping> it = this.messageDispatcher.getTransportMappings().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        CommonTimer commonTimer = this.timer;
        this.timer = null;
        if (commonTimer != null) {
            commonTimer.cancel();
        }
        NotificationDispatcher notificationDispatcher = this.notificationDispatcher;
        if (notificationDispatcher != null) {
            notificationDispatcher.closeAll();
        }
        synchronized (this.pendingRequests) {
            arrayList = new ArrayList(this.pendingRequests.values());
        }
        for (PendingRequest pendingRequest : arrayList) {
            pendingRequest.cancel();
            ResponseEvent responseEvent = new ResponseEvent(this, null, pendingRequest.pdu, null, pendingRequest.userObject, new InterruptedException("Snmp session has been closed"));
            ResponseListener responseListener = pendingRequest.listener;
            if (responseListener != null) {
                responseListener.onResponse(responseEvent);
            }
        }
        this.pendingRequests.clear();
        this.asyncRequests.clear();
    }

    protected void closeTransportMapping(TransportMapping transportMapping) {
        try {
            transportMapping.close();
        } catch (IOException e10) {
            logger.error(e10);
            if (logger.isDebugEnabled()) {
                e10.printStackTrace();
            }
        }
    }

    public byte[] discoverAuthoritativeEngineID(Address address, long j10) {
        USM usm;
        MPv3 mPv3 = getMPv3();
        OctetString octetStringRemoveEngineID = mPv3.removeEngineID(address);
        if (octetStringRemoveEngineID != null && (usm = getUSM()) != null) {
            usm.removeEngineTime(octetStringRemoveEngineID);
        }
        ScopedPDU scopedPDU = new ScopedPDU();
        scopedPDU.setType(-96);
        UserTarget userTarget = new UserTarget();
        userTarget.setTimeout(j10);
        userTarget.setAddress(address);
        userTarget.setSecurityLevel(1);
        try {
            send(scopedPDU, userTarget, (TransportMapping) null, 0);
            OctetString engineID = mPv3.getEngineID(address);
            if (engineID == null) {
                return null;
            }
            return new OctetString(engineID.getValue()).getValue();
        } catch (IOException e10) {
            logger.error("IO error while trying to discover authoritative engine ID: " + e10);
            return null;
        }
    }

    protected void fireProcessPdu(CommandResponderEvent commandResponderEvent) {
        List<CommandResponder> list = this.commandResponderListeners;
        if (list != null) {
            Iterator<CommandResponder> it = list.iterator();
            while (it.hasNext()) {
                it.next().processPdu(commandResponderEvent);
                if (commandResponderEvent.isProcessed()) {
                    return;
                }
            }
        }
    }

    public ResponseEvent get(PDU pdu, Target target) throws IOException {
        pdu.setType(-96);
        return send(pdu, target);
    }

    public ResponseEvent getBulk(PDU pdu, Target target) throws IOException {
        pdu.setType(-91);
        return send(pdu, target);
    }

    public CounterSupport getCounterSupport() {
        return this.counterSupport;
    }

    public byte[] getLocalEngineID() {
        return getMPv3().getLocalEngineID();
    }

    public MessageDispatcher getMessageDispatcher() {
        return this.messageDispatcher;
    }

    public MessageProcessingModel getMessageProcessingModel(int i10) {
        return this.messageDispatcher.getMessageProcessingModel(i10);
    }

    public ResponseEvent getNext(PDU pdu, Target target) throws IOException {
        pdu.setType(-95);
        return send(pdu, target);
    }

    public int getNextRequestID() {
        return this.messageDispatcher.getNextRequestID();
    }

    public TransportMapping getNotificationListenerTM(Address address) {
        NotificationDispatcher notificationDispatcher = this.notificationDispatcher;
        if (notificationDispatcher != null) {
            return notificationDispatcher.getTransportMapping(address);
        }
        return null;
    }

    public int getPendingAsyncRequestCount() {
        return this.asyncRequests.size();
    }

    public int getPendingSyncRequestCount() {
        return this.pendingRequests.size();
    }

    public ReportHandler getReportHandler() {
        return this.reportHandler;
    }

    public TimeoutModel getTimeoutModel() {
        return this.timeoutModel;
    }

    public USM getUSM() {
        MPv3 mPv3 = (MPv3) getMessageProcessingModel(3);
        if (mPv3 != null) {
            return (USM) mPv3.getSecurityModel(3);
        }
        return null;
    }

    protected void handleInternalResponse(PDU pdu, PDU pdu2, Address address) {
        Variable variable = pdu.getVariable(SnmpConstants.snmpEngineID);
        if ((variable instanceof OctetString) && (pdu2 instanceof ScopedPDU)) {
            ((ScopedPDU) pdu2).setContextEngineID((OctetString) variable);
            LogAdapter logAdapter = logger;
            if (logAdapter.isInfoEnabled()) {
                logAdapter.info("Discovered contextEngineID '" + variable + "' by RFC 5343 for " + address);
            }
        }
    }

    public ResponseEvent inform(PDU pdu, Target target) throws IOException {
        pdu.setType(-90);
        return send(pdu, target);
    }

    protected final void initMessageDispatcher() {
        this.messageDispatcher.addCommandResponder(this);
        this.messageDispatcher.addMessageProcessingModel(new MPv2c());
        this.messageDispatcher.addMessageProcessingModel(new MPv1());
        this.messageDispatcher.addMessageProcessingModel(new MPv3());
        SecurityProtocols.getInstance().addDefaultProtocols();
    }

    public boolean isContextEngineIdDiscoveryDisabled() {
        return this.contextEngineIdDiscoveryDisabled;
    }

    public void listen() throws IOException {
        for (TransportMapping transportMapping : this.messageDispatcher.getTransportMappings()) {
            if (!transportMapping.isListening()) {
                transportMapping.listen();
            }
        }
    }

    protected TransportMapping lookupTransportMapping(Target target) {
        List<TransportMapping<? extends Address>> preferredTransports = target.getPreferredTransports();
        if (preferredTransports == null) {
            return null;
        }
        for (TransportMapping<? extends Address> transportMapping : preferredTransports) {
            if (transportMapping.getSupportedAddressClass().isInstance(target.getAddress())) {
                return transportMapping;
            }
        }
        return null;
    }

    public void notify(PDU pdu, Target target) throws IOException {
        if (target.getVersion() == 0) {
            throw new IllegalArgumentException("Notifications PDUs cannot be used with SNMPv1");
        }
        pdu.setType(-89);
        send(pdu, target);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.snmp4j.CommandResponder
    public void processPdu(CommandResponderEvent commandResponderEvent) {
        PendingRequest pendingRequest;
        ResponseListener responseListener;
        PduHandle pduHandle = commandResponderEvent.getPduHandle();
        if (SNMP4JSettings.getSnmp4jStatistics() == SNMP4JSettings.Snmp4jStatistics.extended && (pduHandle instanceof RequestStatistics)) {
            RequestStatistics requestStatistics = (RequestStatistics) pduHandle;
            this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmp4jStatsRequestRuntime, requestStatistics.getResponseRuntimeNanos()));
            this.counterSupport.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmp4jStatsReqTableRuntime, commandResponderEvent.getPeerAddress(), requestStatistics.getResponseRuntimeNanos()));
        }
        PDU pdu = commandResponderEvent.getPDU();
        if (pdu.getType() == -88) {
            commandResponderEvent.setProcessed(true);
            this.reportHandler.processReport(pduHandle, commandResponderEvent);
            return;
        }
        if (pdu.getType() != -94) {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Fire process PDU event: " + commandResponderEvent.toString());
            }
            fireProcessPdu(commandResponderEvent);
            return;
        }
        commandResponderEvent.setProcessed(true);
        LogAdapter logAdapter2 = logger;
        if (logAdapter2.isDebugEnabled()) {
            logAdapter2.debug("Looking up pending request with handle " + pduHandle);
        }
        synchronized (this.pendingRequests) {
            try {
                pendingRequest = this.pendingRequests.get(pduHandle);
                if (pendingRequest != null) {
                    pendingRequest.responseReceived();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pendingRequest != null) {
            if (resendRequest(pendingRequest, pdu) || (responseListener = pendingRequest.listener) == null) {
                return;
            }
            responseListener.onResponse(new ResponseEvent(this, commandResponderEvent.getPeerAddress(), pendingRequest.pdu, pdu, pendingRequest.userObject));
            return;
        }
        if (logAdapter2.isWarnEnabled()) {
            logAdapter2.warn("Received response that cannot be matched to any outstanding request, address=" + commandResponderEvent.getPeerAddress() + ", requestID=" + pdu.getRequestID());
        }
    }

    public synchronized void removeCommandResponder(CommandResponder commandResponder) {
        List<CommandResponder> list = this.commandResponderListeners;
        if (list != null && list.contains(commandResponder)) {
            ArrayList arrayList = new ArrayList(this.commandResponderListeners);
            arrayList.remove(commandResponder);
            this.commandResponderListeners = arrayList;
        }
    }

    public synchronized boolean removeNotificationListener(Address address) {
        try {
            if (this.notificationDispatcher == null) {
                return false;
            }
            LogAdapter logAdapter = logger;
            if (logAdapter.isInfoEnabled()) {
                logAdapter.info("Removing notification listener for address: " + address);
            }
            return this.notificationDispatcher.removeNotificationListener(address);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void removeTransportMapping(TransportMapping<? extends Address> transportMapping) {
        this.messageDispatcher.removeTransportMapping(transportMapping);
        transportMapping.removeTransportListener(this.messageDispatcher);
    }

    protected boolean resendRequest(PendingRequest pendingRequest, PDU pdu) {
        if (!pendingRequest.useNextPDU()) {
            return false;
        }
        pendingRequest.responseReceived = false;
        synchronized (this.pendingRequests) {
            this.pendingRequests.remove(pendingRequest.key);
            PduHandle pduHandle = pendingRequest.key;
            pendingRequest.key = null;
            handleInternalResponse(pdu, pendingRequest.pdu, pendingRequest.target.getAddress());
            try {
                sendMessage(pendingRequest.pdu, pendingRequest.target, pendingRequest.transport, pendingRequest);
            } catch (IOException e10) {
                logger.error("IOException while resending request after RFC 5343 context engine ID discovery: " + e10.getMessage(), e10);
            }
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Releasing PDU handle " + pduHandle);
            }
        }
        return true;
    }

    @Override // org.snmp4j.Session
    public ResponseEvent send(PDU pdu, Target target) throws IOException {
        return send(pdu, target, null);
    }

    protected PduHandle sendMessage(PDU pdu, Target target, TransportMapping transportMapping, PduHandleCallback<PDU> pduHandleCallback) throws IOException {
        if (transportMapping == null) {
            transportMapping = lookupTransportMapping(target);
        }
        return this.messageDispatcher.sendPdu(transportMapping, target, pdu, true, pduHandleCallback);
    }

    public ResponseEvent set(PDU pdu, Target target) throws IOException {
        pdu.setType(-93);
        return send(pdu, target);
    }

    public void setContextEngineIdDiscoveryDisabled(boolean z10) {
        this.contextEngineIdDiscoveryDisabled = z10;
    }

    public void setCounterSupport(CounterSupport counterSupport) {
        this.counterSupport = counterSupport;
    }

    public void setLocalEngine(byte[] bArr, int i10, int i11) {
        MPv3 mPv3 = getMPv3();
        mPv3.setLocalEngineID(bArr);
        mPv3.setCurrentMsgID(MPv3.randomMsgID(i10));
        USM usm = (USM) mPv3.getSecurityModel(3);
        if (usm != null) {
            usm.setLocalEngine(new OctetString(bArr), i10, i11);
        }
    }

    public void setMessageDispatcher(MessageDispatcher messageDispatcher) {
        messageDispatcher.getClass();
        Collection<TransportMapping> linkedList = new LinkedList<>();
        if (this.messageDispatcher != null) {
            linkedList = messageDispatcher.getTransportMappings();
            Iterator<TransportMapping> it = linkedList.iterator();
            while (it.hasNext()) {
                removeTransportMapping(it.next());
            }
            this.messageDispatcher.removeCommandResponder(this);
        }
        this.messageDispatcher = messageDispatcher;
        messageDispatcher.addCommandResponder(this);
        Iterator<TransportMapping> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            addTransportMapping(it2.next());
        }
    }

    public void setReportHandler(ReportHandler reportHandler) {
        if (reportHandler == null) {
            throw new IllegalArgumentException("ReportHandler must not be null");
        }
        this.reportHandler = reportHandler;
    }

    public void setTimeoutModel(TimeoutModel timeoutModel) {
        if (timeoutModel == null) {
            throw new NullPointerException("Timeout model cannot be null");
        }
        this.timeoutModel = timeoutModel;
    }

    public void trap(PDUv1 pDUv1, Target target) throws IOException {
        if (target.getVersion() != 0) {
            throw new IllegalArgumentException("SNMPv1 trap PDU must be used with SNMPv1");
        }
        pDUv1.setType(-92);
        send(pDUv1, target);
    }

    @Override // org.snmp4j.Session
    public ResponseEvent send(PDU pdu, Target target, TransportMapping transportMapping) throws IOException {
        return send(pdu, target, transportMapping, 2);
    }

    private ResponseEvent send(PDU pdu, Target target, TransportMapping transportMapping, int i10) throws IOException {
        PendingRequest pendingRequestRemove;
        PendingRequest pendingRequestRemove2;
        if (!pdu.isConfirmedPdu()) {
            sendMessage(pdu, target, transportMapping, null);
            return null;
        }
        if (this.timer == null) {
            createPendingTimer();
        }
        SyncResponseListener syncResponseListener = new SyncResponseListener();
        synchronized (syncResponseListener) {
            PendingRequest pendingRequest = new PendingRequest(syncResponseListener, target, pdu, target, transportMapping);
            pendingRequest.maxRequestStatus = i10;
            PduHandle pduHandleSendMessage = sendMessage(pendingRequest.pdu, target, transportMapping, pendingRequest);
            long jNanoTime = System.nanoTime() + (this.timeoutModel.getRequestTimeout(target.getRetries(), target.getTimeout()) * 1000000);
            while (syncResponseListener.getResponse() == null) {
                try {
                    try {
                        long jNanoTime2 = (jNanoTime - System.nanoTime()) / 1000000;
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        syncResponseListener.wait(jNanoTime2);
                    } catch (Throwable th2) {
                        if (!pendingRequest.finished && (pendingRequestRemove = this.pendingRequests.remove(pduHandleSendMessage)) != null) {
                            pendingRequestRemove.setFinished();
                            pendingRequestRemove.cancel();
                        }
                        throw th2;
                    }
                } catch (InterruptedException e10) {
                    logger.warn(e10);
                    pendingRequest.setFinished();
                    pendingRequest.cancel();
                    pendingRequestRemove2 = this.pendingRequests.remove(pduHandleSendMessage);
                    if (pendingRequestRemove2 != null) {
                        pendingRequestRemove2.setFinished();
                        pendingRequestRemove2.cancel();
                    }
                    Thread.currentThread().interrupt();
                    if (!pendingRequest.finished && (pendingRequestRemove2 = this.pendingRequests.remove(pduHandleSendMessage)) != null) {
                        pendingRequestRemove2.setFinished();
                    }
                }
            }
            pendingRequestRemove2 = this.pendingRequests.remove(pduHandleSendMessage);
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Removed pending request with handle: " + pduHandleSendMessage);
            }
            pendingRequest.setFinished();
            pendingRequest.cancel();
            if (!pendingRequest.finished && (pendingRequestRemove2 = this.pendingRequests.remove(pduHandleSendMessage)) != null) {
                pendingRequestRemove2.setFinished();
                pendingRequestRemove2.cancel();
            }
        }
        if (pendingRequestRemove2 != null) {
            pendingRequestRemove2.setFinished();
            pendingRequestRemove2.cancel();
        }
        if (syncResponseListener.getResponse() == null) {
            syncResponseListener.response = new ResponseEvent(this, null, pdu, null, null);
        }
        return syncResponseListener.response;
    }

    public void get(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        pdu.setType(-96);
        send(pdu, target, obj, responseListener);
    }

    public void getBulk(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        pdu.setType(-91);
        send(pdu, target, obj, responseListener);
    }

    public void getNext(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        pdu.setType(-95);
        send(pdu, target, obj, responseListener);
    }

    public void inform(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        pdu.setType(-90);
        send(pdu, target, obj, responseListener);
    }

    public void set(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        pdu.setType(-93);
        send(pdu, target, obj, responseListener);
    }

    public Snmp(TransportMapping<? extends Address> transportMapping) {
        this();
        initMessageDispatcher();
        if (transportMapping != null) {
            addTransportMapping(transportMapping);
        }
    }

    public Snmp(MessageDispatcher messageDispatcher, TransportMapping<? extends Address> transportMapping) {
        this.pendingRequests = new Hashtable(50);
        this.asyncRequests = new Hashtable(50);
        this.timeoutModel = new DefaultTimeoutModel();
        this.notificationDispatcher = null;
        this.reportHandler = new ReportProcessor();
        this.contextEngineIDs = Collections.synchronizedMap(new HashMap());
        this.messageDispatcher = messageDispatcher;
        messageDispatcher.addCommandResponder(this);
        if (transportMapping != null) {
            addTransportMapping(transportMapping);
        }
        if (SNMP4JSettings.getSnmp4jStatistics() != SNMP4JSettings.Snmp4jStatistics.none) {
            this.counterSupport = CounterSupport.getInstance();
        }
    }

    public synchronized boolean addNotificationListener(Address address, CommandResponder commandResponder) {
        TransportMapping<? extends Address> transportMappingCreateTransportMapping = TransportMappings.getInstance().createTransportMapping(address);
        if (transportMappingCreateTransportMapping == null) {
            LogAdapter logAdapter = logger;
            if (logAdapter.isInfoEnabled()) {
                logAdapter.info("Failed to add notification listener for address: " + address);
            }
            return false;
        }
        return addNotificationListener(transportMappingCreateTransportMapping, address, commandResponder);
    }

    public Snmp(MessageDispatcher messageDispatcher) {
        this.pendingRequests = new Hashtable(50);
        this.asyncRequests = new Hashtable(50);
        this.timeoutModel = new DefaultTimeoutModel();
        this.notificationDispatcher = null;
        this.reportHandler = new ReportProcessor();
        this.contextEngineIDs = Collections.synchronizedMap(new HashMap());
        this.messageDispatcher = messageDispatcher;
        messageDispatcher.addCommandResponder(this);
        if (SNMP4JSettings.getSnmp4jStatistics() != SNMP4JSettings.Snmp4jStatistics.none) {
            this.counterSupport = CounterSupport.getInstance();
        }
    }

    @Override // org.snmp4j.Session
    public void send(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException {
        send(pdu, target, null, obj, responseListener);
    }

    @Override // org.snmp4j.Session
    public void send(PDU pdu, Target target, TransportMapping transportMapping, Object obj, ResponseListener responseListener) throws IOException {
        if (!pdu.isConfirmedPdu()) {
            sendMessage(pdu, target, transportMapping, null);
            return;
        }
        if (this.timer == null) {
            createPendingTimer();
        }
        AsyncPendingRequest asyncPendingRequest = new AsyncPendingRequest(responseListener, obj, pdu, target, transportMapping);
        sendMessage(asyncPendingRequest.pdu, target, transportMapping, asyncPendingRequest);
    }
}
