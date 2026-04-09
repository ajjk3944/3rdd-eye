package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class PrivAES128 extends PrivAES {
    public static final OID ID = new OID("1.3.6.1.6.3.10.1.2.4");
    private static final long serialVersionUID = 4358221830402784741L;

    public PrivAES128() {
        super(16);
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        return (OID) ID.clone();
    }
}
