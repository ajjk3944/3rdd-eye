package vs;

/* loaded from: classes.dex */
public final class d extends q {
    public d(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        br.l.e(a0Var, "module");
        or.h hVarN = a0Var.n();
        hVarN.getClass();
        return hVarN.s(or.k.BYTE);
    }

    @Override // vs.g
    public final String toString() {
        return ((Number) this.f23957a).intValue() + ".toByte()";
    }
}
