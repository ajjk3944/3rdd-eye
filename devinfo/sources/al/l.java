package al;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f556b;

    /* renamed from: c, reason: collision with root package name */
    public int f557c;

    /* renamed from: d, reason: collision with root package name */
    public Object f558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Serializable serializable, ck.c cVar, int i4) {
        super(1, cVar);
        this.f556b = i4;
        this.f558d = obj;
        this.f559e = serializable;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        switch (this.f556b) {
            case 0:
                return new l((i) this.f558d, (nk.u) this.f559e, cVar, 0);
            case 1:
                return new l((String) this.f558d, (String) this.f559e, cVar, 1);
            default:
                return new l((p4.z) this.f559e, cVar);
        }
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        ck.c cVar = (ck.c) obj;
        switch (this.f556b) {
        }
        return ((l) create(cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        p4.b1 u0Var;
        switch (this.f556b) {
            case 0:
                nk.u uVar = (nk.u) this.f559e;
                int i4 = this.f557c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    i iVar = (i) this.f558d;
                    cl.u uVar2 = bl.c.f2285b;
                    Object obj2 = uVar.f29986a;
                    if (obj2 == uVar2) {
                        obj2 = null;
                    }
                    this.f557c = 1;
                    Object objC = iVar.c(obj2, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                uVar.f29986a = null;
                return yj.u.f37649a;
            case 1:
                int i10 = this.f557c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                ch.f fVar = ch.e.f2868a;
                String str = (String) this.f558d;
                String str2 = (String) this.f559e;
                this.f557c = 1;
                Object objG = fVar.g(str, str2, this);
                dk.a aVar2 = dk.a.f22275a;
                return objG == aVar2 ? aVar2 : objG;
            default:
                p4.z zVar = (p4.z) this.f559e;
                int i11 = this.f557c;
                dk.a aVar3 = dk.a.f22275a;
                try {
                } catch (Throwable th3) {
                    p4.k0 k0VarG = zVar.g();
                    this.f558d = th3;
                    this.f557c = 2;
                    Object objB = k0VarG.b(this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                    th2 = th3;
                    obj = objB;
                }
                if (i11 == 0) {
                    ci.b.D(obj);
                    this.f557c = 1;
                    obj = p4.z.f(zVar, true, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f558d;
                        ci.b.D(obj);
                        u0Var = new p4.u0(((Number) obj).intValue(), th2);
                        return new yj.i(u0Var, Boolean.TRUE);
                    }
                    ci.b.D(obj);
                }
                u0Var = (p4.b1) obj;
                return new yj.i(u0Var, Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p4.z zVar, ck.c cVar) {
        super(1, cVar);
        this.f556b = 2;
        this.f559e = zVar;
    }
}
