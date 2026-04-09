package com.bytedance.sdk.component.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn {
    private static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String ouw(String str) throws NoSuchAlgorithmException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    byte[] bArrDigest = messageDigest.digest();
                    if (bArrDigest != null) {
                        return ouw(bArrDigest, bArrDigest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String ouw(byte[] bArr, int i4) {
        if (bArr != null) {
            if (i4 <= bArr.length) {
                int i10 = i4 * 2;
                char[] cArr = new char[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    byte b10 = bArr[i12];
                    int i13 = i11 + 1;
                    char[] cArr2 = ouw;
                    cArr[i11] = cArr2[(b10 & 255) >> 4];
                    i11 += 2;
                    cArr[i13] = cArr2[b10 & 15];
                }
                return new String(cArr, 0, i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
