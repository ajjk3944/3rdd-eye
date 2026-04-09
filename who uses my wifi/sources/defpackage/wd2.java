package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wd2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ yd2 g;

    public /* synthetic */ wd2(yd2 yd2Var, int i) {
        this.f = i;
        this.g = yd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ee2 ee2Var = this.g.v;
                if (ee2Var != null) {
                    ee2Var.h();
                    break;
                }
                break;
            case 1:
                ee2 ee2Var2 = this.g.v;
                if (ee2Var2 != null) {
                    de2 de2Var = ee2Var2.j;
                    de2Var.h = false;
                    i63 i63Var = lf4.l;
                    i63Var.removeCallbacks(de2Var);
                    i63Var.postDelayed(de2Var, 250L);
                    i63Var.post(new be2(ee2Var2, 0));
                    break;
                }
                break;
            case 2:
                yd2 yd2Var = this.g;
                ee2 ee2Var3 = yd2Var.v;
                if (ee2Var3 != null) {
                    ee2Var3.g();
                    yd2Var.v.i();
                    break;
                }
                break;
            case 3:
                yd2 yd2Var2 = this.g;
                ee2 ee2Var4 = yd2Var2.v;
                if (ee2Var4 != null) {
                    if (!yd2Var2.w) {
                        ee2Var4.k();
                        yd2Var2.w = true;
                    }
                    yd2Var2.v.f();
                    break;
                }
                break;
            default:
                ee2 ee2Var5 = this.g.v;
                if (ee2Var5 != null) {
                    ee2Var5.g();
                    break;
                }
                break;
        }
    }
}
