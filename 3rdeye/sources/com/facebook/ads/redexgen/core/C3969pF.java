package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017J%\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0019\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "maxArraySize", "", "checkBoundsIndexes", "", "startIndex", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.pF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3969pF {
    public static byte[] A00;

    static {
        A01();
    }

    public /* synthetic */ C3969pF(AbstractC3964p7 abstractC3964p7) {
        this();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-104, -74, -104, -20, -25, -63, -26, -36, -35, -16, -78, -104, -105, -117, -34, -44, -27, -48, -91, -117, -64, -76, 8, 3, -35, 2, -8, -7, 12, -50, -76, -19, 16, 28, 25, 23, -13, 24, 14, 15, 34, -28, -54, 43, 48, 38, 39, 58, -4, -30, 49, 54, 42, 39, 52};
    }

    public C3969pF() {
    }

    public final int A02(Collection<?> collection) {
        C3963p6.A09(collection, A00(31, 1, 39));
        int i = 1;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i * 31;
            int hashCode = next != null ? next.hashCode() : 0;
            i = i10 + hashCode;
        }
        return i;
    }

    public final void A03(int i, int i10) {
        if (i >= 0 && i < i10) {
        } else {
            throw new IndexOutOfBoundsException(A00(43, 7, 95) + i + A00(12, 8, 8) + i10);
        }
    }

    public final void A04(int i, int i10) {
        if (i >= 0 && i <= i10) {
        } else {
            throw new IndexOutOfBoundsException(A00(43, 7, 95) + i + A00(12, 8, 8) + i10);
        }
    }

    public final void A05(int i, int i10, int i11) {
        String strA00 = A00(32, 11, 71);
        if (i >= 0 && i10 <= i11) {
            if (i <= i10) {
                return;
            } else {
                throw new IllegalArgumentException(strA00 + i + A00(0, 12, 21) + i10);
            }
        }
        throw new IndexOutOfBoundsException(strA00 + i + A00(20, 11, 49) + i10 + A00(12, 8, 8) + i11);
    }

    public final boolean A06(Collection<?> collection, Collection<?> collection2) {
        C3963p6.A09(collection, A00(31, 1, 39));
        C3963p6.A09(collection2, A00(50, 5, 95));
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!C3963p6.A0C(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }
}
