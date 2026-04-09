package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthHMAC384SHA512 extends AuthSHA2 {
    private static final int AUTH_CODE_LENGTH = 48;
    private static final int DIGEST_LENGTH = 64;
    private static final int HMAC_BLOCK_SIZE = 128;
    public static final OID ID = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 7});

    public AuthHMAC384SHA512() {
        super("SHA-512", ID, 64, AUTH_CODE_LENGTH, 128);
    }
}
