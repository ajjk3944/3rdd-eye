package cl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class r extends xk.a implements ek.d {

    /* renamed from: d, reason: collision with root package name */
    public final ck.c f2937d;

    public r(ck.c cVar, ck.h hVar) {
        super(hVar, true);
        this.f2937d = cVar;
    }

    @Override // xk.f1
    public final boolean S() {
        return true;
    }

    @Override // ek.d
    public final ek.d getCallerFrame() {
        ck.c cVar = this.f2937d;
        if (cVar instanceof ek.d) {
            return (ek.d) cVar;
        }
        return null;
    }

    @Override // xk.f1
    public void o(Object obj) {
        b.h(a.a.r(this.f2937d), xk.x.x(obj));
    }

    @Override // xk.f1
    public void q(Object obj) {
        this.f2937d.resumeWith(xk.x.x(obj));
    }

    public void j0() {
    }
}
