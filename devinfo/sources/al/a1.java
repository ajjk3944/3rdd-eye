package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 extends bl.d {

    /* renamed from: a, reason: collision with root package name */
    public long f472a;

    /* renamed from: b, reason: collision with root package name */
    public xk.h f473b;

    @Override // bl.d
    public final boolean a(bl.b bVar) {
        y0 y0Var = (y0) bVar;
        if (this.f472a >= 0) {
            return false;
        }
        long j = y0Var.f652i;
        if (j < y0Var.j) {
            y0Var.j = j;
        }
        this.f472a = j;
        return true;
    }

    @Override // bl.d
    public final ck.c[] b(bl.b bVar) {
        long j = this.f472a;
        this.f472a = -1L;
        this.f473b = null;
        return ((y0) bVar).v(j);
    }
}
