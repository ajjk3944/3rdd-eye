package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    public final Yb f40224a;

    public U4() {
        this(Ga.j().k());
    }

    public static Z4 a(S4 s42) {
        return new Z4(new X4(s42), s42);
    }

    public U4(Yb yb) {
        this.f40224a = yb;
    }

    public final C4648gn a(S4 s42, C5108ym c5108ym) {
        C4648gn c4648gn = new C4648gn(s42, new Tg(c5108ym));
        Yb yb = this.f40224a;
        synchronized (yb) {
            yb.f40416c.add(c4648gn);
        }
        return c4648gn;
    }
}
