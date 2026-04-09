package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class oe2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ se2 g;
    public final /* synthetic */ String h;

    public /* synthetic */ oe2(se2 se2Var, String str, int i) {
        this.f = i;
        this.g = se2Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ee2 ee2Var = this.g.l;
                if (ee2Var != null) {
                    ee2Var.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.h);
                    break;
                }
                break;
            default:
                ee2 ee2Var2 = this.g.l;
                if (ee2Var2 != null) {
                    ee2Var2.c("error", "what", "ExoPlayerAdapter error", "extra", this.h);
                    break;
                }
                break;
        }
    }
}
