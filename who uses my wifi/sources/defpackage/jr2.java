package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jr2 implements ca4 {
    public final /* synthetic */ int a;
    public final u12 b;

    public /* synthetic */ jr2(u12 u12Var, int i) {
        this.a = i;
        this.b = u12Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ir2(this.b.a());
            default:
                return new gu2(this.b.a());
        }
    }
}
