package as;

import com.google.android.gms.internal.measurement.y3;
import rr.m0;

/* loaded from: classes.dex */
public final class m implements ts.g {
    @Override // ts.g
    public final ts.e a() {
        return ts.e.BOTH;
    }

    @Override // ts.g
    public final ts.f b(rr.b bVar, rr.b bVar2, rr.f fVar) {
        br.l.e(bVar, "superDescriptor");
        br.l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof m0) || !(bVar instanceof m0)) {
            return ts.f.UNKNOWN;
        }
        m0 m0Var = (m0) bVar2;
        m0 m0Var2 = (m0) bVar;
        return !br.l.a(m0Var.getName(), m0Var2.getName()) ? ts.f.UNKNOWN : (y3.C(m0Var) && y3.C(m0Var2)) ? ts.f.OVERRIDABLE : (y3.C(m0Var) || y3.C(m0Var2)) ? ts.f.INCOMPATIBLE : ts.f.UNKNOWN;
    }
}
