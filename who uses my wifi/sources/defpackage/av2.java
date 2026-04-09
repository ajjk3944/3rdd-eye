package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class av2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bv2 g;

    public /* synthetic */ av2(bv2 bv2Var, int i) {
        this.f = i;
        this.g = bv2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                bv2 bv2Var = this.g;
                bv2Var.c.execute(new av2(bv2Var, 1));
                break;
            case 1:
                this.g.a();
                break;
            default:
                this.g.a();
                break;
        }
    }
}
