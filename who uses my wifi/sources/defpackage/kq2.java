package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kq2 implements ca4 {
    public final /* synthetic */ int a;
    public final l92 b;

    public /* synthetic */ kq2(l92 l92Var, int i) {
        this.a = i;
        this.b = l92Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                ag2 ag2Var = (ag2) this.b.g;
                if (ag2Var == null) {
                    return null;
                }
                return ag2Var.t();
            case 1:
                ag2 ag2Var2 = (ag2) this.b.g;
                if (ag2Var2 != null) {
                    return ag2Var2.t();
                }
                return null;
            default:
                return (ag2) this.b.g;
        }
    }
}
