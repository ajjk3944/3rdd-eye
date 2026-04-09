package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f24b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ck.c cVar) {
        super(1, cVar);
        this.f24b = eVar;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        return new d(this.f24b, cVar);
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        d dVar = (d) create((ck.c) obj);
        yj.u uVar = yj.u.f37649a;
        dVar.invokeSuspend(uVar);
        return uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        e.b(this.f24b);
        return yj.u.f37649a;
    }
}
