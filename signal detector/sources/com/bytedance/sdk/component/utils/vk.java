package com.bytedance.sdk.component.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class vk {
    private static final char[] emc = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String emc(String str) throws NoSuchAlgorithmException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return emc(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String emc(byte[] bArr) {
        if (bArr != null) {
            return emc(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String emc(byte[] bArr, int i, int i3) {
        if (bArr != null) {
            if (i >= 0 && i + i3 <= bArr.length) {
                int i6 = i3 * 2;
                char[] cArr = new char[i6];
                int i7 = 0;
                for (int i8 = 0; i8 < i3; i8++) {
                    byte b5 = bArr[i8 + i];
                    int i9 = i7 + 1;
                    char[] cArr2 = emc;
                    cArr[i7] = cArr2[(b5 & 255) >> 4];
                    i7 += 2;
                    cArr[i9] = cArr2[b5 & 15];
                }
                return new String(cArr, 0, i6);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
