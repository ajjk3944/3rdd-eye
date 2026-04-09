package io.appmetrica.analytics.impl;

import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class Xc implements V8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ge f40382a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a f40383b;

    public Xc(Ge ge, InterfaceC5480a<Integer> interfaceC5480a) {
        this.f40382a = ge;
        this.f40383b = interfaceC5480a;
    }

    @Override // io.appmetrica.analytics.impl.V8
    public final boolean b() {
        return ((Fe) this.f40382a).f39437b.get() >= ((long) ((Number) this.f40383b.invoke()).intValue());
    }
}
