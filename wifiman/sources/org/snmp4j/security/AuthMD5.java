package org.snmp4j.security;

import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthMD5 extends AuthGeneric {
    public static final OID ID = new OID(SnmpConstants.usmHMACMD5AuthProtocol);
    public static final int KEY_LENGTH = 16;
    private static final long serialVersionUID = -5972274836195217352L;

    public AuthMD5() {
        super("MD5", 16);
    }

    @Override // org.snmp4j.security.AuthenticationProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        return (OID) ID.clone();
    }
}
