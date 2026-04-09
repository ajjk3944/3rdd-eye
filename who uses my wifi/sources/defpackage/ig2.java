package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ig2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ag2 g;

    public /* synthetic */ ig2(ag2 ag2Var, int i) {
        this.f = i;
        this.g = ag2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.destroy();
                break;
            case 1:
                this.g.destroy();
                break;
            case 2:
                this.g.onPause();
                break;
            case 3:
                this.g.onResume();
                break;
            case 4:
                this.g.destroy();
                break;
            case 5:
                this.g.a("onSdkImpression", new s8(0));
                break;
            case 6:
                this.g.destroy();
                break;
            default:
                this.g.H0();
                break;
        }
    }
}
