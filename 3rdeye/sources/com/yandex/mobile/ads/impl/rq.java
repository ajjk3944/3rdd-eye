package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class rq<T> extends df1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final Comparator<T> f32742b;

    public rq(Comparator<T> comparator) {
        this.f32742b = (Comparator) pj1.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f32742b.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rq) {
            return this.f32742b.equals(((rq) obj).f32742b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32742b.hashCode();
    }

    public final String toString() {
        return this.f32742b.toString();
    }
}
