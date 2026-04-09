package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4594el implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final C4986u0 f40823a;

    public C4594el(C4986u0 c4986u0) {
        this.f40823a = c4986u0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Void r32) {
        boolean z10;
        this.f40823a.getClass();
        synchronized (C4961t0.class) {
            z10 = C4961t0.f41658f;
        }
        return z10 ? new C4752ko(this, true, "") : new C4752ko(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C4752ko a() {
        return a((Void) null);
    }
}
