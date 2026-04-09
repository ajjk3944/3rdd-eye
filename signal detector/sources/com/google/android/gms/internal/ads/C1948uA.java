package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948uA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2259zy f17067a;

    public C1948uA(Sx sx, InterfaceC2259zy interfaceC2259zy) {
        this.f17067a = interfaceC2259zy;
    }

    public final C1894tA a(int i) {
        return new C1894tA(i, this.f17067a);
    }

    public final void b(int i) {
        ((Hy) this.f17067a).b(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        ((Hy) this.f17067a).b(i - 1, -1L, null, str);
    }

    public final void d(int i, Throwable th) {
        ((Hy) this.f17067a).b(i - 1, -1L, th, null);
    }

    public final void e(int i, InterfaceFutureC2326a interfaceFutureC2326a) {
        C1894tA c1894tAA = a(i);
        c1894tAA.a();
        interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, new C2255zu(this, c1894tAA)), EnumC2059wD.f17407a);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
