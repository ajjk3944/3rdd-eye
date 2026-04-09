package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i03 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ga4 c;
    public final qm2 d;
    public final ga4 e;
    public final da4 f;
    public final ba4 g;
    public final ga4 h;
    public final ba4 i;
    public final ga4 j;

    public /* synthetic */ i03(ba4 ba4Var, ph2 ph2Var, qm2 qm2Var, ba4 ba4Var2, da4 da4Var, ba4 ba4Var3, ba4 ba4Var4, ba4 ba4Var5, ba4 ba4Var6, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ph2Var;
        this.d = qm2Var;
        this.e = ba4Var2;
        this.f = da4Var;
        this.g = ba4Var3;
        this.h = ba4Var4;
        this.i = ba4Var5;
        this.j = ba4Var6;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                zh2 zh2Var = (zh2) this.f.a;
                return new h03(zh2Var, (Executor) this.c.d(), (pu2) this.g.d(), this.d.a(), ((ph2) this.e).a(), new e42(), (pz2) this.h.d(), (jv2) this.i.d(), (mv2) this.j.d());
            case 1:
                return new y03((Context) this.b.d(), ((ph2) this.c).a(), this.d.a(), (Executor) this.e.d(), (ei2) this.f.a, (pu2) this.g.d(), new e42(), (pz2) this.h.d(), (jv2) this.i.d(), (mv2) this.j.d());
            default:
                return new y03((Context) this.b.d(), ((ph2) this.c).a(), this.d.a(), (Executor) this.e.d(), (ji2) this.f.a, (pu2) this.g.d(), new e42(), (pz2) this.h.d(), (jv2) this.i.d(), (mv2) this.j.d());
        }
    }

    public i03(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, qm2 qm2Var, ph2 ph2Var, ba4 ba4Var4, ba4 ba4Var5, ba4 ba4Var6) {
        this.a = 0;
        this.f = da4Var;
        this.b = ba4Var;
        this.c = ba4Var2;
        this.g = ba4Var3;
        this.d = qm2Var;
        this.e = ph2Var;
        this.h = ba4Var4;
        this.i = ba4Var5;
        this.j = ba4Var6;
    }
}
