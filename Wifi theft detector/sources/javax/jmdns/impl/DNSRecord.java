package javax.jmdns.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.NameRegister;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public abstract class DNSRecord extends DNSEntry {
    private long _created;
    private int _isStaleAndShouldBeRefreshedPercentage;
    private final int _randomStaleRefreshOffset;
    private InetAddress _source;
    private int _ttl;
    private static Logger logger = LoggerFactory.getLogger(DNSRecord.class.getName());
    public static final byte[] EMPTY_TXT = {0};

    public static class HostInformation extends DNSRecord {
        String _cpu;
        String _os;

        public HostInformation(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, String str2, String str3) {
            super(str, DNSRecordType.TYPE_HINFO, dNSRecordClass, z10, i10);
            this._cpu = str2;
            this._os = str3;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException {
            return dNSOutgoing;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl) {
            ServiceInfo serviceInfo = getServiceInfo(false);
            ((ServiceInfoImpl) serviceInfo).setDns(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, serviceInfo.getType(), serviceInfo.getName(), serviceInfo);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            HashMap map = new HashMap(2);
            map.put("cpu", this._cpu);
            map.put("os", this._os);
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, z10, map);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleQuery(JmDNSImpl jmDNSImpl, long j10) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleResponse(JmDNSImpl jmDNSImpl) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean isSingleValued() {
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean sameValue(DNSRecord dNSRecord) {
            if (!(dNSRecord instanceof HostInformation)) {
                return false;
            }
            HostInformation hostInformation = (HostInformation) dNSRecord;
            String str = this._cpu;
            if (str != null || hostInformation._cpu == null) {
                return (this._os != null || hostInformation._os == null) && str.equals(hostInformation._cpu) && this._os.equals(hostInformation._os);
            }
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord, javax.jmdns.impl.DNSEntry
        public void toString(StringBuilder sb) {
            super.toString(sb);
            sb.append(" cpu: '" + this._cpu + "' os: '" + this._os + "'");
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            String str = this._cpu + " " + this._os;
            messageOutputStream.writeUTF(str, 0, str.length());
        }
    }

    public static class IPv4Address extends Address {
        public IPv4Address(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, InetAddress inetAddress) {
            super(str, DNSRecordType.TYPE_A, dNSRecordClass, z10, i10, inetAddress);
        }

        @Override // javax.jmdns.impl.DNSRecord.Address, javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) super.getServiceInfo(z10);
            serviceInfoImpl.addAddress((Inet4Address) this._addr);
            return serviceInfoImpl;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            InetAddress inetAddress = this._addr;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this._addr instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                messageOutputStream.writeBytes(address, 0, address.length);
            }
        }

        public IPv4Address(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, byte[] bArr) {
            super(str, DNSRecordType.TYPE_A, dNSRecordClass, z10, i10, bArr);
        }
    }

    public static class IPv6Address extends Address {
        public IPv6Address(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, InetAddress inetAddress) {
            super(str, DNSRecordType.TYPE_AAAA, dNSRecordClass, z10, i10, inetAddress);
        }

        @Override // javax.jmdns.impl.DNSRecord.Address, javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) super.getServiceInfo(z10);
            serviceInfoImpl.addAddress((Inet6Address) this._addr);
            return serviceInfoImpl;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            InetAddress inetAddress = this._addr;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this._addr instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i10 = 0; i10 < 16; i10++) {
                        if (i10 < 11) {
                            bArr[i10] = address[i10 - 12];
                        } else {
                            bArr[i10] = 0;
                        }
                    }
                    address = bArr;
                }
                messageOutputStream.writeBytes(address, 0, address.length);
            }
        }

        public IPv6Address(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, byte[] bArr) {
            super(str, DNSRecordType.TYPE_AAAA, dNSRecordClass, z10, i10, bArr);
        }
    }

    public static class Pointer extends DNSRecord {
        private final String _alias;

        public Pointer(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, String str2) {
            super(str, DNSRecordType.TYPE_PTR, dNSRecordClass, z10, i10);
            this._alias = str2;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException {
            return dNSOutgoing;
        }

        public String getAlias() {
            return this._alias;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl) {
            ServiceInfo serviceInfo = getServiceInfo(false);
            ((ServiceInfoImpl) serviceInfo).setDns(jmDNSImpl);
            String type = serviceInfo.getType();
            return new ServiceEventImpl(jmDNSImpl, type, JmDNSImpl.toUnqualifiedName(type, getAlias()), serviceInfo);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            if (isServicesDiscoveryMetaQuery()) {
                return new ServiceInfoImpl(ServiceInfoImpl.decodeQualifiedNameMapForType(getAlias()), 0, 0, 0, z10, (byte[]) null);
            }
            if (isReverseLookup()) {
                return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, z10, (byte[]) null);
            }
            if (isDomainDiscoveryQuery()) {
                return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, z10, (byte[]) null);
            }
            Map<ServiceInfo.Fields, String> mapDecodeQualifiedNameMapForType = ServiceInfoImpl.decodeQualifiedNameMapForType(getAlias());
            ServiceInfo.Fields fields = ServiceInfo.Fields.Subtype;
            mapDecodeQualifiedNameMapForType.put(fields, getQualifiedNameMap().get(fields));
            return new ServiceInfoImpl(mapDecodeQualifiedNameMapForType, 0, 0, 0, z10, getAlias());
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleQuery(JmDNSImpl jmDNSImpl, long j10) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleResponse(JmDNSImpl jmDNSImpl) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSEntry
        public boolean isSameEntry(DNSEntry dNSEntry) {
            return super.isSameEntry(dNSEntry) && (dNSEntry instanceof Pointer) && sameValue((Pointer) dNSEntry);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean isSingleValued() {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean sameValue(DNSRecord dNSRecord) {
            if (!(dNSRecord instanceof Pointer)) {
                return false;
            }
            Pointer pointer = (Pointer) dNSRecord;
            String str = this._alias;
            if (str != null || pointer._alias == null) {
                return str.equals(pointer._alias);
            }
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord, javax.jmdns.impl.DNSEntry
        public void toString(StringBuilder sb) {
            super.toString(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this._alias;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            messageOutputStream.writeName(this._alias);
        }
    }

    public static class Service extends DNSRecord {
        private static Logger logger1 = LoggerFactory.getLogger(Service.class.getName());
        private final int _port;
        private final int _priority;
        private final String _server;
        private final int _weight;

        public Service(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, int i11, int i12, int i13, String str2) {
            super(str, DNSRecordType.TYPE_SRV, dNSRecordClass, z10, i10);
            this._priority = i11;
            this._weight = i12;
            this._port = i13;
            this._server = str2;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) jmDNSImpl.getServices().get(getKey());
            if (serviceInfoImpl != null) {
                if ((this._port == serviceInfoImpl.getPort()) != this._server.equals(jmDNSImpl.getLocalHost().getName())) {
                    return jmDNSImpl.addAnswer(dNSIncoming, inetAddress, i10, dNSOutgoing, new Service(serviceInfoImpl.getQualifiedName(), DNSRecordClass.CLASS_IN, true, DNSConstants.DNS_TTL, serviceInfoImpl.getPriority(), serviceInfoImpl.getWeight(), serviceInfoImpl.getPort(), jmDNSImpl.getLocalHost().getName()));
                }
            }
            return dNSOutgoing;
        }

        public int getPort() {
            return this._port;
        }

        public int getPriority() {
            return this._priority;
        }

        public String getServer() {
            return this._server;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl) {
            ServiceInfo serviceInfo = getServiceInfo(false);
            ((ServiceInfoImpl) serviceInfo).setDns(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, serviceInfo.getType(), serviceInfo.getName(), serviceInfo);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            return new ServiceInfoImpl(getQualifiedNameMap(), this._port, this._weight, this._priority, z10, (byte[]) null);
        }

        public int getWeight() {
            return this._weight;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleQuery(JmDNSImpl jmDNSImpl, long j10) throws IOException {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) jmDNSImpl.getServices().get(getKey());
            if (serviceInfoImpl != null && ((serviceInfoImpl.isAnnouncing() || serviceInfoImpl.isAnnounced()) && (this._port != serviceInfoImpl.getPort() || !this._server.equalsIgnoreCase(jmDNSImpl.getLocalHost().getName())))) {
                logger1.debug("handleQuery() Conflicting probe detected from: " + getRecordSource());
                Service service = new Service(serviceInfoImpl.getQualifiedName(), DNSRecordClass.CLASS_IN, true, DNSConstants.DNS_TTL, serviceInfoImpl.getPriority(), serviceInfoImpl.getWeight(), serviceInfoImpl.getPort(), jmDNSImpl.getLocalHost().getName());
                try {
                    if (jmDNSImpl.getInetAddress().equals(getRecordSource())) {
                        logger1.warn("Got conflicting probe from ourselves\nincoming: " + toString() + "\nlocal   : " + service.toString());
                    }
                } catch (IOException e10) {
                    logger1.warn("IOException", (Throwable) e10);
                }
                int iCompareTo = compareTo(service);
                if (iCompareTo == 0) {
                    logger1.debug("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (serviceInfoImpl.isProbing() && iCompareTo > 0) {
                    String lowerCase = serviceInfoImpl.getQualifiedName().toLowerCase();
                    serviceInfoImpl.setName(NameRegister.Factory.getRegistry().incrementName(jmDNSImpl.getLocalHost().getInetAddress(), serviceInfoImpl.getName(), NameRegister.NameType.SERVICE));
                    jmDNSImpl.getServices().remove(lowerCase);
                    jmDNSImpl.getServices().put(serviceInfoImpl.getQualifiedName().toLowerCase(), serviceInfoImpl);
                    logger1.debug("handleQuery() Lost tie break: new unique name chosen:" + serviceInfoImpl.getName());
                    serviceInfoImpl.revertState();
                    return true;
                }
            }
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleResponse(JmDNSImpl jmDNSImpl) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) jmDNSImpl.getServices().get(getKey());
            if (serviceInfoImpl == null) {
                return false;
            }
            if (this._port == serviceInfoImpl.getPort() && this._server.equalsIgnoreCase(jmDNSImpl.getLocalHost().getName())) {
                return false;
            }
            logger1.debug("handleResponse() Denial detected");
            if (serviceInfoImpl.isProbing()) {
                String lowerCase = serviceInfoImpl.getQualifiedName().toLowerCase();
                serviceInfoImpl.setName(NameRegister.Factory.getRegistry().incrementName(jmDNSImpl.getLocalHost().getInetAddress(), serviceInfoImpl.getName(), NameRegister.NameType.SERVICE));
                jmDNSImpl.getServices().remove(lowerCase);
                jmDNSImpl.getServices().put(serviceInfoImpl.getQualifiedName().toLowerCase(), serviceInfoImpl);
                logger1.debug("handleResponse() New unique name chose:" + serviceInfoImpl.getName());
            }
            serviceInfoImpl.revertState();
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean isSingleValued() {
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean sameValue(DNSRecord dNSRecord) {
            if (!(dNSRecord instanceof Service)) {
                return false;
            }
            Service service = (Service) dNSRecord;
            return this._priority == service._priority && this._weight == service._weight && this._port == service._port && this._server.equals(service._server);
        }

        @Override // javax.jmdns.impl.DNSEntry
        public void toByteArray(DataOutputStream dataOutputStream) throws IOException {
            super.toByteArray(dataOutputStream);
            dataOutputStream.writeShort(this._priority);
            dataOutputStream.writeShort(this._weight);
            dataOutputStream.writeShort(this._port);
            try {
                dataOutputStream.write(this._server.getBytes(C.UTF8_NAME));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        @Override // javax.jmdns.impl.DNSRecord, javax.jmdns.impl.DNSEntry
        public void toString(StringBuilder sb) {
            super.toString(sb);
            sb.append(" server: '" + this._server + ":" + this._port + "'");
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            messageOutputStream.writeShort(this._priority);
            messageOutputStream.writeShort(this._weight);
            messageOutputStream.writeShort(this._port);
            if (DNSIncoming.USE_DOMAIN_NAME_FORMAT_FOR_SRV_TARGET) {
                messageOutputStream.writeName(this._server);
                return;
            }
            String str = this._server;
            messageOutputStream.writeUTF(str, 0, str.length());
            messageOutputStream.writeByte(0);
        }
    }

    public static class Text extends DNSRecord {
        private final byte[] _text;

        public Text(String str, DNSRecordClass dNSRecordClass, boolean z10, int i10, byte[] bArr) {
            super(str, DNSRecordType.TYPE_TXT, dNSRecordClass, z10, i10);
            this._text = (bArr == null || bArr.length <= 0) ? DNSRecord.EMPTY_TXT : bArr;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException {
            return dNSOutgoing;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl) {
            ServiceInfo serviceInfo = getServiceInfo(false);
            ((ServiceInfoImpl) serviceInfo).setDns(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, serviceInfo.getType(), serviceInfo.getName(), serviceInfo);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, z10, this._text);
        }

        public byte[] getText() {
            return this._text;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleQuery(JmDNSImpl jmDNSImpl, long j10) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleResponse(JmDNSImpl jmDNSImpl) {
            return false;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean isSingleValued() {
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean sameValue(DNSRecord dNSRecord) {
            if (!(dNSRecord instanceof Text)) {
                return false;
            }
            Text text = (Text) dNSRecord;
            byte[] bArr = this._text;
            if ((bArr == null && text._text != null) || text._text.length != bArr.length) {
                return false;
            }
            int length = bArr.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    return true;
                }
                if (text._text[i10] != this._text[i10]) {
                    return false;
                }
                length = i10;
            }
        }

        @Override // javax.jmdns.impl.DNSRecord, javax.jmdns.impl.DNSEntry
        public void toString(StringBuilder sb) {
            String str;
            super.toString(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            byte[] bArr = this._text;
            if (bArr.length > 20) {
                str = new String(this._text, 0, 17) + "...";
            } else {
                str = new String(bArr);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }

        @Override // javax.jmdns.impl.DNSRecord
        public void write(DNSOutgoing.MessageOutputStream messageOutputStream) {
            byte[] bArr = this._text;
            messageOutputStream.writeBytes(bArr, 0, bArr.length);
        }
    }

    public DNSRecord(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z10, int i10) {
        super(str, dNSRecordType, dNSRecordClass, z10);
        this._ttl = i10;
        this._created = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this._randomStaleRefreshOffset = iNextInt;
        this._isStaleAndShouldBeRefreshedPercentage = iNextInt + 80;
    }

    public abstract DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException;

    @Override // javax.jmdns.impl.DNSEntry
    public boolean equals(Object obj) {
        return (obj instanceof DNSRecord) && super.equals(obj) && sameValue((DNSRecord) obj);
    }

    public long getExpirationTime(int i10) {
        return this._created + (i10 * this._ttl * 10);
    }

    public InetAddress getRecordSource() {
        return this._source;
    }

    public int getRemainingTTL(long j10) {
        return (int) Math.max(0L, (getExpirationTime(100) - j10) / 1000);
    }

    public abstract ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl);

    public ServiceInfo getServiceInfo() {
        return getServiceInfo(false);
    }

    public abstract ServiceInfo getServiceInfo(boolean z10);

    public int getTTL() {
        return this._ttl;
    }

    public abstract boolean handleQuery(JmDNSImpl jmDNSImpl, long j10);

    public abstract boolean handleResponse(JmDNSImpl jmDNSImpl);

    public void incrementRefreshPercentage() {
        int i10 = this._isStaleAndShouldBeRefreshedPercentage + 5;
        this._isStaleAndShouldBeRefreshedPercentage = i10;
        if (i10 > 100) {
            this._isStaleAndShouldBeRefreshedPercentage = 100;
        }
    }

    @Override // javax.jmdns.impl.DNSEntry
    public boolean isExpired(long j10) {
        return getExpirationTime(100) <= j10;
    }

    public abstract boolean isSingleValued();

    @Override // javax.jmdns.impl.DNSEntry
    public boolean isStale(long j10) {
        return getExpirationTime(50) <= j10;
    }

    public boolean isStaleAndShouldBeRefreshed(long j10) {
        return getExpirationTime(this._isStaleAndShouldBeRefreshedPercentage) <= j10;
    }

    public void resetTTL(DNSRecord dNSRecord) {
        this._created = dNSRecord._created;
        this._ttl = dNSRecord._ttl;
        this._isStaleAndShouldBeRefreshedPercentage = this._randomStaleRefreshOffset + 80;
    }

    public boolean sameType(DNSRecord dNSRecord) {
        return getRecordType() == dNSRecord.getRecordType();
    }

    public abstract boolean sameValue(DNSRecord dNSRecord);

    public void setRecordSource(InetAddress inetAddress) {
        this._source = inetAddress;
    }

    public void setTTL(int i10) {
        this._ttl = i10;
    }

    public void setWillExpireSoon(long j10) {
        this._created = j10;
        this._ttl = 1;
    }

    public boolean suppressedBy(DNSIncoming dNSIncoming) {
        try {
            Iterator<DNSRecord> it = dNSIncoming.getAllAnswers().iterator();
            while (it.hasNext()) {
                if (suppressedBy(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e10) {
            logger.warn("suppressedBy() message " + dNSIncoming + " exception ", (Throwable) e10);
            return false;
        }
    }

    @Override // javax.jmdns.impl.DNSEntry
    public void toString(StringBuilder sb) {
        super.toString(sb);
        sb.append(" ttl: '" + getRemainingTTL(System.currentTimeMillis()) + "/" + this._ttl + "'");
    }

    public abstract void write(DNSOutgoing.MessageOutputStream messageOutputStream);

    public static abstract class Address extends DNSRecord {
        private static Logger logger1 = LoggerFactory.getLogger(Address.class.getName());
        InetAddress _addr;

        public Address(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z10, int i10, InetAddress inetAddress) {
            super(str, dNSRecordType, dNSRecordClass, z10, i10);
            this._addr = inetAddress;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public DNSOutgoing addAnswer(JmDNSImpl jmDNSImpl, DNSIncoming dNSIncoming, InetAddress inetAddress, int i10, DNSOutgoing dNSOutgoing) throws IOException {
            return dNSOutgoing;
        }

        public InetAddress getAddress() {
            return this._addr;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceEvent getServiceEvent(JmDNSImpl jmDNSImpl) {
            ServiceInfo serviceInfo = getServiceInfo(false);
            ((ServiceInfoImpl) serviceInfo).setDns(jmDNSImpl);
            return new ServiceEventImpl(jmDNSImpl, serviceInfo.getType(), serviceInfo.getName(), serviceInfo);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public ServiceInfo getServiceInfo(boolean z10) {
            return new ServiceInfoImpl(getQualifiedNameMap(), 0, 0, 0, z10, (byte[]) null);
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleQuery(JmDNSImpl jmDNSImpl, long j10) throws IOException {
            Address dNSAddressRecord;
            if (!jmDNSImpl.getLocalHost().conflictWithRecord(this) || (dNSAddressRecord = jmDNSImpl.getLocalHost().getDNSAddressRecord(getRecordType(), isUnique(), DNSConstants.DNS_TTL)) == null) {
                return false;
            }
            int iCompareTo = compareTo(dNSAddressRecord);
            if (iCompareTo == 0) {
                logger1.debug("handleQuery() Ignoring an identical address query");
                return false;
            }
            logger1.debug("handleQuery() Conflicting query detected.");
            if (jmDNSImpl.isProbing() && iCompareTo > 0) {
                jmDNSImpl.getLocalHost().incrementHostName();
                jmDNSImpl.getCache().clear();
                Iterator<ServiceInfo> it = jmDNSImpl.getServices().values().iterator();
                while (it.hasNext()) {
                    ((ServiceInfoImpl) it.next()).revertState();
                }
            }
            jmDNSImpl.revertState();
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean handleResponse(JmDNSImpl jmDNSImpl) {
            if (!jmDNSImpl.getLocalHost().conflictWithRecord(this)) {
                return false;
            }
            logger1.debug("handleResponse() Denial detected");
            if (jmDNSImpl.isProbing()) {
                jmDNSImpl.getLocalHost().incrementHostName();
                jmDNSImpl.getCache().clear();
                Iterator<ServiceInfo> it = jmDNSImpl.getServices().values().iterator();
                while (it.hasNext()) {
                    ((ServiceInfoImpl) it.next()).revertState();
                }
            }
            jmDNSImpl.revertState();
            return true;
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean isSingleValued() {
            return false;
        }

        public boolean same(DNSRecord dNSRecord) {
            return (dNSRecord instanceof Address) && sameName(dNSRecord) && sameValue(dNSRecord);
        }

        public boolean sameName(DNSRecord dNSRecord) {
            return getName().equalsIgnoreCase(dNSRecord.getName());
        }

        @Override // javax.jmdns.impl.DNSRecord
        public boolean sameValue(DNSRecord dNSRecord) {
            try {
                if (!(dNSRecord instanceof Address)) {
                    return false;
                }
                Address address = (Address) dNSRecord;
                if (getAddress() != null || address.getAddress() == null) {
                    return getAddress().equals(address.getAddress());
                }
                return false;
            } catch (Exception e10) {
                logger1.info("Failed to compare addresses of DNSRecords", (Throwable) e10);
                return false;
            }
        }

        @Override // javax.jmdns.impl.DNSEntry
        public void toByteArray(DataOutputStream dataOutputStream) throws IOException {
            super.toByteArray(dataOutputStream);
            for (byte b10 : getAddress().getAddress()) {
                dataOutputStream.writeByte(b10);
            }
        }

        @Override // javax.jmdns.impl.DNSRecord, javax.jmdns.impl.DNSEntry
        public void toString(StringBuilder sb) {
            super.toString(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(getAddress() != null ? getAddress().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        public Address(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z10, int i10, byte[] bArr) {
            super(str, dNSRecordType, dNSRecordClass, z10, i10);
            try {
                this._addr = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e10) {
                logger1.warn("Address() exception ", (Throwable) e10);
            }
        }
    }

    public boolean suppressedBy(DNSRecord dNSRecord) {
        return equals(dNSRecord) && dNSRecord._ttl > this._ttl / 2;
    }
}
