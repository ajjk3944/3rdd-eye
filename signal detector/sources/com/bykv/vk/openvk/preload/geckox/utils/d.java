package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f6821a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                    }
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (str.equals(strA)) {
                            return;
                        }
                        throw new RuntimeException("md5 check failed file: local md5:" + strA + " expect md5:" + str);
                    } catch (Exception e6) {
                        throw new RuntimeException("md5 check failed:" + e6.getMessage(), e6);
                    }
                } catch (Exception e7) {
                    throw new RuntimeException("md5 check failed:" + e7.getMessage(), e7);
                }
            } finally {
                CloseableUtils.close(inputStream);
            }
        } catch (Exception e8) {
            throw new RuntimeException("md5 check failed:" + e8.getMessage(), e8);
        }
    }

    private static String a(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i3 = i << 1;
                char[] cArr = new char[i3];
                int i6 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    byte b5 = bArr[i7];
                    int i8 = i6 + 1;
                    char[] cArr2 = f6821a;
                    cArr[i6] = cArr2[(b5 & 255) >> 4];
                    i6 += 2;
                    cArr[i8] = cArr2[b5 & 15];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
