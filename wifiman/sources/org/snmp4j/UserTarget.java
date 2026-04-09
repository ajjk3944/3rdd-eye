package org.snmp4j;

import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class UserTarget extends SecureTarget {
    private static final long serialVersionUID = -1426511355567423746L;
    private OctetString authoritativeEngineID;

    public UserTarget() {
        this.authoritativeEngineID = new OctetString();
        setSecurityModel(3);
    }

    @Override // org.snmp4j.Target
    public Target duplicate() {
        UserTarget userTarget = new UserTarget(getAddress(), this.securityName, this.authoritativeEngineID.getValue(), this.securityLevel);
        userTarget.setRetries(getRetries());
        userTarget.setTimeout(getTimeout());
        userTarget.setMaxSizeRequestPDU(getMaxSizeRequestPDU());
        userTarget.setSecurityModel(getSecurityModel());
        userTarget.setVersion(getVersion());
        userTarget.setPreferredTransports(getPreferredTransports());
        return userTarget;
    }

    @Override // org.snmp4j.AbstractTarget
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        OctetString octetString = this.authoritativeEngineID;
        OctetString octetString2 = ((UserTarget) obj).authoritativeEngineID;
        return octetString == null ? octetString2 == null : octetString.equals(octetString2);
    }

    public byte[] getAuthoritativeEngineID() {
        return this.authoritativeEngineID.getValue();
    }

    @Override // org.snmp4j.AbstractTarget
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        OctetString octetString = this.authoritativeEngineID;
        return iHashCode + (octetString != null ? octetString.hashCode() : 0);
    }

    public void setAuthoritativeEngineID(byte[] bArr) {
        this.authoritativeEngineID.setValue(bArr);
    }

    @Override // org.snmp4j.SecureTarget, org.snmp4j.AbstractTarget
    public String toString() {
        return "UserTarget[" + toStringAbstractTarget() + ", authoritativeEngineID=" + this.authoritativeEngineID + ']';
    }

    public UserTarget(Address address, OctetString octetString, byte[] bArr) {
        super(address, octetString);
        this.authoritativeEngineID = new OctetString();
        setAuthoritativeEngineID(bArr);
        setSecurityModel(3);
    }

    public UserTarget(Address address, OctetString octetString, byte[] bArr, int i10) {
        super(address, octetString);
        this.authoritativeEngineID = new OctetString();
        setAuthoritativeEngineID(bArr);
        setSecurityLevel(i10);
        setSecurityModel(3);
    }
}
