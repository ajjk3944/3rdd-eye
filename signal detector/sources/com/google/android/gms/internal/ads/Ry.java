package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Ry implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11091a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f11092b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f11093c;

    /* renamed from: d, reason: collision with root package name */
    public final C1907tN f11094d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f11095e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f11096f;

    public /* synthetic */ Ry(C1907tN c1907tN, C1799rN c1799rN, C1799rN c1799rN2, C1907tN c1907tN2, C1799rN c1799rN3, int i) {
        this.f11091a = i;
        this.f11092b = c1907tN;
        this.f11093c = c1799rN;
        this.f11095e = c1799rN2;
        this.f11094d = c1907tN2;
        this.f11096f = c1799rN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11091a) {
            case 0:
                return new Qy((Xx) this.f11092b.f16902a, (Py) this.f11093c.c(), (Ny) this.f11095e.c(), (ExecutorService) this.f11094d.f16902a, (C1948uA) this.f11096f.c());
            case 1:
                return new C1505lz((S5) this.f11092b.f16902a, (C1291hz) this.f11093c.c(), (Map) this.f11094d.f16902a, (Context) this.f11095e.c(), (C1948uA) this.f11096f.c());
            case 2:
                return new C1936tz((S5) this.f11092b.f16902a, (C1291hz) this.f11093c.c(), (Map) this.f11094d.f16902a, (DisplayMetrics) this.f11095e.c(), (C1948uA) this.f11096f.c());
            default:
                return new C1505lz((S5) this.f11092b.f16902a, (C1291hz) this.f11093c.c(), (DisplayMetrics) this.f11095e.c(), (View) this.f11094d.f16902a, (C1948uA) this.f11096f.c());
        }
    }

    public /* synthetic */ Ry(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, Object obj, C1799rN c1799rN2, int i) {
        this.f11091a = i;
        this.f11092b = c1907tN;
        this.f11093c = c1799rN;
        this.f11094d = c1907tN2;
        this.f11095e = (InterfaceC2069wN) obj;
        this.f11096f = c1799rN2;
    }
}
