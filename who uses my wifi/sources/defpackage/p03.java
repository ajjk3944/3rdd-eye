package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p03 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ga4 c;
    public final da4 d;

    public /* synthetic */ p03(ba4 ba4Var, da4 da4Var, ga4 ga4Var, int i) {
        this.a = i;
        this.b = ba4Var;
        this.d = da4Var;
        this.c = ga4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new l03((Context) this.b.d(), (bi2) this.d.a, (Executor) this.c.d(), 1);
            case 1:
                Context context = (Context) this.b.d();
                e51 e51VarA = ((ph2) this.c).a();
                ei2 ei2Var = (ei2) this.d.a;
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new r03(context, e51VarA, ei2Var, ld2Var);
            case 2:
                return new l03((Context) this.b.d(), (sh2) this.d.a, (Executor) this.c.d(), 2);
            case 3:
                return new r03((Context) this.b.d(), (sh2) this.d.a, ((ph2) this.c).a());
            case 4:
                return new t13((Context) this.b.d(), (Executor) this.c.d(), (ji2) this.d.a, 0);
            default:
                return new t13((Context) this.b.d(), (Executor) this.c.d(), (ji2) this.d.a, 1);
        }
    }

    public /* synthetic */ p03(ba4 ba4Var, ga4 ga4Var, da4 da4Var, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ga4Var;
        this.d = da4Var;
    }
}
