package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32665b;

    /* renamed from: c, reason: collision with root package name */
    public int f32666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32667d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ float f32668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(o2.c cVar, ck.c cVar2) {
        super(2, cVar2);
        this.f32665b = 2;
        this.f32667d = cVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f32665b) {
            case 0:
                return new u0((v0) this.f32667d, this.f32668e, cVar, 0);
            case 1:
                return new u0((v0) this.f32667d, this.f32668e, cVar, 1);
            default:
                u0 u0Var = new u0((o2.c) this.f32667d, cVar);
                u0Var.f32668e = ((Number) obj).floatValue();
                return u0Var;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32665b) {
            case 0:
                return ((u0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((u0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((u0) create(Float.valueOf(((Number) obj).floatValue()), (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32665b) {
            case 0:
                v0 v0Var = (v0) this.f32667d;
                int i4 = this.f32666c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    a0.e eVar = v0Var.f32680t;
                    if (eVar != null) {
                        Float f10 = new Float(this.f32668e);
                        a0.l lVar = v0Var.f32678r ? q0.f32638f : v0Var.f32677q;
                        this.f32666c = 1;
                        obj = a0.e.c(eVar, f10, lVar, null, this, 12);
                        dk.a aVar = dk.a.f22275a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return yj.u.f37649a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ci.b.D(obj);
                return yj.u.f37649a;
            case 1:
                v0 v0Var2 = (v0) this.f32667d;
                int i10 = this.f32666c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    a0.e eVar2 = v0Var2.f32679s;
                    if (eVar2 == null) {
                        return yj.u.f37649a;
                    }
                    Float f11 = new Float(this.f32668e);
                    a0.l lVar2 = v0Var2.f32678r ? q0.f32638f : v0Var2.f32677q;
                    this.f32666c = 1;
                    obj = a0.e.c(eVar2, f11, lVar2, null, this, 12);
                    dk.a aVar2 = dk.a.f22275a;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                o2.c cVar = (o2.c) this.f32667d;
                int i11 = this.f32666c;
                if (i11 == 0) {
                    ci.b.D(obj);
                    float f12 = this.f32668e;
                    Object objG = cVar.f30388a.f31104d.f31095a.g(p2.k.f31075e);
                    if (objG == null) {
                        objG = null;
                    }
                    mk.e eVar3 = (mk.e) objG;
                    if (eVar3 == null) {
                        throw d.h.o("Required value was null.");
                    }
                    o1.b bVar = new o1.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
                    this.f32666c = 1;
                    obj = eVar3.invoke(bVar, this);
                    dk.a aVar3 = dk.a.f22275a;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((o1.b) obj).f30364a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, float f10, ck.c cVar, int i4) {
        super(2, cVar);
        this.f32665b = i4;
        this.f32667d = v0Var;
        this.f32668e = f10;
    }
}
