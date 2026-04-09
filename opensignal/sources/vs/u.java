package vs;

import com.google.android.gms.internal.measurement.e5;
import ht.b0;
import ht.c1;
import ht.d1;
import ht.g0;
import ht.i0;

/* loaded from: classes.dex */
public final class u extends g {
    public u(qs.b bVar, int i10) {
        super(new s(new f(bVar, i10)));
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        ht.x xVarC;
        br.l.e(a0Var, "module");
        i0.f10910d.getClass();
        i0 i0Var = i0.f10911g;
        or.h hVarN = a0Var.n();
        hVarN.getClass();
        rr.f fVarI = hVarN.i(or.n.P.g());
        if (fVarI == null) {
            or.h.a(21);
            throw null;
        }
        Object obj = this.f23957a;
        t tVar = (t) obj;
        if (tVar instanceof r) {
            xVarC = ((r) obj).f23965a;
        } else {
            if (!(tVar instanceof s)) {
                throw new bf.n();
            }
            f fVar = ((s) obj).f23966a;
            qs.b bVar = fVar.f23955a;
            int i10 = fVar.f23956b;
            rr.f fVarD = rr.w.d(a0Var, bVar);
            if (fVarD == null) {
                kt.j jVar = kt.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String string = bVar.toString();
                br.l.d(string, "classId.toString()");
                xVarC = kt.k.c(jVar, string, String.valueOf(i10));
            } else {
                b0 b0VarQ = fVarD.q();
                br.l.d(b0VarQ, "descriptor.defaultType");
                c1 c1VarR = se.b.R(b0VarQ);
                for (int i11 = 0; i11 < i10; i11++) {
                    c1VarR = a0Var.n().h(d1.INVARIANT, c1VarR);
                }
                xVarC = c1VarR;
            }
        }
        return ht.e.q(i0Var, fVarI, e5.H(new g0(xVarC)));
    }
}
