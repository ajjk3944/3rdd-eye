package com.google.common.collect;

import java.io.Serializable;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
final class D extends G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final D f38320a = new D();

    private D() {
    }

    @Override // com.google.common.collect.G, java.util.Comparator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC6769h.i(comparable);
        AbstractC6769h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
