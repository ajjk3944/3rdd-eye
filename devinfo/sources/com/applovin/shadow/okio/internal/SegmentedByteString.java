package com.applovin.shadow.okio.internal;

import a0.g;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0138SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import je.u;
import mk.f;
import nk.k;
import r5.c;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i4, int i10, int i11) {
        k.e(iArr, "<this>");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i4) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i4) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final void commonCopyInto(C0138SegmentedByteString c0138SegmentedByteString, int i4, byte[] bArr, int i10, int i11) {
        k.e(c0138SegmentedByteString, "<this>");
        k.e(bArr, "target");
        long j = i11;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0138SegmentedByteString.size(), i4, j);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j);
        int i12 = i11 + i4;
        int iSegment = segment(c0138SegmentedByteString, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c0138SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            int i16 = (i4 - i13) + i15;
            m.O(c0138SegmentedByteString.getSegments$okio()[iSegment], i10, bArr, i16, i16 + iMin);
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C0138SegmentedByteString c0138SegmentedByteString, Object obj) {
        k.e(c0138SegmentedByteString, "<this>");
        if (obj == c0138SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0138SegmentedByteString.size() && c0138SegmentedByteString.rangeEquals(0, byteString, 0, c0138SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C0138SegmentedByteString c0138SegmentedByteString) {
        k.e(c0138SegmentedByteString, "<this>");
        return c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C0138SegmentedByteString c0138SegmentedByteString) {
        k.e(c0138SegmentedByteString, "<this>");
        int hashCode$okio = c0138SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c0138SegmentedByteString.getSegments$okio().length;
        int i4 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i4 < length) {
            int i12 = c0138SegmentedByteString.getDirectory$okio()[length + i4];
            int i13 = c0138SegmentedByteString.getDirectory$okio()[i4];
            byte[] bArr = c0138SegmentedByteString.getSegments$okio()[i4];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i4++;
            i11 = i13;
        }
        c0138SegmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    public static final byte commonInternalGet(C0138SegmentedByteString c0138SegmentedByteString, int i4) {
        k.e(c0138SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length - 1], i4, 1L);
        int iSegment = segment(c0138SegmentedByteString, i4);
        return c0138SegmentedByteString.getSegments$okio()[iSegment][(i4 - (iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C0138SegmentedByteString c0138SegmentedByteString, int i4, ByteString byteString, int i10, int i11) {
        k.e(c0138SegmentedByteString, "<this>");
        k.e(byteString, "other");
        if (i4 < 0 || i4 > c0138SegmentedByteString.size() - i11) {
            return false;
        }
        int i12 = i11 + i4;
        int iSegment = segment(c0138SegmentedByteString, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c0138SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            if (!byteString.rangeEquals(i10, c0138SegmentedByteString.getSegments$okio()[iSegment], (i4 - i13) + i15, iMin)) {
                return false;
            }
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C0138SegmentedByteString c0138SegmentedByteString, int i4, int i10) {
        k.e(c0138SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c0138SegmentedByteString, i10);
        if (i4 < 0) {
            throw new IllegalArgumentException(c.h(i4, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c0138SegmentedByteString.size()) {
            StringBuilder sbW = u.w(iResolveDefaultParameter, "endIndex=", " > length(");
            sbW.append(c0138SegmentedByteString.size());
            sbW.append(')');
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        int i11 = iResolveDefaultParameter - i4;
        if (i11 < 0) {
            throw new IllegalArgumentException(g.i(iResolveDefaultParameter, i4, "endIndex=", " < beginIndex=").toString());
        }
        if (i4 == 0 && iResolveDefaultParameter == c0138SegmentedByteString.size()) {
            return c0138SegmentedByteString;
        }
        if (i4 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0138SegmentedByteString, i4);
        int iSegment2 = segment(c0138SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.T(c0138SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i12 = iSegment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(c0138SegmentedByteString.getDirectory$okio()[i12] - i4, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + i12];
                if (i12 == iSegment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iSegment != 0 ? c0138SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i4 - i15) + iArr[length];
        return new C0138SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C0138SegmentedByteString c0138SegmentedByteString) {
        k.e(c0138SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0138SegmentedByteString.size()];
        int length = c0138SegmentedByteString.getSegments$okio().length;
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i4 < length) {
            int i12 = c0138SegmentedByteString.getDirectory$okio()[length + i4];
            int i13 = c0138SegmentedByteString.getDirectory$okio()[i4];
            int i14 = i13 - i10;
            m.O(c0138SegmentedByteString.getSegments$okio()[i4], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i4++;
            i10 = i13;
        }
        return bArr;
    }

    public static final void commonWrite(C0138SegmentedByteString c0138SegmentedByteString, Buffer buffer, int i4, int i10) {
        k.e(c0138SegmentedByteString, "<this>");
        k.e(buffer, "buffer");
        int i11 = i4 + i10;
        int iSegment = segment(c0138SegmentedByteString, i4);
        while (i4 < i11) {
            int i12 = iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c0138SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i4;
            int i15 = (i4 - i12) + i14;
            Segment segment = new Segment(c0138SegmentedByteString.getSegments$okio()[iSegment], i15, i15 + iMin, true, false);
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

    public static final void forEachSegment(C0138SegmentedByteString c0138SegmentedByteString, f fVar) {
        k.e(c0138SegmentedByteString, "<this>");
        k.e(fVar, "action");
        int length = c0138SegmentedByteString.getSegments$okio().length;
        int i4 = 0;
        int i10 = 0;
        while (i4 < length) {
            int i11 = c0138SegmentedByteString.getDirectory$okio()[length + i4];
            int i12 = c0138SegmentedByteString.getDirectory$okio()[i4];
            fVar.a(c0138SegmentedByteString.getSegments$okio()[i4], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i4++;
            i10 = i12;
        }
    }

    public static final int segment(C0138SegmentedByteString c0138SegmentedByteString, int i4) {
        k.e(c0138SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c0138SegmentedByteString.getDirectory$okio(), i4 + 1, 0, c0138SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C0138SegmentedByteString c0138SegmentedByteString, int i4, int i10, f fVar) {
        int iSegment = segment(c0138SegmentedByteString, i4);
        while (i4 < i10) {
            int i11 = iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = c0138SegmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i4;
            fVar.a(c0138SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf((i4 - i11) + i13), Integer.valueOf(iMin));
            i4 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C0138SegmentedByteString c0138SegmentedByteString, int i4, byte[] bArr, int i10, int i11) {
        k.e(c0138SegmentedByteString, "<this>");
        k.e(bArr, "other");
        if (i4 < 0 || i4 > c0138SegmentedByteString.size() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i4;
        int iSegment = segment(c0138SegmentedByteString, i4);
        while (i4 < i12) {
            int i13 = iSegment == 0 ? 0 : c0138SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c0138SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c0138SegmentedByteString.getDirectory$okio()[c0138SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i4;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c0138SegmentedByteString.getSegments$okio()[iSegment], (i4 - i13) + i15, bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }
}
