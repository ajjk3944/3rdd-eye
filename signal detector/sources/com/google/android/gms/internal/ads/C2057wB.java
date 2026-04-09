package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2057wB extends AbstractC1087eC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2057wB c2057wB = C0627Mj.f9890a;
        Integer numValueOf = Integer.valueOf(((C2244zj) obj).f17937p);
        C2057wB c2057wB2 = C0627Mj.f9890a;
        return numValueOf.compareTo(Integer.valueOf(((C2244zj) obj2).f17937p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2057wB)) {
            return false;
        }
        Object obj2 = C1563n2.f15716h;
        ((C2057wB) obj).getClass();
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = C1033dC.f13741b;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(C1563n2.f15716h, C1033dC.f13741b);
    }

    public final String toString() {
        String string = C1563n2.f15716h.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
