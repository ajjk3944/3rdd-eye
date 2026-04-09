package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Object obj, ck.c cVar) {
        super(1, cVar);
        this.f18b = eVar;
        this.f19c = obj;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        return new c(this.f18b, this.f19c, cVar);
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        c cVar = (c) create((ck.c) obj);
        yj.u uVar = yj.u.f37649a;
        cVar.invokeSuspend(uVar);
        return uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        e eVar = this.f18b;
        e.b(eVar);
        Object objA = e.a(eVar, this.f19c);
        eVar.f29c.f81b.setValue(objA);
        eVar.f31e.setValue(objA);
        return yj.u.f37649a;
    }
}
