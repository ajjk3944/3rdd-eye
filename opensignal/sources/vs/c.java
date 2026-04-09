package vs;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23954b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        switch (this.f23954b) {
            case 0:
                br.l.e(a0Var, "module");
                or.h hVarN = a0Var.n();
                hVarN.getClass();
                return hVarN.s(or.k.BOOLEAN);
            case 1:
                br.l.e(a0Var, "module");
                or.h hVarN2 = a0Var.n();
                hVarN2.getClass();
                return hVarN2.s(or.k.DOUBLE);
            default:
                br.l.e(a0Var, "module");
                or.h hVarN3 = a0Var.n();
                hVarN3.getClass();
                return hVarN3.s(or.k.FLOAT);
        }
    }

    @Override // vs.g
    public String toString() {
        switch (this.f23954b) {
            case 1:
                return ((Number) this.f23957a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f23957a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d6) {
        super(Double.valueOf(d6));
    }

    public c(float f10) {
        super(Float.valueOf(f10));
    }
}
