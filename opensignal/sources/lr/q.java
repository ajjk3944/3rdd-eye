package lr;

/* loaded from: classes.dex */
public final class q extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.d f15669d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rr.d dVar, int i10) {
        super(0);
        this.f15669d = dVar;
        this.f15670g = i10;
    }

    @Override // ar.a
    public final Object c() {
        Object obj = this.f15669d.Y().get(this.f15670g);
        br.l.d(obj, "descriptor.valueParameters[i]");
        return (rr.k0) obj;
    }
}
