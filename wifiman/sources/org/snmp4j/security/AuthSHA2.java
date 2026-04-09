package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthSHA2 extends AuthGeneric {
    private static final long serialVersionUID = 1;
    private OID protocolID;

    public AuthSHA2(String str, OID oid, int i10, int i11) {
        super(str, i10, i11);
        this.protocolID = oid;
    }

    @Override // org.snmp4j.security.AuthenticationProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        return (OID) this.protocolID.clone();
    }

    public AuthSHA2(String str, OID oid, int i10, int i11, int i12) {
        super(str, i10, i11, i12);
        this.protocolID = oid;
    }
}
