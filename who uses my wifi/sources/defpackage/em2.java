package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class em2 implements ca4 {
    public final /* synthetic */ int a = 0;
    public final ga4 b;
    public final qm2 c;
    public final ba4 d;

    public em2(qm2 qm2Var, ba4 ba4Var, ba4 ba4Var2) {
        this.c = qm2Var;
        this.b = ba4Var;
        this.d = ba4Var2;
    }

    public i33 a() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        l83 l83VarA = this.c.a();
        return new i33(ld2Var, l83VarA, ((Integer) this.d.d()).intValue());
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new dm2((Context) this.d.d(), ((ph2) this.b).a(), this.c.a(), 0);
            case 1:
                return new rw2((zw2) this.b.d(), this.c.a(), (String) this.d.d());
            default:
                return a();
        }
    }

    public em2(ba4 ba4Var, qm2 qm2Var, ba4 ba4Var2) {
        this.b = ba4Var;
        this.c = qm2Var;
        this.d = ba4Var2;
    }

    public em2(ba4 ba4Var, ga4 ga4Var, qm2 qm2Var) {
        this.d = ba4Var;
        this.b = ga4Var;
        this.c = qm2Var;
    }
}
