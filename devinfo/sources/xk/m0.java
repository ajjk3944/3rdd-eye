package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f37207c;

    public m0(Runnable runnable, long j) {
        super(j);
        this.f37207c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37207c.run();
    }

    @Override // xk.n0
    public final String toString() {
        return super.toString() + this.f37207c;
    }
}
