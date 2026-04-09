package lr;

/* loaded from: classes.dex */
public final class h0 extends w0 implements ir.k {
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d0 d0Var, rr.m0 m0Var) {
        super(d0Var, m0Var);
        br.l.e(m0Var, "descriptor");
        this.I = kc.f.E(lq.j.PUBLICATION, new ht.g(20, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.k
    public final ir.h d() {
        return (g0) this.I.getValue();
    }
}
