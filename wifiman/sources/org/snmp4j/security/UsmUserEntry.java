package org.snmp4j.security;

import java.io.Serializable;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class UsmUserEntry implements Serializable, Comparable {
    private static final long serialVersionUID = -3021438367015187166L;
    private byte[] authenticationKey;
    private OctetString engineID;
    private byte[] privacyKey;
    private SnmpConstants.StorageTypeEnum storageType;
    private OctetString userName;
    private UsmUser usmUser;

    public UsmUserEntry() {
        this.storageType = SnmpConstants.StorageTypeEnum.nonVolatile;
        this.engineID = new OctetString();
        this.userName = new OctetString();
        this.usmUser = new UsmUser(new OctetString(), null, null, null, null);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        OctetString octetString;
        UsmUserEntry usmUserEntry = (UsmUserEntry) obj;
        OctetString octetString2 = this.engineID;
        int iCompareTo = (octetString2 == null || (octetString = usmUserEntry.engineID) == null) ? (octetString2 == null || usmUserEntry.engineID != null) ? (octetString2 != null || usmUserEntry.engineID == null) ? 0 : -1 : 1 : octetString2.compareTo((Variable) octetString);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.userName.compareTo((Variable) usmUserEntry.userName);
        return iCompareTo2 == 0 ? this.usmUser.compareTo(usmUserEntry.usmUser) : iCompareTo2;
    }

    public byte[] getAuthenticationKey() {
        return this.authenticationKey;
    }

    public OctetString getEngineID() {
        return this.engineID;
    }

    public byte[] getPrivacyKey() {
        return this.privacyKey;
    }

    public SnmpConstants.StorageTypeEnum getStorageType() {
        return this.storageType;
    }

    public OctetString getUserName() {
        return this.userName;
    }

    public UsmUser getUsmUser() {
        return this.usmUser;
    }

    public void setAuthenticationKey(byte[] bArr) {
        this.authenticationKey = bArr;
    }

    public void setEngineID(OctetString octetString) {
        this.engineID = octetString;
    }

    public void setPrivacyKey(byte[] bArr) {
        this.privacyKey = bArr;
    }

    public void setStorageType(SnmpConstants.StorageTypeEnum storageTypeEnum) {
        this.storageType = storageTypeEnum;
    }

    public void setUserName(OctetString octetString) {
        this.userName = octetString;
    }

    public void setUsmUser(UsmUser usmUser) {
        this.usmUser = usmUser;
    }

    public String toString() {
        return "UsmUserEntry[userName=" + this.userName + ",usmUser=" + this.usmUser + ",storageType=" + this.storageType + "]";
    }

    public UsmUserEntry(OctetString octetString, UsmUser usmUser) {
        this.storageType = SnmpConstants.StorageTypeEnum.nonVolatile;
        this.userName = octetString;
        this.usmUser = usmUser;
        if (usmUser.isLocalized()) {
            this.engineID = usmUser.getLocalizationEngineID();
            if (usmUser.getAuthenticationProtocol() == null || usmUser.getAuthenticationPassphrase() == null) {
                return;
            }
            this.authenticationKey = usmUser.getAuthenticationPassphrase().getValue();
            if (usmUser.getPrivacyProtocol() == null || usmUser.getPrivacyPassphrase() == null) {
                return;
            }
            this.privacyKey = usmUser.getPrivacyPassphrase().getValue();
        }
    }

    public UsmUserEntry(OctetString octetString, OctetString octetString2, UsmUser usmUser) {
        this(octetString, usmUser);
        this.engineID = octetString2;
    }

    public UsmUserEntry(byte[] bArr, OctetString octetString, OID oid, byte[] bArr2, OID oid2, byte[] bArr3) {
        this.storageType = SnmpConstants.StorageTypeEnum.nonVolatile;
        this.engineID = bArr == null ? null : new OctetString(bArr);
        this.userName = octetString;
        this.authenticationKey = bArr2;
        this.privacyKey = bArr3;
        this.usmUser = new UsmUser(octetString, oid, bArr2 != null ? new OctetString(this.authenticationKey) : null, oid2, this.privacyKey != null ? new OctetString(this.privacyKey) : null, this.engineID);
    }
}
