package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fw2 implements zv2 {
    public final long a;
    public final w23 b;

    public fw2(long j, Context context, f20 f20Var, th2 th2Var, String str) {
        this.a = j;
        th2 th2Var2 = th2Var.b;
        xe4 xe4Var = new xe4();
        str.getClass();
        w23 w23Var = (w23) ((ba4) new of3(th2Var2, context, str, xe4Var).g).d();
        this.b = w23Var;
        w23Var.W2(new ew2(this, f20Var));
    }

    @Override // defpackage.zv2
    public final void a(pc4 pc4Var) {
        this.b.Z(pc4Var);
    }

    @Override // defpackage.zv2
    public final void d() {
        this.b.k3(new oi0(null));
    }

    @Override // defpackage.zv2
    public final void h() {
        this.b.r();
    }
}
