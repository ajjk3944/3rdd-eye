package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class e43 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ f43 g;

    public /* synthetic */ e43(f43 f43Var, int i) {
        this.f = i;
        this.g = f43Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                f43 f43Var = this.g;
                f43Var.a.set(new d43(f43Var.e.a(), f43Var.f, f43Var.c));
                break;
            default:
                f43 f43Var2 = this.g;
                f43Var2.d.execute(new e43(f43Var2, 0));
                break;
        }
    }
}
