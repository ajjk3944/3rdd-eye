package org.snmp4j.security;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class AuthHMAC256SHA384 extends AuthSHA2 {
    private static final int AUTH_CODE_LENGTH = 32;
    private static final int DIGEST_LENGTH = 48;
    private static final int HMAC_BLOCK_SIZE = 128;
    public static final OID ID = new OID(new int[]{1, 3, 6, 1, 6, 3, 10, 1, 1, 6});

    public AuthHMAC256SHA384() {
        super("SHA-384", ID, DIGEST_LENGTH, 32, 128);
    }
}
