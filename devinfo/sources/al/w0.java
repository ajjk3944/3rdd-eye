package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 implements xk.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f632a;

    /* renamed from: b, reason: collision with root package name */
    public final long f633b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f634c;

    /* renamed from: d, reason: collision with root package name */
    public final xk.h f635d;

    public w0(y0 y0Var, long j, Object obj, xk.h hVar) {
        this.f632a = y0Var;
        this.f633b = j;
        this.f634c = obj;
        this.f635d = hVar;
    }

    @Override // xk.i0
    public final void a() {
        y0 y0Var = this.f632a;
        synchronized (y0Var) {
            if (this.f633b < y0Var.o()) {
                return;
            }
            Object[] objArr = y0Var.f651h;
            nk.k.b(objArr);
            long j = this.f633b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            z0.e(objArr, j, z0.f661a);
            y0Var.j();
        }
    }
}
