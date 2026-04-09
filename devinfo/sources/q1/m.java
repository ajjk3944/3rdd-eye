package q1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f32116b;

    public /* synthetic */ m(q qVar, int i4) {
        this.f32115a = i4;
        this.f32116b = qVar;
    }

    @Override // q1.i
    public final double a(double d10) {
        switch (this.f32115a) {
            case 0:
                return ci.b.c(this.f32116b.f32129k.a(d10), r10.f32125e, r10.f32126f);
            default:
                return this.f32116b.f32132n.a(ci.b.c(d10, r0.f32125e, r0.f32126f));
        }
    }
}
