package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xc4 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ yc4 e;

    public xc4(yc4 yc4Var, int i) {
        this.e = yc4Var;
        this.a = i;
    }

    public final void a() {
        yc4 yc4Var = this.e;
        ya4 ya4Var = yc4Var.f;
        d13 d13Var = yc4Var.i;
        int iD1 = ya4Var.D1();
        ya4 ya4Var2 = yc4Var.f;
        if (!ya4Var2.H1() || ya4Var2.C1() == 1 || ya4Var2.C1() == 4 || iD1 == 0 || iD1 == 1) {
            if (this.c) {
                d13Var.c(4);
            }
            this.c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iD1) {
            if (jElapsedRealtime - this.d >= i) {
                yc4Var.g.f.Y1(new b84(2, new zc4(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iD1;
        d13Var.c(4);
        d13Var.a.sendEmptyMessageDelayed(4, i);
    }
}
