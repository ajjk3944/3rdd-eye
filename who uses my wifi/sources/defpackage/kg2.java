package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kg2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ og2 g;

    public /* synthetic */ kg2(og2 og2Var, int i) {
        this.f = i;
        this.g = og2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.g.T();
                break;
        }
    }
}
