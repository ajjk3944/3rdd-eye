package javax.jmdns.impl;

import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.jmdns.ServiceTypeListener;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.DNSTaskStarter;
import javax.jmdns.impl.ListenerStatus;
import javax.jmdns.impl.NameRegister;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;
import javax.jmdns.impl.util.NamedThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes4.dex */
public class JmDNSImpl extends JmDNS implements DNSStatefulObject, DNSTaskStarter {
    private final DNSCache _cache;
    private volatile JmDNS.Delegate _delegate;
    private volatile InetAddress _group;
    private Thread _incomingListener;
    private long _lastThrottleIncrement;
    private final List<DNSListener> _listeners;
    private HostInfo _localHost;
    private final String _name;
    private DNSIncoming _plannedAnswer;
    private final ConcurrentMap<String, ServiceCollector> _serviceCollectors;
    final ConcurrentMap<String, List<ListenerStatus.ServiceListenerStatus>> _serviceListeners;
    private final ConcurrentMap<String, ServiceTypeEntry> _serviceTypes;
    private final ConcurrentMap<String, ServiceInfo> _services;
    protected Thread _shutdown;
    private volatile MulticastSocket _socket;
    private int _throttle;
    private final Set<ListenerStatus.ServiceTypeListenerStatus> _typeListeners;
    private static Logger logger = LoggerFactory.getLogger(JmDNSImpl.class.getName());
    private static final Random _random = new Random();
    private final ExecutorService _executor = Executors.newSingleThreadExecutor(new NamedThreadFactory("JmDNS"));
    private final ReentrantLock _ioLock = new ReentrantLock();
    private final Object _recoverLock = new Object();

    /* renamed from: javax.jmdns.impl.JmDNSImpl$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation;

        static {
            int[] iArr = new int[Operation.values().length];
            $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation = iArr;
            try {
                iArr[Operation.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation[Operation.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Operation {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    public static class ServiceCollector implements ServiceListener {
        private final String _type;
        private final ConcurrentMap<String, ServiceInfo> _infos = new ConcurrentHashMap();
        private final ConcurrentMap<String, ServiceEvent> _events = new ConcurrentHashMap();
        private volatile boolean _needToWaitForInfos = true;

        public ServiceCollector(String str) {
            this._type = str;
        }

        public ServiceInfo[] list(long j10) throws InterruptedException {
            if (this._infos.isEmpty() || !this._events.isEmpty() || this._needToWaitForInfos) {
                long j11 = j10 / 200;
                if (j11 < 1) {
                    j11 = 1;
                }
                for (int i10 = 0; i10 < j11; i10++) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException unused) {
                    }
                    if (this._events.isEmpty() && !this._infos.isEmpty() && !this._needToWaitForInfos) {
                        break;
                    }
                }
            }
            this._needToWaitForInfos = false;
            return (ServiceInfo[]) this._infos.values().toArray(new ServiceInfo[this._infos.size()]);
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceAdded(ServiceEvent serviceEvent) {
            synchronized (this) {
                try {
                    ServiceInfo info = serviceEvent.getInfo();
                    if (info == null || !info.hasData()) {
                        ServiceInfoImpl serviceInfoImplResolveServiceInfo = ((JmDNSImpl) serviceEvent.getDNS()).resolveServiceInfo(serviceEvent.getType(), serviceEvent.getName(), info != null ? info.getSubtype() : "", true);
                        if (serviceInfoImplResolveServiceInfo != null) {
                            this._infos.put(serviceEvent.getName(), serviceInfoImplResolveServiceInfo);
                        } else {
                            this._events.put(serviceEvent.getName(), serviceEvent);
                        }
                    } else {
                        this._infos.put(serviceEvent.getName(), info);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceRemoved(ServiceEvent serviceEvent) {
            synchronized (this) {
                this._infos.remove(serviceEvent.getName());
                this._events.remove(serviceEvent.getName());
            }
        }

        @Override // javax.jmdns.ServiceListener
        public void serviceResolved(ServiceEvent serviceEvent) {
            synchronized (this) {
                this._infos.put(serviceEvent.getName(), serviceEvent.getInfo());
                this._events.remove(serviceEvent.getName());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this._type);
            if (this._infos.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this._infos.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this._infos.get(str));
                }
            }
            if (this._events.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this._events.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this._events.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    public static class ServiceTypeEntry extends AbstractMap<String, String> implements Cloneable {
        private final Set<Map.Entry<String, String>> _entrySet = new HashSet();
        private final String _type;

        public static class SubTypeEntry implements Map.Entry<String, String>, Serializable, Cloneable {
            private static final long serialVersionUID = 9188503522395855322L;
            private final String _key;
            private final String _value;

            public SubTypeEntry(String str) {
                str = str == null ? "" : str;
                this._value = str;
                this._key = str.toLowerCase();
            }

            public SubTypeEntry clone() {
                return this;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                String str = this._key;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this._value;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return this._key + "=" + this._value;
            }

            @Override // java.util.Map.Entry
            public String getKey() {
                return this._key;
            }

            @Override // java.util.Map.Entry
            public String getValue() {
                return this._value;
            }

            @Override // java.util.Map.Entry
            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }
        }

        public ServiceTypeEntry(String str) {
            this._type = str;
        }

        public boolean add(String str) {
            if (str == null || contains(str)) {
                return false;
            }
            this._entrySet.add(new SubTypeEntry(str));
            return true;
        }

        public boolean contains(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return this._entrySet;
        }

        public String getType() {
            return this._type;
        }

        public Iterator<String> iterator() {
            return keySet().iterator();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                Iterator<String> it = values().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }

        @Override // java.util.AbstractMap
        public ServiceTypeEntry clone() {
            ServiceTypeEntry serviceTypeEntry = new ServiceTypeEntry(getType());
            Iterator<Map.Entry<String, String>> it = entrySet().iterator();
            while (it.hasNext()) {
                serviceTypeEntry.add(it.next().getValue());
            }
            return serviceTypeEntry;
        }
    }

    public class Shutdown implements Runnable {
        public Shutdown() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JmDNSImpl jmDNSImpl = JmDNSImpl.this;
                jmDNSImpl._shutdown = null;
                jmDNSImpl.close();
            } catch (Throwable th) {
                System.err.println("Error while shuting down. " + th);
            }
        }
    }

    public JmDNSImpl(InetAddress inetAddress, String str) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("JmDNS instance created");
        }
        this._cache = new DNSCache(100);
        this._listeners = Collections.synchronizedList(new ArrayList());
        this._serviceListeners = new ConcurrentHashMap();
        this._typeListeners = Collections.synchronizedSet(new HashSet());
        this._serviceCollectors = new ConcurrentHashMap();
        this._services = new ConcurrentHashMap(20);
        this._serviceTypes = new ConcurrentHashMap(20);
        HostInfo hostInfoNewHostInfo = HostInfo.newHostInfo(inetAddress, this, str);
        this._localHost = hostInfoNewHostInfo;
        this._name = str == null ? hostInfoNewHostInfo.getName() : str;
        openMulticastSocket(getLocalHost());
        start(getServices().values());
        startReaper();
    }

    private List<DNSRecord> aRecordsLast(List<DNSRecord> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (DNSRecord dNSRecord : list) {
            if (dNSRecord.getRecordType().equals(DNSRecordType.TYPE_A) || dNSRecord.getRecordType().equals(DNSRecordType.TYPE_AAAA)) {
                arrayList2.add(dNSRecord);
            } else {
                arrayList.add(dNSRecord);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void closeMulticastSocket() throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("closeMulticastSocket()");
        }
        if (this._socket != null) {
            try {
                try {
                    this._socket.leaveGroup(this._group);
                } catch (SocketException unused) {
                }
                this._socket.close();
                while (true) {
                    Thread thread = this._incomingListener;
                    if (thread == null || !thread.isAlive()) {
                        break;
                    }
                    synchronized (this) {
                        try {
                            try {
                                Thread thread2 = this._incomingListener;
                                if (thread2 != null && thread2.isAlive()) {
                                    if (logger.isDebugEnabled()) {
                                        logger.debug("closeMulticastSocket(): waiting for jmDNS monitor");
                                    }
                                    wait(1000L);
                                }
                            } finally {
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
                this._incomingListener = null;
            } catch (Exception e10) {
                logger.warn("closeMulticastSocket() Close socket exception ", (Throwable) e10);
            }
            this._socket = null;
        }
    }

    private void disposeServiceCollectors() {
        if (logger.isDebugEnabled()) {
            logger.debug("disposeServiceCollectors()");
        }
        for (String str : this._serviceCollectors.keySet()) {
            ServiceCollector serviceCollector = this._serviceCollectors.get(str);
            if (serviceCollector != null) {
                removeServiceListener(str, serviceCollector);
                this._serviceCollectors.remove(str, serviceCollector);
            }
        }
    }

    public static Random getRandom() {
        return _random;
    }

    public static void main(String[] strArr) throws IOException {
        String property;
        try {
            Properties properties = new Properties();
            properties.load(JmDNSImpl.class.getResourceAsStream("/META-INF/maven/javax.jmdns/jmdns/pom.properties"));
            property = properties.getProperty("version");
        } catch (Exception unused) {
            property = "RUNNING.IN.IDE.FULL";
        }
        System.out.println("JmDNS version \"" + property + "\"");
        System.out.println(" ");
        System.out.println("Running on java version \"" + System.getProperty("java.version") + "\" (build " + System.getProperty("java.runtime.version") + ") from " + System.getProperty("java.vendor"));
        System.out.println("Operating environment \"" + System.getProperty("os.name") + "\" version " + System.getProperty("os.version") + " on " + System.getProperty("os.arch"));
        System.out.println("For more information on JmDNS please visit http://jmdns.org");
    }

    private boolean makeServiceNameUnique(ServiceInfoImpl serviceInfoImpl) {
        boolean z10;
        ServiceInfo serviceInfo;
        String key = serviceInfoImpl.getKey();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            for (DNSEntry dNSEntry : getCache().getDNSEntryList(serviceInfoImpl.getKey())) {
                if (DNSRecordType.TYPE_SRV.equals(dNSEntry.getRecordType()) && !dNSEntry.isExpired(jCurrentTimeMillis)) {
                    DNSRecord.Service service = (DNSRecord.Service) dNSEntry;
                    if (service.getPort() != serviceInfoImpl.getPort() || !service.getServer().equals(this._localHost.getName())) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + dNSEntry + " s.server=" + service.getServer() + " " + this._localHost.getName() + " equals:" + service.getServer().equals(this._localHost.getName()));
                        }
                        serviceInfoImpl.setName(NameRegister.Factory.getRegistry().incrementName(this._localHost.getInetAddress(), serviceInfoImpl.getName(), NameRegister.NameType.SERVICE));
                        z10 = true;
                        serviceInfo = this._services.get(serviceInfoImpl.getKey());
                        if (serviceInfo == null && serviceInfo != serviceInfoImpl) {
                            serviceInfoImpl.setName(NameRegister.Factory.getRegistry().incrementName(this._localHost.getInetAddress(), serviceInfoImpl.getName(), NameRegister.NameType.SERVICE));
                            z10 = true;
                        }
                    }
                }
            }
            z10 = false;
            serviceInfo = this._services.get(serviceInfoImpl.getKey());
            if (serviceInfo == null) {
            }
        } while (z10);
        return !key.equals(serviceInfoImpl.getKey());
    }

    private void openMulticastSocket(HostInfo hostInfo) throws IOException {
        if (this._group == null) {
            if (hostInfo.getInetAddress() instanceof Inet6Address) {
                this._group = InetAddress.getByName(DNSConstants.MDNS_GROUP_IPV6);
            } else {
                this._group = InetAddress.getByName(DNSConstants.MDNS_GROUP);
            }
        }
        if (this._socket != null) {
            closeMulticastSocket();
        }
        this._socket = new MulticastSocket(DNSConstants.MDNS_PORT);
        if (hostInfo != null && hostInfo.getInterface() != null) {
            try {
                this._socket.setNetworkInterface(hostInfo.getInterface());
            } catch (SocketException e10) {
                if (logger.isDebugEnabled()) {
                    logger.debug("openMulticastSocket() Set network interface exception: " + e10.getMessage());
                }
            }
        }
        this._socket.setTimeToLive(255);
        this._socket.joinGroup(this._group);
    }

    private void start(Collection<? extends ServiceInfo> collection) {
        if (this._incomingListener == null) {
            SocketListener socketListener = new SocketListener(this);
            this._incomingListener = socketListener;
            socketListener.start();
        }
        startProber();
        Iterator<? extends ServiceInfo> it = collection.iterator();
        while (it.hasNext()) {
            try {
                registerService(new ServiceInfoImpl(it.next()));
            } catch (Exception e10) {
                logger.warn("start() Registration exception ", (Throwable) e10);
            }
        }
    }

    public static String toUnqualifiedName(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    private void waitForInfoData(ServiceInfo serviceInfo, long j10) {
        synchronized (serviceInfo) {
            long j11 = j10 / 200;
            if (j11 < 1) {
                j11 = 1;
            }
            for (int i10 = 0; i10 < j11 && !serviceInfo.hasData(); i10++) {
                try {
                    serviceInfo.wait(200L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void __recover() throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + "recover() Cleanning up");
        }
        logger.warn("RECOVERING");
        purgeTimer();
        ArrayList arrayList = new ArrayList(getServices().values());
        unregisterAllServices();
        disposeServiceCollectors();
        waitForCanceled(5000L);
        purgeStateTimer();
        closeMulticastSocket();
        getCache().clear();
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + "recover() All is clean");
        }
        if (!isCanceled()) {
            logger.warn(getName() + "recover() Could not recover we are Down!");
            if (getDelegate() != null) {
                getDelegate().cannotRecoverFromIOError(getDns(), arrayList);
                return;
            }
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ServiceInfoImpl) ((ServiceInfo) obj)).recoverState();
        }
        recoverState();
        try {
            openMulticastSocket(getLocalHost());
            start(arrayList);
        } catch (Exception e10) {
            logger.warn(getName() + "recover() Start services exception ", (Throwable) e10);
        }
        logger.warn(getName() + "recover() We are back!");
    }

    public DNSOutgoing addAnswer(DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing, DNSRecord dNSRecord) throws IOException {
        if (dNSOutgoing == null) {
            dNSOutgoing = new DNSOutgoing(33792, false, dNSIncoming.getSenderUDPPayload());
        }
        try {
            dNSOutgoing.addAnswer(dNSIncoming, dNSRecord);
            return dNSOutgoing;
        } catch (IOException unused) {
            dNSOutgoing.setFlags(dNSOutgoing.getFlags() | 512);
            dNSOutgoing.setId(dNSIncoming.getId());
            send(dNSOutgoing);
            DNSOutgoing dNSOutgoing2 = new DNSOutgoing(33792, false, dNSIncoming.getSenderUDPPayload());
            dNSOutgoing2.addAnswer(dNSIncoming, dNSRecord);
            return dNSOutgoing2;
        }
    }

    public void addListener(DNSListener dNSListener, DNSQuestion dNSQuestion) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this._listeners.add(dNSListener);
        if (dNSQuestion != null) {
            for (DNSEntry dNSEntry : getCache().getDNSEntryList(dNSQuestion.getName().toLowerCase())) {
                if (dNSQuestion.answeredBy(dNSEntry) && !dNSEntry.isExpired(jCurrentTimeMillis)) {
                    dNSListener.updateRecord(getCache(), jCurrentTimeMillis, dNSEntry);
                }
            }
        }
    }

    @Override // javax.jmdns.JmDNS
    public void addServiceListener(String str, ServiceListener serviceListener) {
        addServiceListener(str, serviceListener, false);
    }

    @Override // javax.jmdns.JmDNS
    public void addServiceTypeListener(ServiceTypeListener serviceTypeListener) throws IOException {
        ListenerStatus.ServiceTypeListenerStatus serviceTypeListenerStatus = new ListenerStatus.ServiceTypeListenerStatus(serviceTypeListener, false);
        this._typeListeners.add(serviceTypeListenerStatus);
        Iterator<String> it = this._serviceTypes.keySet().iterator();
        while (it.hasNext()) {
            serviceTypeListenerStatus.serviceTypeAdded(new ServiceEventImpl(this, it.next(), "", null));
        }
        startTypeResolver();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean advanceState(DNSTask dNSTask) {
        return this._localHost.advanceState(dNSTask);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public void associateWithTask(DNSTask dNSTask, DNSState dNSState) {
        this._localHost.associateWithTask(dNSTask, dNSState);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean cancelState() {
        return this._localHost.cancelState();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void cancelStateTimer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).cancelStateTimer();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void cancelTimer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).cancelTimer();
    }

    public void cleanCache() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (DNSEntry dNSEntry : getCache().allValues()) {
            try {
                DNSRecord dNSRecord = (DNSRecord) dNSEntry;
                if (dNSRecord.isExpired(jCurrentTimeMillis)) {
                    updateRecord(jCurrentTimeMillis, dNSRecord, Operation.Remove);
                    getCache().removeDNSEntry(dNSRecord);
                } else if (dNSRecord.isStaleAndShouldBeRefreshed(jCurrentTimeMillis)) {
                    dNSRecord.incrementRefreshPercentage();
                    String lowerCase = dNSRecord.getServiceInfo().getType().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        renewServiceCollector(lowerCase);
                    }
                }
            } catch (Exception e10) {
                logger.warn(getName() + ".Error while reaping records: " + dNSEntry, (Throwable) e10);
                logger.warn(toString());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (isClosing()) {
            return;
        }
        if (logger.isDebugEnabled()) {
            logger.debug("Cancelling JmDNS: " + this);
        }
        if (closeState()) {
            logger.debug("Canceling the timer");
            cancelTimer();
            unregisterAllServices();
            disposeServiceCollectors();
            if (logger.isDebugEnabled()) {
                logger.debug("Wait for JmDNS cancel: " + this);
            }
            waitForCanceled(5000L);
            logger.debug("Canceling the state timer");
            cancelStateTimer();
            this._executor.shutdown();
            closeMulticastSocket();
            if (this._shutdown != null) {
                Runtime.getRuntime().removeShutdownHook(this._shutdown);
            }
            DNSTaskStarter.Factory.getInstance().disposeStarter(getDns());
            if (logger.isDebugEnabled()) {
                logger.debug("JmDNS closed.");
            }
        }
        advanceState(null);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean closeState() {
        return this._localHost.closeState();
    }

    public DNSCache getCache() {
        return this._cache;
    }

    @Override // javax.jmdns.JmDNS
    public JmDNS.Delegate getDelegate() {
        return this._delegate;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public JmDNSImpl getDns() {
        return this;
    }

    public InetAddress getGroup() {
        return this._group;
    }

    @Override // javax.jmdns.JmDNS
    public String getHostName() {
        return this._localHost.getName();
    }

    @Override // javax.jmdns.JmDNS
    public InetAddress getInetAddress() throws IOException {
        return this._localHost.getInetAddress();
    }

    @Override // javax.jmdns.JmDNS
    @Deprecated
    public InetAddress getInterface() throws IOException {
        return this._socket.getInterface();
    }

    public long getLastThrottleIncrement() {
        return this._lastThrottleIncrement;
    }

    public HostInfo getLocalHost() {
        return this._localHost;
    }

    @Override // javax.jmdns.JmDNS
    public String getName() {
        return this._name;
    }

    public DNSIncoming getPlannedAnswer() {
        return this._plannedAnswer;
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo getServiceInfo(String str, String str2) {
        return getServiceInfo(str, str2, false, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    public ServiceInfoImpl getServiceInfoFromCache(String str, String str2, String str3, boolean z10) {
        ServiceInfoImpl serviceInfoImpl;
        byte[] textBytes;
        String server;
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        ServiceInfo serviceInfo3;
        ServiceInfo serviceInfo4;
        ServiceInfoImpl serviceInfoImpl2 = new ServiceInfoImpl(str, str2, str3, 0, 0, 0, z10, (byte[]) null);
        DNSCache cache = getCache();
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_ANY;
        DNSEntry dNSEntry = cache.getDNSEntry(new DNSRecord.Pointer(str, dNSRecordClass, false, 0, serviceInfoImpl2.getQualifiedName()));
        if ((dNSEntry instanceof DNSRecord) && (serviceInfoImpl = (ServiceInfoImpl) ((DNSRecord) dNSEntry).getServiceInfo(z10)) != null) {
            Map<ServiceInfo.Fields, String> qualifiedNameMap = serviceInfoImpl.getQualifiedNameMap();
            DNSEntry dNSEntry2 = getCache().getDNSEntry(serviceInfoImpl2.getQualifiedName(), DNSRecordType.TYPE_SRV, dNSRecordClass);
            if (!(dNSEntry2 instanceof DNSRecord) || (serviceInfo4 = ((DNSRecord) dNSEntry2).getServiceInfo(z10)) == null) {
                textBytes = null;
                server = "";
            } else {
                serviceInfoImpl = new ServiceInfoImpl(qualifiedNameMap, serviceInfo4.getPort(), serviceInfo4.getWeight(), serviceInfo4.getPriority(), z10, (byte[]) null);
                textBytes = serviceInfo4.getTextBytes();
                server = serviceInfo4.getServer();
            }
            Iterator<? extends DNSEntry> it = getCache().getDNSEntryList(server, DNSRecordType.TYPE_A, dNSRecordClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DNSEntry next = it.next();
                if ((next instanceof DNSRecord) && (serviceInfo3 = ((DNSRecord) next).getServiceInfo(z10)) != null) {
                    for (Inet4Address inet4Address : serviceInfo3.getInet4Addresses()) {
                        serviceInfoImpl.addAddress(inet4Address);
                    }
                    serviceInfoImpl._setText(serviceInfo3.getTextBytes());
                }
            }
            for (DNSEntry dNSEntry3 : getCache().getDNSEntryList(server, DNSRecordType.TYPE_AAAA, DNSRecordClass.CLASS_ANY)) {
                if ((dNSEntry3 instanceof DNSRecord) && (serviceInfo2 = ((DNSRecord) dNSEntry3).getServiceInfo(z10)) != null) {
                    for (Inet6Address inet6Address : serviceInfo2.getInet6Addresses()) {
                        serviceInfoImpl.addAddress(inet6Address);
                    }
                    serviceInfoImpl._setText(serviceInfo2.getTextBytes());
                }
            }
            DNSEntry dNSEntry4 = getCache().getDNSEntry(serviceInfoImpl.getQualifiedName(), DNSRecordType.TYPE_TXT, DNSRecordClass.CLASS_ANY);
            if ((dNSEntry4 instanceof DNSRecord) && (serviceInfo = ((DNSRecord) dNSEntry4).getServiceInfo(z10)) != null) {
                serviceInfoImpl._setText(serviceInfo.getTextBytes());
            }
            if (serviceInfoImpl.getTextBytes().length == 0) {
                serviceInfoImpl._setText(textBytes);
            }
            if (serviceInfoImpl.hasData()) {
                return serviceInfoImpl;
            }
        }
        return serviceInfoImpl2;
    }

    public Map<String, ServiceTypeEntry> getServiceTypes() {
        return this._serviceTypes;
    }

    public Map<String, ServiceInfo> getServices() {
        return this._services;
    }

    public MulticastSocket getSocket() {
        return this._socket;
    }

    public int getThrottle() {
        return this._throttle;
    }

    public void handleQuery(DNSIncoming dNSIncoming, InetAddress inetAddress, int i10) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + ".handle query: " + dNSIncoming);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + 120;
        Iterator<DNSRecord> it = dNSIncoming.getAllAnswers().iterator();
        boolean zHandleQuery = false;
        while (it.hasNext()) {
            zHandleQuery |= it.next().handleQuery(this, jCurrentTimeMillis);
        }
        ioLock();
        try {
            DNSIncoming dNSIncoming2 = this._plannedAnswer;
            if (dNSIncoming2 != null) {
                dNSIncoming2.append(dNSIncoming);
            } else {
                DNSIncoming dNSIncomingM454clone = dNSIncoming.clone();
                if (dNSIncoming.isTruncated()) {
                    this._plannedAnswer = dNSIncomingM454clone;
                }
                startResponder(dNSIncomingM454clone, inetAddress, i10);
            }
            ioUnlock();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Iterator<? extends DNSRecord> it2 = dNSIncoming.getAnswers().iterator();
            while (it2.hasNext()) {
                handleRecord(it2.next(), jCurrentTimeMillis2);
            }
            if (zHandleQuery) {
                startProber();
            }
        } catch (Throwable th) {
            ioUnlock();
            throw th;
        }
    }

    public void handleRecord(DNSRecord dNSRecord, long j10) {
        Operation operation = Operation.Noop;
        boolean zIsExpired = dNSRecord.isExpired(j10);
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + " handle response: " + dNSRecord);
        }
        if (!dNSRecord.isServicesDiscoveryMetaQuery() && !dNSRecord.isDomainDiscoveryQuery()) {
            boolean zIsUnique = dNSRecord.isUnique();
            DNSRecord dNSRecord2 = (DNSRecord) getCache().getDNSEntry(dNSRecord);
            if (logger.isDebugEnabled()) {
                logger.debug(getName() + " handle response cached record: " + dNSRecord2);
            }
            if (zIsUnique) {
                for (DNSEntry dNSEntry : getCache().getDNSEntryList(dNSRecord.getKey())) {
                    if (dNSRecord.getRecordType().equals(dNSEntry.getRecordType()) && dNSRecord.getRecordClass().equals(dNSEntry.getRecordClass()) && dNSEntry != dNSRecord2) {
                        ((DNSRecord) dNSEntry).setWillExpireSoon(j10);
                    }
                }
            }
            if (dNSRecord2 != null) {
                if (zIsExpired) {
                    if (dNSRecord.getTTL() == 0) {
                        operation = Operation.Noop;
                        dNSRecord2.setWillExpireSoon(j10);
                    } else {
                        operation = Operation.Remove;
                        getCache().removeDNSEntry(dNSRecord2);
                    }
                } else if (dNSRecord.sameValue(dNSRecord2) && (dNSRecord.sameSubtype(dNSRecord2) || dNSRecord.getSubtype().length() <= 0)) {
                    dNSRecord2.resetTTL(dNSRecord);
                    dNSRecord = dNSRecord2;
                } else if (dNSRecord.isSingleValued()) {
                    operation = Operation.Update;
                    getCache().replaceDNSEntry(dNSRecord, dNSRecord2);
                } else {
                    operation = Operation.Add;
                    getCache().addDNSEntry(dNSRecord);
                }
            } else if (!zIsExpired) {
                operation = Operation.Add;
                getCache().addDNSEntry(dNSRecord);
            }
        }
        if (dNSRecord.getRecordType() == DNSRecordType.TYPE_PTR) {
            if (dNSRecord.isServicesDiscoveryMetaQuery()) {
                if (zIsExpired) {
                    return;
                }
                registerServiceType(((DNSRecord.Pointer) dNSRecord).getAlias());
                return;
            } else if (registerServiceType(dNSRecord.getName()) && operation == Operation.Noop) {
                operation = Operation.RegisterServiceType;
            }
        }
        if (operation != Operation.Noop) {
            updateRecord(j10, dNSRecord, operation);
        }
    }

    public void handleResponse(DNSIncoming dNSIncoming) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zHandleResponse = false;
        boolean zHandleResponse2 = false;
        for (DNSRecord dNSRecord : aRecordsLast(dNSIncoming.getAllAnswers())) {
            handleRecord(dNSRecord, jCurrentTimeMillis);
            if (DNSRecordType.TYPE_A.equals(dNSRecord.getRecordType()) || DNSRecordType.TYPE_AAAA.equals(dNSRecord.getRecordType())) {
                zHandleResponse |= dNSRecord.handleResponse(this);
            } else {
                zHandleResponse2 |= dNSRecord.handleResponse(this);
            }
        }
        if (zHandleResponse || zHandleResponse2) {
            startProber();
        }
    }

    public void handleServiceResolved(final ServiceEvent serviceEvent) {
        ArrayList arrayList;
        List<ListenerStatus.ServiceListenerStatus> list = this._serviceListeners.get(serviceEvent.getType().toLowerCase());
        if (list == null || list.isEmpty() || serviceEvent.getInfo() == null || !serviceEvent.getInfo().hasData()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final ListenerStatus.ServiceListenerStatus serviceListenerStatus = (ListenerStatus.ServiceListenerStatus) obj;
            this._executor.submit(new Runnable() { // from class: javax.jmdns.impl.JmDNSImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    serviceListenerStatus.serviceResolved(serviceEvent);
                }
            });
        }
    }

    public void ioLock() {
        this._ioLock.lock();
    }

    public void ioUnlock() {
        this._ioLock.unlock();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAnnounced() {
        return this._localHost.isAnnounced();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAnnouncing() {
        return this._localHost.isAnnouncing();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAssociatedWithTask(DNSTask dNSTask, DNSState dNSState) {
        return this._localHost.isAssociatedWithTask(dNSTask, dNSState);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isCanceled() {
        return this._localHost.isCanceled();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isCanceling() {
        return this._localHost.isCanceling();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isClosed() {
        return this._localHost.isClosed();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isClosing() {
        return this._localHost.isClosing();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isProbing() {
        return this._localHost.isProbing();
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo[] list(String str) {
        return list(str, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    @Override // javax.jmdns.JmDNS
    public Map<String, ServiceInfo[]> listBySubtype(String str) {
        return listBySubtype(str, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    @Override // javax.jmdns.JmDNS
    @Deprecated
    public void printServices() {
        System.err.println(toString());
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void purgeStateTimer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).purgeStateTimer();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void purgeTimer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).purgeTimer();
    }

    public void recover() {
        logger.debug(getName() + "recover()");
        if (isClosing() || isClosed() || isCanceling() || isCanceled()) {
            return;
        }
        synchronized (this._recoverLock) {
            try {
                if (cancelState()) {
                    logger.debug(getName() + "recover() thread " + Thread.currentThread().getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(getName());
                    sb.append(".recover()");
                    new Thread(sb.toString()) { // from class: javax.jmdns.impl.JmDNSImpl.6
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() throws IOException {
                            JmDNSImpl.this.__recover();
                        }
                    }.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean recoverState() {
        return this._localHost.recoverState();
    }

    @Override // javax.jmdns.JmDNS
    public void registerService(ServiceInfo serviceInfo) throws IOException {
        if (isClosing() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) serviceInfo;
        if (serviceInfoImpl.getDns() != null) {
            if (serviceInfoImpl.getDns() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (this._services.get(serviceInfoImpl.getKey()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        serviceInfoImpl.setDns(this);
        registerServiceType(serviceInfoImpl.getTypeWithSubtype());
        serviceInfoImpl.recoverState();
        serviceInfoImpl.setServer(this._localHost.getName());
        serviceInfoImpl.addAddress(this._localHost.getInet4Address());
        serviceInfoImpl.addAddress(this._localHost.getInet6Address());
        waitForAnnounced(DNSConstants.SERVICE_INFO_TIMEOUT);
        makeServiceNameUnique(serviceInfoImpl);
        while (this._services.putIfAbsent(serviceInfoImpl.getKey(), serviceInfoImpl) != null) {
            makeServiceNameUnique(serviceInfoImpl);
        }
        startProber();
        serviceInfoImpl.waitForAnnounced(DNSConstants.SERVICE_INFO_TIMEOUT);
        if (logger.isDebugEnabled()) {
            logger.debug("registerService() JmDNS registered service as " + serviceInfoImpl);
        }
    }

    @Override // javax.jmdns.JmDNS
    public boolean registerServiceType(String str) {
        boolean z10;
        ServiceTypeEntry serviceTypeEntry;
        Map<ServiceInfo.Fields, String> mapDecodeQualifiedNameMapForType = ServiceInfoImpl.decodeQualifiedNameMapForType(str);
        String str2 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Domain);
        String str3 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Protocol);
        String str4 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Application);
        String str5 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? "_" + str4 + "." : "");
        sb.append(str3.length() > 0 ? "_" + str3 + "." : "");
        sb.append(str2);
        sb.append(".");
        String string = sb.toString();
        String lowerCase = string.toLowerCase();
        if (logger.isDebugEnabled()) {
            Logger logger2 = logger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getName());
            sb2.append(".registering service type: ");
            sb2.append(str);
            sb2.append(" as: ");
            sb2.append(string);
            sb2.append(str5.length() > 0 ? " subtype: " + str5 : "");
            logger2.debug(sb2.toString());
        }
        boolean z11 = true;
        if (this._serviceTypes.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z10 = false;
        } else {
            z10 = this._serviceTypes.putIfAbsent(lowerCase, new ServiceTypeEntry(string)) == null;
            if (z10) {
                Set<ListenerStatus.ServiceTypeListenerStatus> set = this._typeListeners;
                ListenerStatus.ServiceTypeListenerStatus[] serviceTypeListenerStatusArr = (ListenerStatus.ServiceTypeListenerStatus[]) set.toArray(new ListenerStatus.ServiceTypeListenerStatus[set.size()]);
                final ServiceEventImpl serviceEventImpl = new ServiceEventImpl(this, string, "", null);
                for (final ListenerStatus.ServiceTypeListenerStatus serviceTypeListenerStatus : serviceTypeListenerStatusArr) {
                    this._executor.submit(new Runnable() { // from class: javax.jmdns.impl.JmDNSImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            serviceTypeListenerStatus.serviceTypeAdded(serviceEventImpl);
                        }
                    });
                }
            }
        }
        if (str5.length() <= 0 || (serviceTypeEntry = this._serviceTypes.get(lowerCase)) == null || serviceTypeEntry.contains(str5)) {
            return z10;
        }
        synchronized (serviceTypeEntry) {
            try {
                if (serviceTypeEntry.contains(str5)) {
                    z11 = z10;
                } else {
                    serviceTypeEntry.add(str5);
                    Set<ListenerStatus.ServiceTypeListenerStatus> set2 = this._typeListeners;
                    ListenerStatus.ServiceTypeListenerStatus[] serviceTypeListenerStatusArr2 = (ListenerStatus.ServiceTypeListenerStatus[]) set2.toArray(new ListenerStatus.ServiceTypeListenerStatus[set2.size()]);
                    final ServiceEventImpl serviceEventImpl2 = new ServiceEventImpl(this, "_" + str5 + "._sub." + string, "", null);
                    for (final ListenerStatus.ServiceTypeListenerStatus serviceTypeListenerStatus2 : serviceTypeListenerStatusArr2) {
                        this._executor.submit(new Runnable() { // from class: javax.jmdns.impl.JmDNSImpl.3
                            @Override // java.lang.Runnable
                            public void run() {
                                serviceTypeListenerStatus2.subTypeForServiceTypeAdded(serviceEventImpl2);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public void removeAssociationWithTask(DNSTask dNSTask) {
        this._localHost.removeAssociationWithTask(dNSTask);
    }

    public void removeListener(DNSListener dNSListener) {
        this._listeners.remove(dNSListener);
    }

    @Override // javax.jmdns.JmDNS
    public void removeServiceListener(String str, ServiceListener serviceListener) {
        String lowerCase = str.toLowerCase();
        List<ListenerStatus.ServiceListenerStatus> list = this._serviceListeners.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                try {
                    list.remove(new ListenerStatus.ServiceListenerStatus(serviceListener, false));
                    if (list.isEmpty()) {
                        this._serviceListeners.remove(lowerCase, list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // javax.jmdns.JmDNS
    public void removeServiceTypeListener(ServiceTypeListener serviceTypeListener) {
        this._typeListeners.remove(new ListenerStatus.ServiceTypeListenerStatus(serviceTypeListener, false));
    }

    public void renewServiceCollector(String str) {
        if (this._serviceCollectors.containsKey(str.toLowerCase())) {
            startServiceResolver(str);
        }
    }

    @Override // javax.jmdns.JmDNS
    public void requestServiceInfo(String str, String str2) {
        requestServiceInfo(str, str2, false, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    public ServiceInfoImpl resolveServiceInfo(String str, String str2, String str3, boolean z10) {
        cleanCache();
        String lowerCase = str.toLowerCase();
        registerServiceType(str);
        if (this._serviceCollectors.putIfAbsent(lowerCase, new ServiceCollector(str)) == null) {
            addServiceListener(lowerCase, this._serviceCollectors.get(lowerCase), true);
        }
        ServiceInfoImpl serviceInfoFromCache = getServiceInfoFromCache(str, str2, str3, z10);
        startServiceInfoResolver(serviceInfoFromCache);
        return serviceInfoFromCache;
    }

    public void respondToQuery(DNSIncoming dNSIncoming) {
        ioLock();
        try {
            if (this._plannedAnswer == dNSIncoming) {
                this._plannedAnswer = null;
            }
        } finally {
            ioUnlock();
        }
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean revertState() {
        return this._localHost.revertState();
    }

    public void send(DNSOutgoing dNSOutgoing) throws IOException {
        InetAddress address;
        int port;
        if (dNSOutgoing.isEmpty()) {
            return;
        }
        if (dNSOutgoing.getDestination() != null) {
            address = dNSOutgoing.getDestination().getAddress();
            port = dNSOutgoing.getDestination().getPort();
        } else {
            address = this._group;
            port = DNSConstants.MDNS_PORT;
        }
        byte[] bArrData = dNSOutgoing.data();
        DatagramPacket datagramPacket = new DatagramPacket(bArrData, bArrData.length, address, port);
        if (logger.isTraceEnabled()) {
            try {
                DNSIncoming dNSIncoming = new DNSIncoming(datagramPacket);
                if (logger.isTraceEnabled()) {
                    logger.trace("send(" + getName() + ") JmDNS out:" + dNSIncoming.print(true));
                }
            } catch (IOException e10) {
                logger.debug(getClass().toString(), "send(" + getName() + ") - JmDNS can not parse what it sends!!!", e10);
            }
        }
        MulticastSocket multicastSocket = this._socket;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // javax.jmdns.JmDNS
    public JmDNS.Delegate setDelegate(JmDNS.Delegate delegate) {
        JmDNS.Delegate delegate2 = this._delegate;
        this._delegate = delegate;
        return delegate2;
    }

    public void setLastThrottleIncrement(long j10) {
        this._lastThrottleIncrement = j10;
    }

    public void setLocalHost(HostInfo hostInfo) {
        this._localHost = hostInfo;
    }

    public void setPlannedAnswer(DNSIncoming dNSIncoming) {
        this._plannedAnswer = dNSIncoming;
    }

    public void setThrottle(int i10) {
        this._throttle = i10;
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startAnnouncer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startAnnouncer();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startCanceler() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startCanceler();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startProber() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startProber();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startReaper() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startReaper();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startRenewer() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startRenewer();
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startResponder(DNSIncoming dNSIncoming, InetAddress inetAddress, int i10) {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startResponder(dNSIncoming, inetAddress, i10);
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startServiceInfoResolver(ServiceInfoImpl serviceInfoImpl) {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startServiceInfoResolver(serviceInfoImpl);
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startServiceResolver(String str) {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startServiceResolver(str);
    }

    @Override // javax.jmdns.impl.DNSTaskStarter
    public void startTypeResolver() {
        DNSTaskStarter.Factory.getInstance().getStarter(getDns()).startTypeResolver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.AbstractMap, javax.jmdns.impl.JmDNSImpl$ServiceTypeEntry] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    public String toString() {
        StringBuilder sb = new StringBuilder(KEYRecord.Flags.FLAG4);
        sb.append("\n");
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this._localHost);
        sb.append("\n\t---- Services -----");
        for (String str : this._services.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this._services.get(str));
        }
        sb.append("\n");
        sb.append("\t---- Types ----");
        Iterator<String> it = this._serviceTypes.keySet().iterator();
        while (it.hasNext()) {
            ServiceTypeEntry serviceTypeEntry = this._serviceTypes.get(it.next());
            sb.append("\n\t\tType: ");
            sb.append(serviceTypeEntry.getType());
            sb.append(": ");
            if (serviceTypeEntry.isEmpty()) {
                serviceTypeEntry = "no subtypes";
            }
            sb.append(serviceTypeEntry);
        }
        sb.append("\n");
        sb.append(this._cache.toString());
        sb.append("\n");
        sb.append("\t---- Service Collectors ----");
        for (String str2 : this._serviceCollectors.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(this._serviceCollectors.get(str2));
        }
        sb.append("\n");
        sb.append("\t---- Service Listeners ----");
        for (String str3 : this._serviceListeners.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this._serviceListeners.get(str3));
        }
        return sb.toString();
    }

    @Override // javax.jmdns.JmDNS
    public void unregisterAllServices() {
        if (logger.isDebugEnabled()) {
            logger.debug("unregisterAllServices()");
        }
        Iterator<String> it = this._services.keySet().iterator();
        while (it.hasNext()) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) this._services.get(it.next());
            if (serviceInfoImpl != null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Cancelling service info: " + serviceInfoImpl);
                }
                serviceInfoImpl.cancelState();
            }
        }
        startCanceler();
        for (String str : this._services.keySet()) {
            ServiceInfoImpl serviceInfoImpl2 = (ServiceInfoImpl) this._services.get(str);
            if (serviceInfoImpl2 != null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Wait for service info cancel: " + serviceInfoImpl2);
                }
                serviceInfoImpl2.waitForCanceled(5000L);
                this._services.remove(str, serviceInfoImpl2);
            }
        }
    }

    @Override // javax.jmdns.JmDNS
    public void unregisterService(ServiceInfo serviceInfo) {
        ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) this._services.get(serviceInfo.getKey());
        if (serviceInfoImpl == null) {
            logger.warn(getName() + " removing unregistered service info: " + serviceInfo.getKey());
            return;
        }
        serviceInfoImpl.cancelState();
        startCanceler();
        serviceInfoImpl.waitForCanceled(5000L);
        this._services.remove(serviceInfoImpl.getKey(), serviceInfoImpl);
        if (logger.isDebugEnabled()) {
            logger.debug("unregisterService() JmDNS " + getName() + " unregistered service as " + serviceInfoImpl);
        }
    }

    public void updateRecord(long j10, DNSRecord dNSRecord, Operation operation) {
        ArrayList arrayList;
        List<ListenerStatus.ServiceListenerStatus> arrayList2;
        synchronized (this._listeners) {
            arrayList = new ArrayList(this._listeners);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((DNSListener) obj).updateRecord(getCache(), j10, dNSRecord);
        }
        if (DNSRecordType.TYPE_PTR.equals(dNSRecord.getRecordType())) {
            final ServiceEvent serviceEvent = dNSRecord.getServiceEvent(this);
            if (serviceEvent.getInfo() == null || !serviceEvent.getInfo().hasData()) {
                ServiceInfoImpl serviceInfoFromCache = getServiceInfoFromCache(serviceEvent.getType(), serviceEvent.getName(), "", false);
                if (serviceInfoFromCache.hasData()) {
                    serviceEvent = new ServiceEventImpl(this, serviceEvent.getType(), serviceEvent.getName(), serviceInfoFromCache);
                }
            }
            List<ListenerStatus.ServiceListenerStatus> list = this._serviceListeners.get(serviceEvent.getType().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList(list);
                }
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            if (logger.isTraceEnabled()) {
                logger.trace(getName() + ".updating record for event: " + serviceEvent + " list " + arrayList2 + " operation: " + operation);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            int i11 = AnonymousClass7.$SwitchMap$javax$jmdns$impl$JmDNSImpl$Operation[operation.ordinal()];
            if (i11 == 1) {
                for (final ListenerStatus.ServiceListenerStatus serviceListenerStatus : arrayList2) {
                    if (serviceListenerStatus.isSynchronous()) {
                        serviceListenerStatus.serviceAdded(serviceEvent);
                    } else {
                        this._executor.submit(new Runnable() { // from class: javax.jmdns.impl.JmDNSImpl.4
                            @Override // java.lang.Runnable
                            public void run() {
                                serviceListenerStatus.serviceAdded(serviceEvent);
                            }
                        });
                    }
                }
                return;
            }
            if (i11 != 2) {
                return;
            }
            for (final ListenerStatus.ServiceListenerStatus serviceListenerStatus2 : arrayList2) {
                if (serviceListenerStatus2.isSynchronous()) {
                    serviceListenerStatus2.serviceRemoved(serviceEvent);
                } else {
                    this._executor.submit(new Runnable() { // from class: javax.jmdns.impl.JmDNSImpl.5
                        @Override // java.lang.Runnable
                        public void run() {
                            serviceListenerStatus2.serviceRemoved(serviceEvent);
                        }
                    });
                }
            }
        }
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForAnnounced(long j10) {
        return this._localHost.waitForAnnounced(j10);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForCanceled(long j10) {
        return this._localHost.waitForCanceled(j10);
    }

    private void addServiceListener(String str, ServiceListener serviceListener, boolean z10) {
        ListenerStatus.ServiceListenerStatus serviceListenerStatus = new ListenerStatus.ServiceListenerStatus(serviceListener, z10);
        String lowerCase = str.toLowerCase();
        List<ListenerStatus.ServiceListenerStatus> list = this._serviceListeners.get(lowerCase);
        if (list == null) {
            if (this._serviceListeners.putIfAbsent(lowerCase, new LinkedList()) == null && this._serviceCollectors.putIfAbsent(lowerCase, new ServiceCollector(str)) == null) {
                addServiceListener(lowerCase, this._serviceCollectors.get(lowerCase), true);
            }
            list = this._serviceListeners.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                try {
                    if (!list.contains(serviceListenerStatus)) {
                        list.add(serviceListenerStatus);
                    }
                } finally {
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DNSEntry> it = getCache().allValues().iterator();
        while (it.hasNext()) {
            DNSRecord dNSRecord = (DNSRecord) it.next();
            if (dNSRecord.getRecordType() == DNSRecordType.TYPE_SRV && dNSRecord.getKey().endsWith(lowerCase)) {
                arrayList.add(new ServiceEventImpl(this, dNSRecord.getType(), toUnqualifiedName(dNSRecord.getType(), dNSRecord.getName()), dNSRecord.getServiceInfo()));
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            serviceListenerStatus.serviceAdded((ServiceEvent) obj);
        }
        startServiceResolver(str);
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo getServiceInfo(String str, String str2, long j10) {
        return getServiceInfo(str, str2, false, j10);
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo[] list(String str, long j10) {
        cleanCache();
        String lowerCase = str.toLowerCase();
        if (isCanceling() || isCanceled()) {
            System.out.println("JmDNS Cancelling.");
            return new ServiceInfo[0];
        }
        ServiceCollector serviceCollector = this._serviceCollectors.get(lowerCase);
        if (serviceCollector == null) {
            boolean z10 = this._serviceCollectors.putIfAbsent(lowerCase, new ServiceCollector(str)) == null;
            ServiceCollector serviceCollector2 = this._serviceCollectors.get(lowerCase);
            if (z10) {
                addServiceListener(str, serviceCollector2, true);
            }
            serviceCollector = serviceCollector2;
        }
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + "-collector: " + serviceCollector);
        }
        return serviceCollector != null ? serviceCollector.list(j10) : new ServiceInfo[0];
    }

    @Override // javax.jmdns.JmDNS
    public Map<String, ServiceInfo[]> listBySubtype(String str, long j10) {
        HashMap map = new HashMap(5);
        for (ServiceInfo serviceInfo : list(str, j10)) {
            String lowerCase = serviceInfo.getSubtype().toLowerCase();
            if (!map.containsKey(lowerCase)) {
                map.put(lowerCase, new ArrayList(10));
            }
            ((List) map.get(lowerCase)).add(serviceInfo);
        }
        HashMap map2 = new HashMap(map.size());
        for (String str2 : map.keySet()) {
            List list = (List) map.get(str2);
            map2.put(str2, list.toArray(new ServiceInfo[list.size()]));
        }
        return map2;
    }

    @Override // javax.jmdns.JmDNS
    public void requestServiceInfo(String str, String str2, boolean z10) {
        requestServiceInfo(str, str2, z10, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo getServiceInfo(String str, String str2, boolean z10) {
        return getServiceInfo(str, str2, z10, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    @Override // javax.jmdns.JmDNS
    public void requestServiceInfo(String str, String str2, long j10) {
        requestServiceInfo(str, str2, false, DNSConstants.SERVICE_INFO_TIMEOUT);
    }

    @Override // javax.jmdns.JmDNS
    public ServiceInfo getServiceInfo(String str, String str2, boolean z10, long j10) {
        ServiceInfoImpl serviceInfoImplResolveServiceInfo = resolveServiceInfo(str, str2, "", z10);
        waitForInfoData(serviceInfoImplResolveServiceInfo, j10);
        if (serviceInfoImplResolveServiceInfo.hasData()) {
            return serviceInfoImplResolveServiceInfo;
        }
        return null;
    }

    @Override // javax.jmdns.JmDNS
    public void requestServiceInfo(String str, String str2, boolean z10, long j10) {
        waitForInfoData(resolveServiceInfo(str, str2, "", z10), j10);
    }
}
