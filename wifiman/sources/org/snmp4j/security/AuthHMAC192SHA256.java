package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthHMAC192SHA256 extends AuthSHA2 {
    private static final int AUTH_CODE_LENGTH = 24;
    private static final int DIGEST_LENGTH = 32;
    public static final OID ID = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 5});
    private static final int HMAC_BLOCK_SIZE = AuthGeneric.HMAC_BLOCK_SIZE;

    public AuthHMAC192SHA256() {
        super("SHA-256", ID, 32, AUTH_CODE_LENGTH, HMAC_BLOCK_SIZE);
    }
}
