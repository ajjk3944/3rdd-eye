package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rt2 implements ca4 {
    public final /* synthetic */ int a;
    public final ll2 b;
    public final u43 c;
    public final u12 d;

    public /* synthetic */ rt2(ll2 ll2Var, u43 u43Var, u12 u12Var, int i) {
        this.a = i;
        this.b = ll2Var;
        this.c = u43Var;
        this.d = u12Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new qt2((String) this.b.b.i, (pr2) this.c.d(), this.d.a());
            default:
                return new st2((String) this.b.b.i, (pr2) this.c.d(), this.d.a());
        }
    }
}
