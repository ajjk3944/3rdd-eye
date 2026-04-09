package com.wireguard.crypto;

import com.wireguard.crypto.KeyFormatException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f45656a;

    public enum a {
        BASE64(44),
        BINARY(32),
        HEX(64);

        private final int length;

        a(int i10) {
            this.length = i10;
        }

        public int getLength() {
            return this.length;
        }
    }

    private b(byte[] bArr) {
        this.f45656a = Arrays.copyOf(bArr, bArr.length);
    }

    private static int a(char[] cArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            char c10 = cArr[i12 + i10];
            i11 |= ((((((((('@' - c10) & (c10 - '[')) >>> 8) & (c10 - '@')) - 1) + (((('`' - c10) & (c10 - '{')) >>> 8) & (c10 - 'F'))) + (((('/' - c10) & (c10 - ':')) >>> 8) & (c10 + 5))) + (((('*' - c10) & (c10 - ',')) >>> 8) & 63)) + ((((c10 - '0') & ('.' - c10)) >>> 8) & 64)) << (18 - (i12 * 6));
        }
        return i11;
    }

    private static void b(byte[] bArr, int i10, char[] cArr, int i11) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte[] bArr2 = {(byte) ((b10 >>> 2) & 63), (byte) (((b10 << 4) | ((b11 & 255) >>> 4)) & 63), (byte) ((((b12 & 255) >>> 6) | (b11 << 2)) & 63), (byte) (b12 & 63)};
        for (int i12 = 0; i12 < 4; i12++) {
            byte b13 = bArr2[i12];
            cArr[i12 + i11] = (char) (((((b13 + 65) + (((25 - b13) >>> 8) & 6)) - (((51 - b13) >>> 8) & 75)) - (((61 - b13) >>> 8) & 15)) + (((62 - b13) >>> 8) & 3));
        }
    }

    public static b c(String str) throws KeyFormatException {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        a aVar = a.BASE64;
        if (length != aVar.length || charArray[aVar.length - 1] != '=') {
            throw new KeyFormatException(aVar, KeyFormatException.a.LENGTH);
        }
        int i10 = a.BINARY.length;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 / 3) {
            int iA = a(charArray, i11 * 4);
            i12 |= iA >>> 31;
            int i13 = i11 * 3;
            bArr[i13] = (byte) ((iA >>> 16) & 255);
            bArr[i13 + 1] = (byte) ((iA >>> 8) & 255);
            bArr[i13 + 2] = (byte) (iA & 255);
            i11++;
        }
        int i14 = i11 * 4;
        int iA2 = a(new char[]{charArray[i14], charArray[i14 + 1], charArray[i14 + 2], 'A'}, 0);
        int i15 = (iA2 >>> 31) | (iA2 & 255) | i12;
        int i16 = i11 * 3;
        bArr[i16] = (byte) ((iA2 >>> 16) & 255);
        bArr[i16 + 1] = (byte) ((iA2 >>> 8) & 255);
        if (i15 == 0) {
            return new b(bArr);
        }
        throw new KeyFormatException(a.BASE64, KeyFormatException.a.CONTENTS);
    }

    public static b d(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        a aVar = a.HEX;
        if (length != aVar.length) {
            throw new KeyFormatException(aVar, KeyFormatException.a.LENGTH);
        }
        int i10 = a.BINARY.length;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * 2;
            char c10 = charArray[i13];
            int i14 = c10 ^ '0';
            int i15 = c10 & 65503;
            int i16 = i15 - 55;
            int i17 = (((i15 - 71) ^ (i15 - 65)) >>> 8) & 255;
            int i18 = i11 | (((r7 | i17) - 1) >>> 8);
            int i19 = ((i17 & i16) | (i14 & ((i14 - 10) >>> 8) & 255)) * 16;
            char c11 = charArray[i13 + 1];
            int i20 = c11 ^ '0';
            int i21 = c11 & 65503;
            int i22 = i21 - 55;
            int i23 = (((i21 - 71) ^ (i21 - 65)) >>> 8) & 255;
            i11 = i18 | (((r7 | i23) - 1) >>> 8);
            bArr[i12] = (byte) ((i23 & i22) | (i20 & ((i20 - 10) >>> 8) & 255) | i19);
        }
        if (i11 == 0) {
            return new b(bArr);
        }
        throw new KeyFormatException(a.HEX, KeyFormatException.a.CONTENTS);
    }

    static b e() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[a.BINARY.getLength()];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b10 = (byte) (bArr[31] & 127);
        bArr[31] = b10;
        bArr[31] = (byte) (b10 | 64);
        return new b(bArr);
    }

    static b f(b bVar) {
        byte[] bArr = new byte[a.BINARY.getLength()];
        com.wireguard.crypto.a.d(bArr, 0, bVar.g(), null);
        return new b(bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b.class) {
            return false;
        }
        return MessageDigest.isEqual(this.f45656a, ((b) obj).f45656a);
    }

    public byte[] g() {
        byte[] bArr = this.f45656a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String h() {
        char[] cArr = new char[a.BASE64.length];
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f45656a;
            if (i10 >= bArr.length / 3) {
                int i11 = i10 * 3;
                b(new byte[]{bArr[i11], bArr[i11 + 1], 0}, 0, cArr, i10 * 4);
                cArr[a.BASE64.length - 1] = '=';
                return new String(cArr);
            }
            b(bArr, i10 * 3, cArr, i10 * 4);
            i10++;
        }
    }

    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f45656a;
            if (i10 >= bArr.length / 4) {
                return i11;
            }
            int i12 = i10 * 4;
            i11 ^= ((bArr[i12] + (bArr[i12 + 1] >> 8)) + (bArr[i12 + 2] >> BER.ASN_SEQUENCE)) + (bArr[i12 + 3] >> 24);
            i10++;
        }
    }

    public String i() {
        char[] cArr = new char[a.HEX.length];
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f45656a;
            if (i10 >= bArr.length) {
                return new String(cArr);
            }
            int i11 = i10 * 2;
            byte b10 = bArr[i10];
            cArr[i11] = (char) (((b10 >> 4) & 15) + 87 + (((((b10 >> 4) & 15) - 10) >> 8) & (-39)));
            cArr[i11 + 1] = (char) ((b10 & 15) + 87 + ((((b10 & 15) - 10) >> 8) & (-39)));
            i10++;
        }
    }
}
