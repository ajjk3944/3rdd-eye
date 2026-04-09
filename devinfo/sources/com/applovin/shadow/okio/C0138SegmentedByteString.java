package com.applovin.shadow.okio;

import a0.g;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import je.u;
import nk.k;
import r5.c;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        k.e(bArr, "segments");
        k.e(iArr, "directory");
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        k.c(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        k.d(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void copyInto(int i4, byte[] bArr, int i10, int i11) {
        k.e(bArr, "target");
        long j = i11;
        SegmentedByteString.checkOffsetAndCount(size(), i4, j);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j);
        int i12 = i11 + i4;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            int i16 = (i4 - i13) + i15;
            m.O(getSegments$okio()[iSegment], i10, bArr, i16, i16 + iMin);
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString digest$okio(String str) throws NoSuchAlgorithmException {
        k.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i4 = 0;
        int i10 = 0;
        while (i4 < length) {
            int i11 = getDirectory$okio()[length + i4];
            int i12 = getDirectory$okio()[i4];
            messageDigest.update(getSegments$okio()[i4], i11, i12 - i10);
            i4++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        k.b(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i4 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i4 < length) {
            int i12 = getDirectory$okio()[length + i4];
            int i13 = getDirectory$okio()[i4];
            byte[] bArr = getSegments$okio()[i4];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i4++;
            i11 = i13;
        }
        setHashCode$okio(i10);
        return i10;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString hmac$okio(String str, ByteString byteString) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        k.e(str, "algorithm");
        k.e(byteString, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i4 = 0;
            int i10 = 0;
            while (i4 < length) {
                int i11 = getDirectory$okio()[length + i4];
                int i12 = getDirectory$okio()[i4];
                mac.update(getSegments$okio()[i4], i11, i12 - i10);
                i4++;
                i10 = i12;
            }
            byte[] bArrDoFinal = mac.doFinal();
            k.d(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int indexOf(byte[] bArr, int i4) {
        k.e(bArr, "other");
        return toByteString().indexOf(bArr, i4);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte internalGet$okio(int i4) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i4, 1L);
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        return getSegments$okio()[iSegment][(i4 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int lastIndexOf(byte[] bArr, int i4) {
        k.e(bArr, "other");
        return toByteString().lastIndexOf(bArr, i4);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int i4, ByteString byteString, int i10, int i11) {
        k.e(byteString, "other");
        if (i4 < 0 || i4 > size() - i11) {
            return false;
        }
        int i12 = i11 + i4;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            if (!byteString.rangeEquals(i10, getSegments$okio()[iSegment], (i4 - i13) + i15, iMin)) {
                return false;
            }
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String string(Charset charset) {
        k.e(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString substring(int i4, int i10) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i10);
        if (i4 < 0) {
            throw new IllegalArgumentException(c.h(i4, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbW = u.w(iResolveDefaultParameter, "endIndex=", " > length(");
            sbW.append(size());
            sbW.append(')');
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        int i11 = iResolveDefaultParameter - i4;
        if (i11 < 0) {
            throw new IllegalArgumentException(g.i(iResolveDefaultParameter, i4, "endIndex=", " < beginIndex=").toString());
        }
        if (i4 == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (i4 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        int iSegment2 = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.T(getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(getDirectory$okio()[i12] - i4, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i4 - i15) + iArr[length];
        return new C0138SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i4 < length) {
            int i12 = getDirectory$okio()[length + i4];
            int i13 = getDirectory$okio()[i4];
            int i14 = i13 - i10;
            m.O(getSegments$okio()[i4], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i4++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        k.e(outputStream, "out");
        int length = getSegments$okio().length;
        int i4 = 0;
        int i10 = 0;
        while (i4 < length) {
            int i11 = getDirectory$okio()[length + i4];
            int i12 = getDirectory$okio()[i4];
            outputStream.write(getSegments$okio()[i4], i11, i12 - i10);
            i4++;
            i10 = i12;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write$okio(Buffer buffer, int i4, int i10) {
        k.e(buffer, "buffer");
        int i11 = i4 + i10;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        while (i4 < i11) {
            int i12 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i13 = getDirectory$okio()[iSegment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i4;
            int i15 = (i4 - i12) + i14;
            Segment segment = new Segment(getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                k.b(segment2);
                Segment segment3 = segment2.prev;
                k.b(segment3);
                segment3.push(segment);
            }
            i4 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i10);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int i4, byte[] bArr, int i10, int i11) {
        k.e(bArr, "other");
        if (i4 < 0 || i4 > size() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i4;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], (i4 - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }
}
