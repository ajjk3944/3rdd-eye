package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37174a;

    public c0(Throwable th2, r rVar, ck.h hVar) {
        super("Coroutine dispatcher " + rVar + " threw an exception, context = " + hVar, th2);
        this.f37174a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f37174a;
    }
}
