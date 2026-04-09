package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nm;

/* loaded from: classes3.dex */
public final class rq1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f32763a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.a f32764b;

    /* renamed from: c, reason: collision with root package name */
    public final fi2 f32765c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32766d;

    public interface a {
        void a(fi2 fi2Var);
    }

    public interface b<T> {
        void a(T t10);
    }

    private rq1(fi2 fi2Var) {
        this.f32766d = false;
        this.f32763a = null;
        this.f32764b = null;
        this.f32765c = fi2Var;
    }

    public static <T> rq1<T> a(T t10, nm.a aVar) {
        return new rq1<>(t10, aVar);
    }

    public static <T> rq1<T> a(fi2 fi2Var) {
        return new rq1<>(fi2Var);
    }

    private rq1(T t10, nm.a aVar) {
        this.f32766d = false;
        this.f32763a = t10;
        this.f32764b = aVar;
        this.f32765c = null;
    }
}
