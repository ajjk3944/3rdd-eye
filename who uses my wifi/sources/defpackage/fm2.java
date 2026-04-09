package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fm2 implements um2, op2, to2, bn2, ov1 {
    public final cn2 f;
    public final co2 g;
    public final a83 h;
    public final ScheduledExecutorService i;
    public final Executor j;
    public ScheduledFuture l;
    public final String n;
    public final wq3 k = new wq3();
    public final AtomicBoolean m = new AtomicBoolean();

    public fm2(cn2 cn2Var, a83 a83Var, ScheduledExecutorService scheduledExecutorService, ld2 ld2Var, String str, co2 co2Var) {
        this.f = cn2Var;
        this.h = a83Var;
        this.i = scheduledExecutorService;
        this.j = ld2Var;
        this.n = str;
        this.g = co2Var;
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        if (((Boolean) tw1.e.c.a(mz1.lc)).booleanValue() && this.n.equals("com.google.ads.mediation.admob.AdMobAdapter") && nv1Var.j && this.m.compareAndSet(false, true) && this.h.e != 3) {
            gi2.G("Full screen 1px impression occurred");
            this.f.a();
        }
    }

    @Override // defpackage.op2
    public final void e() {
        a83 a83Var = this.h;
        int i = a83Var.e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.g.a();
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.E1)).booleanValue() && a83Var.Y == 2) {
            int i2 = a83Var.q;
            if (i2 == 0) {
                this.f.a();
                return;
            }
            wq3 wq3Var = this.k;
            wq3Var.c(new jq3(wq3Var, new f23(19, this), 0), this.j);
            this.l = this.i.schedule(new fu1(26, this), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.to2
    public final synchronized void p() {
        if (this.h.e == 4) {
            this.f.a();
            return;
        }
        wq3 wq3Var = this.k;
        if (wq3Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        wq3Var.d(Boolean.TRUE);
    }

    @Override // defpackage.um2
    public final void r() {
        a83 a83Var = this.h;
        if (a83Var.e == 3) {
            return;
        }
        int i = a83Var.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) tw1.e.c.a(mz1.lc)).booleanValue() && this.n.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f.a();
        }
    }

    @Override // defpackage.bn2
    public final synchronized void s(nx2 nx2Var) {
        try {
            wq3 wq3Var = this.k;
            if (wq3Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            wq3Var.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.um2
    public final void T() {
    }

    @Override // defpackage.um2
    public final void a() {
    }

    @Override // defpackage.um2
    public final void b() {
    }

    @Override // defpackage.um2
    public final void c() {
    }

    @Override // defpackage.op2
    public final void f() {
    }

    @Override // defpackage.to2
    public final void w() {
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
    }
}
