package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vc4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ yc4 h;

    public vc4(yc4 yc4Var, int i) {
        this.h = yc4Var;
        this.a = i;
    }

    public final void a() {
        yc4 yc4Var = this.h;
        ya4 ya4Var = yc4Var.f;
        d13 d13Var = yc4Var.i;
        if (ya4Var.C1() != 3 || !ya4Var.H1() || ya4Var.D1() != 0) {
            if (this.f) {
                d13Var.c(2);
            }
            this.f = false;
            return;
        }
        oz1 oz1VarK1 = ya4Var.K1();
        Object objF = oz1VarK1.g() ? null : oz1VarK1.f(ya4Var.N1());
        int iD = ya4Var.d();
        int iT1 = ya4Var.T1();
        long jQ1 = ya4Var.Q1();
        if (objF != null && iD == -1) {
            oz1VarK1.o(objF, yc4Var.h);
            jQ1 -= v23.q(0L);
            iD = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iD == this.c && iT1 == this.d && jQ1 == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                yc4Var.g.f.Y1(new b84(2, new zc4(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objF;
        this.c = iD;
        this.d = iT1;
        this.e = jQ1;
        d13Var.c(2);
        d13Var.a.sendEmptyMessageDelayed(2, i);
    }
}
