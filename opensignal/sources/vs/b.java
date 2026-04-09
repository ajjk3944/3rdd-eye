package vs;

import java.util.List;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final br.n f23953b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list, ar.k kVar) {
        super(list);
        this.f23953b = (br.n) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ar.k, br.n] */
    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        rr.i iVarP;
        br.l.e(a0Var, "module");
        ht.x xVar = (ht.x) this.f23953b.a(a0Var);
        if (!or.h.y(xVar) && (((iVarP = xVar.Z().p()) == null || or.h.r(iVarP) == null) && !or.h.B(xVar, or.n.V.i()) && !or.h.B(xVar, or.n.W.i()) && !or.h.B(xVar, or.n.X.i()))) {
            or.h.B(xVar, or.n.Y.i());
        }
        return xVar;
    }
}
