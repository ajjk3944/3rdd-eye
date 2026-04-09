package defpackage;

import android.content.Context;
import java.math.BigInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ql2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final qm2 c;
    public final ga4 d;

    public ql2(qm2 qm2Var, ba4 ba4Var, fh2 fh2Var) {
        this.a = 2;
        this.c = qm2Var;
        this.b = ba4Var;
        this.d = fh2Var;
    }

    public e33 a() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new e33(ld2Var, (bv2) this.b.d(), this.c.a(), (String) this.d.d(), 3);
    }

    public e33 b() {
        Context contextA = ((hh2) this.b).a();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new e33(contextA, ld2Var, this.c.a(), ((ph2) this.d).a());
    }

    @Override // defpackage.ga4
    public final Object d() {
        String string;
        switch (this.a) {
            case 0:
                ym ymVar = (ym) this.b.d();
                id2 id2VarD = ((qh2) this.d).d();
                String str = this.c.a().g;
                l92 l92Var = id2VarD.h;
                synchronized (l92Var) {
                    string = ((BigInteger) l92Var.f).toString();
                    l92Var.f = ((BigInteger) l92Var.f).add(BigInteger.ONE);
                    l92Var.g = string;
                }
                return new dd2(ymVar, id2VarD, string, str);
            case 1:
                return a();
            case 2:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new e33((Object) ld2Var, this.c.a(), this.b.d(), (Object) ((fh2) this.d).d(), 5);
            default:
                return b();
        }
    }

    public ql2(ba4 ba4Var, qh2 qh2Var, qm2 qm2Var) {
        this.a = 0;
        this.b = ba4Var;
        this.d = qh2Var;
        this.c = qm2Var;
    }

    public /* synthetic */ ql2(ga4 ga4Var, qm2 qm2Var, ga4 ga4Var2, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = qm2Var;
        this.d = ga4Var2;
    }
}
