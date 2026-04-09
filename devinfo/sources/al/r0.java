package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f603b;

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        r0 r0Var = new r0(2, cVar);
        r0Var.f603b = ((Number) obj).intValue();
        return r0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create(Integer.valueOf(((Number) obj).intValue()), (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        return Boolean.valueOf(this.f603b > 0);
    }
}
