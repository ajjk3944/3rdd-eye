package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class o52 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ q52 g;
    public final /* synthetic */ String h;

    public /* synthetic */ o52(q52 q52Var, String str, int i) {
        this.f = i;
        this.g = q52Var;
        this.h = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                this.g.f.loadData(this.h, "text/html", "UTF-8");
                break;
            case 1:
                this.g.f.loadData(this.h, "text/html", "UTF-8");
                break;
            case 2:
                this.g.f.loadUrl(this.h);
                break;
            default:
                this.g.f.l(this.h);
                break;
        }
    }
}
