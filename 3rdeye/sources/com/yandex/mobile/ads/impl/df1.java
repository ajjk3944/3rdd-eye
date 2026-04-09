package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class df1<T> implements Comparator<T> {
    public static <T> df1<T> a(Comparator<T> comparator) {
        return comparator instanceof df1 ? (df1) comparator : new rq(comparator);
    }

    public <S extends T> df1<S> b() {
        return new kr1(this);
    }

    public static <C extends Comparable> df1<C> a() {
        return gc1.f27622b;
    }
}
