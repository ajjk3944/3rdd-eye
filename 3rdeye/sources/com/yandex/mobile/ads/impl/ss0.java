package com.yandex.mobile.ads.impl;

import A9.B;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class ss0 implements A9.B {

    /* renamed from: b, reason: collision with root package name */
    private final B.a f33194b = B.a.f182b;

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
        return this.f33194b;
    }

    @Override // A9.B
    public final void handleException(InterfaceC4350h context, Throwable exception) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(exception, "exception");
        fp0.c(new Object[0]);
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
