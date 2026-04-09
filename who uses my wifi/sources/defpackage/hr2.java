package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hr2 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;

    public /* synthetic */ hr2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, Object obj, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.e = (ga4) obj;
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                mv1 mv1Var = (mv1) this.b.d();
                Executor executor = (Executor) this.c.d();
                Context context = (Context) this.d.d();
                return new zj2(executor, new rj2(context, mv1Var), (ym) this.e.d());
            default:
                z94 z94VarB = ba4.b(this.b);
                gk3 gk3Var = (gk3) this.c.d();
                return new vj3(z94VarB, gk3Var, ((vf3) this.e.d()).K().B());
        }
    }
}
