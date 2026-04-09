package km;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28469d;

    /* renamed from: e, reason: collision with root package name */
    public final f f28470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u0 u0Var, rl.d dVar, m mVar, f fVar, int i4) {
        super(u0Var, dVar, mVar);
        this.f28469d = i4;
        this.f28470e = fVar;
    }

    @Override // km.v
    public final Object a(d0 d0Var, Object[] objArr) {
        switch (this.f28469d) {
            case 0:
                return this.f28470e.y(d0Var);
            default:
                d dVar = (d) this.f28470e.y(d0Var);
                ck.c cVar = (ck.c) objArr[objArr.length - 1];
                try {
                    xk.h hVar = new xk.h(1, a.a.r(cVar));
                    hVar.s();
                    hVar.u(new x(dVar, 2));
                    dVar.c(new i(1, hVar));
                    return hVar.r();
                } catch (Exception e2) {
                    c1.p(e2, cVar);
                    return dk.a.f22275a;
                }
        }
    }
}
