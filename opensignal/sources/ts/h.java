package ts;

import ht.x;
import rr.b0;
import rr.m0;
import rr.s0;
import rr.u0;
import rr.v;
import ur.i0;

/* loaded from: classes.dex */
public abstract class h {
    static {
        qs.b.j(new qs.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(rr.d dVar) {
        br.l.e(dVar, "<this>");
        if (!(dVar instanceof i0)) {
            return false;
        }
        m0 m0VarV1 = ((i0) dVar).v1();
        br.l.d(m0VarV1, "correspondingProperty");
        return d(m0VarV1);
    }

    public static final boolean b(rr.l lVar) {
        br.l.e(lVar, "<this>");
        return (lVar instanceof rr.f) && (((rr.f) lVar).B0() instanceof v);
    }

    public static final boolean c(x xVar) {
        br.l.e(xVar, "<this>");
        rr.i iVarP = xVar.Z().p();
        if (iVarP != null) {
            return b(iVarP);
        }
        return false;
    }

    public static final boolean d(u0 u0Var) {
        if (u0Var.j0() != null) {
            return false;
        }
        rr.l lVarO = u0Var.o();
        qs.g gVar = null;
        rr.f fVar = lVarO instanceof rr.f ? (rr.f) lVarO : null;
        if (fVar != null) {
            int i10 = xs.d.f25523a;
            s0 s0VarB0 = fVar.B0();
            v vVar = s0VarB0 instanceof v ? (v) s0VarB0 : null;
            if (vVar != null) {
                gVar = vVar.f21719a;
            }
        }
        return br.l.a(gVar, u0Var.getName());
    }

    public static final boolean e(rr.l lVar) {
        if (b(lVar)) {
            return true;
        }
        return (lVar instanceof rr.f) && (((rr.f) lVar).B0() instanceof b0);
    }

    public static final ht.b0 f(x xVar) {
        br.l.e(xVar, "<this>");
        rr.i iVarP = xVar.Z().p();
        rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
        if (fVar != null) {
            int i10 = xs.d.f25523a;
            s0 s0VarB0 = fVar.B0();
            v vVar = s0VarB0 instanceof v ? (v) s0VarB0 : null;
            if (vVar != null) {
                return (ht.b0) vVar.f21720b;
            }
        }
        return null;
    }
}
