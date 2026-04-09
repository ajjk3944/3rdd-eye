package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f32494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.e f32495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f32497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f32498f;
    public final /* synthetic */ e0.h g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a0.e eVar, float f10, boolean z3, d dVar, e0.h hVar, ck.c cVar) {
        super(2, cVar);
        this.f32495c = eVar;
        this.f32496d = f10;
        this.f32497e = z3;
        this.f32498f = dVar;
        this.g = hVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new c(this.f32495c, this.f32496d, this.f32497e, this.f32498f, this.g, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        int i4 = this.f32494b;
        yj.u uVar = yj.u.f37649a;
        if (i4 == 0) {
            ci.b.D(obj);
            a0.e eVar = this.f32495c;
            float f10 = ((d3.f) eVar.f31e.getValue()).f21957a;
            float f11 = this.f32496d;
            if (!d3.f.b(f10, f11)) {
                boolean z3 = this.f32497e;
                dk.a aVar = dk.a.f22275a;
                if (z3) {
                    float f12 = ((d3.f) eVar.f31e.getValue()).f21957a;
                    d dVar = this.f32498f;
                    a0.u0 u0Var = null;
                    Object kVar = d3.f.b(f12, dVar.f32501b) ? new e0.k(0L) : d3.f.b(f12, dVar.f32503d) ? new e0.f() : d3.f.b(f12, dVar.f32502c) ? new e0.d() : null;
                    this.f32494b = 2;
                    a0.u0 u0Var2 = s0.d.f33222b;
                    a0.u0 u0Var3 = s0.d.f33221a;
                    e0.h hVar = this.g;
                    if (hVar != null) {
                        if ((hVar instanceof e0.k) || (hVar instanceof e0.b) || (hVar instanceof e0.f) || (hVar instanceof e0.d)) {
                            u0Var = u0Var3;
                        }
                    } else if (kVar != null) {
                        if (!(kVar instanceof e0.k) && !(kVar instanceof e0.b)) {
                            if (kVar instanceof e0.f) {
                                u0Var = s0.d.f33223c;
                            } else if (kVar instanceof e0.d) {
                            }
                        }
                        u0Var = u0Var2;
                    }
                    if (u0Var == null ? (objE = eVar.e(new d3.f(f11), this)) != aVar : (objE = a0.e.c(eVar, new d3.f(f11), u0Var, null, this, 12)) != aVar) {
                        objE = uVar;
                    }
                    if (objE == aVar) {
                    }
                } else {
                    d3.f fVar = new d3.f(f11);
                    this.f32494b = 1;
                    if (eVar.e(fVar, this) == aVar) {
                    }
                }
                return aVar;
            }
            return uVar;
        }
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ci.b.D(obj);
        return uVar;
    }
}
