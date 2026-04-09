package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0516SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.m;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001ad\u0010\u0014\u001a\u00020\u0012*\u00020\u00072K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0014\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0018\u001a$\u0010\u001a\u001a\u00020\u0019*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u001c*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b!\u0010\"\u001a,\u0010%\u001a\u00020\u0012*\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b%\u0010&\u001a4\u0010*\u001a\u00020)*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b*\u0010+\u001a4\u0010*\u001a\u00020)*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b*\u0010,\u001a4\u0010/\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u001e\u00102\u001a\u00020)*\u00020\u00072\b\u0010'\u001a\u0004\u0018\u000101H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b4\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lcom/applovin/shadow/okio/SegmentedByteString;", "pos", "segment", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "data", "offset", "byteCount", "Ly8/s;", "action", "forEachSegment", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ll9/q;)V", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/SegmentedByteString;IILl9/q;)V", "Lcom/applovin/shadow/okio/ByteString;", "commonSubstring", "(Lcom/applovin/shadow/okio/SegmentedByteString;II)Lcom/applovin/shadow/okio/ByteString;", "", "commonInternalGet", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/SegmentedByteString;)I", "commonToByteArray", "(Lcom/applovin/shadow/okio/SegmentedByteString;)[B", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "commonWrite", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        p.e(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10, @NotNull byte[] target, int i11, int i12) {
        p.e(c0516SegmentedByteString, "<this>");
        p.e(target, "target");
        long j10 = i12;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0516SegmentedByteString.size(), i10, j10);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c0516SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0516SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            m.d(c0516SegmentedByteString.getSegments()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C0516SegmentedByteString c0516SegmentedByteString, @Nullable Object obj) {
        p.e(c0516SegmentedByteString, "<this>");
        if (obj == c0516SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0516SegmentedByteString.size() && c0516SegmentedByteString.rangeEquals(0, byteString, 0, c0516SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C0516SegmentedByteString c0516SegmentedByteString) {
        p.e(c0516SegmentedByteString, "<this>");
        return c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C0516SegmentedByteString c0516SegmentedByteString) {
        p.e(c0516SegmentedByteString, "<this>");
        int hashCode = c0516SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c0516SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0516SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0516SegmentedByteString.getDirectory()[i10];
            byte[] bArr = c0516SegmentedByteString.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c0516SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10) {
        p.e(c0516SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length - 1], i10, 1L);
        int iSegment = segment(c0516SegmentedByteString, i10);
        return c0516SegmentedByteString.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1])) + c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10, @NotNull ByteString other, int i11, int i12) {
        p.e(c0516SegmentedByteString, "<this>");
        p.e(other, "other");
        if (i10 < 0 || i10 > c0516SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0516SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0516SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c0516SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10, int i11) {
        p.e(c0516SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c0516SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c0516SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c0516SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c0516SegmentedByteString.size()) {
            return c0516SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0516SegmentedByteString, i10);
        int iSegment2 = segment(c0516SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.l(c0516SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c0516SegmentedByteString.getDirectory()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c0516SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C0516SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C0516SegmentedByteString c0516SegmentedByteString) {
        p.e(c0516SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0516SegmentedByteString.size()];
        int length = c0516SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0516SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0516SegmentedByteString.getDirectory()[i10];
            int i15 = i14 - i11;
            m.d(c0516SegmentedByteString.getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C0516SegmentedByteString c0516SegmentedByteString, @NotNull Buffer buffer, int i10, int i11) {
        p.e(c0516SegmentedByteString, "<this>");
        p.e(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c0516SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c0516SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c0516SegmentedByteString.getSegments()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                p.b(segment2);
                Segment segment3 = segment2.prev;
                p.b(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + i11);
    }

    public static final void forEachSegment(@NotNull C0516SegmentedByteString c0516SegmentedByteString, @NotNull q action) {
        p.e(c0516SegmentedByteString, "<this>");
        p.e(action, "action");
        int length = c0516SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c0516SegmentedByteString.getDirectory()[length + i10];
            int i13 = c0516SegmentedByteString.getDirectory()[i10];
            action.invoke(c0516SegmentedByteString.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10) {
        p.e(c0516SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c0516SegmentedByteString.getDirectory(), i10 + 1, 0, c0516SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C0516SegmentedByteString c0516SegmentedByteString, int i10, int i11, q qVar) {
        int iSegment = segment(c0516SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c0516SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(c0516SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C0516SegmentedByteString c0516SegmentedByteString, int i10, @NotNull byte[] other, int i11, int i12) {
        p.e(c0516SegmentedByteString, "<this>");
        p.e(other, "other");
        if (i10 < 0 || i10 > c0516SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0516SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0516SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0516SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0516SegmentedByteString.getDirectory()[c0516SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c0516SegmentedByteString.getSegments()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
