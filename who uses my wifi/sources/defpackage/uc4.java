package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uc4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ yc4 i;

    public uc4(yc4 yc4Var, int i) {
        this.i = yc4Var;
        this.a = i;
    }

    public final void a() {
        Object obj;
        yc4 yc4Var = this.i;
        ya4 ya4Var = yc4Var.f;
        d13 d13Var = yc4Var.i;
        if (ya4Var.C1() != 2 || !ya4Var.H1() || ya4Var.D1() != 0) {
            if (this.g) {
                d13Var.c(1);
            }
            this.g = false;
            return;
        }
        oz1 oz1VarK1 = ya4Var.K1();
        Object objF = oz1VarK1.g() ? null : oz1VarK1.f(ya4Var.N1());
        int iD = ya4Var.d();
        int iT1 = ya4Var.T1();
        long jO2 = ya4Var.o2();
        long jMax = Math.max(0L, ya4Var.R1() - Math.max(0L, jO2 - ya4Var.Q1()));
        if (objF != null && iD == -1) {
            oz1VarK1.o(objF, yc4Var.h);
            jO2 -= v23.q(0L);
            iD = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iD == this.c && iT1 == this.d) {
            obj = objF;
            if (jO2 == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i) {
                    yc4Var.g.f.Y1(new b84(2, new zc4(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = obj;
        this.c = iD;
        this.d = iT1;
        this.e = jO2;
        this.f = jMax;
        d13Var.c(1);
        d13Var.a.sendEmptyMessageDelayed(1, i);
    }
}
