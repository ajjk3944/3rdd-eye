package com.bytedance.sdk.openadsdk.utils;

import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes.dex */
public class db {
    private static final ThreadLocal<SecureRandom> emc = new ThreadLocal<>();

    public static String emc() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = emc;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b5 = (byte) (bArr[6] & 15);
        bArr[6] = b5;
        bArr[6] = (byte) (b5 | 64);
        byte b6 = (byte) (bArr[8] & 63);
        bArr[8] = b6;
        bArr[8] = (byte) (b6 | 128);
        long j6 = 0;
        long j7 = 0;
        for (int i = 0; i < 8; i++) {
            j7 = (j7 << 8) | (bArr[i] & 255);
        }
        for (int i3 = 8; i3 < 16; i3++) {
            j6 = (j6 << 8) | (bArr[i3] & 255);
        }
        return new UUID(j7, j6).toString();
    }
}
