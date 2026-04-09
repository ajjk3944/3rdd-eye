package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class is2 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final ga4 b;
    public final fr2 c;

    public is2(fr2 fr2Var, ba4 ba4Var) {
        this.c = fr2Var;
        this.b = ba4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                au2 au2Var = (au2) this.c.b.h;
                i41.M(au2Var);
                return new hs2(au2Var, (ym) this.b.d());
            default:
                pu2 pu2Var = (pu2) this.b.d();
                au2 au2Var2 = (au2) this.c.b.h;
                i41.M(au2Var2);
                return new qs2(pu2Var, au2Var2);
        }
    }

    public is2(ba4 ba4Var, fr2 fr2Var) {
        this.b = ba4Var;
        this.c = fr2Var;
    }
}
