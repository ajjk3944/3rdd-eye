package ed;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: t, reason: collision with root package name */
    public final g f23339t;

    /* renamed from: u, reason: collision with root package name */
    public final float f23340u;

    public k(g gVar, float f10) {
        super(0);
        this.f23339t = gVar;
        this.f23340u = f10;
    }

    @Override // ed.f
    public final boolean l() {
        return true;
    }

    @Override // ed.f
    public final void m(float f10, float f11, float f12, x xVar) {
        this.f23339t.m(f10, f11 - this.f23340u, f12, xVar);
    }
}
