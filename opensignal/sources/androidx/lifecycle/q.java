package androidx.lifecycle;

/* loaded from: classes.dex */
public final class q implements t, wt.t {

    /* renamed from: a, reason: collision with root package name */
    public final o f1514a;

    /* renamed from: d, reason: collision with root package name */
    public final pq.h f1515d;

    public q(o oVar, pq.h hVar) {
        br.l.e(hVar, "coroutineContext");
        this.f1514a = oVar;
        this.f1515d = hVar;
        if (oVar.e1() == n.DESTROYED) {
            wt.w.e(hVar, null);
        }
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) {
        o oVar = this.f1514a;
        if (oVar.e1().compareTo(n.DESTROYED) <= 0) {
            oVar.m1(this);
            wt.w.e(this.f1515d, null);
        }
    }

    @Override // wt.t
    public final pq.h getCoroutineContext() {
        return this.f1515d;
    }
}
