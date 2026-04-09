package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yj2 implements ca4 {
    public final /* synthetic */ int a = 0;
    public final ga4 b;
    public final ba4 c;
    public final ba4 d;
    public final ba4 e;
    public final ga4 f;

    public yj2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, ba4 ba4Var5) {
        this.c = ba4Var;
        this.d = ba4Var2;
        this.b = ba4Var3;
        this.e = ba4Var4;
        this.f = ba4Var5;
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new xj2((l62) this.c.d(), (rj2) this.d.d(), (Executor) this.b.d(), (qj2) this.e.d(), (ym) this.f.d());
            default:
                return new fe3((Context) this.b.d(), (ge3) this.c.d(), (gd3) this.d.d(), (fd3) this.e.d(), ((vf3) this.f.d()).T());
        }
    }

    public yj2(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, da4 da4Var2, ba4 ba4Var3) {
        this.b = da4Var;
        this.c = ba4Var;
        this.d = ba4Var2;
        this.e = ba4Var3;
        this.f = da4Var2;
    }
}
