package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class kr1<T> extends df1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final df1<? super T> f29761b;

    public kr1(df1<? super T> df1Var) {
        this.f29761b = (df1) pj1.a(df1Var);
    }

    @Override // com.yandex.mobile.ads.impl.df1
    public final <S extends T> df1<S> b() {
        return this.f29761b;
    }

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return this.f29761b.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kr1) {
            return this.f29761b.equals(((kr1) obj).f29761b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f29761b.hashCode();
    }

    public final String toString() {
        return this.f29761b + ".reverse()";
    }
}
