package i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements rj.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25289a;

    /* renamed from: b, reason: collision with root package name */
    public long f25290b;

    @Override // rj.d
    public boolean a(rj.a aVar) {
        nk.k.e(aVar, "child");
        long j = aVar.f32986c.f407b;
        boolean z3 = this.f25289a;
        boolean z10 = false;
        long j8 = this.f25290b;
        if (!z3 ? j < j8 : j > j8) {
            z10 = true;
        }
        if (z10) {
            this.f25290b = j;
        }
        return z10;
    }

    public long b() {
        if (this.f25289a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f25290b - System.nanoTime());
    }

    @Override // rj.d
    public void reset() {
        this.f25290b = this.f25289a ? Long.MIN_VALUE : Long.MAX_VALUE;
    }
}
