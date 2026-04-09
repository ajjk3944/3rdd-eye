package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class gbl {
    private static final byte[] emc = emc("VP8X");

    private static byte[] emc(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean emc(byte[] bArr, int i) {
        boolean zEmc;
        int i3;
        try {
            zEmc = emc(bArr, i + 12, emc);
            i3 = i + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i3) {
            return false;
        }
        return zEmc && ((bArr[i3] & 2) == 2);
    }

    private static boolean emc(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
