package as;

import com.google.android.gms.internal.measurement.e5;
import ht.x0;
import java.util.List;
import ur.k0;

/* loaded from: classes.dex */
public final class k implements ts.g {
    @Override // ts.g
    public final ts.e a() {
        return ts.e.SUCCESS_ONLY;
    }

    @Override // ts.g
    public final ts.f b(rr.b bVar, rr.b bVar2, rr.f fVar) {
        br.l.e(bVar, "superDescriptor");
        br.l.e(bVar2, "subDescriptor");
        if (bVar2 instanceof cs.g) {
            cs.g gVar = (cs.g) bVar2;
            if (gVar.getTypeParameters().isEmpty()) {
                ts.m mVarI = ts.n.i(bVar, bVar2);
                if ((mVarI != null ? mVarI.c() : null) != null) {
                    return ts.f.UNKNOWN;
                }
                List listY = gVar.Y();
                br.l.d(listY, "subDescriptor.valueParameters");
                st.p pVarB0 = st.l.b0(mq.o.j0(listY), f.f2214y);
                ht.x xVar = gVar.D;
                br.l.b(xVar);
                st.g gVarZ = st.l.Z(mq.l.Y(new st.j[]{pVarB0, new mq.n(4, xVar)}));
                ur.v vVar = gVar.F;
                st.e eVar = new st.e(st.l.Z(mq.l.Y(new st.j[]{gVarZ, mq.o.j0(e5.J(vVar != null ? vVar.getType() : null))})));
                while (eVar.hasNext()) {
                    ht.x xVar2 = (ht.x) eVar.next();
                    if (!xVar2.L().isEmpty() && !(xVar2.k0() instanceof fs.h)) {
                        return ts.f.UNKNOWN;
                    }
                }
                rr.b bVarBuild = (rr.b) bVar.e(new x0(new fs.f()));
                if (bVarBuild == null) {
                    return ts.f.UNKNOWN;
                }
                if (bVarBuild instanceof k0) {
                    k0 k0Var = (k0) bVarBuild;
                    if (!k0Var.getTypeParameters().isEmpty()) {
                        bVarBuild = k0Var.F0().x().build();
                        br.l.b(bVarBuild);
                    }
                }
                ts.l lVarC = ts.n.f22971c.n(bVarBuild, bVar2, false).c();
                br.l.d(lVarC, "DEFAULT.isOverridableByW…Descriptor, false).result");
                return j.f2223a[lVarC.ordinal()] == 1 ? ts.f.OVERRIDABLE : ts.f.UNKNOWN;
            }
        }
        return ts.f.UNKNOWN;
    }
}
