package du;

import wt.q;

/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: g, reason: collision with root package name */
    public static final m f7584g = new m();

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        f.f7572r.f7574g.f(runnable, true, false);
    }

    @Override // wt.q
    public final void o0(pq.h hVar, Runnable runnable) {
        f.f7572r.f7574g.f(runnable, true, true);
    }

    @Override // wt.q
    public final q q0(int i10) {
        bu.a.a(i10);
        return i10 >= l.f7581d ? this : super.q0(i10);
    }

    @Override // wt.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
