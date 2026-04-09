package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class lj2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ nj2 g;

    public /* synthetic */ lj2(nj2 nj2Var, int i) {
        this.f = i;
        this.g = nj2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                nj2 nj2Var = this.g;
                nj2Var.g.execute(new lj2(nj2Var, 1));
                break;
            default:
                this.g.l();
                break;
        }
    }
}
