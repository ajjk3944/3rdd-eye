package vs;

/* loaded from: classes.dex */
public final class v extends q {
    public v(long j) {
        super(Long.valueOf(j));
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        br.l.e(a0Var, "module");
        or.h hVarN = a0Var.n();
        hVarN.getClass();
        return hVarN.s(or.k.LONG);
    }

    @Override // vs.g
    public final String toString() {
        return ((Number) this.f23957a).longValue() + ".toLong()";
    }
}
