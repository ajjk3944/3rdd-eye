package defpackage;

import java.io.File;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u43 implements ca4 {
    public final /* synthetic */ int a;
    public ga4 b;

    public /* synthetic */ u43() {
        this.a = 18;
    }

    public static void a(u43 u43Var, ga4 ga4Var) {
        if (u43Var.b != null) {
            throw new IllegalStateException();
        }
        u43Var.b = ga4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new g33(ld2Var, (zw2) this.b.d(), 5);
            case 1:
                return new b33(4, (z73) this.b.d());
            case 2:
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new g43(((hh2) this.b).a(), ld2Var2);
            case 3:
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new g33(ld2Var3, (xv2) this.b.d(), 6);
            case 4:
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new o33(ld2Var4, ((hh2) this.b).a(), 5);
            case 5:
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                ((hh2) this.b).a();
                return new g43(ld2Var5, 4);
            case 6:
                return new s63((x83) this.b.d());
            case 7:
                return new s73((x83) this.b.d());
            case 8:
                return new da3((ea3) this.b.d());
            case 9:
                return new da3((ea3) this.b.d());
            case 10:
                return new File(new File((File) this.b.d(), "dgd"), "pmtd");
            case 11:
                return new File(new File((File) this.b.d(), "dgd"), "pcopt");
            case 12:
                return new File(new File((File) this.b.d(), "dgd"), "pcbc");
            case 13:
                return new File(new File((File) this.b.d(), "dgd"), "pcam.jar.tmp");
            case 14:
                return new File(new File((File) this.b.d(), "dgd"), "pcam.jar");
            case 15:
                return new File(new File((File) this.b.d(), "ocs"), "pmtd");
            case 16:
                return new File(new File((File) this.b.d(), "ocs"), "pcbc");
            case 17:
                return new File(new File((File) this.b.d(), "ocs"), "pcam.jar");
            default:
                ga4 ga4Var = this.b;
                if (ga4Var != null) {
                    return ga4Var.d();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ u43(ga4 ga4Var, int i) {
        this.a = i;
        this.b = ga4Var;
    }
}
