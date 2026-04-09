package org.snmp4j.transport.tls;

import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class SecurityNameMapping {
    private OctetString data;
    private OctetString fingerprint;
    private OctetString securityName;
    private CertMappingType type;

    public enum CertMappingType {
        Specified,
        SANRFC822Name,
        SANDNSName,
        SANIpAddress,
        SANAny,
        CommonName
    }

    public SecurityNameMapping(OctetString octetString, OctetString octetString2, CertMappingType certMappingType, OctetString octetString3) {
        this.fingerprint = octetString;
        this.data = octetString2;
        this.type = certMappingType;
        this.securityName = octetString3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityNameMapping securityNameMapping = (SecurityNameMapping) obj;
        OctetString octetString = this.data;
        if (octetString == null ? securityNameMapping.data != null : !octetString.equals(securityNameMapping.data)) {
            return false;
        }
        OctetString octetString2 = this.fingerprint;
        if (octetString2 == null ? securityNameMapping.fingerprint == null : octetString2.equals(securityNameMapping.fingerprint)) {
            return this.type == securityNameMapping.type;
        }
        return false;
    }

    public OctetString getData() {
        return this.data;
    }

    public OctetString getFingerprint() {
        return this.fingerprint;
    }

    public OctetString getSecurityName() {
        return this.securityName;
    }

    public CertMappingType getType() {
        return this.type;
    }

    public int hashCode() {
        OctetString octetString = this.fingerprint;
        int iHashCode = (octetString != null ? octetString.hashCode() : 0) * 31;
        OctetString octetString2 = this.data;
        int iHashCode2 = (iHashCode + (octetString2 != null ? octetString2.hashCode() : 0)) * 31;
        CertMappingType certMappingType = this.type;
        return iHashCode2 + (certMappingType != null ? certMappingType.hashCode() : 0);
    }

    public String toString() {
        return "SecurityNameMapping{fingerprint=" + this.fingerprint + ", data=" + this.data + ", type=" + this.type + ", securityName=" + this.securityName + '}';
    }
}
