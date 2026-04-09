package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c1 extends h {

    /* renamed from: i, reason: collision with root package name */
    public final n f37175i;

    public c1(ck.c cVar, n nVar) {
        super(1, cVar);
        this.f37175i = nVar;
    }

    @Override // xk.h
    public final Throwable q(f1 f1Var) {
        Throwable thB;
        n nVar = this.f37175i;
        nVar.getClass();
        Object obj = f1.f37187a.get(nVar);
        return (!(obj instanceof e1) || (thB = ((e1) obj).b()) == null) ? obj instanceof p ? ((p) obj).f37219a : f1Var.p() : thB;
    }

    @Override // xk.h
    public final String z() {
        return "AwaitContinuation";
    }
}
