package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2374b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f2375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.i f2376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.k f2377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e0.i iVar, e0.k kVar, ck.c cVar) {
        super(2, cVar);
        this.f2376d = iVar;
        this.f2377e = kVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2374b) {
            case 0:
                return new c(this.f2377e, this.f2376d, cVar);
            default:
                return new c(this.f2376d, this.f2377e, cVar);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2374b) {
        }
        return ((c) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f2374b) {
            case 0:
                int i4 = this.f2375c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    e0.l lVar = new e0.l(this.f2377e);
                    this.f2375c = 1;
                    Object objA = this.f2376d.a(lVar, this);
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
                return yj.u.f37649a;
            default:
                int i10 = this.f2375c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    this.f2375c = 1;
                    Object objA2 = this.f2376d.a(this.f2377e, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e0.k kVar, e0.i iVar, ck.c cVar) {
        super(2, cVar);
        this.f2377e = kVar;
        this.f2376d = iVar;
    }
}
