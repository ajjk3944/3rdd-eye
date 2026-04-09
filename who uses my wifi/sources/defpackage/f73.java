package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f73 implements zk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc2 b;

    public /* synthetic */ f73(mc2 mc2Var, int i) {
        this.a = i;
        this.b = mc2Var;
    }

    @Override // defpackage.zk3
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.a) {
            case 0:
                gi2.c0("", (my2) obj);
                gi2.G("Failed to get a cache key, reverting to legacy flow.");
                mc2 mc2Var = this.b;
                g73 g73Var = new g73(null, mc2Var.x());
                mc2Var.j = g73Var;
                return g73Var;
            default:
                fa2 fa2Var = (fa2) obj;
                g73 g73Var2 = new g73(fa2Var, new h93(fa2Var.o));
                this.b.j = g73Var2;
                return g73Var2;
        }
    }
}
