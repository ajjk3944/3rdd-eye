package km;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends v {

    /* renamed from: d, reason: collision with root package name */
    public final f f28495d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28496e;

    public u(u0 u0Var, rl.d dVar, m mVar, f fVar, boolean z3) {
        super(u0Var, dVar, mVar);
        this.f28495d = fVar;
        this.f28496e = z3;
    }

    @Override // km.v
    public final Object a(d0 d0Var, Object[] objArr) {
        d dVar = (d) this.f28495d.y(d0Var);
        ck.c cVar = (ck.c) objArr[objArr.length - 1];
        try {
            if (!this.f28496e) {
                return c1.b(dVar, cVar);
            }
            nk.k.c(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return c1.c(dVar, cVar);
        } catch (LinkageError e2) {
            throw e2;
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (VirtualMachineError e11) {
            throw e11;
        } catch (Throwable th2) {
            c1.p(th2, cVar);
            return dk.a.f22275a;
        }
    }
}
