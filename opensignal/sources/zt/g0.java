package zt;

/* loaded from: classes.dex */
public final class g0 extends au.d {

    /* renamed from: a, reason: collision with root package name */
    public long f27546a;

    /* renamed from: b, reason: collision with root package name */
    public wt.g f27547b;

    @Override // au.d
    public final boolean a(au.b bVar) {
        e0 e0Var = (e0) bVar;
        if (this.f27546a >= 0) {
            return false;
        }
        long j = e0Var.E;
        if (j < e0Var.F) {
            e0Var.F = j;
        }
        this.f27546a = j;
        return true;
    }

    @Override // au.d
    public final pq.c[] b(au.b bVar) {
        long j = this.f27546a;
        this.f27546a = -1L;
        this.f27547b = null;
        return ((e0) bVar).v(j);
    }
}
