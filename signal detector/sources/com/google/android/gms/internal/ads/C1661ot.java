package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661ot implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16069a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f16070b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f16071c;

    /* renamed from: d, reason: collision with root package name */
    public final C1907tN f16072d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f16073e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f16074f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f16075g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f16076h;

    public C1661ot(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1907tN c1907tN3, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f16070b = c1907tN;
        this.f16071c = c1799rN;
        this.f16072d = c1907tN2;
        this.f16073e = c1907tN3;
        this.f16074f = c1799rN2;
        this.f16075g = c1799rN3;
        this.f16076h = c1799rN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16069a) {
            case 0:
                return new BinderC1607nt((C0710Rh) this.f16071c.c(), (Context) this.f16070b.f16902a, (String) this.f16072d.f16902a, (C1445kt) this.f16073e.c(), (C1391jt) this.f16074f.c(), ((C0642Nh) this.f16075g).a(), (C0784Vn) this.f16076h.c());
            default:
                return new C1715pt((Context) this.f16070b.f16902a, (Executor) this.f16071c.c(), (q2.d1) this.f16072d.f16902a, (C0710Rh) this.f16073e.c(), (C2090wr) this.f16074f.c(), (C2198yr) this.f16075g.c(), new C0905au(), (C0896al) this.f16076h.c());
        }
    }

    public C1661ot(C1907tN c1907tN, C1907tN c1907tN2, C1907tN c1907tN3, C1799rN c1799rN, C1799rN c1799rN2, C0642Nh c0642Nh, C1799rN c1799rN3) {
        this.f16071c = c1907tN;
        this.f16070b = c1907tN2;
        this.f16072d = c1907tN3;
        this.f16073e = c1799rN;
        this.f16074f = c1799rN2;
        this.f16075g = c0642Nh;
        this.f16076h = c1799rN3;
    }
}
