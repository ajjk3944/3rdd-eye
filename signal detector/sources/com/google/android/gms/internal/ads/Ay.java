package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Ay implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f7081c;

    /* renamed from: d, reason: collision with root package name */
    public final C1907tN f7082d;

    /* renamed from: e, reason: collision with root package name */
    public final C1907tN f7083e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f7084f;

    public Ay(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1799rN c1799rN2, C1907tN c1907tN3) {
        this.f7079a = 0;
        this.f7080b = c1907tN;
        this.f7081c = c1799rN;
        this.f7082d = c1907tN2;
        this.f7084f = c1799rN2;
        this.f7083e = c1907tN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f7079a) {
            case 0:
                Context context = (Context) this.f7080b.f16902a;
                InterfaceC1666oy interfaceC1666oy = (InterfaceC1666oy) this.f7081c.c();
                ExecutorService executorService = (ExecutorService) this.f7082d.f16902a;
                C1612ny c1612ny = (C1612ny) this.f7084f.c();
                Xx xx = (Xx) this.f7083e.f16902a;
                return new Hy(context, interfaceC1666oy, executorService, c1612ny, new Random(), xx.I().A(), xx.I().C(), xx.I().D(), xx.I().B(), xx.G(), xx.D() - 1);
            case 1:
                return new C1505lz((S5) this.f7080b.f16902a, (C1291hz) this.f7081c.c(), (View) this.f7082d.f16902a, (Activity) this.f7083e.f16902a, (C1948uA) this.f7084f.c());
            default:
                return new C1505lz((S5) this.f7080b.f16902a, (C1291hz) this.f7081c.c(), (EnumC1450ky) this.f7082d.f16902a, (Map) this.f7083e.f16902a, (C1948uA) this.f7084f.c());
        }
    }

    public /* synthetic */ Ay(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1907tN c1907tN3, C1799rN c1799rN2, int i) {
        this.f7079a = i;
        this.f7080b = c1907tN;
        this.f7081c = c1799rN;
        this.f7082d = c1907tN2;
        this.f7083e = c1907tN3;
        this.f7084f = c1799rN2;
    }
}
