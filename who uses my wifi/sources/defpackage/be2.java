package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class be2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ee2 g;

    public /* synthetic */ be2(ee2 ee2Var, int i) {
        this.f = i;
        this.g = ee2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.g.c("surfaceDestroyed", new String[0]);
                break;
            default:
                this.g.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
