package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class al2 implements ca4 {
    public final /* synthetic */ int a;
    public final l92 b;

    public /* synthetic */ al2(l92 l92Var, int i) {
        this.a = i;
        this.b = l92Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                wo2 wo2Var = (wo2) this.b.g;
                return wo2Var != null ? new up2(wo2Var, md2.g) : new up2(new zk2(), md2.g);
            default:
                return (wo2) this.b.g;
        }
    }
}
