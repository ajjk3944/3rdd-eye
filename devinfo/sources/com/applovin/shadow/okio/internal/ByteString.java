package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import d.h;
import java.util.Arrays;
import nk.k;
import vk.p;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        k.e(byteString, "<this>");
        k.e(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int iMin = Math.min(size, size2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i10 = byteString.getByte(i4) & 255;
            int i11 = byteString2.getByte(i4) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(com.applovin.shadow.okio.ByteString byteString, int i4, byte[] bArr, int i10, int i11) {
        k.e(byteString, "<this>");
        k.e(bArr, "target");
        m.O(byteString.getData$okio(), i10, bArr, i4, i11 + i4);
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeBase64(String str) {
        k.e(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new com.applovin.shadow.okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeHex(String str) {
        k.e(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i10 = i4 * 2;
            bArr[i4] = (byte) (decodeHexDigit(str.charAt(i10 + 1)) + (decodeHexDigit(str.charAt(i10)) << 4));
        }
        return new com.applovin.shadow.okio.ByteString(bArr);
    }

    public static final com.applovin.shadow.okio.ByteString commonEncodeUtf8(String str) {
        k.e(str, "<this>");
        com.applovin.shadow.okio.ByteString byteString = new com.applovin.shadow.okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        k.e(byteString, "<this>");
        k.e(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.ByteString byteString, Object obj) {
        k.e(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof com.applovin.shadow.okio.ByteString) {
            com.applovin.shadow.okio.ByteString byteString2 = (com.applovin.shadow.okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(com.applovin.shadow.okio.ByteString byteString, int i4) {
        k.e(byteString, "<this>");
        return byteString.getData$okio()[i4];
    }

    public static final int commonGetSize(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i4 = 0;
        for (byte b10 : byteString.getData$okio()) {
            int i10 = i4 + 1;
            cArr[i4] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i4 += 2;
            cArr[i10] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] bArr, int i4) {
        k.e(byteString, "<this>");
        k.e(bArr, "other");
        int length = byteString.getData$okio().length - bArr.length;
        int iMax = Math.max(i4, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2, int i4) {
        k.e(byteString, "<this>");
        k.e(byteString2, "other");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i4);
    }

    public static final com.applovin.shadow.okio.ByteString commonOf(byte[] bArr) {
        k.e(bArr, "data");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        k.d(bArrCopyOf, "copyOf(this, size)");
        return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i4, com.applovin.shadow.okio.ByteString byteString2, int i10, int i11) {
        k.e(byteString, "<this>");
        k.e(byteString2, "other");
        return byteString2.rangeEquals(i10, byteString.getData$okio(), i4, i11);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        k.e(byteString, "<this>");
        k.e(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final com.applovin.shadow.okio.ByteString commonSubstring(com.applovin.shadow.okio.ByteString byteString, int i4, int i10) {
        k.e(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i10);
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(h.u(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter - i4 >= 0) {
            return (i4 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new com.applovin.shadow.okio.ByteString(m.S(i4, iResolveDefaultParameter, byteString.getData$okio()));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiLowercase(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        for (int i4 = 0; i4 < byteString.getData$okio().length; i4++) {
            byte b10 = byteString.getData$okio()[i4];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b10 + 32);
                for (int i10 = i4 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiUppercase(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        for (int i4 = 0; i4 < byteString.getData$okio().length; i4++) {
            byte b10 = byteString.getData$okio()[i4];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b10 - 32);
                for (int i10 = i4 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i10] = (byte) (b11 - 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        k.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final com.applovin.shadow.okio.ByteString commonToByteString(byte[] bArr, int i4, int i10) {
        k.e(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i10);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i4, iResolveDefaultParameter);
        return new com.applovin.shadow.okio.ByteString(m.S(i4, iResolveDefaultParameter + i4, bArr));
    }

    public static final String commonToString(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strU0 = p.u0(p.u0(p.u0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return h.p(']', "[text=", strU0);
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strU0 + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(byteString.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(h.u(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new com.applovin.shadow.okio.ByteString(m.S(0, iResolveDefaultParameter, byteString.getData$okio()));
        }
        sb2.append(byteString.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public static final String commonUtf8(com.applovin.shadow.okio.ByteString byteString) {
        k.e(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(com.applovin.shadow.okio.ByteString byteString, Buffer buffer, int i4, int i10) {
        k.e(byteString, "<this>");
        k.e(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i4, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, byte[] bArr) {
        k.e(byteString, "<this>");
        k.e(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] bArr, int i4) {
        k.e(byteString, "<this>");
        k.e(bArr, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i4), byteString.getData$okio().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i4, byte[] bArr, int i10, int i11) {
        k.e(byteString, "<this>");
        k.e(bArr, "other");
        return i4 >= 0 && i4 <= byteString.getData$okio().length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i4, bArr, i10, i11);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, byte[] bArr) {
        k.e(byteString, "<this>");
        k.e(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }
}
