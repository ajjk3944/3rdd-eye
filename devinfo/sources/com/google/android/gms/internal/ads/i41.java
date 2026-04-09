package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i41 extends s51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i41 i41Var = i50.f12141a;
        Integer numValueOf = Integer.valueOf(((w40) obj).f17886p);
        i41 i41Var2 = i50.f12141a;
        return numValueOf.compareTo(Integer.valueOf(((w40) obj2).f17886p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i41)) {
            return false;
        }
        Object obj2 = o5.f14546h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = r51.f15551b;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(o5.f14546h, r51.f15551b);
    }

    public final String toString() {
        String string = o5.f14546h.toString();
        return r5.c.m(new StringBuilder(string.length() + 31), "Ordering.natural().onResultOf(", string, ")");
    }
}
