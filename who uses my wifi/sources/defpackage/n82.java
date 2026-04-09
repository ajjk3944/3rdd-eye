package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class n82 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n82(Object obj, boolean z, int i) {
        this.f = i;
        this.h = obj;
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hv1, rs2] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f;
        boolean z = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((o82) obj).L(z);
                break;
            case 1:
                pr2 pr2Var = (pr2) obj;
                ?? r0 = pr2Var.w;
                if (r0 != 0) {
                    pr2Var.n.j(null, r0.X0(), pr2Var.w.g(), pr2Var.w.k(), this.g, pr2Var.k(), 0);
                    break;
                } else {
                    gi2.U("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 2:
                gb4 gb4Var = (gb4) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    gb4.p(gb4Var.o, gb4Var.q, z, gb4Var.r).k();
                    break;
                } catch (NullPointerException e) {
                    gb4Var.m.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                    return;
                }
            case 3:
                ((jd4) obj).d(z, false);
                break;
            default:
                wt2 wt2Var = (wt2) obj;
                wt2Var.getClass();
                String str = v23.a;
                ya4 ya4Var = ((oa4) wt2Var.h).f;
                if (ya4Var.X != z) {
                    ya4Var.X = z;
                    mu2 mu2Var = ya4Var.t;
                    mu2Var.c(23, new y24(z));
                    mu2Var.d();
                    break;
                }
                break;
        }
    }
}
