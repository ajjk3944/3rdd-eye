package q1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f32122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i4) {
        super(1);
        this.f32121a = i4;
        this.f32122b = qVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f32121a) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f32122b.f32132n.a(ci.b.c(dDoubleValue, r10.f32125e, r10.f32126f)));
            default:
                return Double.valueOf(ci.b.c(this.f32122b.f32129k.a(((Number) obj).doubleValue()), r10.f32125e, r10.f32126f));
        }
    }
}
