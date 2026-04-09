package h1;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9728a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f9729d;

    public /* synthetic */ m(q qVar, int i10) {
        this.f9728a = i10;
        this.f9729d = qVar;
    }

    @Override // h1.i
    public final double i(double d6) {
        switch (this.f9728a) {
            case 0:
                return vc.e.f(this.f9729d.k.i(d6), r10.f9738e, r10.f9739f);
            default:
                return this.f9729d.f9745n.i(vc.e.f(d6, r0.f9738e, r0.f9739f));
        }
    }
}
