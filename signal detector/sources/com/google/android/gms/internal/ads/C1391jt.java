package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2852x0;
import q2.InterfaceC2842s0;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391jt implements InterfaceC1544mk, InterfaceC0526Gk, InterfaceC2200yt, s2.k, InterfaceC0577Jk, InterfaceC1813rk, InterfaceC2084wl {

    /* renamed from: a, reason: collision with root package name */
    public final C1554mu f15008a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f15009b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f15010c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f15011d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f15012e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f15013f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f15014g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public C1391jt f15015h = null;

    public C1391jt(C1554mu c1554mu) {
        this.f15008a = c1554mu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.D(c2852x0);
            return;
        }
        AtomicReference atomicReference = this.f15009b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1407k8) obj).j0(c2852x0);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC1407k8) obj2).E(c2852x0.f23273a);
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.L();
            return;
        }
        Object obj = this.f15011d.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1569n8) obj).e();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
    }

    @Override // s2.k
    public final void N2() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.N2();
        } else {
            AbstractC1984ut.m(this.f15013f, C1285ht.f14606d);
        }
    }

    @Override // s2.k
    public final void R1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0577Jk
    public final void a(q2.e1 e1Var) {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.a(e1Var);
            return;
        }
        Object obj = this.f15014g.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC2842s0) obj).u1(e1Var);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void b(BinderC0779Vi binderC0779Vi) {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.b(binderC0779Vi);
            return;
        }
        Object obj = this.f15009b.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1407k8) obj).c2(binderC0779Vi);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void c() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.c();
            return;
        }
        C2255zu c2255zu = this.f15008a.f15688a;
        if (c2255zu != null) {
            C1184g c1184g = (C1184g) c2255zu.f17990b;
            synchronized (c1184g) {
                c1184g.f14179a = 1;
                c1184g.h();
            }
        }
        if (this.f15010c.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj = this.f15011d.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1569n8) obj).m();
        } catch (RemoteException e8) {
            u2.k.k("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final void f(C2852x0 c2852x0) {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.f(c2852x0);
            return;
        }
        Object obj = this.f15011d.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC1569n8) obj).c0(c2852x0);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // s2.k
    public final void g() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.g();
            return;
        }
        Object obj = this.f15013f.get();
        if (obj != null) {
            try {
                ((s2.k) obj).g();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        AtomicReference atomicReference = this.f15011d;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC1569n8) obj2).s();
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((InterfaceC1569n8) obj3).d();
        } catch (RemoteException e10) {
            u2.k.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0526Gk
    public final void i() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.i();
        } else {
            AbstractC1984ut.m(this.f15012e, C1285ht.f14604b);
        }
    }

    @Override // s2.k
    public final void j2() {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.j2();
        } else {
            AbstractC1984ut.m(this.f15013f, C1285ht.f14605c);
        }
    }

    @Override // s2.k
    public final void k0(int i) {
        C1391jt c1391jt = this.f15015h;
        if (c1391jt != null) {
            c1391jt.k0(i);
            return;
        }
        Object obj = this.f15013f.get();
        if (obj == null) {
            return;
        }
        try {
            ((s2.k) obj).k0(i);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2200yt
    public final void p(InterfaceC2200yt interfaceC2200yt) {
        this.f15015h = (C1391jt) interfaceC2200yt;
    }

    @Override // s2.k
    public final void x1() {
    }
}
