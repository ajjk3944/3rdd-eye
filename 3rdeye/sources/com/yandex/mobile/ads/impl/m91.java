package com.yandex.mobile.ads.impl;

import A9.B;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class m91 implements A9.B {

    /* renamed from: b, reason: collision with root package name */
    private final x41 f30308b;

    /* renamed from: c, reason: collision with root package name */
    private final B.a f30309c;

    public m91(x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        this.f30308b = nativeAdCreationListener;
        this.f30309c = B.a.f182b;
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p9.p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) InterfaceC4350h.a.C0456a.a(this, r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        return (E) InterfaceC4350h.a.C0456a.b(this, bVar);
    }

    @Override // f9.InterfaceC4350h.a
    public final InterfaceC4350h.b<?> getKey() {
        return this.f30309c;
    }

    @Override // A9.B
    public final void handleException(InterfaceC4350h context, Throwable exception) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(exception, "exception");
        fp0.c(new Object[0]);
        this.f30308b.a(i7.d());
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return InterfaceC4350h.a.C0456a.c(this, bVar);
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return InterfaceC4350h.a.C0456a.d(this, interfaceC4350h);
    }
}
