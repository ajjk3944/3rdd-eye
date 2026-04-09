package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class r {
    public static final void a(o oVar, y0 y0Var) {
        oVar.e(new z0(y0Var));
    }

    public static final p b(c9.c cVar) {
        if (!(cVar instanceof kotlinx.coroutines.internal.i)) {
            return new p(cVar, 1);
        }
        p pVarM = ((kotlinx.coroutines.internal.i) cVar).m();
        if (pVarM != null) {
            if (!pVarM.O()) {
                pVarM = null;
            }
            if (pVarM != null) {
                return pVarM;
            }
        }
        return new p(cVar, 2);
    }
}
