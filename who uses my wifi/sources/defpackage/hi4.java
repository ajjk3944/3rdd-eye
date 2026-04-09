package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hi4 extends pg4 {
    public final hh3 h;
    public final yf3 i;
    public final pz j;
    public final int k;
    public boolean l;
    public long m;
    public boolean n;
    public boolean o;
    public ws3 p;
    public fk1 q;

    public /* synthetic */ hi4(fk1 fk1Var, hh3 hh3Var, yf3 yf3Var, hd4 hd4Var, int i) {
        pz pzVar = pz.q;
        this.q = fk1Var;
        this.h = hh3Var;
        this.i = yf3Var;
        this.j = pzVar;
        this.k = i;
        this.l = true;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.pg4
    public final synchronized void a(fk1 fk1Var) {
        this.q = fk1Var;
    }

    @Override // defpackage.pg4
    public final void b(jh4 jh4Var) {
        bi4 bi4Var = (bi4) jh4Var;
        if (bi4Var.z) {
            for (ki4 ki4Var : bi4Var.w) {
                ki4Var.l();
                if (ki4Var.g != null) {
                    ki4Var.g = null;
                    ki4Var.f = null;
                }
            }
        }
        t83 t83Var = bi4Var.o;
        yj4 yj4Var = (yj4) t83Var.h;
        if (yj4Var != null) {
            yj4Var.a(true);
        }
        ia1 ia1Var = (ia1) t83Var.g;
        ia1Var.execute(new bh3(16, bi4Var));
        ((ExecutorService) ((Executor) ia1Var.g)).shutdown();
        bi4Var.t.removeCallbacksAndMessages(null);
        bi4Var.u = null;
        bi4Var.R = true;
    }

    @Override // defpackage.pg4
    public final jh4 c(kh4 kh4Var, rj4 rj4Var, long j) {
        th3 th3VarMo10a = this.h.mo10a();
        ws3 ws3Var = this.p;
        if (ws3Var != null) {
            th3VarMo10a.b(ws3Var);
        }
        kh1 kh1Var = f().b;
        kh1Var.getClass();
        Uri uri = kh1Var.a;
        this.g.getClass();
        return new bi4(uri, th3VarMo10a, new jr3((of1) this.i.f), this.j, new lv2(this.d.h, (Object) kh4Var, 18, false), new wt2((CopyOnWriteArrayList) this.c.h, kh4Var, 14), this, rj4Var, this.k, v23.r(-9223372036854775807L));
    }

    @Override // defpackage.pg4
    public final synchronized fk1 f() {
        return this.q;
    }

    @Override // defpackage.pg4
    public final void h(ws3 ws3Var) {
        this.p = ws3Var;
        Looper.myLooper().getClass();
        this.g.getClass();
        t();
    }

    public final void s(long j, cg1 cg1Var, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.m;
        }
        boolean zD = cg1Var.d();
        if (!this.l && this.m == j && this.n == zD && this.o == z) {
            return;
        }
        this.m = j;
        this.n = zD;
        this.o = z;
        this.l = false;
        t();
    }

    public final void t() {
        long j = this.m;
        boolean z = this.n;
        boolean z2 = this.o;
        fk1 fk1VarF = f();
        oz1 oi4Var = new oi4(j, j, z, fk1VarF, z2 ? fk1VarF.c : null);
        if (this.l) {
            oi4Var = new ci4(oi4Var);
        }
        k(oi4Var);
    }

    @Override // defpackage.pg4
    public final void j() {
    }

    @Override // defpackage.pg4
    public final void r() {
    }
}
