package vs;

import ht.b0;

/* loaded from: classes.dex */
public final class a0 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23952b = 0;

    public a0(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        switch (this.f23952b) {
            case 0:
                br.l.e(a0Var, "module");
                rr.f fVarD = rr.w.d(a0Var, or.n.R);
                b0 b0VarQ = fVarD != null ? fVarD.q() : null;
                return b0VarQ == null ? kt.k.c(kt.j.NOT_FOUND_UNSIGNED_TYPE, "UByte") : b0VarQ;
            case 1:
                br.l.e(a0Var, "module");
                rr.f fVarD2 = rr.w.d(a0Var, or.n.T);
                b0 b0VarQ2 = fVarD2 != null ? fVarD2.q() : null;
                return b0VarQ2 == null ? kt.k.c(kt.j.NOT_FOUND_UNSIGNED_TYPE, "UInt") : b0VarQ2;
            case 2:
                br.l.e(a0Var, "module");
                rr.f fVarD3 = rr.w.d(a0Var, or.n.U);
                b0 b0VarQ3 = fVarD3 != null ? fVarD3.q() : null;
                return b0VarQ3 == null ? kt.k.c(kt.j.NOT_FOUND_UNSIGNED_TYPE, "ULong") : b0VarQ3;
            default:
                br.l.e(a0Var, "module");
                rr.f fVarD4 = rr.w.d(a0Var, or.n.S);
                b0 b0VarQ4 = fVarD4 != null ? fVarD4.q() : null;
                return b0VarQ4 == null ? kt.k.c(kt.j.NOT_FOUND_UNSIGNED_TYPE, "UShort") : b0VarQ4;
        }
    }

    @Override // vs.g
    public final String toString() {
        switch (this.f23952b) {
            case 0:
                return ((Number) this.f23957a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f23957a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f23957a).longValue() + ".toULong()";
            default:
                return ((Number) this.f23957a).intValue() + ".toUShort()";
        }
    }

    public a0(short s8) {
        super(Short.valueOf(s8));
    }

    public a0(int i10) {
        super(Integer.valueOf(i10));
    }

    public a0(long j) {
        super(Long.valueOf(j));
    }
}
