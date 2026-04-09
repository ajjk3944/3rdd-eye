package vs;

/* loaded from: classes.dex */
public final class x extends q {
    public x(short s8) {
        super(Short.valueOf(s8));
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        br.l.e(a0Var, "module");
        or.h hVarN = a0Var.n();
        hVarN.getClass();
        return hVarN.s(or.k.SHORT);
    }

    @Override // vs.g
    public final String toString() {
        return ((Number) this.f23957a).intValue() + ".toShort()";
    }
}
