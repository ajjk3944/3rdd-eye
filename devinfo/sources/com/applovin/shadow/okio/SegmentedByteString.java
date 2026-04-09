package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Buffer;
import d.h;
import nk.k;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b10, int i4) {
        return b10 & i4;
    }

    public static final boolean arrayRangeEquals(byte[] bArr, int i4, byte[] bArr2, int i10, int i11) {
        k.e(bArr, "a");
        k.e(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i4] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            StringBuilder sbY = h.y(j, "size=", " offset=");
            sbY.append(j8);
            sbY.append(" byteCount=");
            sbY.append(j9);
            throw new ArrayIndexOutOfBoundsException(sbY.toString());
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i4, int i10) {
        return (i4 >>> (32 - i10)) | (i4 << i10);
    }

    public static final long minOf(long j, int i4) {
        return Math.min(j, i4);
    }

    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        k.e(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final long rightRotate(long j, int i4) {
        return (j << (64 - i4)) | (j >>> i4);
    }

    public static final int shl(byte b10, int i4) {
        return b10 << i4;
    }

    public static final int shr(byte b10, int i4) {
        return b10 >> i4;
    }

    public static final String toHexString(byte b10) {
        return new String(new char[]{com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final long and(byte b10, long j) {
        return j & b10;
    }

    public static final long minOf(int i4, long j) {
        return Math.min(i4, j);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i4) {
        k.e(byteString, "<this>");
        return i4 == DEFAULT__ByteString_size ? byteString.size() : i4;
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final long and(int i4, long j) {
        return j & i4;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i4) {
        k.e(bArr, "<this>");
        return i4 == DEFAULT__ByteString_size ? bArr.length : i4;
    }

    public static final short reverseBytes(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String toHexString(int i4) {
        if (i4 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 28) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 24) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 20) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 16) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 12) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 8) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[i4 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return p.n0(cArr, i10, 8);
    }

    public static final String toHexString(long j) {
        if (j == 0) {
            return "0";
        }
        int i4 = 0;
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i4 < 16 && cArr[i4] == '0') {
            i4++;
        }
        return p.n0(cArr, i4, 16);
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }
}
