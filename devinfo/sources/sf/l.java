package sf;

import al.z0;
import xk.v;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33590b;

    /* renamed from: c, reason: collision with root package name */
    public int f33591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f33592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f33590b = i4;
        this.f33592d = nVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f33590b) {
            case 0:
                return new l(this.f33592d, cVar, 0);
            default:
                return new l(this.f33592d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f33590b) {
        }
        return ((l) create(vVar, cVar)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f33590b) {
            case 0:
                int i4 = this.f33591c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    n nVar = this.f33592d;
                    al.h data = nVar.f33597b.getData();
                    k kVar = new k(nVar.f33598c);
                    this.f33591c = 1;
                    Object objA = data.a(kVar, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return u.f37649a;
            default:
                int i10 = this.f33591c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                al.h data2 = this.f33592d.f33597b.getData();
                this.f33591c = 1;
                Object objK = z0.k(data2, this);
                dk.a aVar2 = dk.a.f22275a;
                return objK == aVar2 ? aVar2 : objK;
        }
    }
}
