package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x73 extends xa2 {
    public final v73 g;
    public final s73 h;
    public final String i;
    public final i83 j;
    public final Context k;
    public final e51 l;
    public final vs1 m;
    public final mv2 n;
    public iu2 o;
    public boolean p = ((Boolean) tw1.e.c.a(mz1.M0)).booleanValue();

    public x73(String str, v73 v73Var, Context context, s73 s73Var, i83 i83Var, e51 e51Var, vs1 vs1Var, mv2 mv2Var) {
        this.i = str;
        this.g = v73Var;
        this.h = s73Var;
        this.j = i83Var;
        this.k = context;
        this.l = e51Var;
        this.m = vs1Var;
        this.n = mv2Var;
    }

    @Override // defpackage.ya2
    public final void A2(gb2 gb2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        this.h.k.set(gb2Var);
    }

    @Override // defpackage.ya2
    public final synchronized void B2(mb2 mb2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        i83 i83Var = this.j;
        i83Var.a = mb2Var.f;
        i83Var.b = mb2Var.g;
    }

    public final synchronized void B3(pc4 pc4Var, fb2 fb2Var, int i) {
        try {
            if (!pc4Var.b()) {
                boolean z = false;
                if (((Boolean) q02.k.w()).booleanValue()) {
                    if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.l.h < ((Integer) tw1.e.c.a(mz1.Xb)).intValue() || !z) {
                    ou1.h("#008 Must be called on the main UI thread.");
                }
            }
            s73 s73Var = this.h;
            s73Var.h.set(fb2Var);
            lf4 lf4Var = hg4.C.c;
            if (lf4.h(this.k) && pc4Var.x == null) {
                gi2.Z("Failed to load the ad because app ID is missing.");
                s73Var.d0(zt0.Q(4, null, null));
                return;
            }
            if (this.o != null) {
                return;
            }
            t73 t73Var = new t73();
            v73 v73Var = this.g;
            v73Var.h.o.g = i;
            v73Var.a(pc4Var, this.i, t73Var, new kf3(25, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ya2
    public final synchronized void C1(u10 u10Var, boolean z) {
        ou1.h("#008 Must be called on the main UI thread.");
        if (this.o == null) {
            gi2.i0("Rewarded can not be shown before loaded");
            this.h.s(zt0.Q(9, null, null));
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
            this.m.b.c(new Throwable().getStackTrace());
        }
        this.o.c((Activity) oi0.l1(u10Var), z);
    }

    @Override // defpackage.ya2
    public final synchronized void K1(pc4 pc4Var, fb2 fb2Var) {
        B3(pc4Var, fb2Var, 3);
    }

    @Override // defpackage.ya2
    public final void c1(bb2 bb2Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        this.h.i.set(bb2Var);
    }

    @Override // defpackage.ya2
    public final void d1(zu2 zu2Var) {
        ou1.h("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zu2Var.c()) {
                this.n.b();
            }
        } catch (RemoteException unused) {
            gi2.q0(3);
        }
        this.h.m.set(zu2Var);
    }

    @Override // defpackage.ya2
    public final void d2(xs2 xs2Var) {
        s73 s73Var = this.h;
        if (xs2Var == null) {
            s73Var.g.set(null);
        } else {
            s73Var.g.set(new w73(this, xs2Var, 0));
        }
    }

    @Override // defpackage.ya2
    public final Bundle e() {
        Bundle bundle;
        ou1.h("#008 Must be called on the main UI thread.");
        iu2 iu2Var = this.o;
        if (iu2Var == null) {
            return new Bundle();
        }
        un2 un2Var = iu2Var.q;
        synchronized (un2Var) {
            bundle = new Bundle(un2Var.i);
        }
        return bundle;
    }

    @Override // defpackage.ya2
    public final synchronized String g() {
        rm2 rm2Var;
        iu2 iu2Var = this.o;
        if (iu2Var == null || (rm2Var = iu2Var.f) == null) {
            return null;
        }
        return rm2Var.f;
    }

    @Override // defpackage.ya2
    public final synchronized void h1(long j) {
        gm2 gm2Var;
        iu2 iu2Var = this.o;
        if (iu2Var == null || (gm2Var = iu2Var.j) == null) {
            return;
        }
        gm2Var.a(j);
    }

    @Override // defpackage.ya2
    public final va2 i() {
        ou1.h("#008 Must be called on the main UI thread.");
        iu2 iu2Var = this.o;
        if (iu2Var != null) {
            return iu2Var.s;
        }
        return null;
    }

    @Override // defpackage.ya2
    public final boolean j() {
        ou1.h("#008 Must be called on the main UI thread.");
        iu2 iu2Var = this.o;
        return (iu2Var == null || iu2Var.w) ? false : true;
    }

    @Override // defpackage.ya2
    public final synchronized long m() {
        gm2 gm2Var;
        iu2 iu2Var = this.o;
        if (iu2Var == null || (gm2Var = iu2Var.j) == null) {
            return 0L;
        }
        return gm2Var.a.get();
    }

    @Override // defpackage.ya2
    public final tx2 n() {
        iu2 iu2Var;
        if (((Boolean) tw1.e.c.a(mz1.d7)).booleanValue() && (iu2Var = this.o) != null) {
            return iu2Var.f;
        }
        return null;
    }

    @Override // defpackage.ya2
    public final String o() {
        return this.i;
    }

    @Override // defpackage.ya2
    public final synchronized void q2(pc4 pc4Var, fb2 fb2Var) {
        B3(pc4Var, fb2Var, 2);
    }

    @Override // defpackage.ya2
    public final synchronized void u3(boolean z) {
        ou1.h("setImmersiveMode must be called on the main UI thread.");
        this.p = z;
    }

    @Override // defpackage.ya2
    public final synchronized void w2(u10 u10Var) {
        C1(u10Var, this.p);
    }
}
