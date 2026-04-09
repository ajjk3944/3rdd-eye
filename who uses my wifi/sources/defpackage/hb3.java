package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hb3 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final nh2 c;
    public final hh2 d;
    public final ba4 e;

    public /* synthetic */ hb3(ba4 ba4Var, nh2 nh2Var, hh2 hh2Var, ba4 ba4Var2, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = nh2Var;
        this.d = hh2Var;
        this.e = ba4Var2;
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new gb3((ub3) this.b.d(), this.c.a(), this.d.a(), (ym) this.e.d());
            default:
                return new nb3((ub3) this.b.d(), this.c.a(), this.d.a(), (ym) this.e.d());
        }
    }
}
