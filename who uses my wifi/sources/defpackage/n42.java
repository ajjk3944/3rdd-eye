package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class n42 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ a02 g;
    public final /* synthetic */ String h;

    public /* synthetic */ n42(a02 a02Var, String str, int i) {
        this.f = i;
        this.g = a02Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                ((i01) this.g.c).b.evaluateJavascript(this.h, null);
                break;
            default:
                ((i01) this.g.c).b.evaluateJavascript(this.h, null);
                break;
        }
    }
}
