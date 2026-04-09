package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xk implements ca4 {
    public final /* synthetic */ int a;
    public final hh2 b;
    public final ph2 c;

    public /* synthetic */ xk(hh2 hh2Var, ph2 ph2Var, int i) {
        this.a = i;
        this.b = hh2Var;
        this.c = ph2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        int i = this.a;
        ph2 ph2Var = this.c;
        hh2 hh2Var = this.b;
        switch (i) {
            case 0:
                return new t83((Context) hh2Var.d(), (e51) ph2Var.d());
            case 1:
                return new ax2(hh2Var.a(), ph2Var.a());
            case 2:
                Context contextA = hh2Var.a();
                e51 e51VarA = ph2Var.a();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new gx2(contextA, e51VarA, ld2Var);
            default:
                Context contextA2 = hh2Var.a();
                iz1 iz1Var = mz1.a;
                return new k63(contextA2, tw1.e.a.H(), ph2Var.a());
        }
    }
}
