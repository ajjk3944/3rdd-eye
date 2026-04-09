package bj;

import Xi.m;
import Xi.n;
import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class N {
    public static final Xi.f a(Xi.f fVar, cj.e module) {
        Xi.f fVarA;
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(module, "module");
        if (!AbstractC6492s.d(fVar.h(), m.a.f24468a)) {
            return fVar.isInline() ? a(fVar.i(0), module) : fVar;
        }
        Xi.f fVarB = Xi.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final M b(AbstractC3868b abstractC3868b, Xi.f desc) {
        AbstractC6492s.i(abstractC3868b, "<this>");
        AbstractC6492s.i(desc, "desc");
        Xi.m mVarH = desc.h();
        if (mVarH instanceof Xi.d) {
            return M.POLY_OBJ;
        }
        if (AbstractC6492s.d(mVarH, n.b.f24471a)) {
            return M.LIST;
        }
        if (!AbstractC6492s.d(mVarH, n.c.f24472a)) {
            return M.OBJ;
        }
        Xi.f fVarA = a(desc.i(0), abstractC3868b.a());
        Xi.m mVarH2 = fVarA.h();
        if ((mVarH2 instanceof Xi.e) || AbstractC6492s.d(mVarH2, m.b.f24469a)) {
            return M.MAP;
        }
        if (abstractC3868b.e().c()) {
            return M.LIST;
        }
        throw r.c(fVarA);
    }
}
