package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f35634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i4) {
        super(1);
        this.f35633a = i4;
        this.f35634b = d0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [mk.a, nk.l] */
    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f35633a) {
            case 0:
                d0 d0Var = this.f35634b;
                d0Var.f35645d = true;
                d0Var.f35647f.invoke();
                return yj.u.f37649a;
            default:
                r1.d dVar = (r1.d) obj;
                d0 d0Var2 = this.f35634b;
                c cVar = d0Var2.f35643b;
                float f10 = d0Var2.f35650k;
                float f11 = d0Var2.f35651l;
                i0.f fVarM = dVar.M();
                long jE = fVarM.E();
                fVarM.x().c();
                try {
                    ((nm.d0) fVarM.f25416b).u(f10, f11, 0L);
                    cVar.a(dVar);
                    fVarM.x().k();
                    fVarM.R(jE);
                    return yj.u.f37649a;
                } catch (Throwable th2) {
                    fVarM.x().k();
                    fVarM.R(jE);
                    throw th2;
                }
        }
    }
}
