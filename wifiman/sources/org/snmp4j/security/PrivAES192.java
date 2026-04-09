package org.snmp4j.security;

import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.nonstandard.NonStandardSecurityProtocol;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class PrivAES192 extends PrivAES implements NonStandardSecurityProtocol {
    public static OID ID = new OID(SnmpConstants.oosnmpUsmAesCfb192Protocol);
    private static final long serialVersionUID = -3496699866363408441L;
    private OID oid;

    public PrivAES192() {
        super(24);
    }

    @Override // org.snmp4j.security.nonstandard.NonStandardSecurityProtocol
    public OID getDefaultID() {
        return (OID) ID.clone();
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        OID oid = this.oid;
        return oid == null ? getDefaultID() : oid;
    }

    @Override // org.snmp4j.security.nonstandard.NonStandardSecurityProtocol
    public void setID(OID oid) {
        this.oid = new OID(oid);
    }
}
