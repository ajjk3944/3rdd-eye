package wt;

/* loaded from: classes.dex */
public final class x0 extends g {
    public final m E;

    public x0(pq.c cVar, m mVar) {
        super(1, cVar);
        this.E = mVar;
    }

    @Override // wt.g
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // wt.g
    public final Throwable t(b1 b1Var) {
        Throwable thC;
        m mVar = this.E;
        mVar.getClass();
        Object obj = b1.f24604a.get(mVar);
        return (!(obj instanceof z0) || (thC = ((z0) obj).c()) == null) ? obj instanceof o ? ((o) obj).f24644a : b1Var.y() : thC;
    }
}
