package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class jr1 extends df1<Comparable<?>> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final jr1 f29267b = new jr1();
    private static final long serialVersionUID = 0;

    private jr1() {
    }

    private Object readResolve() {
        return f29267b;
    }

    @Override // com.yandex.mobile.ads.impl.df1
    public final <S extends Comparable<?>> df1<S> b() {
        return gc1.f27622b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
