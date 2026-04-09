package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wf3 implements ga4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ga4
    public final /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new f20(28, (ep2) ((ep2) this.b).a);
            case 1:
                return new sq0(20, (ep2) ((ep2) this.b).a);
            case 2:
                return new yf3((ep2) ((ep2) this.b).a);
            default:
                p21 p21Var = (p21) this.b;
                ep2 ep2Var = (ep2) p21Var.f;
                p21 p21Var2 = (p21) p21Var.g;
                h2 h2Var = new h2();
                h2Var.a = ep2Var;
                h2Var.b = p21Var2;
                return h2Var;
        }
    }
}
