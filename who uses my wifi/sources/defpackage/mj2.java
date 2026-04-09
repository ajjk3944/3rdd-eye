package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mj2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ nj2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ mj2(nj2 nj2Var, int i, int i2, int i3) {
        this.f = i3;
        this.g = nj2Var;
        this.h = i;
        this.i = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                nj2 nj2Var = this.g;
                nj2Var.g.execute(new mj2(nj2Var, this.h, this.i, 1));
                break;
            default:
                this.g.h(this.h - 1, this.i);
                break;
        }
    }
}
