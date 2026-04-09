package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class qz2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ xb3 g;

    public /* synthetic */ qz2(xb3 xb3Var, int i) {
        this.f = i;
        this.g = xb3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.a();
                break;
            default:
                if (((Boolean) tw1.e.c.a(mz1.G5)).booleanValue() && m54.f.g) {
                    this.g.c();
                    break;
                }
                break;
        }
    }
}
