package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class le1 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ le1(gw3 gw3Var, Object obj, long j) {
        this.h = gw3Var;
        this.i = obj;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        long j = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                String str = v23.a;
                ya4 ya4Var = ((oa4) ((gw3) obj).h).f;
                md4 md4Var = ya4Var.y;
                ad4 ad4VarY = md4Var.y();
                md4Var.s(ad4VarY, 26, new bi3(ad4VarY, obj2, j));
                if (ya4Var.R == obj2) {
                    mu2 mu2Var = ya4Var.t;
                    mu2Var.c(26, t24.o);
                    mu2Var.d();
                    break;
                }
                break;
            case 1:
                jo1 jo1Var = (jo1) obj2;
                jo1Var.f.a((String) obj, j);
                jo1Var.f.b(jo1Var.toString());
                break;
            default:
                jb3 jb3Var = (jb3) obj2;
                sq0 sq0Var = jb3Var.p;
                if (sq0Var != null) {
                    tx2 tx2Var = (tx2) obj;
                    qb3 qb3Var = jb3Var.r;
                    sq0Var.z("paa", "pano_ts", this.g, jb3Var.e.i, jb3Var.m(), !(tx2Var instanceof rm2) ? null : ((rm2) tx2Var).i, qb3Var, jb3Var.e());
                    break;
                }
                break;
        }
    }

    public le1(jo1 jo1Var, String str, long j) {
        this.h = str;
        this.g = j;
        this.i = jo1Var;
    }

    public le1(jb3 jb3Var, long j, tx2 tx2Var) {
        this.g = j;
        this.h = tx2Var;
        this.i = jb3Var;
    }
}
