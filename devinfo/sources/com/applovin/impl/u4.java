package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class u4 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f5821a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f5822b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f5827a;

        a(int i4) {
            this.f5827a = i4;
        }

        public int b() {
            return this.f5827a;
        }

        public static a a(int i4) {
            return i4 == 0 ? DEFAULT : i4 == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f5822b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j, false, str2, kVar) : a(str, j, str2, kVar);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j, true, str2, kVar) : a(str, j, str2, kVar);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int iA;
        int i4;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f5822b, kVar).getBytes();
        int i10 = iA + 1;
        int length = bytes.length + i10;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i4 = length + 55) || bArr[i4] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i10, bytes.length + i10), bytes)) {
            return 0;
        }
        int i11 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i11;
    }

    private static byte[] a(String str, long j, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        char c9 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b10 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrA = a(strSubstring2, f5821a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ bArrA[0]);
            char c10 = '\b';
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ bArrA[1]);
            char c11 = 16;
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ bArrA[7]);
            int i4 = 0;
            while (i4 < bytes.length) {
                char c12 = c10;
                char c13 = c11;
                long j8 = j + i4;
                long j9 = (j8 ^ (j8 >> 33)) * (-4417276706812531889L);
                long j10 = (j9 ^ (j9 >> 29)) * (-8796714831421723037L);
                long j11 = j10 ^ (j10 >> c9);
                char c14 = c9;
                byteArrayOutputStream.write((byte) (((i4 >= bytes.length ? b10 : bytes[i4]) ^ bArrA[i4 % bArrA.length]) ^ (j11 & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> c12) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> c13) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> c14) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i4 + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j11 >> 56) & 255)));
                i4 += 8;
                c10 = c12;
                c11 = c13;
                c9 = c14;
                b10 = 0;
            }
            String strC = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f5821a, kVar) + ":" + strSubstring + ":" + strC).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            kVar.D().a("AppLovinSdk", "encode", e2);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        if (str != null) {
            if (str.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a aVarB = b(bArr);
            if (a.NONE == aVarB) {
                return new String(bArr);
            }
            if (aVarB == a.V2) {
                return a(bArr, str, kVar);
            }
            return a(new String(bArr), str, kVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c9 = (char) bArr[0];
            if (c9 == '2') {
                return a.V2;
            }
            if (c9 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j, boolean z3, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f5822b;
            byte[] bArrA = a(strSubstring2, bArr, kVar);
            long jC = n7.c(bArrA) ^ j;
            byte[] bytes2 = ("2:" + a(bArr, kVar) + ":" + strSubstring + ":").getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(n7.a(bytes), j, bArrA);
            if (z3) {
                byte[] bytes3 = c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = c(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e2) {
            kVar.D().a("AppLovinSdk", "encode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e10) {
            kVar.D().a("AppLovinSdk", "encode2", e10);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j8 = j;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (i4 % 8 == 0) {
                long j9 = i4 + j;
                long j10 = (j9 ^ (j9 >>> 33)) * (-4417276706812531889L);
                long j11 = (j10 ^ (j10 >>> 29)) * (-8796714831421723037L);
                j8 = j11 ^ (j11 >>> 32);
            }
            byte b10 = bArrCopyOf[i4];
            bArrCopyOf[i4] = (byte) (b10 ^ (((j8 >> (r4 * 8)) & 255) ^ bArr2[i4 % bArr2.length]));
        }
        return bArrCopyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, IOException {
        String str3;
        String[] strArrSplit = str.split(":");
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                char c9 = 2;
                String str5 = strArrSplit[2];
                char c10 = 3;
                byte[] bArrB = b(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f5821a;
                if (!a(bArr, kVar).equals(str4)) {
                    return null;
                }
                byte[] bArrA = a(str2.substring(0, 32), bArr, kVar);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                char c11 = 5;
                str3 = null;
                char c12 = '(';
                try {
                    char c13 = 7;
                    long j = (((byteArrayInputStream.read() ^ bArrA[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ bArrA[0]) & 255) | (((byteArrayInputStream.read() ^ bArrA[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ bArrA[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ bArrA[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ bArrA[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ bArrA[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ bArrA[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i4 = byteArrayInputStream.read(bArr2);
                    int i10 = 0;
                    while (i4 >= 0) {
                        char c14 = c13;
                        long j8 = i10 + j;
                        long j9 = (j8 ^ (j8 >> 33)) * (-4417276706812531889L);
                        long j10 = (j9 ^ (j9 >> 29)) * (-8796714831421723037L);
                        long j11 = j10 ^ (j10 >> 32);
                        byteArrayOutputStream.write((byte) ((bArr2[0] ^ bArrA[i10 % bArrA.length]) ^ (j11 & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[1] ^ bArrA[(i10 + 1) % bArrA.length]) ^ ((j11 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r23] ^ bArrA[(i10 + 2) % bArrA.length]) ^ ((j11 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r27] ^ bArrA[(i10 + 3) % bArrA.length]) ^ ((j11 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[4] ^ bArrA[(i10 + 4) % bArrA.length]) ^ ((j11 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r26] ^ bArrA[(i10 + 5) % bArrA.length]) ^ ((j11 >> r28) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[6] ^ bArrA[(i10 + 6) % bArrA.length]) ^ ((j11 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j11 >> 56) & 255) ^ (bArr2[c14] ^ bArrA[(i10 + 7) % bArrA.length])));
                        i10 += 8;
                        c9 = c9;
                        c11 = c11;
                        c10 = c10;
                        c12 = c12;
                        i4 = byteArrayInputStream.read(bArr2);
                        c13 = c14;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e2) {
                    e = e2;
                    com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to read bytes", e);
                    kVar.D().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e10) {
                kVar.D().a("AppLovinSdk", "decode", e10);
                throw new RuntimeException("UTF-8 encoding not found", e10);
            }
        } catch (IOException e11) {
            e = e11;
            str3 = null;
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            int iC = c(bArr, str, kVar);
            if (iC == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                return null;
            }
            long jA = n7.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f5822b, kVar);
            return new String(n7.d(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ n7.c(bArrA), bArrA)), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            kVar.D().a("AppLovinSdk", "decode2", e2);
            throw new RuntimeException("UTF-8 encoding not found", e2);
        } catch (IOException e10) {
            com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to ungzip decode", e10);
            kVar.D().a("AppLovinSdk", "decode2", e10);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (bArr[i4] == b10) {
                    return i4;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            kVar.D().a("AppLovinSdk", "SHA256", e2);
            throw new RuntimeException("SHA-256 algorithm not found", e2);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            kVar.D().a("AppLovinSdk", "SHA1", e2);
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
