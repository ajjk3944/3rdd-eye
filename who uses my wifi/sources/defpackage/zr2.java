package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zr2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final qm2 c;

    public zr2(qm2 qm2Var, ga4 ga4Var) {
        this.a = 2;
        this.c = qm2Var;
        this.b = ga4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new nc2(((hh2) this.b).a(), this.c.a().g);
            case 1:
                return new g33((ym) this.b.d(), this.c.a(), 0);
            default:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new k33(ld2Var, this.c.a(), ((qh2) this.b).d(), 1);
        }
    }

    public /* synthetic */ zr2(ga4 ga4Var, qm2 qm2Var, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = qm2Var;
    }
}
