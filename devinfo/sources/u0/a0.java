package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34725b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(mk.a aVar) {
        super(aVar);
        e eVar = e.g;
        this.f34726c = eVar;
    }

    @Override // u0.k1
    public final p.r a(Object obj) {
        switch (this.f34725b) {
            case 0:
                return new p.r(this, obj, obj == null, null, true);
            default:
                return new p.r(this, obj, obj == null, (j2) this.f34726c, true);
        }
    }

    @Override // u0.k1
    public q2 b() {
        switch (this.f34725b) {
            case 0:
                return (b0) this.f34726c;
            default:
                return super.b();
        }
    }

    public a0(mk.c cVar) {
        super(new r0.i0(6));
        this.f34726c = new b0(cVar);
    }
}
