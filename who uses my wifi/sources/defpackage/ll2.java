package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ll2 implements ca4 {
    public final /* synthetic */ int a;
    public final xb4 b;

    public /* synthetic */ ll2(xb4 xb4Var, int i) {
        this.a = i;
        this.b = xb4Var;
    }

    public a83 a() {
        a83 a83Var = (a83) this.b.h;
        i41.M(a83Var);
        return a83Var;
    }

    public h83 b() {
        h83 h83Var = (h83) this.b.g;
        i41.M(h83Var);
        return h83Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                a83 a83Var = (a83) this.b.h;
                i41.M(a83Var);
                return a83Var;
            case 1:
                return (String) this.b.i;
            case 2:
                return this.b.G();
            default:
                h83 h83Var = (h83) this.b.g;
                i41.M(h83Var);
                return h83Var;
        }
    }
}
