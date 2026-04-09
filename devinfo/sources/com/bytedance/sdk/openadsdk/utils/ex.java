package com.bytedance.sdk.openadsdk.utils;

import com.applovin.shadow.okio.Utf8;
import java.security.SecureRandom;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex {
    private static final ThreadLocal<SecureRandom> ouw = new ThreadLocal<>();

    public static String ouw() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = ouw;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j = 0;
        long j8 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            j8 = (j8 << 8) | (bArr[i4] & 255);
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return new UUID(j8, j).toString();
    }
}
