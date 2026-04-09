package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wi3 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final ba4 c;
    public final da4 d;
    public final ba4 e;

    public /* synthetic */ wi3(int i, ba4 ba4Var, ba4 ba4Var2, da4 da4Var, da4 da4Var2) {
        this.a = i;
        this.b = da4Var;
        this.c = ba4Var;
        this.e = ba4Var2;
        this.d = da4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new vi3((Context) this.b.a, (gk3) this.c.d(), (wh3) this.e.d(), (vf3) this.d.a);
            case 1:
                return new zj3((Context) this.b.a, (gk3) this.c.d(), (vf3) this.d.a, (pq3) this.e.d());
            default:
                return new zj3((Context) this.b.a, (gk3) this.c.d(), (pq3) this.e.d(), (vf3) this.d.a);
        }
    }

    public wi3(da4 da4Var, ba4 ba4Var, da4 da4Var2, ba4 ba4Var2) {
        this.a = 1;
        this.b = da4Var;
        this.c = ba4Var;
        this.d = da4Var2;
        this.e = ba4Var2;
    }
}
