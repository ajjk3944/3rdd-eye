package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oo0 implements i60, b70, cp0, xa.l, e70, n60, t80 {

    /* renamed from: a, reason: collision with root package name */
    public final tq0 f14756a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14757b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f14758c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f14759d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f14760e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f14761f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public oo0 f14762h = null;

    public oo0(tq0 tq0Var) {
        this.f14756a = tq0Var;
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void B1() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.B1();
        } else {
            yo0.l(this.f14760e, tk0.f16841e);
        }
    }

    @Override // xa.l
    public final void D2() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.D2();
        } else {
            yo0.l(this.f14761f, tk0.f16842f);
        }
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void a(va.d3 d3Var) {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.a(d3Var);
            return;
        }
        Object obj = this.g.get();
        if (obj == null) {
            return;
        }
        try {
            ((va.r1) obj).x1(d3Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void b(va.w1 w1Var) {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.b(w1Var);
            return;
        }
        Object obj = this.f14759d.get();
        if (obj == null) {
            return;
        }
        try {
            ((yh) obj).Q(w1Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void c(q30 q30Var) {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.c(q30Var);
            return;
        }
        Object obj = this.f14757b.get();
        if (obj == null) {
            return;
        }
        try {
            ((vh) obj).t2(q30Var);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public final void d() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.d();
            return;
        }
        ne0 ne0Var = this.f14756a.f16922a;
        if (ne0Var != null) {
            g gVar = (g) ne0Var.f14280b;
            synchronized (gVar) {
                gVar.f11324a = 1;
                gVar.e();
            }
        }
        if (this.f14758c.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj = this.f14759d.get();
        if (obj == null) {
            return;
        }
        try {
            ((yh) obj).f();
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // xa.l
    public final void e0(int i4) {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.e0(i4);
            return;
        }
        Object obj = this.f14761f.get();
        if (obj == null) {
            return;
        }
        try {
            ((xa.l) obj).e0(i4);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.cp0
    public final void g(cp0 cp0Var) {
        this.f14762h = (oo0) cp0Var;
    }

    @Override // xa.l
    public final void h3() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.h3();
        } else {
            yo0.l(this.f14761f, tk0.g);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.o(w1Var);
            return;
        }
        AtomicReference atomicReference = this.f14757b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((vh) obj).W(w1Var);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            } catch (NullPointerException e10) {
                za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((vh) obj2).p(w1Var.f36177a);
        } catch (RemoteException e11) {
            za.i.k("#007 Could not call remote method.", e11);
        } catch (NullPointerException e12) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.x();
        } else {
            yo0.l(this.f14759d, tk0.f16845k);
        }
    }

    @Override // xa.l
    public final void z1() {
        oo0 oo0Var = this.f14762h;
        if (oo0Var != null) {
            oo0Var.z1();
            return;
        }
        yo0.l(this.f14761f, tk0.f16843h);
        tk0 tk0Var = tk0.f16844i;
        AtomicReference atomicReference = this.f14759d;
        yo0.l(atomicReference, tk0Var);
        yo0.l(atomicReference, tk0.j);
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
    }

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void k2() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // xa.l
    public final void u1() {
    }
}
