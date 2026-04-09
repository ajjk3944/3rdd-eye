package javax.jmdns.impl;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import javax.jmdns.NetworkTopologyDiscovery;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.NameRegister;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public class HostInfo implements DNSStatefulObject {
    private static Logger logger = LoggerFactory.getLogger(HostInfo.class.getName());
    protected InetAddress _address;
    protected NetworkInterface _interfaze;
    protected String _name;
    private final HostInfoState _state;

    /* renamed from: javax.jmdns.impl.HostInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$jmdns$impl$constants$DNSRecordType;

        static {
            int[] iArr = new int[DNSRecordType.values().length];
            $SwitchMap$javax$jmdns$impl$constants$DNSRecordType = iArr;
            try {
                iArr[DNSRecordType.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class HostInfoState extends DNSStatefulObject.DefaultImplementation {
        private static final long serialVersionUID = -8191476803620402088L;

        public HostInfoState(JmDNSImpl jmDNSImpl) {
            setDns(jmDNSImpl);
        }
    }

    private HostInfo(InetAddress inetAddress, String str, JmDNSImpl jmDNSImpl) {
        this._state = new HostInfoState(jmDNSImpl);
        this._address = inetAddress;
        this._name = str;
        if (inetAddress != null) {
            try {
                this._interfaze = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e10) {
                logger.warn("LocalHostInfo() exception ", (Throwable) e10);
            }
        }
    }

    private DNSRecord.Address getDNS4AddressRecord(boolean z10, int i10) {
        if (getInetAddress() instanceof Inet4Address) {
            return new DNSRecord.IPv4Address(getName(), DNSRecordClass.CLASS_IN, z10, i10, getInetAddress());
        }
        return null;
    }

    private DNSRecord.Pointer getDNS4ReverseAddressRecord(boolean z10, int i10) {
        if (!(getInetAddress() instanceof Inet4Address)) {
            return null;
        }
        return new DNSRecord.Pointer(getInetAddress().getHostAddress() + ".in-addr.arpa.", DNSRecordClass.CLASS_IN, z10, i10, getName());
    }

    private DNSRecord.Address getDNS6AddressRecord(boolean z10, int i10) {
        if (getInetAddress() instanceof Inet6Address) {
            return new DNSRecord.IPv6Address(getName(), DNSRecordClass.CLASS_IN, z10, i10, getInetAddress());
        }
        return null;
    }

    private DNSRecord.Pointer getDNS6ReverseAddressRecord(boolean z10, int i10) {
        if (!(getInetAddress() instanceof Inet6Address)) {
            return null;
        }
        return new DNSRecord.Pointer(getInetAddress().getHostAddress() + ".ip6.arpa.", DNSRecordClass.CLASS_IN, z10, i10, getName());
    }

    private static InetAddress loopbackAddress() {
        try {
            return InetAddress.getByName(null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static HostInfo newHostInfo(InetAddress inetAddress, JmDNSImpl jmDNSImpl, String str) {
        InetAddress localHost;
        String strSubstring = str != null ? str : "";
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddresses = NetworkTopologyDiscovery.Factory.getInstance().getInetAddresses();
                        if (inetAddresses.length > 0) {
                            localHost = inetAddresses[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    logger.warn("Could not find any address beside the loopback.");
                }
            } catch (IOException e10) {
                logger.warn("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e10.getMessage(), (Throwable) e10);
                localHost = loopbackAddress();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            localHost = inetAddress;
        }
        if (strSubstring.length() == 0) {
            strSubstring = localHost.getHostName();
        }
        if (strSubstring.contains("in-addr.arpa") || strSubstring.equals(localHost.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = localHost.getHostAddress();
            }
            strSubstring = str;
        }
        int iIndexOf = strSubstring.indexOf(".local");
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return new HostInfo(localHost, strSubstring.replaceAll("[:%\\.]", "-") + ".local.", jmDNSImpl);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean advanceState(DNSTask dNSTask) {
        return this._state.advanceState(dNSTask);
    }

    public Collection<DNSRecord> answers(DNSRecordClass dNSRecordClass, boolean z10, int i10) {
        ArrayList arrayList = new ArrayList();
        DNSRecord.Address dNS4AddressRecord = getDNS4AddressRecord(z10, i10);
        if (dNS4AddressRecord != null && dNS4AddressRecord.matchRecordClass(dNSRecordClass)) {
            arrayList.add(dNS4AddressRecord);
        }
        DNSRecord.Address dNS6AddressRecord = getDNS6AddressRecord(z10, i10);
        if (dNS6AddressRecord != null && dNS6AddressRecord.matchRecordClass(dNSRecordClass)) {
            arrayList.add(dNS6AddressRecord);
        }
        return arrayList;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public void associateWithTask(DNSTask dNSTask, DNSState dNSState) {
        this._state.associateWithTask(dNSTask, dNSState);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean cancelState() {
        return this._state.cancelState();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean closeState() {
        return this._state.closeState();
    }

    public boolean conflictWithRecord(DNSRecord.Address address) {
        DNSRecord.Address dNSAddressRecord = getDNSAddressRecord(address.getRecordType(), address.isUnique(), DNSConstants.DNS_TTL);
        return dNSAddressRecord != null && dNSAddressRecord.sameType(address) && dNSAddressRecord.sameName(address) && !dNSAddressRecord.sameValue(address);
    }

    public DNSRecord.Address getDNSAddressRecord(DNSRecordType dNSRecordType, boolean z10, int i10) {
        int i11 = AnonymousClass1.$SwitchMap$javax$jmdns$impl$constants$DNSRecordType[dNSRecordType.ordinal()];
        if (i11 == 1) {
            return getDNS4AddressRecord(z10, i10);
        }
        if (i11 == 2 || i11 == 3) {
            return getDNS6AddressRecord(z10, i10);
        }
        return null;
    }

    public DNSRecord.Pointer getDNSReverseAddressRecord(DNSRecordType dNSRecordType, boolean z10, int i10) {
        int i11 = AnonymousClass1.$SwitchMap$javax$jmdns$impl$constants$DNSRecordType[dNSRecordType.ordinal()];
        if (i11 == 1) {
            return getDNS4ReverseAddressRecord(z10, i10);
        }
        if (i11 == 2 || i11 == 3) {
            return getDNS6ReverseAddressRecord(z10, i10);
        }
        return null;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public JmDNSImpl getDns() {
        return this._state.getDns();
    }

    public Inet4Address getInet4Address() {
        if (getInetAddress() instanceof Inet4Address) {
            return (Inet4Address) this._address;
        }
        return null;
    }

    public Inet6Address getInet6Address() {
        if (getInetAddress() instanceof Inet6Address) {
            return (Inet6Address) this._address;
        }
        return null;
    }

    public InetAddress getInetAddress() {
        return this._address;
    }

    public NetworkInterface getInterface() {
        return this._interfaze;
    }

    public String getName() {
        return this._name;
    }

    public synchronized String incrementHostName() {
        String strIncrementName;
        strIncrementName = NameRegister.Factory.getRegistry().incrementName(getInetAddress(), this._name, NameRegister.NameType.HOST);
        this._name = strIncrementName;
        return strIncrementName;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAnnounced() {
        return this._state.isAnnounced();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAnnouncing() {
        return this._state.isAnnouncing();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isAssociatedWithTask(DNSTask dNSTask, DNSState dNSState) {
        return this._state.isAssociatedWithTask(dNSTask, dNSState);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isCanceled() {
        return this._state.isCanceled();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isCanceling() {
        return this._state.isCanceling();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isClosed() {
        return this._state.isClosed();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isClosing() {
        return this._state.isClosing();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isProbing() {
        return this._state.isProbing();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean recoverState() {
        return this._state.recoverState();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public void removeAssociationWithTask(DNSTask dNSTask) {
        this._state.removeAssociationWithTask(dNSTask);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean revertState() {
        return this._state.revertState();
    }

    public boolean shouldIgnorePacket(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z10 = false;
        if (getInetAddress() != null && (address = datagramPacket.getAddress()) != null) {
            if ((getInetAddress().isLinkLocalAddress() || getInetAddress().isMCLinkLocal()) && !address.isLinkLocalAddress()) {
                z10 = true;
            }
            if (address.isLoopbackAddress() && !getInetAddress().isLoopbackAddress()) {
                return true;
            }
        }
        return z10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(getName() != null ? getName() : "no name");
        sb.append(", ");
        sb.append(getInterface() != null ? getInterface().getDisplayName() : "???");
        sb.append(":");
        sb.append(getInetAddress() != null ? getInetAddress().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this._state);
        sb.append("]");
        return sb.toString();
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForAnnounced(long j10) {
        return this._state.waitForAnnounced(j10);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForCanceled(long j10) {
        if (this._address == null) {
            return true;
        }
        return this._state.waitForCanceled(j10);
    }
}
