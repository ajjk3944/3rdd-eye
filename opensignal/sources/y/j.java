package y;

import g1.r;
import wt.w;
import x1.h0;

/* loaded from: classes.dex */
public final class j extends z0.l implements x1.m {

    /* renamed from: p, reason: collision with root package name */
    public final a0.i f25593p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25594q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25595r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25596s;

    public j(a0.i iVar) {
        this.f25593p = iVar;
    }

    @Override // z0.l
    public final void U() {
        w.s(Q(), null, null, new cq.h(this, null, 11), 3);
    }

    @Override // x1.m
    public final void d(h0 h0Var) {
        h0Var.a();
        i1.b bVar = h0Var.f24844b;
        if (this.f25594q) {
            i1.d.g(h0Var, r.b(r.f9264b, 0.3f), bVar.C(), 0.0f, 122);
        } else if (this.f25595r || this.f25596s) {
            i1.d.g(h0Var, r.b(r.f9264b, 0.1f), bVar.C(), 0.0f, 122);
        }
    }
}
