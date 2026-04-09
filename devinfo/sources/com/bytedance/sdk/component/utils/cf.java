package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    private static final byte[] ouw = ouw("VP8X");

    private static byte[] ouw(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean ouw(byte[] bArr) {
        boolean z3;
        try {
            byte[] bArr2 = ouw;
            if (bArr2 == null || bArr == null || bArr2.length + 12 > bArr.length) {
                z3 = false;
                break;
            }
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4 + 12] != bArr2[i4]) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
            if (bArr.length <= 20) {
                return false;
            }
            return z3 && ((bArr[20] & 2) == 2);
        } catch (Throwable th2) {
            ko.ouw("ImageLoadUtils", th2);
            return false;
        }
    }
}
