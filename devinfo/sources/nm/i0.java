package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 extends ek.j implements mk.c {
    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        return new i0(1, cVar);
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        i0 i0Var = (i0) create((ck.c) obj);
        yj.u uVar = yj.u.f37649a;
        i0Var.invokeSuspend(uVar);
        return uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        return yj.u.f37649a;
    }
}
