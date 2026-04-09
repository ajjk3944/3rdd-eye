package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nh2 implements ca4 {
    public final /* synthetic */ int a;
    public final hh2 b;
    public final ba4 c;

    public nh2(hh2 hh2Var, ba4 ba4Var) {
        this.a = 3;
        this.c = ba4Var;
        this.b = hh2Var;
    }

    public sq0 a() {
        mv2 mv2Var = (mv2) this.c.d();
        this.b.a();
        return new sq0(19, mv2Var);
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                try {
                    return za1.a(this.b.a()).b(((ApplicationInfo) this.c.d()).packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new ug4(this.b.a(), (String) this.c.d());
            case 2:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new k33(ld2Var, this.b.a(), (gx2) this.c.d(), 4);
            case 3:
                return a();
            default:
                Context contextA = this.b.a();
                pv2 pv2Var = (pv2) this.c.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new jd4(contextA, pv2Var, ld2Var2);
        }
    }

    public /* synthetic */ nh2(hh2 hh2Var, ba4 ba4Var, int i) {
        this.a = i;
        this.b = hh2Var;
        this.c = ba4Var;
    }
}
