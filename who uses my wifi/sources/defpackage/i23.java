package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class i23 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ j23 g;

    public /* synthetic */ i23(j23 j23Var, int i) {
        this.f = i;
        this.g = j23Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                this.g.c();
                break;
            case 1:
                this.g.c();
                break;
            default:
                j23 j23Var = this.g;
                j23Var.getClass();
                j23Var.f.execute(new i23(j23Var, 1));
                break;
        }
    }
}
