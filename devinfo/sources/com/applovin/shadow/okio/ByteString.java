package com.applovin.shadow.okio;

import d.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import je.u;
import nk.f;
import nk.k;
import vk.p;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                charset = vk.a.f36267a;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i4, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i4 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i4, i10);
        }

        @yj.a
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m141deprecated_decodeBase64(String str) {
            k.e(str, "string");
            return decodeBase64(str);
        }

        @yj.a
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m142deprecated_decodeHex(String str) {
            k.e(str, "string");
            return decodeHex(str);
        }

        @yj.a
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m143deprecated_encodeString(String str, Charset charset) {
            k.e(str, "string");
            k.e(charset, "charset");
            return encodeString(str, charset);
        }

        @yj.a
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m144deprecated_encodeUtf8(String str) {
            k.e(str, "string");
            return encodeUtf8(str);
        }

        @yj.a
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m145deprecated_of(ByteBuffer byteBuffer) {
            k.e(byteBuffer, "buffer");
            return of(byteBuffer);
        }

        @yj.a
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m147deprecated_read(InputStream inputStream, int i4) {
            k.e(inputStream, "inputstream");
            return read(inputStream, i4);
        }

        public final ByteString decodeBase64(String str) {
            k.e(str, "<this>");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            k.e(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i10 = i4 * 2;
                bArr[i4] = (byte) (com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i10 + 1)) + (com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i10)) << 4));
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            k.e(str, "<this>");
            k.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            k.e(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            k.e(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i4) throws IOException {
            k.e(inputStream, "<this>");
            if (i4 < 0) {
                throw new IllegalArgumentException(u.r(i4, "byteCount < 0: ").toString());
            }
            byte[] bArr = new byte[i4];
            int i10 = 0;
            while (i10 < i4) {
                int i11 = inputStream.read(bArr, i10, i4 - i10);
                if (i11 == -1) {
                    throw new EOFException();
                }
                i10 += i11;
            }
            return new ByteString(bArr);
        }

        private Companion() {
        }

        @yj.a
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m146deprecated_of(byte[] bArr, int i4, int i10) {
            k.e(bArr, "array");
            return of(bArr, i4, i10);
        }

        public final ByteString of(byte... bArr) {
            k.e(bArr, "data");
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            k.d(bArrCopyOf, "copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        public final ByteString of(byte[] bArr, int i4, int i10) {
            k.e(bArr, "<this>");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i10);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i4, iResolveDefaultParameter);
            return new ByteString(m.S(i4, iResolveDefaultParameter + i4, bArr));
        }
    }

    public ByteString(byte[] bArr) {
        k.e(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i4, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i12 & 1) != 0) {
            i4 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        byteString.copyInto(i4, bArr, i10, i11);
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        return byteString.indexOf(byteString2, i4);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i10 & 2) != 0) {
            i4 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i4);
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i4) throws IOException {
        return Companion.read(inputStream, i4);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i4, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i11 & 1) != 0) {
            i4 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i4, i10);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @yj.a
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m139deprecated_getByte(int i4) {
        return getByte(i4);
    }

    @yj.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m140deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        k.d(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i4, byte[] bArr, int i10, int i11) {
        k.e(bArr, "target");
        m.O(getData$okio(), i10, bArr, i4, i11 + i4);
    }

    public ByteString digest$okio(String str) throws NoSuchAlgorithmException {
        k.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        k.b(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(ByteString byteString) {
        k.e(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i4) {
        return internalGet$okio(i4);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i4 = 0;
        for (byte b10 : getData$okio()) {
            int i10 = i4 + 1;
            cArr[i4] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i4 += 2;
            cArr[i10] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        k.e(str, "algorithm");
        k.e(byteString, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            k.d(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        k.e(byteString, "key");
        return hmac$okio("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        k.e(byteString, "key");
        return hmac$okio("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        k.e(byteString, "key");
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        k.e(byteString, "other");
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i4) {
        return getData$okio()[i4];
    }

    public final int lastIndexOf(ByteString byteString) {
        k.e(byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i4, ByteString byteString, int i10, int i11) {
        k.e(byteString, "other");
        return byteString.rangeEquals(i10, getData$okio(), i4, i11);
    }

    public final void setHashCode$okio(int i4) {
        this.hashCode = i4;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        k.e(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        k.e(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        for (int i4 = 0; i4 < getData$okio().length; i4++) {
            byte b10 = getData$okio()[i4];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b10 + 32);
                for (int i10 = i4 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        for (int i4 = 0; i4 < getData$okio().length; i4++) {
            byte b10 = getData$okio()[i4];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                k.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b10 - 32);
                for (int i10 = i4 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i10] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        k.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strU0 = p.u0(p.u0(p.u0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return h.p(']', "[text=", strU0);
            }
            return "[size=" + getData$okio().length + " text=" + strU0 + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
        if (iResolveDefaultParameter > getData$okio().length) {
            throw new IllegalArgumentException(h.u(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iResolveDefaultParameter == getData$okio().length ? this : new ByteString(m.S(0, iResolveDefaultParameter, getData$okio()))).hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream outputStream) throws IOException {
        k.e(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(Buffer buffer, int i4, int i10) {
        k.e(buffer, "buffer");
        com.applovin.shadow.okio.internal.ByteString.commonWrite(this, buffer, i4, i10);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        return byteString.indexOf(bArr, i4);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        k.e(byteString, "other");
        int size = size();
        int size2 = byteString.size();
        int iMin = Math.min(size, size2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i10 = getByte(i4) & 255;
            int i11 = byteString.getByte(i4) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(byte[] bArr) {
        k.e(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(byte[] bArr) {
        k.e(bArr, "other");
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] bArr) {
        k.e(bArr, "other");
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i4, byte[] bArr, int i10, int i11) {
        k.e(bArr, "other");
        return i4 >= 0 && i4 <= getData$okio().length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && SegmentedByteString.arrayRangeEquals(getData$okio(), i4, bArr, i10, i11);
    }

    public final boolean startsWith(byte[] bArr) {
        k.e(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final ByteString substring(int i4) {
        return substring$default(this, i4, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i10 & 2) != 0) {
            i4 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i4);
    }

    public static final ByteString of(byte[] bArr, int i4, int i10) {
        return Companion.of(bArr, i4, i10);
    }

    public final int indexOf(ByteString byteString, int i4) {
        k.e(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i4);
    }

    public final int lastIndexOf(ByteString byteString, int i4) {
        k.e(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i4);
    }

    public ByteString substring(int i4, int i10) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i10);
        if (i4 >= 0) {
            if (iResolveDefaultParameter > getData$okio().length) {
                throw new IllegalArgumentException(h.u(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
            }
            if (iResolveDefaultParameter - i4 >= 0) {
                return (i4 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(m.S(i4, iResolveDefaultParameter, getData$okio()));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public int indexOf(byte[] bArr, int i4) {
        k.e(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int iMax = Math.max(i4, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int lastIndexOf(byte[] bArr, int i4) {
        k.e(bArr, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i4), getData$okio().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
