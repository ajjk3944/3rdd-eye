package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qd1 implements ne1 {
    public final /* synthetic */ sd1 b;

    public qd1(sd1 sd1Var) {
        this.b = sd1Var;
    }

    @Override // defpackage.ne1
    public final void a() {
        za4 za4Var = this.b.L;
        if (za4Var != null) {
            za4Var.a();
        }
    }

    @Override // defpackage.ne1
    public final void d() {
        sd1 sd1Var = this.b;
        Surface surface = sd1Var.P0;
        if (surface != null) {
            gw3 gw3Var = sd1Var.C0;
            Handler handler = (Handler) gw3Var.g;
            if (handler != null) {
                handler.post(new le1(gw3Var, surface, SystemClock.elapsedRealtime()));
            }
            sd1Var.S0 = true;
        }
    }

    @Override // defpackage.ne1
    public final void h() {
        sd1 sd1Var = this.b;
        if (sd1Var.P0 != null) {
            sd1Var.u0(0, 1);
        }
    }
}
