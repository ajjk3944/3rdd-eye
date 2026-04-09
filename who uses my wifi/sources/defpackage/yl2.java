package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yl2 implements ca4 {
    public final /* synthetic */ int a = 0;
    public final hh2 b;
    public final ph2 c;
    public final ba4 d;

    public yl2(hh2 hh2Var, ph2 ph2Var, ba4 ba4Var) {
        this.b = hh2Var;
        this.c = ph2Var;
        this.d = ba4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                Context contextA = this.b.a();
                ea3 ea3Var = (ea3) this.d.d();
                e51 e51VarA = this.c.a();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new vl2(contextA, ea3Var, e51VarA, ld2Var);
            default:
                i62 i62VarC = new p21(11).C(this.b.a(), this.c.a(), (ea3) this.d.d());
                i41.M(i62VarC);
                return i62VarC;
        }
    }

    public yl2(hh2 hh2Var, ba4 ba4Var, ph2 ph2Var) {
        this.b = hh2Var;
        this.d = ba4Var;
        this.c = ph2Var;
    }
}
