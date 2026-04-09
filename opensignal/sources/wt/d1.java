package wt;

import lf.t1;

/* loaded from: classes.dex */
public final class d1 extends z {

    /* renamed from: x, reason: collision with root package name */
    public final pq.c f24611x;

    public d1(pq.h hVar, ar.n nVar) {
        super(hVar, false, 1);
        this.f24611x = xu.l.m(nVar, this, this);
    }

    @Override // wt.b1
    public final void O() {
        try {
            bu.a.h(lq.b0.f15562a, xu.l.D(this.f24611x));
        } catch (Throwable th2) {
            g(t1.k(th2));
            throw th2;
        }
    }
}
