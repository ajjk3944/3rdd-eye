package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p1 extends cl.r implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f37222e;

    public p1(long j, ek.c cVar) {
        super(cVar, cVar.getContext());
        this.f37222e = j;
    }

    @Override // xk.f1
    public final String V() {
        return super.V() + "(timeMillis=" + this.f37222e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.m(this.f37167c);
        r(new o1("Timed out waiting for " + this.f37222e + " ms", this));
    }
}
