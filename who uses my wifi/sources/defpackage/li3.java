package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class li3 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final da4 b;
    public final ga4 c;
    public final da4 d;
    public final ga4 e;

    public li3(da4 da4Var, ba4 ba4Var, da4 da4Var2, ba4 ba4Var2) {
        this.b = da4Var;
        this.c = ba4Var;
        this.d = da4Var2;
        this.e = ba4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ki3((fr1) this.b.a, (Map) this.d.a, (vf3) this.c.d(), (gk3) this.e.d());
            default:
                return new pi3((fr1) this.b.a, (gi3) this.c.d(), (Map) this.d.a, (gk3) this.e.d());
        }
    }

    public li3(da4 da4Var, da4 da4Var2, da4 da4Var3, ba4 ba4Var) {
        this.b = da4Var;
        this.d = da4Var2;
        this.c = da4Var3;
        this.e = ba4Var;
    }
}
