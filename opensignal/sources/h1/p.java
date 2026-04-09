package h1;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9734d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f9735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f9734d = i10;
        this.f9735g = qVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f9734d) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f9735g.f9745n.i(vc.e.f(dDoubleValue, r10.f9738e, r10.f9739f)));
            default:
                return Double.valueOf(vc.e.f(this.f9735g.k.i(((Number) obj).doubleValue()), r10.f9738e, r10.f9739f));
        }
    }
}
