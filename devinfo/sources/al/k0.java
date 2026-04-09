package al;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f550b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f551c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ i f552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f553e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(ck.c cVar, mk.g gVar) {
        super(3, cVar);
        this.f553e = (ek.j) gVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ek.j, mk.g] */
    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        switch (this.f550b) {
            case 0:
                k0 k0Var = new k0((mk.e) this.f553e, (ck.c) obj3);
                k0Var.f552d = iVar;
                k0Var.f554f = obj2;
                return k0Var.invokeSuspend(yj.u.f37649a);
            case 1:
                k0 k0Var2 = new k0((ck.c) obj3, (mk.g) this.f553e);
                k0Var2.f552d = iVar;
                k0Var2.f554f = (Object[]) obj2;
                return k0Var2.invokeSuspend(yj.u.f37649a);
            default:
                k0 k0Var3 = new k0((pf.c1) this.f553e, (ck.c) obj3);
                k0Var3.f552d = iVar;
                k0Var3.f554f = (Throwable) obj2;
                return k0Var3.invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [ek.j, mk.g] */
    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        i iVar2;
        switch (this.f550b) {
            case 0:
                int i4 = this.f551c;
                dk.a aVar = dk.a.f22275a;
                if (i4 == 0) {
                    ci.b.D(obj);
                    iVar = this.f552d;
                    Object obj2 = this.f554f;
                    ?? r42 = (ek.j) this.f553e;
                    this.f552d = iVar;
                    this.f551c = 1;
                    obj = r42.invoke(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                        return yj.u.f37649a;
                    }
                    iVar = this.f552d;
                    ci.b.D(obj);
                }
                this.f552d = null;
                this.f551c = 2;
                if (iVar.c(obj, this) == aVar) {
                    return aVar;
                }
                return yj.u.f37649a;
            case 1:
                int i10 = this.f551c;
                dk.a aVar2 = dk.a.f22275a;
                if (i10 == 0) {
                    ci.b.D(obj);
                    iVar2 = this.f552d;
                    Object[] objArr = (Object[]) this.f554f;
                    ?? r43 = (ek.j) this.f553e;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.f552d = iVar2;
                    this.f551c = 1;
                    obj = r43.b(obj3, obj4, obj5, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ci.b.D(obj);
                        return yj.u.f37649a;
                    }
                    iVar2 = this.f552d;
                    ci.b.D(obj);
                }
                this.f552d = null;
                this.f551c = 2;
                if (iVar2.c(obj, this) == aVar2) {
                    return aVar2;
                }
                return yj.u.f37649a;
            default:
                int i11 = this.f551c;
                if (i11 == 0) {
                    ci.b.D(obj);
                    i iVar3 = this.f552d;
                    Throwable th2 = (Throwable) this.f554f;
                    pf.n0 n0VarA = ((pf.c1) this.f553e).f31782b.a(null);
                    pf.j0 j0Var = new pf.j0(n0VarA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + n0VarA.f31871a);
                    this.f552d = null;
                    this.f551c = 1;
                    Object objC = iVar3.c(j0Var, this);
                    dk.a aVar3 = dk.a.f22275a;
                    if (objC == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(mk.e eVar, ck.c cVar) {
        super(3, cVar);
        this.f553e = (ek.j) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(pf.c1 c1Var, ck.c cVar) {
        super(3, cVar);
        this.f553e = c1Var;
    }
}
