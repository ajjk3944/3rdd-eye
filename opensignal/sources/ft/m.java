package ft;

import mq.f0;

/* loaded from: classes.dex */
public final class m extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9088d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f9089g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f9090r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, q qVar, int i10) {
        super(0);
        this.f9088d = i10;
        this.f9089g = oVar;
        this.f9090r = qVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f9088d) {
            case 0:
                return f0.N(this.f9089g.f9093a.keySet(), this.f9090r.o());
            default:
                return f0.N(this.f9089g.f9094b.keySet(), this.f9090r.p());
        }
    }
}
