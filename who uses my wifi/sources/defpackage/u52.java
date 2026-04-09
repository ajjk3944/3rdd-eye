package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class u52 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ q52 g;

    public /* synthetic */ u52(q52 q52Var, int i) {
        this.f = i;
        this.g = q52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.f.destroy();
                break;
            case 1:
                this.g.f.destroy();
                break;
            default:
                v32 v32Var = x32.j;
                q52 q52Var = this.g;
                q52Var.h("/result", v32Var);
                q52Var.f.destroy();
                break;
        }
    }
}
