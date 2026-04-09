package zt;

/* loaded from: classes.dex */
public final class b0 implements wt.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f27526a;

    /* renamed from: d, reason: collision with root package name */
    public final long f27527d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27528g;

    /* renamed from: r, reason: collision with root package name */
    public final wt.g f27529r;

    public b0(e0 e0Var, long j, Object obj, wt.g gVar) {
        this.f27526a = e0Var;
        this.f27527d = j;
        this.f27528g = obj;
        this.f27529r = gVar;
    }

    @Override // wt.e0
    public final void a() {
        e0 e0Var = this.f27526a;
        synchronized (e0Var) {
            if (this.f27527d < e0Var.o()) {
                return;
            }
            Object[] objArr = e0Var.D;
            br.l.b(objArr);
            long j = this.f27527d;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            f0.c(objArr, j, f0.f27543a);
            e0Var.h();
        }
    }
}
