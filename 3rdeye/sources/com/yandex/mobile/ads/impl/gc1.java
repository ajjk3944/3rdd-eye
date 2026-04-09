package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class gc1 extends df1<Comparable<?>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final gc1 f27622b = new gc1();
    private static final long serialVersionUID = 0;

    private gc1() {
    }

    private Object readResolve() {
        return f27622b;
    }

    @Override // com.yandex.mobile.ads.impl.df1
    public final <S extends Comparable<?>> df1<S> b() {
        return jr1.f29267b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
