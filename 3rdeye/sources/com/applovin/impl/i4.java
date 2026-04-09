package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f19529a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f19530b;

    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f19535a;

        a(int i) {
            this.f19535a = i;
        }

        public int b() {
            return this.f19535a;
        }

        public static a a(int i) {
            return i == 0 ? DEFAULT : i == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f19530b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j4, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? a(str, j4, false, str2, kVar) : a(str, j4, str2, kVar);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    public static String b(String str, long j4, a aVar, String str2, com.applovin.impl.sdk.k kVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j4, true, str2, kVar) : a(str, j4, str2, kVar);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.k kVar) {
        int iA;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f19530b, kVar).getBytes();
        int i10 = iA + 1;
        int length = bytes.length + i10;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i10, bytes.length + i10), bytes)) {
            return 0;
        }
        int i11 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i11;
    }

    private static byte[] a(String str, long j4, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        char c10 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b10 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(Constants.ENCODING);
            byte[] bArrA = a(strSubstring2, f19529a, kVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j4 & 255)) ^ bArrA[0]);
            char c11 = '\b';
            byteArrayOutputStream.write(((byte) ((j4 >> 8) & 255)) ^ bArrA[1]);
            char c12 = 16;
            byteArrayOutputStream.write(((byte) ((j4 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j4 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j4 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j4 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j4 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j4 >> 56) & 255)) ^ bArrA[7]);
            int i = 0;
            while (i < bytes.length) {
                char c13 = c11;
                char c14 = c12;
                long j10 = j4 + i;
                long j11 = (j10 ^ (j10 >> 33)) * (-4417276706812531889L);
                long j12 = (j11 ^ (j11 >> 29)) * (-8796714831421723037L);
                long j13 = j12 ^ (j12 >> c10);
                char c15 = c10;
                byteArrayOutputStream.write((byte) (((i >= bytes.length ? b10 : bytes[i]) ^ bArrA[i % bArrA.length]) ^ (j13 & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> c13) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> c14) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> c15) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((bArrA[r4 % bArrA.length] ^ (i + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j13 >> 56) & 255)));
                i += 8;
                c11 = c13;
                c12 = c14;
                c10 = c15;
                b10 = 0;
            }
            String strC = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f19529a, kVar) + StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring + StringUtils.PROCESS_POSTFIX_DELIMITER + strC).getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e4) {
            kVar.E().a("AppLovinSdk", "encode", e4);
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
            char c10 = (char) bArr[0];
            if (c10 == '2') {
                return a.V2;
            }
            if (c10 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j4, boolean z10, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f19530b;
            byte[] bArrA = a(strSubstring2, bArr, kVar);
            long jC = a7.c(bArrA) ^ j4;
            byte[] bytes2 = ("2:" + a(bArr, kVar) + StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring + StringUtils.PROCESS_POSTFIX_DELIMITER).getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(a7.a(bytes), j4, bArrA);
            if (z10) {
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
        } catch (UnsupportedEncodingException e4) {
            kVar.E().a("AppLovinSdk", "encode2", e4);
            throw new RuntimeException("UTF-8 encoding not found", e4);
        } catch (IOException e10) {
            kVar.E().a("AppLovinSdk", "encode2", e10);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j4, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j10 = j4;
        for (int i = 0; i < bArr.length; i++) {
            if (i % 8 == 0) {
                long j11 = i + j4;
                long j12 = (j11 ^ (j11 >>> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >>> 29)) * (-8796714831421723037L);
                j10 = j13 ^ (j13 >>> 32);
            }
            byte b10 = bArrCopyOf[i];
            bArrCopyOf[i] = (byte) (b10 ^ (((j10 >> (r4 * 8)) & 255) ^ bArr2[i % bArr2.length]));
        }
        return bArrCopyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException, IOException {
        String str3;
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                char c10 = 2;
                String str5 = strArrSplit[2];
                char c11 = 3;
                byte[] bArrB = b(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f19529a;
                if (!a(bArr, kVar).equals(str4)) {
                    return null;
                }
                byte[] bArrA = a(str2.substring(0, 32), bArr, kVar);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                char c12 = 5;
                str3 = null;
                char c13 = '(';
                try {
                    char c14 = 7;
                    long j4 = (((byteArrayInputStream.read() ^ bArrA[1]) & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((byteArrayInputStream.read() ^ bArrA[0]) & KotlinVersion.MAX_COMPONENT_VALUE) | (((byteArrayInputStream.read() ^ bArrA[2]) & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (((byteArrayInputStream.read() ^ bArrA[3]) & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((byteArrayInputStream.read() ^ bArrA[4]) & KotlinVersion.MAX_COMPONENT_VALUE) << 32) | (((byteArrayInputStream.read() ^ bArrA[5]) & KotlinVersion.MAX_COMPONENT_VALUE) << 40) | (((byteArrayInputStream.read() ^ bArrA[6]) & KotlinVersion.MAX_COMPONENT_VALUE) << 48) | (((byteArrayInputStream.read() ^ bArrA[7]) & KotlinVersion.MAX_COMPONENT_VALUE) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i = byteArrayInputStream.read(bArr2);
                    int i10 = 0;
                    while (i >= 0) {
                        char c15 = c14;
                        long j10 = i10 + j4;
                        long j11 = (j10 ^ (j10 >> 33)) * (-4417276706812531889L);
                        long j12 = (j11 ^ (j11 >> 29)) * (-8796714831421723037L);
                        long j13 = j12 ^ (j12 >> 32);
                        byteArrayOutputStream.write((byte) ((bArr2[0] ^ bArrA[i10 % bArrA.length]) ^ (j13 & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[1] ^ bArrA[(i10 + 1) % bArrA.length]) ^ ((j13 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r23] ^ bArrA[(i10 + 2) % bArrA.length]) ^ ((j13 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r27] ^ bArrA[(i10 + 3) % bArrA.length]) ^ ((j13 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[4] ^ bArrA[(i10 + 4) % bArrA.length]) ^ ((j13 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r26] ^ bArrA[(i10 + 5) % bArrA.length]) ^ ((j13 >> r28) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[6] ^ bArrA[(i10 + 6) % bArrA.length]) ^ ((j13 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j13 >> 56) & 255) ^ (bArr2[c15] ^ bArrA[(i10 + 7) % bArrA.length])));
                        i10 += 8;
                        c10 = c10;
                        c12 = c12;
                        c11 = c11;
                        c13 = c13;
                        i = byteArrayInputStream.read(bArr2);
                        c14 = c15;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), Constants.ENCODING).trim();
                } catch (IOException e4) {
                    e = e4;
                    com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to read bytes", e);
                    kVar.E().a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e10) {
                kVar.E().a("AppLovinSdk", "decode", e10);
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
            long jA = a7.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f19530b, kVar);
            return new String(a7.d(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ a7.c(bArrA), bArrA)), Constants.ENCODING);
        } catch (UnsupportedEncodingException e4) {
            kVar.E().a("AppLovinSdk", "decode2", e4);
            throw new RuntimeException("UTF-8 encoding not found", e4);
        } catch (IOException e10) {
            com.applovin.impl.sdk.o.b("AppLovinSdk", "Failed to ungzip decode", e10);
            kVar.E().a("AppLovinSdk", "decode2", e10);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b10) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(Constants.ENCODING));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e4) {
            kVar.E().a("AppLovinSdk", "SHA256", e4);
            throw new RuntimeException("SHA-256 algorithm not found", e4);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.k kVar) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return com.applovin.impl.sdk.utils.StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e4) {
            kVar.E().a("AppLovinSdk", "SHA1", e4);
            throw new RuntimeException("SHA-1 algorithm not found", e4);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    private static String a(byte[] bArr) {
        return new String(bArr, Constants.ENCODING).replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
