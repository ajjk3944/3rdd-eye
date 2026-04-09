package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class es2 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final ba4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;
    public final ga4 f;
    public final ga4 g;
    public final ga4 h;
    public final ga4 i;

    public es2(fh2 fh2Var, qm2 qm2Var, ga4 ga4Var, u12 u12Var, ca4 ca4Var, ca4 ca4Var2, ba4 ba4Var, ba4 ba4Var2) {
        this.c = fh2Var;
        this.f = qm2Var;
        this.d = ga4Var;
        this.g = u12Var;
        this.h = ca4Var;
        this.i = ca4Var2;
        this.e = ba4Var;
        this.b = ba4Var2;
    }

    public ds2 a() {
        ra4 ra4VarD = ((fh2) this.c).d();
        l83 l83VarA = ((qm2) this.f).a();
        vr2 vr2Var = (vr2) this.d.d();
        tr2 tr2VarA = ((u12) this.g).a();
        ns2 ns2Var = (ns2) ((ca4) this.h).d();
        qs2 qs2Var = (qs2) ((ca4) this.i).d();
        Executor executor = (Executor) this.e.d();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new ds2(ra4VarD, l83VarA, vr2Var, tr2VarA, ns2Var, qs2Var, executor, ld2Var, (rr2) this.b.d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return new yt2((sm2) this.b.d(), (gn2) ((ba4) this.e).d(), (un2) this.c.d(), (xn2) ((ba4) this.f).d(), (vo2) this.d.d(), ((ll2) this.g).a(), ((ll2) this.h).b.G(), (gj2) ((ba4) this.i).d());
            case 2:
                return new zw2((ax2) this.b.d(), (fx2) ((ba4) this.c).d(), (pw2) ((ba4) this.d).d(), ((hh2) this.e).a(), ((ph2) this.f).a(), (vw2) ((ba4) this.g).d(), (ex2) ((ba4) this.h).d(), new m92(), new m92(), ((lh2) this.i).d());
            default:
                return new x73((String) ((da4) this.f).a, (v73) this.b.d(), (Context) ((da4) this.g).a, (s73) ((ba4) this.h).d(), (i83) ((ba4) this.i).d(), ((ph2) this.c).a(), (vs1) this.d.d(), (mv2) this.e.d());
        }
    }

    public es2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, hh2 hh2Var, ph2 ph2Var, ba4 ba4Var4, ba4 ba4Var5, lh2 lh2Var) {
        this.b = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.e = hh2Var;
        this.f = ph2Var;
        this.g = ba4Var4;
        this.h = ba4Var5;
        this.i = lh2Var;
    }

    public es2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, ba4 ba4Var5, ll2 ll2Var, ll2 ll2Var2, ba4 ba4Var6) {
        this.b = ba4Var;
        this.e = ba4Var2;
        this.c = ba4Var3;
        this.f = ba4Var4;
        this.d = ba4Var5;
        this.g = ll2Var;
        this.h = ll2Var2;
        this.i = ba4Var6;
    }

    public es2(da4 da4Var, ba4 ba4Var, da4 da4Var2, ba4 ba4Var2, ba4 ba4Var3, ph2 ph2Var, ba4 ba4Var4, ba4 ba4Var5) {
        this.f = da4Var;
        this.b = ba4Var;
        this.g = da4Var2;
        this.h = ba4Var2;
        this.i = ba4Var3;
        this.c = ph2Var;
        this.d = ba4Var4;
        this.e = ba4Var5;
    }
}
