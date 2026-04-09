package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC2806a;
import z5.AbstractC3046w;

/* renamed from: com.google.android.gms.internal.ads.Dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476Dl implements s2.k, InterfaceC2806a {

    /* renamed from: a, reason: collision with root package name */
    public final C0495En f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final St f7830b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7831c = new AtomicBoolean(false);

    public C0476Dl(C0495En c0495En, St st) {
        this.f7829a = c0495En;
        this.f7830b = st;
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final void R1() {
    }

    public final void a() {
        if (this.f7831c.getAndSet(true)) {
            return;
        }
        C0495En c0495En = this.f7829a;
        if (c0495En.f8003b.getAndSet(false)) {
            C1009cp c1009cp = c0495En.f8002a;
            c1009cp.getClass();
            AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Fx(c1009cp, null), 3);
        }
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // s2.k
    public final void g() {
        String str = this.f7830b.f11269b;
        boolean zK = C1476lN.k(str);
        C0495En c0495En = this.f7829a;
        if (zK) {
            c0495En.getClass();
            return;
        }
        if (!c0495En.f8004c.get() || c0495En.f8003b.getAndSet(true)) {
            return;
        }
        C1009cp c1009cp = c0495En.f8002a;
        c1009cp.getClass();
        q5.i.e(str, "gwsQueryId");
        AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Bx(c1009cp, str, null), 3);
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // s2.k
    public final void j2() {
        a();
    }

    @Override // s2.k
    public final void k0(int i) {
        a();
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        C0495En c0495En = this.f7829a;
        if (c0495En.f8003b.get()) {
            C1009cp c1009cp = c0495En.f8002a;
            c1009cp.getClass();
            AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Dx(c1009cp, null), 3);
        }
    }

    @Override // s2.k
    public final void x1() {
    }
}
