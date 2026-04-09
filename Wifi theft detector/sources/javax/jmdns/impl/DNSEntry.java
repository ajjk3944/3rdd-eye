package javax.jmdns.impl;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* loaded from: classes4.dex */
public abstract class DNSEntry {
    private final DNSRecordClass _dnsClass;
    private final String _key;
    private final String _name;
    final Map<ServiceInfo.Fields, String> _qualifiedNameMap;
    private final DNSRecordType _recordType;
    private final String _type;
    private final boolean _unique;

    public DNSEntry(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z10) {
        String str2;
        String str3;
        this._name = str;
        this._recordType = dNSRecordType;
        this._dnsClass = dNSRecordClass;
        this._unique = z10;
        Map<ServiceInfo.Fields, String> mapDecodeQualifiedNameMapForType = ServiceInfoImpl.decodeQualifiedNameMapForType(getName());
        this._qualifiedNameMap = mapDecodeQualifiedNameMapForType;
        String str4 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Domain);
        String str5 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Protocol);
        String str6 = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Application);
        String lowerCase = mapDecodeQualifiedNameMapForType.get(ServiceInfo.Fields.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        String str7 = "";
        if (str6.length() > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        String string = sb.toString();
        this._type = string;
        StringBuilder sb2 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb2.append(str7);
        sb2.append(string);
        this._key = sb2.toString().toLowerCase();
    }

    public int compareTo(DNSEntry dNSEntry) throws IOException {
        byte[] byteArray = toByteArray();
        byte[] byteArray2 = dNSEntry.toByteArray();
        int iMin = Math.min(byteArray.length, byteArray2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = byteArray[i10];
            byte b11 = byteArray2[i10];
            if (b10 > b11) {
                return 1;
            }
            if (b10 < b11) {
                return -1;
            }
        }
        return byteArray.length - byteArray2.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DNSEntry) {
            DNSEntry dNSEntry = (DNSEntry) obj;
            if (getKey().equals(dNSEntry.getKey()) && getRecordType().equals(dNSEntry.getRecordType()) && getRecordClass() == dNSEntry.getRecordClass()) {
                return true;
            }
        }
        return false;
    }

    public String getKey() {
        String str = this._key;
        return str != null ? str : "";
    }

    public String getName() {
        String str = this._name;
        return str != null ? str : "";
    }

    public Map<ServiceInfo.Fields, String> getQualifiedNameMap() {
        return Collections.unmodifiableMap(this._qualifiedNameMap);
    }

    public DNSRecordClass getRecordClass() {
        DNSRecordClass dNSRecordClass = this._dnsClass;
        return dNSRecordClass != null ? dNSRecordClass : DNSRecordClass.CLASS_UNKNOWN;
    }

    public DNSRecordType getRecordType() {
        DNSRecordType dNSRecordType = this._recordType;
        return dNSRecordType != null ? dNSRecordType : DNSRecordType.TYPE_IGNORE;
    }

    public String getSubtype() {
        String str = getQualifiedNameMap().get(ServiceInfo.Fields.Subtype);
        return str != null ? str : "";
    }

    public String getType() {
        String str = this._type;
        return str != null ? str : "";
    }

    public int hashCode() {
        return getKey().hashCode() + getRecordType().indexValue() + getRecordClass().indexValue();
    }

    public boolean isDomainDiscoveryQuery() {
        if (!this._qualifiedNameMap.get(ServiceInfo.Fields.Application).equals("dns-sd")) {
            return false;
        }
        String str = this._qualifiedNameMap.get(ServiceInfo.Fields.Instance);
        return DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B.equals(str) || "db".equals(str) || "r".equals(str) || DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE.equals(str) || "lb".equals(str);
    }

    public abstract boolean isExpired(long j10);

    public boolean isReverseLookup() {
        return isV4ReverseLookup() || isV6ReverseLookup();
    }

    public boolean isSameEntry(DNSEntry dNSEntry) {
        return getKey().equals(dNSEntry.getKey()) && matchRecordType(dNSEntry.getRecordType()) && matchRecordClass(dNSEntry.getRecordClass());
    }

    public boolean isSameRecordClass(DNSEntry dNSEntry) {
        return dNSEntry != null && dNSEntry.getRecordClass() == getRecordClass();
    }

    public boolean isSameType(DNSEntry dNSEntry) {
        return dNSEntry != null && dNSEntry.getRecordType() == getRecordType();
    }

    public boolean isServicesDiscoveryMetaQuery() {
        return this._qualifiedNameMap.get(ServiceInfo.Fields.Application).equals("dns-sd") && this._qualifiedNameMap.get(ServiceInfo.Fields.Instance).equals("_services");
    }

    public abstract boolean isStale(long j10);

    public boolean isUnique() {
        return this._unique;
    }

    public boolean isV4ReverseLookup() {
        return this._qualifiedNameMap.get(ServiceInfo.Fields.Domain).endsWith("in-addr.arpa");
    }

    public boolean isV6ReverseLookup() {
        return this._qualifiedNameMap.get(ServiceInfo.Fields.Domain).endsWith("ip6.arpa");
    }

    public boolean matchRecordClass(DNSRecordClass dNSRecordClass) {
        DNSRecordClass dNSRecordClass2 = DNSRecordClass.CLASS_ANY;
        return dNSRecordClass2 == dNSRecordClass || dNSRecordClass2 == getRecordClass() || getRecordClass().equals(dNSRecordClass);
    }

    public boolean matchRecordType(DNSRecordType dNSRecordType) {
        return getRecordType().equals(dNSRecordType);
    }

    public boolean sameSubtype(DNSEntry dNSEntry) {
        return getSubtype().equals(dNSEntry.getSubtype());
    }

    public void toByteArray(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(getName().getBytes("UTF8"));
        dataOutputStream.writeShort(getRecordType().indexValue());
        dataOutputStream.writeShort(getRecordClass().indexValue());
    }

    public void toString(StringBuilder sb) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(getRecordType());
        sb.append(sb2.toString());
        sb.append(", class: " + getRecordClass());
        sb.append(this._unique ? "-unique," : ",");
        sb.append(" name: " + this._name);
        toString(sb);
        sb.append("]");
        return sb.toString();
    }

    public byte[] toByteArray() throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            toByteArray(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }
}
