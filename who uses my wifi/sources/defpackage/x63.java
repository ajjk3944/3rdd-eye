package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class x63 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ y63 g;

    public /* synthetic */ x63(y63 y63Var, int i) {
        this.f = i;
        this.g = y63Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                y63 y63Var = this.g;
                y63Var.f.b().execute(new x63(y63Var, 1));
                break;
            default:
                this.g.B3(5);
                break;
        }
    }
}
