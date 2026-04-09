package defpackage;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class im2 implements ye4 {
    public final h83 g;
    public final a83 h;
    public final ym i;
    public final mv2 j;
    public final ScheduledExecutorService k;
    public final Object f = new Object();
    public final ra3 l = sa3.A();
    public boolean m = false;
    public boolean n = false;

    public im2(h83 h83Var, a83 a83Var, ym ymVar, mv2 mv2Var, ScheduledExecutorService scheduledExecutorService) {
        this.g = h83Var;
        this.h = a83Var;
        this.i = ymVar;
        this.j = mv2Var;
        this.k = scheduledExecutorService;
    }

    @Override // defpackage.ye4
    public final void B1() {
        b(6);
    }

    @Override // defpackage.ye4
    public final void E1() {
        b(4);
    }

    @Override // defpackage.ye4
    public final void R2() {
        b(7);
    }

    @Override // defpackage.ye4
    public final void U() {
        b(8);
    }

    @Override // defpackage.ye4
    public final void Y() {
        b(5);
    }

    public final void a() {
        synchronized (this.f) {
            try {
                mv2 mv2Var = this.j;
                String str = ((c83) this.g.b.g).b;
                String strEncodeToString = Base64.encodeToString(((sa3) this.l.d()).b(), 1);
                if (((Boolean) tw1.e.c.a(mz1.Gd)).booleanValue()) {
                    lv2 lv2VarA = mv2Var.a();
                    lv2VarA.k("action", "pclma");
                    lv2VarA.k("pclmd", strEncodeToString);
                    lv2VarA.k("gqi", str);
                    lv2VarA.o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f) {
            try {
                if (!this.n && this.m) {
                    ra3 ra3Var = this.l;
                    y93 y93VarA = z93.A();
                    y93VarA.b();
                    ((z93) y93VarA.g).C(i);
                    this.i.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    y93VarA.b();
                    ((z93) y93VarA.g).B(jCurrentTimeMillis);
                    z93 z93Var = (z93) y93VarA.d();
                    ra3Var.b();
                    ((sa3) ra3Var.g).B(z93Var);
                    if (i == 10) {
                        a();
                        this.n = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.ye4
    public final void f3() {
        b(3);
    }

    @Override // defpackage.ye4
    public final void h3() {
        b(10);
    }

    @Override // defpackage.ye4
    public final void m2() {
        b(9);
    }

    @Override // defpackage.ye4
    public final void M1() {
    }

    @Override // defpackage.ye4
    public final void f() {
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
    }
}
