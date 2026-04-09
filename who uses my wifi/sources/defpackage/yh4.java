package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class yh4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bi4 g;

    public /* synthetic */ yh4(bi4 bi4Var, int i) {
        this.f = i;
        this.g = bi4Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                bi4 bi4Var = this.g;
                if (!bi4Var.R) {
                    ih4 ih4Var = bi4Var.u;
                    ih4Var.getClass();
                    ih4Var.c(bi4Var);
                    break;
                }
                break;
            case 1:
                this.g.L = true;
                break;
            default:
                this.g.u();
                break;
        }
    }
}
