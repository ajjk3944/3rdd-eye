package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Zm implements Fn {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f40490a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40491b;

    public Zm(Fn fn, Object obj) {
        this.f40490a = fn;
        this.f40491b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Fn
    public final Object a(Object obj) {
        return obj != this.f40490a.a(obj) ? this.f40491b : obj;
    }
}
