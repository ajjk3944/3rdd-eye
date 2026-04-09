package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s73 implements si0, rn2, wm2, um2, bn2, bo2, h73, xp2 {
    public final x83 f;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public final AtomicReference m = new AtomicReference();
    public s73 n = null;

    public s73(x83 x83Var) {
        this.f = x83Var;
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
        int i = ka2Var.g;
        String str3 = ka2Var.f;
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.J(ka2Var, str, str2);
            return;
        }
        Object obj = this.i.get();
        if (obj != null) {
            try {
                ((bb2) obj).U0(new nb2(str3, i));
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.k.get();
        if (obj2 != null) {
            try {
                gb2 gb2Var = (gb2) obj2;
                nb2 nb2Var = new nb2(str3, i);
                Parcel parcelU = gb2Var.U();
                iv1.e(parcelU, nb2Var);
                parcelU.writeString(str);
                parcelU.writeString(str2);
                gb2Var.M0(parcelU, 2);
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            } catch (NullPointerException unused2) {
                gi2.q0(5);
            }
        }
        Object obj3 = this.j.get();
        if (obj3 != null) {
            try {
                ma2 ma2Var = (ma2) obj3;
                Parcel parcelU2 = ma2Var.U();
                iv1.e(parcelU2, ka2Var);
                ma2Var.M0(parcelU2, 5);
            } catch (RemoteException e3) {
                gi2.p0("#007 Could not call remote method.", e3);
            } catch (NullPointerException unused3) {
                gi2.q0(5);
            }
        }
        Object obj4 = this.l.get();
        if (obj4 == null) {
            return;
        }
        try {
            la2 la2Var = (la2) obj4;
            Parcel parcelU3 = la2Var.U();
            iv1.e(parcelU3, ka2Var);
            parcelU3.writeString(str);
            parcelU3.writeString(str2);
            la2Var.M0(parcelU3, 2);
        } catch (RemoteException e4) {
            gi2.p0("#007 Could not call remote method.", e4);
        } catch (NullPointerException unused4) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.um2
    public final void T() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.T();
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
        Object obj = this.i.get();
        if (obj != null) {
            try {
                ((bb2) obj).c();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj2;
            ma2Var.M0(ma2Var.U(), 4);
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.um2
    public final void a() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.a();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj;
            ma2Var.M0(ma2Var.U(), 6);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.um2
    public final void b() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.b();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj;
            ma2Var.M0(ma2Var.U(), 3);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.um2
    public final void c() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.c();
            return;
        }
        Object obj = this.j.get();
        if (obj == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj;
            ma2Var.M0(ma2Var.U(), 8);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        } catch (NullPointerException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.d0(nx2Var);
            return;
        }
        int i = nx2Var.f;
        AtomicReference atomicReference = this.h;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((fb2) obj).a(nx2Var);
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((fb2) obj2).t(i);
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
            } catch (NullPointerException unused2) {
                gi2.q0(5);
            }
        }
        Object obj3 = this.j.get();
        if (obj3 == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj3;
            Parcel parcelU = ma2Var.U();
            parcelU.writeInt(i);
            ma2Var.M0(parcelU, 7);
        } catch (RemoteException e3) {
            gi2.p0("#007 Could not call remote method.", e3);
        } catch (NullPointerException unused3) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.rn2
    public final void e() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.e();
            return;
        }
        Object obj = this.h.get();
        if (obj != null) {
            try {
                ((fb2) obj).b();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 == null) {
            return;
        }
        try {
            ma2 ma2Var = (ma2) obj2;
            ma2Var.M0(ma2Var.U(), 1);
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.bo2
    public final void h(dg4 dg4Var) {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.h(dg4Var);
            return;
        }
        Object obj = this.m.get();
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

    @Override // defpackage.si0
    public final void l() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.l();
        } else {
            um.G(this.g, su2.k);
        }
    }

    @Override // defpackage.h73
    public final void p(h73 h73Var) {
        this.n = (s73) h73Var;
    }

    @Override // defpackage.um2
    public final void r() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.r();
            return;
        }
        AtomicReference atomicReference = this.i;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((bb2) obj).b();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            } catch (NullPointerException unused) {
                gi2.q0(5);
            }
        }
        Object obj2 = this.j.get();
        if (obj2 != null) {
            try {
                ma2 ma2Var = (ma2) obj2;
                ma2Var.M0(ma2Var.U(), 2);
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
            ((bb2) obj3).g();
        } catch (RemoteException e3) {
            gi2.p0("#007 Could not call remote method.", e3);
        } catch (NullPointerException unused3) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.bn2
    public final void s(nx2 nx2Var) {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.s(nx2Var);
            return;
        }
        AtomicReference atomicReference = this.i;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((bb2) obj).t2(nx2Var);
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
            ((bb2) obj2).z(nx2Var.f);
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        } catch (NullPointerException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.xp2
    public final void s0() {
        s73 s73Var = this.n;
        if (s73Var != null) {
            s73Var.s0();
        } else {
            um.G(this.i, tv2.l);
        }
    }

    @Override // defpackage.xp2
    public final void U0() {
    }
}
