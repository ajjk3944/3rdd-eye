package org.snmp4j.security;

import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthSHA extends AuthGeneric {
    public static final OID ID = new OID(SnmpConstants.usmHMACSHAAuthProtocol);
    private static final long serialVersionUID = 2355896418236397919L;

    public AuthSHA() {
        super("SHA-1", 20);
    }

    @Override // org.snmp4j.security.AuthenticationProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        return (OID) ID.clone();
    }
}
