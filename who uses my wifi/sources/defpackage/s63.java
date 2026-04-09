package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s63 implements wm2, wn2, h73, ye4, bo2, bn2, xp2 {
    public final x83 f;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public s63 m = null;

    public s63(x83 x83Var) {
        this.f = x83Var;
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.G1(i);
            return;
        }
        Object obj = this.k.get();
        if (obj == null) {
            return;
        }
        try {
            ((ye4) obj).G1(i);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.ye4
    public final void M1() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.M1();
        } else {
            um.G(this.k, su2.j);
        }
    }

    @Override // defpackage.ye4
    public final void R2() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.R2();
        } else {
            um.G(this.k, tv2.k);
        }
    }

    public final void a(gk2 gk2Var) {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.a(gk2Var);
            return;
        }
        Object obj = this.g.get();
        if (obj == null) {
            return;
        }
        try {
            ((nw1) obj).d3(gk2Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    public final void b() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.b();
            return;
        }
        vg0 vg0Var = this.f.a;
        if (vg0Var != null) {
            pj4 pj4Var = (pj4) vg0Var.g;
            synchronized (pj4Var) {
                pj4Var.f = 1;
                pj4Var.d();
            }
        }
        if (this.h.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pw1) obj).l();
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.d0(nx2Var);
            return;
        }
        AtomicReference atomicReference = this.g;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((nw1) obj).W(nx2Var);
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((nw1) obj2).I(nx2Var.f);
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.ye4
    public final void f() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.f();
            return;
        }
        Object obj = this.k.get();
        if (obj != null) {
            try {
                ((ye4) obj).f();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        AtomicReference atomicReference = this.i;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((pw1) obj2).r();
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            } catch (NullPointerException unused2) {
                gi2.q0(5);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((pw1) obj3).c();
        } catch (RemoteException e3) {
            gi2.p0("#007 Could not call remote method.", e3);
        } catch (NullPointerException unused3) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.bo2
    public final void h(dg4 dg4Var) {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.h(dg4Var);
            return;
        }
        Object obj = this.l.get();
        if (obj == null) {
            return;
        }
        try {
            ((zu2) obj).R1(dg4Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wn2
    public final void i() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.i();
        } else {
            um.G(this.j, tv2.j);
        }
    }

    @Override // defpackage.h73
    public final void p(h73 h73Var) {
        this.m = (s63) h73Var;
    }

    @Override // defpackage.bn2
    public final void s(nx2 nx2Var) {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.s(nx2Var);
            return;
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pw1) obj).g0(nx2Var);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.xp2
    public final void s0() {
        s63 s63Var = this.m;
        if (s63Var != null) {
            s63Var.s0();
            return;
        }
        Object obj = this.i.get();
        if (obj == null) {
            return;
        }
        try {
            ((pw1) obj).e();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.xp2
    public final void U0() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }
}
