package m1;

/* loaded from: classes.dex */
public final class b0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16136d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f16137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i10) {
        super(1);
        this.f16136d = i10;
        this.f16137g = c0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ar.a, br.n] */
    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f16136d) {
            case 0:
                c0 c0Var = this.f16137g;
                c0Var.f16149d = true;
                c0Var.f16151f.c();
                return lq.b0.f15562a;
            default:
                i1.d dVar = (i1.d) obj;
                c0 c0Var2 = this.f16137g;
                b bVar = c0Var2.f16147b;
                float f10 = c0Var2.k;
                float f11 = c0Var2.f16155l;
                bm.d dVarA = dVar.A();
                long jH = dVarA.H();
                dVarA.y().g();
                try {
                    ((h7.h0) dVarA.f2826d).V(f10, f11, 0L);
                    bVar.a(dVar);
                    dVarA.y().n();
                    dVarA.R(jH);
                    return lq.b0.f15562a;
                } catch (Throwable th2) {
                    dVarA.y().n();
                    dVarA.R(jH);
                    throw th2;
                }
        }
    }
}
