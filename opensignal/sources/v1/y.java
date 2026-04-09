package v1;

import java.util.ArrayList;
import java.util.List;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class y extends x1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f23819a = new y();

    @Override // v1.r
    public final l0 a(m0 m0Var, List list, long j) {
        int size = list.size();
        mq.x xVar = mq.x.f16946a;
        if (size == 0) {
            return m0Var.g0(t2.a.j(j), t2.a.i(j), xVar, w.f23815r);
        }
        if (size == 1) {
            v vVarS = ((q) list.get(0)).s(j);
            return m0Var.g0(t2.b.f(vVarS.f23809b, j), t2.b.e(vVarS.f23810c, j), xVar, new d1.b(vVarS, 1));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            v vVarS2 = ((q) list.get(i10)).s(j);
            iMax = Math.max(vVarS2.f23809b, iMax);
            iMax2 = Math.max(vVarS2.f23810c, iMax2);
            arrayList.add(vVarS2);
        }
        return m0Var.g0(t2.b.f(iMax, j), t2.b.e(iMax2, j), xVar, new j1.a(13, arrayList));
    }
}
