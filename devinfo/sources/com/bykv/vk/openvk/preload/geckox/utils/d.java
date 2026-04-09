package com.bykv.vk.openvk.preload.geckox.utils;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.InputStream;
import java.security.MessageDigest;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f6808a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                try {
                    byte[] bArr = new byte[Buffer.SEGMENTING_THRESHOLD];
                    while (true) {
                        int i4 = inputStream.read(bArr, 0, Buffer.SEGMENTING_THRESHOLD);
                        if (i4 == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i4);
                        }
                    }
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new RuntimeException(u.u("md5 check failed file: local md5:", strA, " expect md5:", str));
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("md5 check failed:" + e10.getMessage(), e10);
                }
            } finally {
                CloseableUtils.close(inputStream);
            }
        } catch (Exception e11) {
            throw new RuntimeException("md5 check failed:" + e11.getMessage(), e11);
        }
    }

    private static String a(byte[] bArr, int i4) {
        if (bArr != null) {
            if (i4 <= bArr.length) {
                int i10 = i4 << 1;
                char[] cArr = new char[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < i4; i12++) {
                    byte b10 = bArr[i12];
                    int i13 = i11 + 1;
                    char[] cArr2 = f6808a;
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
