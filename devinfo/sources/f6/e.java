package f6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f23666a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f23667b;

    public e(f fVar, Throwable th2) {
        super(th2);
        this.f23666a = fVar;
        this.f23667b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23667b;
    }
}
