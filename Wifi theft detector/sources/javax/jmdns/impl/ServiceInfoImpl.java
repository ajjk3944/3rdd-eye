package javax.jmdns.impl;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public class ServiceInfoImpl extends ServiceInfo implements DNSListener, DNSStatefulObject {
    private static Logger logger = LoggerFactory.getLogger(ServiceInfoImpl.class.getName());
    private String _application;
    private Delegate _delegate;
    private String _domain;
    private final Set<Inet4Address> _ipv4Addresses;
    private final Set<Inet6Address> _ipv6Addresses;
    private transient String _key;
    private String _name;
    private boolean _needTextAnnouncing;
    private boolean _persistent;
    private int _port;
    private int _priority;
    private Map<String, byte[]> _props;
    private String _protocol;
    private String _server;
    private final ServiceInfoState _state;
    private String _subtype;
    private byte[] _text;
    private int _weight;

    /* renamed from: javax.jmdns.impl.ServiceInfoImpl$1, reason: invalid class name */
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
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_SRV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$jmdns$impl$constants$DNSRecordType[DNSRecordType.TYPE_PTR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface Delegate {
        void textValueUpdated(ServiceInfo serviceInfo, byte[] bArr);
    }

    public static final class ServiceInfoState extends DNSStatefulObject.DefaultImplementation {
        private static final long serialVersionUID = 1104131034952196820L;
        private final ServiceInfoImpl _info;

        public ServiceInfoState(ServiceInfoImpl serviceInfoImpl) {
            this._info = serviceInfoImpl;
        }

        @Override // javax.jmdns.impl.DNSStatefulObject.DefaultImplementation
        public void setDns(JmDNSImpl jmDNSImpl) {
            super.setDns(jmDNSImpl);
        }

        @Override // javax.jmdns.impl.DNSStatefulObject.DefaultImplementation
        public void setTask(DNSTask dNSTask) {
            super.setTask(dNSTask);
            if (this._task == null && this._info.needTextAnnouncing()) {
                lock();
                try {
                    if (this._task == null && this._info.needTextAnnouncing()) {
                        if (this._state.isAnnounced()) {
                            setState(DNSState.ANNOUNCING_1);
                            if (getDns() != null) {
                                getDns().startAnnouncer();
                            }
                        }
                        this._info.setNeedTextAnnouncing(false);
                    }
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }
    }

    public ServiceInfoImpl(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, String str4) throws IOException {
        this(decodeQualifiedNameMap(str, str2, str3), i10, i11, i12, z10, (byte[]) null);
        this._server = str4;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
            writeUTF(byteArrayOutputStream2, str4);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (byteArray.length > 255) {
                throw new IOException("Cannot have individual values larger that 255 chars. Offending value: " + str4);
            }
            byteArrayOutputStream.write((byte) byteArray.length);
            byteArrayOutputStream.write(byteArray, 0, byteArray.length);
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            this._text = (byteArray2 == null || byteArray2.length <= 0) ? DNSRecord.EMPTY_TXT : byteArray2;
        } catch (IOException e10) {
            throw new RuntimeException("unexpected exception: " + e10);
        }
    }

    public static Map<ServiceInfo.Fields, String> checkQualifiedNameMap(Map<ServiceInfo.Fields, String> map) {
        HashMap map2 = new HashMap(5);
        ServiceInfo.Fields fields = ServiceInfo.Fields.Domain;
        String str = "local";
        String str2 = map.containsKey(fields) ? map.get(fields) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(fields, removeSeparators(str));
        ServiceInfo.Fields fields2 = ServiceInfo.Fields.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(fields2) ? map.get(fields2) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(fields2, removeSeparators(str3));
        ServiceInfo.Fields fields3 = ServiceInfo.Fields.Application;
        String str5 = "";
        String str6 = map.containsKey(fields3) ? map.get(fields3) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        map2.put(fields3, removeSeparators(str6));
        ServiceInfo.Fields fields4 = ServiceInfo.Fields.Instance;
        String str7 = map.containsKey(fields4) ? map.get(fields4) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        map2.put(fields4, removeSeparators(str7));
        ServiceInfo.Fields fields5 = ServiceInfo.Fields.Subtype;
        String str8 = map.containsKey(fields5) ? map.get(fields5) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(fields5, removeSeparators(str5));
        return map2;
    }

    public static Map<ServiceInfo.Fields, String> decodeQualifiedNameMap(String str, String str2, String str3) {
        Map<ServiceInfo.Fields, String> mapDecodeQualifiedNameMapForType = decodeQualifiedNameMapForType(str);
        mapDecodeQualifiedNameMapForType.put(ServiceInfo.Fields.Instance, str2);
        mapDecodeQualifiedNameMapForType.put(ServiceInfo.Fields.Subtype, str3);
        return checkQualifiedNameMap(mapDecodeQualifiedNameMapForType);
    }

    public static Map<ServiceInfo.Fields, String> decodeQualifiedNameMapForType(String str) {
        String strRemoveSeparators;
        String strSubstring;
        String str2;
        int iIndexOf;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String lowerCase = str.toLowerCase();
        String strRemoveSeparators2 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strRemoveSeparators = removeSeparators(str.substring(0, iIndexOf2));
            strSubstring = str.substring(iIndexOf2);
        } else {
            if (lowerCase.contains("_") || !lowerCase.contains(".")) {
                if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (iIndexOf = lowerCase.indexOf("._")) > 0) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    int i10 = iIndexOf + 1;
                    if (i10 < lowerCase.length()) {
                        strSubstring3 = lowerCase.substring(i10);
                        str = str.substring(i10);
                    } else {
                        strSubstring3 = lowerCase;
                    }
                } else {
                    strSubstring3 = lowerCase;
                    strSubstring2 = "";
                }
                int iLastIndexOf = strSubstring3.lastIndexOf("._");
                if (iLastIndexOf > 0) {
                    int i11 = iLastIndexOf + 2;
                    strSubstring4 = str.substring(i11, strSubstring3.indexOf(46, i11));
                } else {
                    strSubstring4 = "";
                }
                if (strSubstring4.length() > 0) {
                    int iIndexOf3 = strSubstring3.indexOf("_" + strSubstring4.toLowerCase() + ".");
                    int length = strSubstring4.length() + iIndexOf3 + 2;
                    int length2 = strSubstring3.length() - (strSubstring3.endsWith(".") ? 1 : 0);
                    String strSubstring5 = length2 > length ? str.substring(length, length2) : "";
                    if (iIndexOf3 > 0) {
                        lowerCase = str.substring(0, iIndexOf3 - 1);
                        strSubstring = strSubstring5;
                    } else {
                        strSubstring = strSubstring5;
                        lowerCase = "";
                    }
                } else {
                    strSubstring = "";
                }
                int iIndexOf4 = lowerCase.toLowerCase().indexOf("._sub");
                if (iIndexOf4 > 0) {
                    strRemoveSeparators2 = removeSeparators(lowerCase.substring(0, iIndexOf4));
                    lowerCase = lowerCase.substring(iIndexOf4 + 5);
                }
                String str3 = strRemoveSeparators2;
                strRemoveSeparators2 = strSubstring4;
                str2 = str3;
                strRemoveSeparators = strSubstring2;
                HashMap map = new HashMap(5);
                map.put(ServiceInfo.Fields.Domain, removeSeparators(strSubstring));
                map.put(ServiceInfo.Fields.Protocol, strRemoveSeparators2);
                map.put(ServiceInfo.Fields.Application, removeSeparators(lowerCase));
                map.put(ServiceInfo.Fields.Instance, strRemoveSeparators);
                map.put(ServiceInfo.Fields.Subtype, str2);
                return map;
            }
            int iIndexOf5 = lowerCase.indexOf(46);
            strRemoveSeparators = removeSeparators(str.substring(0, iIndexOf5));
            strSubstring = removeSeparators(str.substring(iIndexOf5));
        }
        lowerCase = "";
        str2 = lowerCase;
        HashMap map2 = new HashMap(5);
        map2.put(ServiceInfo.Fields.Domain, removeSeparators(strSubstring));
        map2.put(ServiceInfo.Fields.Protocol, strRemoveSeparators2);
        map2.put(ServiceInfo.Fields.Application, removeSeparators(lowerCase));
        map2.put(ServiceInfo.Fields.Instance, strRemoveSeparators);
        map2.put(ServiceInfo.Fields.Subtype, str2);
        return map2;
    }

    private final boolean hasInetAddress() {
        return this._ipv4Addresses.size() > 0 || this._ipv6Addresses.size() > 0;
    }

    private static String removeSeparators(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.startsWith("_")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(".") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    private static byte[] textFromProperties(Map<String, ?> map) throws IOException {
        byte[] byteArray = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    writeUTF(byteArrayOutputStream2, str);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            writeUTF(byteArrayOutputStream2, (String) obj);
                        } else {
                            if (!(obj instanceof byte[])) {
                                throw new IllegalArgumentException("invalid property value: " + obj);
                            }
                            byte[] bArr = (byte[]) obj;
                            if (bArr.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr, 0, bArr.length);
                            } else {
                                obj = null;
                            }
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    if (byteArray2.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(str);
                        sb.append(obj != null ? "" : "=" + obj);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray2.length);
                    byteArrayOutputStream.write(byteArray2, 0, byteArray2.length);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new RuntimeException("unexpected exception: " + e10);
            }
        }
        return (byteArray == null || byteArray.length <= 0) ? DNSRecord.EMPTY_TXT : byteArray;
    }

    public static void writeUTF(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 1 && cCharAt <= 127) {
                outputStream.write(cCharAt);
            } else if (cCharAt > 2047) {
                outputStream.write(((cCharAt >> '\f') & 15) | 224);
                outputStream.write(((cCharAt >> 6) & 63) | 128);
                outputStream.write((cCharAt & '?') | 128);
            } else {
                outputStream.write(((cCharAt >> 6) & 31) | PsExtractor.AUDIO_STREAM);
                outputStream.write((cCharAt & '?') | 128);
            }
        }
    }

    public void _setText(byte[] bArr) {
        this._text = bArr;
        this._props = null;
    }

    public void addAddress(Inet4Address inet4Address) {
        this._ipv4Addresses.add(inet4Address);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean advanceState(DNSTask dNSTask) {
        return this._state.advanceState(dNSTask);
    }

    public Collection<DNSRecord> answers(DNSRecordClass dNSRecordClass, boolean z10, int i10, HostInfo hostInfo) {
        ArrayList arrayList = new ArrayList();
        if (dNSRecordClass != DNSRecordClass.CLASS_ANY && dNSRecordClass != DNSRecordClass.CLASS_IN) {
            return arrayList;
        }
        if (getSubtype().length() > 0) {
            arrayList.add(new DNSRecord.Pointer(getTypeWithSubtype(), DNSRecordClass.CLASS_IN, false, i10, getQualifiedName()));
        }
        String type = getType();
        DNSRecordClass dNSRecordClass2 = DNSRecordClass.CLASS_IN;
        arrayList.add(new DNSRecord.Pointer(type, dNSRecordClass2, false, i10, getQualifiedName()));
        arrayList.add(new DNSRecord.Service(getQualifiedName(), dNSRecordClass2, z10, i10, this._priority, this._weight, this._port, hostInfo.getName()));
        arrayList.add(new DNSRecord.Text(getQualifiedName(), dNSRecordClass2, z10, i10, getTextBytes()));
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

    public boolean equals(Object obj) {
        return (obj instanceof ServiceInfoImpl) && getQualifiedName().equals(((ServiceInfoImpl) obj).getQualifiedName());
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public InetAddress getAddress() {
        return getInetAddress();
    }

    @Override // javax.jmdns.ServiceInfo
    public String getApplication() {
        String str = this._application;
        return str != null ? str : "";
    }

    public Delegate getDelegate() {
        return this._delegate;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public JmDNSImpl getDns() {
        return this._state.getDns();
    }

    @Override // javax.jmdns.ServiceInfo
    public String getDomain() {
        String str = this._domain;
        return str != null ? str : "local";
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public String getHostAddress() {
        String[] hostAddresses = getHostAddresses();
        return hostAddresses.length > 0 ? hostAddresses[0] : "";
    }

    @Override // javax.jmdns.ServiceInfo
    public String[] getHostAddresses() {
        Inet4Address[] inet4Addresses = getInet4Addresses();
        Inet6Address[] inet6Addresses = getInet6Addresses();
        String[] strArr = new String[inet4Addresses.length + inet6Addresses.length];
        for (int i10 = 0; i10 < inet4Addresses.length; i10++) {
            strArr[i10] = inet4Addresses[i10].getHostAddress();
        }
        for (int i11 = 0; i11 < inet6Addresses.length; i11++) {
            strArr[inet4Addresses.length + i11] = "[" + inet6Addresses[i11].getHostAddress() + "]";
        }
        return strArr;
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public Inet4Address getInet4Address() {
        Inet4Address[] inet4Addresses = getInet4Addresses();
        if (inet4Addresses.length > 0) {
            return inet4Addresses[0];
        }
        return null;
    }

    @Override // javax.jmdns.ServiceInfo
    public Inet4Address[] getInet4Addresses() {
        Set<Inet4Address> set = this._ipv4Addresses;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public Inet6Address getInet6Address() {
        Inet6Address[] inet6Addresses = getInet6Addresses();
        if (inet6Addresses.length > 0) {
            return inet6Addresses[0];
        }
        return null;
    }

    @Override // javax.jmdns.ServiceInfo
    public Inet6Address[] getInet6Addresses() {
        Set<Inet6Address> set = this._ipv6Addresses;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public InetAddress getInetAddress() {
        InetAddress[] inetAddresses = getInetAddresses();
        if (inetAddresses.length > 0) {
            return inetAddresses[0];
        }
        return null;
    }

    @Override // javax.jmdns.ServiceInfo
    public InetAddress[] getInetAddresses() {
        ArrayList arrayList = new ArrayList(this._ipv4Addresses.size() + this._ipv6Addresses.size());
        arrayList.addAll(this._ipv4Addresses);
        arrayList.addAll(this._ipv6Addresses);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // javax.jmdns.ServiceInfo
    public String getKey() {
        if (this._key == null) {
            this._key = getQualifiedName().toLowerCase();
        }
        return this._key;
    }

    @Override // javax.jmdns.ServiceInfo
    public String getName() {
        String str = this._name;
        return str != null ? str : "";
    }

    @Override // javax.jmdns.ServiceInfo
    public String getNiceTextString() {
        StringBuffer stringBuffer = new StringBuffer();
        int length = getTextBytes().length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (i10 >= 200) {
                stringBuffer.append("...");
                break;
            }
            int i11 = getTextBytes()[i10] & 255;
            if (i11 < 32 || i11 > 127) {
                stringBuffer.append("\\0");
                stringBuffer.append(Integer.toString(i11, 8));
            } else {
                stringBuffer.append((char) i11);
            }
            i10++;
        }
        return stringBuffer.toString();
    }

    @Override // javax.jmdns.ServiceInfo
    public int getPort() {
        return this._port;
    }

    @Override // javax.jmdns.ServiceInfo
    public int getPriority() {
        return this._priority;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r0.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map<java.lang.String, byte[]> getProperties() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9._props     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L7a
            byte[] r0 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7a
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r2 = r1
        L12:
            byte[] r3 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r3 = r3.length     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r2 >= r3) goto L78
            byte[] r3 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r4 = r2 + 1
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L6d
            int r3 = r4 + r2
            byte[] r5 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r5 = r5.length     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r3 <= r5) goto L2f
            goto L6d
        L2f:
            r5 = r1
        L30:
            if (r5 >= r2) goto L45
            byte[] r6 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r7 = r4 + r5
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r7 = 61
            if (r6 == r7) goto L45
            int r5 = r5 + 1
            goto L30
        L41:
            r0 = move-exception
            goto L83
        L43:
            r1 = move-exception
            goto L71
        L45:
            byte[] r6 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r6 = r9.readUTF(r6, r4, r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r6 != 0) goto L53
            r0.clear()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            goto L78
        L53:
            if (r5 != r2) goto L5b
            byte[] r2 = javax.jmdns.ServiceInfo.NO_VALUE     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            goto L6b
        L5b:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            byte[] r8 = r9.getTextBytes()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
        L6b:
            r2 = r3
            goto L12
        L6d:
            r0.clear()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            goto L78
        L71:
            org.slf4j.Logger r2 = javax.jmdns.impl.ServiceInfoImpl.logger     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Malformed TXT Field "
            r2.warn(r3, r1)     // Catch: java.lang.Throwable -> L41
        L78:
            r9._props = r0     // Catch: java.lang.Throwable -> L41
        L7a:
            java.util.Map<java.lang.String, byte[]> r0 = r9._props     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7f
            goto L81
        L7f:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L41
        L81:
            monitor-exit(r9)
            return r0
        L83:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.getProperties():java.util.Map");
    }

    @Override // javax.jmdns.ServiceInfo
    public synchronized byte[] getPropertyBytes(String str) {
        return getProperties().get(str);
    }

    @Override // javax.jmdns.ServiceInfo
    public Enumeration<String> getPropertyNames() {
        Map<String, byte[]> properties = getProperties();
        return new Vector(properties != null ? properties.keySet() : Collections.EMPTY_SET).elements();
    }

    @Override // javax.jmdns.ServiceInfo
    public synchronized String getPropertyString(String str) {
        byte[] bArr = getProperties().get(str);
        if (bArr == null) {
            return null;
        }
        if (bArr == ServiceInfo.NO_VALUE) {
            return "true";
        }
        return readUTF(bArr, 0, bArr.length);
    }

    @Override // javax.jmdns.ServiceInfo
    public String getProtocol() {
        String str = this._protocol;
        return str != null ? str : "tcp";
    }

    @Override // javax.jmdns.ServiceInfo
    public String getQualifiedName() {
        String str;
        String str2;
        String domain = getDomain();
        String protocol = getProtocol();
        String application = getApplication();
        String name = getName();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (name.length() > 0) {
            str = name + ".";
        } else {
            str = "";
        }
        sb.append(str);
        if (application.length() > 0) {
            str2 = "_" + application + ".";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (protocol.length() > 0) {
            str3 = "_" + protocol + ".";
        }
        sb.append(str3);
        sb.append(domain);
        sb.append(".");
        return sb.toString();
    }

    @Override // javax.jmdns.ServiceInfo
    public Map<ServiceInfo.Fields, String> getQualifiedNameMap() {
        HashMap map = new HashMap(5);
        map.put(ServiceInfo.Fields.Domain, getDomain());
        map.put(ServiceInfo.Fields.Protocol, getProtocol());
        map.put(ServiceInfo.Fields.Application, getApplication());
        map.put(ServiceInfo.Fields.Instance, getName());
        map.put(ServiceInfo.Fields.Subtype, getSubtype());
        return map;
    }

    @Override // javax.jmdns.ServiceInfo
    public String getServer() {
        String str = this._server;
        return str != null ? str : "";
    }

    @Override // javax.jmdns.ServiceInfo
    public String getSubtype() {
        String str = this._subtype;
        return str != null ? str : "";
    }

    @Override // javax.jmdns.ServiceInfo
    public byte[] getTextBytes() {
        byte[] bArr = this._text;
        return (bArr == null || bArr.length <= 0) ? DNSRecord.EMPTY_TXT : bArr;
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public String getTextString() {
        Map<String, byte[]> properties = getProperties();
        Iterator<String> it = properties.keySet().iterator();
        if (!it.hasNext()) {
            return "";
        }
        String next = it.next();
        byte[] bArr = properties.get(next);
        if (bArr == null || bArr.length <= 0) {
            return next;
        }
        return next + "=" + new String(bArr);
    }

    @Override // javax.jmdns.ServiceInfo
    public String getType() {
        String str;
        String domain = getDomain();
        String protocol = getProtocol();
        String application = getApplication();
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (application.length() > 0) {
            str = "_" + application + ".";
        } else {
            str = "";
        }
        sb.append(str);
        if (protocol.length() > 0) {
            str2 = "_" + protocol + ".";
        }
        sb.append(str2);
        sb.append(domain);
        sb.append(".");
        return sb.toString();
    }

    @Override // javax.jmdns.ServiceInfo
    public String getTypeWithSubtype() {
        String str;
        String subtype = getSubtype();
        StringBuilder sb = new StringBuilder();
        if (subtype.length() > 0) {
            str = "_" + subtype.toLowerCase() + "._sub.";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(getType());
        return sb.toString();
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public String getURL() {
        return getURL("http");
    }

    @Override // javax.jmdns.ServiceInfo
    public String[] getURLs() {
        return getURLs("http");
    }

    @Override // javax.jmdns.ServiceInfo
    public int getWeight() {
        return this._weight;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // javax.jmdns.ServiceInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean hasData() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.getServer()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            boolean r0 = r1.hasInetAddress()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            byte[] r0 = r1.getTextBytes()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            byte[] r0 = r1.getTextBytes()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1c
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1c:
            r0 = move-exception
            goto L21
        L1e:
            r0 = 0
        L1f:
            monitor-exit(r1)
            return r0
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.hasData():boolean");
    }

    @Override // javax.jmdns.ServiceInfo
    public boolean hasSameAddresses(ServiceInfo serviceInfo) {
        if (serviceInfo == null) {
            return false;
        }
        if (serviceInfo instanceof ServiceInfoImpl) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) serviceInfo;
            return this._ipv4Addresses.size() == serviceInfoImpl._ipv4Addresses.size() && this._ipv6Addresses.size() == serviceInfoImpl._ipv6Addresses.size() && this._ipv4Addresses.equals(serviceInfoImpl._ipv4Addresses) && this._ipv6Addresses.equals(serviceInfoImpl._ipv6Addresses);
        }
        InetAddress[] inetAddresses = getInetAddresses();
        InetAddress[] inetAddresses2 = serviceInfo.getInetAddresses();
        return inetAddresses.length == inetAddresses2.length && new HashSet(Arrays.asList(inetAddresses)).equals(new HashSet(Arrays.asList(inetAddresses2)));
    }

    public int hashCode() {
        return getQualifiedName().hashCode();
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

    @Override // javax.jmdns.ServiceInfo
    public boolean isPersistent() {
        return this._persistent;
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean isProbing() {
        return this._state.isProbing();
    }

    public boolean needTextAnnouncing() {
        return this._needTextAnnouncing;
    }

    public String readUTF(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        StringBuffer stringBuffer = new StringBuffer();
        int i14 = i10 + i11;
        while (i10 < i14) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            int i16 = b10 & 255;
            switch (i16 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i10 = i15;
                    continue;
                    stringBuffer.append((char) i16);
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i10 += 2;
                    if (i10 < i11) {
                        i12 = (b10 & 63) << 4;
                        i13 = bArr[i15] & 15;
                        break;
                    } else {
                        return null;
                    }
                case 12:
                case 13:
                    if (i15 < i11) {
                        i12 = (b10 & 31) << 6;
                        i10 += 2;
                        i13 = bArr[i15] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i10 + 3 >= i11) {
                        return null;
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    i16 = ((bArr[i15] & 63) << 6) | ((b10 & 15) << 12) | (bArr[i17] & 63);
                    continue;
                    stringBuffer.append((char) i16);
            }
            i16 = i12 | i13;
            stringBuffer.append((char) i16);
        }
        return stringBuffer.toString();
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

    public void setDelegate(Delegate delegate) {
        this._delegate = delegate;
    }

    public void setDns(JmDNSImpl jmDNSImpl) {
        this._state.setDns(jmDNSImpl);
    }

    public void setName(String str) {
        this._name = str;
        this._key = null;
    }

    public void setNeedTextAnnouncing(boolean z10) {
        this._needTextAnnouncing = z10;
        if (z10) {
            this._state.setTask(null);
        }
    }

    public void setServer(String str) {
        this._server = str;
    }

    @Override // javax.jmdns.ServiceInfo
    public void setText(byte[] bArr) throws IllegalStateException {
        synchronized (this) {
            this._text = bArr;
            this._props = null;
            setNeedTextAnnouncing(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getName().length() > 0 ? getName() + "." : "");
        sb2.append(getTypeWithSubtype());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] inetAddresses = getInetAddresses();
        if (inetAddresses.length > 0) {
            for (InetAddress inetAddress : inetAddresses) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(getPort());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(getPort());
        }
        sb.append("' status: '");
        sb.append(this._state.toString());
        sb.append(isPersistent() ? "' is persistent," : "',");
        sb.append(" has ");
        sb.append(hasData() ? "" : "NO ");
        sb.append("data");
        if (getTextBytes().length > 0) {
            Map<String, byte[]> properties = getProperties();
            if (properties.isEmpty()) {
                sb.append(" empty");
            } else {
                sb.append("\n");
                for (String str : properties.keySet()) {
                    sb.append("\t" + str + ": " + new String(properties.get(str)) + "\n");
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    @Override // javax.jmdns.impl.DNSListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateRecord(javax.jmdns.impl.DNSCache r4, long r5, javax.jmdns.impl.DNSEntry r7) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.jmdns.impl.ServiceInfoImpl.updateRecord(javax.jmdns.impl.DNSCache, long, javax.jmdns.impl.DNSEntry):void");
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForAnnounced(long j10) {
        return this._state.waitForAnnounced(j10);
    }

    @Override // javax.jmdns.impl.DNSStatefulObject
    public boolean waitForCanceled(long j10) {
        return this._state.waitForCanceled(j10);
    }

    public void addAddress(Inet6Address inet6Address) {
        this._ipv6Addresses.add(inet6Address);
    }

    @Override // javax.jmdns.ServiceInfo
    @Deprecated
    public String getURL(String str) {
        String[] uRLs = getURLs(str);
        if (uRLs.length > 0) {
            return uRLs[0];
        }
        return str + "://null:" + getPort();
    }

    @Override // javax.jmdns.ServiceInfo
    public String[] getURLs(String str) {
        InetAddress[] inetAddresses = getInetAddresses();
        ArrayList arrayList = new ArrayList(inetAddresses.length);
        for (InetAddress inetAddress : inetAddresses) {
            String hostAddress = inetAddress.getHostAddress();
            if (inetAddress instanceof Inet6Address) {
                hostAddress = "[" + hostAddress + "]";
            }
            String string = str + "://" + hostAddress + ":" + getPort();
            String propertyString = getPropertyString(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
            if (propertyString != null) {
                if (propertyString.indexOf("://") >= 0) {
                    string = propertyString;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    if (!propertyString.startsWith("/")) {
                        propertyString = "/" + propertyString;
                    }
                    sb.append(propertyString);
                    string = sb.toString();
                }
            }
            arrayList.add(string);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.jmdns.ServiceInfo
    public ServiceInfoImpl clone() {
        ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl(getQualifiedNameMap(), this._port, this._weight, this._priority, this._persistent, this._text);
        for (Inet6Address inet6Address : getInet6Addresses()) {
            serviceInfoImpl._ipv6Addresses.add(inet6Address);
        }
        for (Inet4Address inet4Address : getInet4Addresses()) {
            serviceInfoImpl._ipv4Addresses.add(inet4Address);
        }
        return serviceInfoImpl;
    }

    @Override // javax.jmdns.ServiceInfo
    public void setText(Map<String, ?> map) throws IllegalStateException {
        setText(textFromProperties(map));
    }

    public ServiceInfoImpl(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, Map<String, ?> map) {
        this(decodeQualifiedNameMap(str, str2, str3), i10, i11, i12, z10, textFromProperties(map));
    }

    public ServiceInfoImpl(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, byte[] bArr) {
        this(decodeQualifiedNameMap(str, str2, str3), i10, i11, i12, z10, bArr);
    }

    public ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i10, int i11, int i12, boolean z10, Map<String, ?> map2) {
        this(map, i10, i11, i12, z10, textFromProperties(map2));
    }

    public ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i10, int i11, int i12, boolean z10, String str) {
        this(map, i10, i11, i12, z10, (byte[]) null);
        this._server = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            writeUTF(byteArrayOutputStream, str);
            this._text = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException("unexpected exception: " + e10);
        }
    }

    public ServiceInfoImpl(Map<ServiceInfo.Fields, String> map, int i10, int i11, int i12, boolean z10, byte[] bArr) {
        Map<ServiceInfo.Fields, String> mapCheckQualifiedNameMap = checkQualifiedNameMap(map);
        this._domain = mapCheckQualifiedNameMap.get(ServiceInfo.Fields.Domain);
        this._protocol = mapCheckQualifiedNameMap.get(ServiceInfo.Fields.Protocol);
        this._application = mapCheckQualifiedNameMap.get(ServiceInfo.Fields.Application);
        this._name = mapCheckQualifiedNameMap.get(ServiceInfo.Fields.Instance);
        this._subtype = mapCheckQualifiedNameMap.get(ServiceInfo.Fields.Subtype);
        this._port = i10;
        this._weight = i11;
        this._priority = i12;
        this._text = bArr;
        setNeedTextAnnouncing(false);
        this._state = new ServiceInfoState(this);
        this._persistent = z10;
        this._ipv4Addresses = Collections.synchronizedSet(new LinkedHashSet());
        this._ipv6Addresses = Collections.synchronizedSet(new LinkedHashSet());
    }

    public ServiceInfoImpl(ServiceInfo serviceInfo) {
        this._ipv4Addresses = Collections.synchronizedSet(new LinkedHashSet());
        this._ipv6Addresses = Collections.synchronizedSet(new LinkedHashSet());
        if (serviceInfo != null) {
            this._domain = serviceInfo.getDomain();
            this._protocol = serviceInfo.getProtocol();
            this._application = serviceInfo.getApplication();
            this._name = serviceInfo.getName();
            this._subtype = serviceInfo.getSubtype();
            this._port = serviceInfo.getPort();
            this._weight = serviceInfo.getWeight();
            this._priority = serviceInfo.getPriority();
            this._text = serviceInfo.getTextBytes();
            this._persistent = serviceInfo.isPersistent();
            for (Inet6Address inet6Address : serviceInfo.getInet6Addresses()) {
                this._ipv6Addresses.add(inet6Address);
            }
            for (Inet4Address inet4Address : serviceInfo.getInet4Addresses()) {
                this._ipv4Addresses.add(inet4Address);
            }
        }
        this._state = new ServiceInfoState(this);
    }
}
