package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oi3 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;

    public /* synthetic */ oi3(int i, ba4 ba4Var, ba4 ba4Var2, da4 da4Var, da4 da4Var2) {
        this.a = i;
        this.b = da4Var;
        this.c = ba4Var;
        this.d = da4Var2;
        this.e = ba4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ni3((fr1) this.b.a, (gi3) this.c.d(), (Context) this.d.d(), (gk3) this.e.d(), 0);
            case 1:
                return new pi3((fr1) this.b.a, (gi3) this.c.d(), (vf3) this.d.d(), (gk3) this.e.d());
            default:
                return new ni3((fr1) this.b.a, (gi3) this.c.d(), (Context) this.d.d(), (gk3) this.e.d(), 1);
        }
    }
}
