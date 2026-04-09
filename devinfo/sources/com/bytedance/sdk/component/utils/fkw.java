package com.bytedance.sdk.component.utils;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    private static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String ouw(byte[] bArr) {
        if (bArr != null) {
            return ouw(bArr, bArr.length);
        }
        throw new NullPointerException("bytes is null");
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

    public static String ouw(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i4 = fileInputStream.read(bArr, 0, Segment.SIZE);
                    if (i4 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i4);
                }
                String strOuw = ouw(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strOuw;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    public static String ouw(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return ouw(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
