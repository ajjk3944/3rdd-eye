package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthHMAC128SHA224 extends AuthSHA2 {
    private static final int AUTH_CODE_LENGTH = 16;
    private static final int DIGEST_LENGTH = 28;
    public static final OID ID = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 4});
    private static final int HMAC_BLOCK_SIZE = AuthGeneric.HMAC_BLOCK_SIZE;

    public AuthHMAC128SHA224() {
        super("SHA-224", ID, DIGEST_LENGTH, 16, HMAC_BLOCK_SIZE);
    }
}
