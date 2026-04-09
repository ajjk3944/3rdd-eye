package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dz1 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ba4 c;
    public final ba4 d;

    public /* synthetic */ dz1(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                dq2 dq2Var = (ei4) this.b.d();
                dq2 dq2Var2 = (q32) this.c.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                if (((Integer) this.d.d()).intValue() == 2) {
                    dq2Var = dq2Var2;
                }
                return new up2(dq2Var, ld2Var);
            default:
                return new y73((v73) this.b.d(), (s73) this.c.d(), (i83) this.d.d());
        }
    }
}
