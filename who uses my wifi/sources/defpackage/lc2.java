package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lc2 implements ca4 {
    public final /* synthetic */ int a;
    public final hh2 b;

    public /* synthetic */ lc2(hh2 hh2Var, int i) {
        this.a = i;
        this.b = hh2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ib2(this.b.a());
            case 1:
                ApplicationInfo applicationInfo = this.b.a().getApplicationInfo();
                i41.M(applicationInfo);
                return applicationInfo;
            case 2:
                return new md3(this.b.a(), hg4.C.t.a());
            case 3:
                return t83.S(this.b.a());
            case 4:
                return new pw2(this.b.a());
            case 5:
                return new fx2(this.b.a());
            case 6:
                return new nn2(this.b.a());
            case 7:
                Context contextA = this.b.a();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new jz2(contextA, ld2Var);
            case 8:
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new o33(ld2Var2, this.b.a(), 2);
            case 9:
                Context contextA2 = this.b.a();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new o33(contextA2, ld2Var3, 6);
            default:
                return new e63(this.b.a());
        }
    }
}
