package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final h f37205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f37206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, long j, h hVar) {
        super(j);
        this.f37206d = p0Var;
        this.f37205c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37205c.C(this.f37206d);
    }

    @Override // xk.n0
    public final String toString() {
        return super.toString() + this.f37205c;
    }
}
