package org.snmp4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.event.AuthenticationFailureEvent;
import org.snmp4j.event.AuthenticationFailureListener;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.CounterListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.PduHandleCallback;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.mp.StateReference;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.security.TsmSecurityStateReference;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;
import org.snmp4j.transport.UnsupportedAddressClassException;

/* loaded from: classes2.dex */
public class MessageDispatcherImpl implements MessageDispatcher {
    private static final LogAdapter logger = LogFactory.getLogger(MessageDispatcherImpl.class);
    private transient List<AuthenticationFailureListener> authenticationFailureListeners;
    private transient List<CommandResponder> commandResponderListeners;
    private transient List<CounterListener> counterListeners;
    private List<MessageProcessingModel> mpm = new ArrayList(3);
    private Map<Class<? extends Address>, List<TransportMapping>> transportMappings = new Hashtable(5);
    private int nextTransactionID = new Random().nextInt(2147483645) + 1;
    private boolean checkOutgoingMsg = true;

    private static void checkListening4ConfirmedPDU(PDU pdu, Address address, TransportMapping transportMapping) {
        if (transportMapping == null || transportMapping.isListening()) {
            return;
        }
        logger.warn("Sending confirmed PDU " + pdu + " to target " + address + " although transport mapping " + transportMapping + " is not listening for a response");
    }

    public synchronized void addAuthenticationFailureListener(AuthenticationFailureListener authenticationFailureListener) {
        try {
            if (this.authenticationFailureListeners == null) {
                this.authenticationFailureListeners = new Vector(2);
            }
            if (!this.authenticationFailureListeners.contains(authenticationFailureListener)) {
                this.authenticationFailureListeners.add(authenticationFailureListener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized void addCommandResponder(CommandResponder commandResponder) {
        try {
            if (this.commandResponderListeners == null) {
                this.commandResponderListeners = new Vector(2);
            }
            if (!this.commandResponderListeners.contains(commandResponder)) {
                this.commandResponderListeners.add(commandResponder);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addCounterListener(CounterListener counterListener) {
        try {
            if (this.counterListeners == null) {
                this.counterListeners = new Vector(2);
            }
            if (!this.counterListeners.contains(counterListener)) {
                this.counterListeners.add(counterListener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized void addMessageProcessingModel(MessageProcessingModel messageProcessingModel) {
        while (this.mpm.size() <= messageProcessingModel.getID()) {
            try {
                this.mpm.add(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.mpm.get(messageProcessingModel.getID()) == null) {
            this.mpm.set(messageProcessingModel.getID(), messageProcessingModel);
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized void addTransportMapping(TransportMapping transportMapping) {
        try {
            List<TransportMapping> linkedList = this.transportMappings.get(transportMapping.getSupportedAddressClass());
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.transportMappings.put(transportMapping.getSupportedAddressClass(), linkedList);
            }
            linkedList.add(transportMapping);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void checkOutgoingMsg(Address address, int i10, PDU pdu) throws MessageException {
        if (this.checkOutgoingMsg) {
            if ((i10 == 0 || SNMP4JSettings.isNoGetBulk()) && pdu.getType() == -91) {
                if (i10 == 0) {
                    logger.warn("Converting GETBULK PDU to GETNEXT for SNMPv1 target: " + address);
                } else {
                    logger.info("Converting GETBULK PDU to GETNEXT for target: " + address);
                }
                pdu.setType(-95);
                if (pdu instanceof PDUv1) {
                    return;
                }
                pdu.setMaxRepetitions(0);
                pdu.setNonRepeaters(0);
            }
        }
    }

    protected void configureAuthoritativeEngineID(Target target, MessageProcessingModel messageProcessingModel) {
        if ((target instanceof UserTarget) && (messageProcessingModel instanceof MPv3)) {
            UserTarget userTarget = (UserTarget) target;
            if (userTarget.getAuthoritativeEngineID() == null || userTarget.getAuthoritativeEngineID().length <= 0) {
                return;
            }
            ((MPv3) messageProcessingModel).addEngineID(target.getAddress(), new OctetString(userTarget.getAuthoritativeEngineID()));
        }
    }

    protected PduHandle createPduHandle() {
        return new PduHandle(getNextRequestID());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void dispatchMessage(org.snmp4j.TransportMapping r25, org.snmp4j.mp.MessageProcessingModel r26, org.snmp4j.smi.Address r27, org.snmp4j.asn1.BERInputStream r28, org.snmp4j.TransportStateReference r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.MessageDispatcherImpl.dispatchMessage(org.snmp4j.TransportMapping, org.snmp4j.mp.MessageProcessingModel, org.snmp4j.smi.Address, org.snmp4j.asn1.BERInputStream, org.snmp4j.TransportStateReference):void");
    }

    protected void fireAuthenticationFailure(AuthenticationFailureEvent authenticationFailureEvent) {
        List<AuthenticationFailureListener> list = this.authenticationFailureListeners;
        if (list != null) {
            Iterator<AuthenticationFailureListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().authenticationFailure(authenticationFailureEvent);
            }
        }
    }

    protected void fireIncrementCounter(CounterEvent counterEvent) {
        List<CounterListener> list = this.counterListeners;
        if (list != null) {
            Iterator<CounterListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().incrementCounter(counterEvent);
            }
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

    @Override // org.snmp4j.MessageDispatcher
    public MessageProcessingModel getMessageProcessingModel(int i10) {
        try {
            return this.mpm.get(i10);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized int getNextRequestID() {
        int i10;
        i10 = this.nextTransactionID;
        this.nextTransactionID = i10 + 1;
        if (i10 <= 0) {
            this.nextTransactionID = 2;
            i10 = 1;
        }
        return i10;
    }

    @Override // org.snmp4j.MessageDispatcher
    public TransportMapping getTransport(Address address) {
        Class<?> superclass = address.getClass();
        do {
            List<TransportMapping> list = this.transportMappings.get(superclass);
            if (list != null && list.size() > 0) {
                return list.get(0);
            }
            superclass = superclass.getSuperclass();
        } while (superclass != null);
        return null;
    }

    @Override // org.snmp4j.MessageDispatcher
    public Collection<TransportMapping> getTransportMappings() {
        ArrayList arrayList = new ArrayList(this.transportMappings.size());
        synchronized (this.transportMappings) {
            try {
                Iterator<List<TransportMapping>> it = this.transportMappings.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public boolean isCheckOutgoingMsg() {
        return this.checkOutgoingMsg;
    }

    @Override // org.snmp4j.MessageDispatcher, org.snmp4j.transport.TransportListener
    public void processMessage(TransportMapping transportMapping, Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference) {
        processMessage(transportMapping, address, new BERInputStream(byteBuffer), transportStateReference);
    }

    @Override // org.snmp4j.MessageDispatcher
    public void releaseStateReference(int i10, PduHandle pduHandle) {
        MessageProcessingModel messageProcessingModel = getMessageProcessingModel(i10);
        if (messageProcessingModel != null) {
            messageProcessingModel.releaseStateReference(pduHandle);
            return;
        }
        throw new IllegalArgumentException("Unsupported message processing model: " + i10);
    }

    public synchronized void removeAuthenticationFailureListener(AuthenticationFailureListener authenticationFailureListener) {
        List<AuthenticationFailureListener> list = this.authenticationFailureListeners;
        if (list != null && list.contains(authenticationFailureListener)) {
            this.authenticationFailureListeners.remove(authenticationFailureListener);
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized void removeCommandResponder(CommandResponder commandResponder) {
        List<CommandResponder> list = this.commandResponderListeners;
        if (list != null && list.contains(commandResponder)) {
            this.commandResponderListeners.remove(commandResponder);
        }
    }

    public synchronized void removeCounterListener(CounterListener counterListener) {
        List<CounterListener> list = this.counterListeners;
        if (list != null && list.contains(counterListener)) {
            this.counterListeners.remove(counterListener);
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public synchronized void removeMessageProcessingModel(MessageProcessingModel messageProcessingModel) {
        this.mpm.set(messageProcessingModel.getID(), null);
    }

    @Override // org.snmp4j.MessageDispatcher
    public TransportMapping removeTransportMapping(TransportMapping transportMapping) {
        List<TransportMapping> listRemove = this.transportMappings.remove(transportMapping.getSupportedAddressClass());
        if (listRemove == null || !listRemove.remove(transportMapping)) {
            return null;
        }
        return transportMapping;
    }

    @Override // org.snmp4j.MessageDispatcher
    public int returnResponsePdu(int i10, int i11, byte[] bArr, int i12, PDU pdu, int i13, StateReference stateReference, StatusInformation statusInformation) throws MessageException {
        try {
            MessageProcessingModel messageProcessingModel = getMessageProcessingModel(i10);
            if (messageProcessingModel == null) {
                throw new MessageException("Unsupported message processing model: " + i10, SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL);
            }
            TransportMapping transportMapping = stateReference.getTransportMapping();
            if (transportMapping == null) {
                transportMapping = getTransport(stateReference.getAddress());
            }
            if (transportMapping == null) {
                throw new MessageException("Unsupported address class (transport mapping): " + stateReference.getAddress().getClass().getName(), SnmpConstants.SNMP_MD_UNSUPPORTED_ADDRESS_CLASS);
            }
            BEROutputStream bEROutputStream = new BEROutputStream();
            int iPrepareResponseMessage = messageProcessingModel.prepareResponseMessage(i10, transportMapping.getMaxInboundMessageSize(), i11, bArr, i12, pdu, i13, stateReference, statusInformation, bEROutputStream);
            if (iPrepareResponseMessage == 0) {
                sendMessage(transportMapping, stateReference.getAddress(), bEROutputStream.getBuffer().array(), stateReference.getSecurityStateReference() instanceof TsmSecurityStateReference ? ((TsmSecurityStateReference) stateReference.getSecurityStateReference()).getTmStateReference() : null);
            }
            return iPrepareResponseMessage;
        } catch (IOException e10) {
            throw new MessageException(e10.getMessage(), SnmpConstants.SNMP_MD_ERROR, e10);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new MessageException("Unsupported message processing model: " + i10, SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL, e11);
        }
    }

    protected void sendMessage(TransportMapping transportMapping, Address address, byte[] bArr, TransportStateReference transportStateReference) throws IOException {
        if (transportMapping != null) {
            if (address instanceof GenericAddress) {
                transportMapping.sendMessage(((GenericAddress) address).getAddress(), bArr, transportStateReference);
                return;
            } else {
                transportMapping.sendMessage(address, bArr, transportStateReference);
                return;
            }
        }
        String str = "No transport mapping for address class: " + address.getClass().getName() + "=" + address;
        logger.error(str);
        throw new IOException(str);
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(Target target, PDU pdu, boolean z10) throws MessageException {
        return sendPdu(null, target, pdu, z10);
    }

    public void setCheckOutgoingMsg(boolean z10) {
        this.checkOutgoingMsg = z10;
    }

    public void processMessage(TransportMapping transportMapping, Address address, BERInputStream bERInputStream, TransportStateReference transportStateReference) {
        fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpInPkts));
        if (!bERInputStream.markSupported()) {
            logger.error("Message stream must support marks");
            throw new IllegalArgumentException("Message stream must support marks");
        }
        try {
            bERInputStream.mark(16);
            BER.MutableByte mutableByte = new BER.MutableByte();
            BER.decodeHeader(bERInputStream, mutableByte, false);
            if (mutableByte.getValue() != 48) {
                logger.error("ASN.1 parse error (message is not a sequence)");
                fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpInASNParseErrs));
            }
            Integer32 integer32 = new Integer32();
            integer32.decodeBER(bERInputStream);
            MessageProcessingModel messageProcessingModel = getMessageProcessingModel(integer32.getValue());
            if (messageProcessingModel != null) {
                bERInputStream.reset();
                dispatchMessage(transportMapping, messageProcessingModel, address, bERInputStream, transportStateReference);
                return;
            }
            logger.warn("SNMP version " + integer32 + " is not supported");
            fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpInBadVersions));
        } catch (IOException e10) {
            e10.printStackTrace();
            logger.warn(e10);
            fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpInvalidMsgs));
        } catch (Exception e11) {
            LogAdapter logAdapter = logger;
            logAdapter.error(e11);
            if (logAdapter.isDebugEnabled()) {
                e11.printStackTrace();
            }
            if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                throw new RuntimeException(e11);
            }
        } catch (OutOfMemoryError e12) {
            logger.error(e12);
            if (SNMP4JSettings.isForwardRuntimeExceptions()) {
                throw e12;
            }
        }
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10, PduHandleCallback<PDU> pduHandleCallback) throws MessageException {
        int i10;
        int i11;
        String str;
        String str2;
        int i12;
        PduHandle pduHandle;
        int version = target.getVersion();
        Address address = target.getAddress();
        int securityModel = target.getSecurityModel();
        int securityLevel = target.getSecurityLevel();
        try {
            try {
                byte[] value = target.getSecurityName().getValue();
                MessageProcessingModel messageProcessingModel = getMessageProcessingModel(version);
                try {
                    if (messageProcessingModel != null) {
                        try {
                            try {
                                if (!messageProcessingModel.isProtocolVersionSupported(version)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("SNMP version ");
                                    sb2.append(version);
                                    sb2.append(" is not supported by message processing model ");
                                    sb2.append(version);
                                    throw new MessageException(sb2.toString(), SnmpConstants.SNMP_MD_UNSUPPORTED_SNMP_VERSION);
                                }
                                TransportMapping transport = transportMapping == null ? getTransport(address) : transportMapping;
                                if (transport == null) {
                                    throw new UnsupportedAddressClassException("Unsupported address class (transport mapping): " + address.getClass().getName(), address.getClass());
                                }
                                try {
                                    if (pdu.isConfirmedPdu()) {
                                        checkListening4ConfirmedPDU(pdu, target.getAddress(), transport);
                                    }
                                    checkOutgoingMsg(address, version, pdu);
                                    Integer32 requestID = pdu.getRequestID();
                                    PduHandle pduHandleCreatePduHandle = ((requestID == null || requestID.getValue() == 0) && pdu.getType() != -94) ? createPduHandle() : new PduHandle(pdu.getRequestID().getValue());
                                    if (pdu.getType() != -92) {
                                        pdu.setRequestID(new Integer32(pduHandleCreatePduHandle.getTransactionID()));
                                    }
                                    GenericAddress genericAddress = new GenericAddress();
                                    TransportMapping transportMapping2 = transport;
                                    TransportStateReference transportStateReference = new TransportStateReference(transport, address, new OctetString(value), SecurityLevel.get(securityLevel), SecurityLevel.undefined, false, null, target instanceof CertifiedIdentity ? (CertifiedIdentity) target : null);
                                    if (pdu.isConfirmedPdu()) {
                                        try {
                                            configureAuthoritativeEngineID(target, messageProcessingModel);
                                        } catch (IndexOutOfBoundsException e10) {
                                            e = e10;
                                            i11 = version;
                                            str = "Unsupported message processing model: ";
                                        }
                                    }
                                    BEROutputStream bEROutputStream = new BEROutputStream();
                                    i12 = version;
                                    str2 = "Unsupported message processing model: ";
                                    try {
                                        int iPrepareOutgoingMessage = messageProcessingModel.prepareOutgoingMessage(address, transportMapping2.getMaxInboundMessageSize(), version, securityModel, value, securityLevel, pdu, z10, pduHandleCreatePduHandle, genericAddress, bEROutputStream, transportStateReference);
                                        if (iPrepareOutgoingMessage == 0) {
                                            if (pduHandleCallback != null) {
                                                pduHandle = pduHandleCreatePduHandle;
                                                pduHandleCallback.pduHandleAssigned(pduHandle, pdu);
                                            } else {
                                                pduHandle = pduHandleCreatePduHandle;
                                            }
                                            sendMessage(transportMapping2, address, bEROutputStream.getBuffer().array(), transportStateReference);
                                            return pduHandle;
                                        }
                                        throw new MessageException("Message processing model " + messageProcessingModel.getID() + " returned error: " + SnmpConstants.mpErrorMessage(iPrepareOutgoingMessage), iPrepareOutgoingMessage);
                                    } catch (IOException e11) {
                                        e = e11;
                                        if (logger.isDebugEnabled()) {
                                            e.printStackTrace();
                                        }
                                        throw new MessageException(e.getMessage(), SnmpConstants.SNMP_MD_ERROR, e);
                                    } catch (IndexOutOfBoundsException e12) {
                                        e = e12;
                                        i11 = i12;
                                        str = str2;
                                        i10 = SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL;
                                        throw new MessageException(str + i11, i10, e);
                                    } catch (MessageException e13) {
                                        e = e13;
                                        if (logger.isDebugEnabled()) {
                                            e.printStackTrace();
                                        }
                                        throw e;
                                    }
                                } catch (IndexOutOfBoundsException e14) {
                                    e = e14;
                                    i12 = version;
                                    str2 = "Unsupported message processing model: ";
                                }
                            } catch (IndexOutOfBoundsException e15) {
                                e = e15;
                            }
                        } catch (IndexOutOfBoundsException e16) {
                            e = e16;
                            i11 = version;
                            str2 = "Unsupported message processing model: ";
                        }
                    } else {
                        i11 = version;
                        StringBuilder sb3 = new StringBuilder();
                        str = "Unsupported message processing model: ";
                        try {
                            sb3.append(str);
                            sb3.append(i11);
                            String string = sb3.toString();
                            i10 = SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL;
                            try {
                                throw new MessageException(string, SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL);
                            } catch (IndexOutOfBoundsException e17) {
                                e = e17;
                            }
                        } catch (IndexOutOfBoundsException e18) {
                            e = e18;
                        }
                    }
                } catch (IndexOutOfBoundsException e19) {
                    e = e19;
                }
                i10 = SnmpConstants.SNMP_MD_UNSUPPORTED_MP_MODEL;
            } catch (MessageException e20) {
                e = e20;
            } catch (IOException e21) {
                e = e21;
            }
        } catch (IndexOutOfBoundsException e22) {
            e = e22;
            i10 = 1702;
            i11 = version;
            str = "Unsupported message processing model: ";
        }
        throw new MessageException(str + i11, i10, e);
    }

    @Override // org.snmp4j.MessageDispatcher
    public PduHandle sendPdu(TransportMapping transportMapping, Target target, PDU pdu, boolean z10) throws MessageException {
        return sendPdu(transportMapping, target, pdu, z10, null);
    }
}
