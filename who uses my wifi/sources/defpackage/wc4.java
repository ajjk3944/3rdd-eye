package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wc4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ yc4 g;

    public wc4(yc4 yc4Var, int i) {
        this.g = yc4Var;
        this.a = i;
    }

    public final void a() {
        long jN2;
        yc4 yc4Var = this.g;
        ya4 ya4Var = yc4Var.f;
        sw1 sw1Var = yc4Var.h;
        d13 d13Var = yc4Var.i;
        oz1 oz1VarK1 = ya4Var.K1();
        Object objF = oz1VarK1.g() ? null : oz1VarK1.f(ya4Var.N1());
        int iD = ya4Var.d();
        int iT1 = ya4Var.T1();
        long jQ1 = ya4Var.Q1();
        if (objF == null || iD != -1) {
            jN2 = iD != -1 ? ya4Var.n2() : -9223372036854775807L;
        } else {
            oz1VarK1.o(objF, sw1Var);
            jQ1 -= v23.q(0L);
            jN2 = v23.q(sw1Var.d);
            iD = -1;
        }
        boolean z = ya4Var.C1() == 3 && ya4Var.H1() && ya4Var.D1() == 0;
        if (!z || jN2 == -9223372036854775807L || jQ1 < jN2) {
            d13Var.c(3);
            if (z && jN2 != -9223372036854775807L) {
                ya4Var.j2();
                d13Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((jN2 - jQ1) / ya4Var.c0.o.a));
            }
            this.e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.e;
        int i = this.a;
        if (z2 && Objects.equals(objF, this.b) && iD == this.c && iT1 == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                yc4Var.g.f.Y1(new b84(2, new zc4(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objF;
        this.c = iD;
        this.d = iT1;
        d13Var.c(3);
        d13Var.a.sendEmptyMessageDelayed(3, i);
    }
}
