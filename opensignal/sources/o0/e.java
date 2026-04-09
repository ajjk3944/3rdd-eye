package o0;

import n0.q1;
import n0.v1;

/* loaded from: classes.dex */
public final class e extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final e f18700d = new e(0, 2, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        n0.a aVar = (n0.a) lVar.g(0);
        Object objG = lVar.g(1);
        if (objG instanceof q1) {
            q1 q1Var = (q1) objG;
            ((p0.e) gVar.f849e).b(q1Var);
            ((u.b0) gVar.f848d).a(q1Var);
        }
        if (v1Var.f17344n != 0) {
            n0.q.c("Can only append a slot if not current inserting");
        }
        int i10 = v1Var.f17341i;
        int i11 = v1Var.j;
        int iC = v1Var.c(aVar);
        int iG = v1Var.g(v1Var.f17334b, v1Var.r(iC + 1));
        v1Var.f17341i = iG;
        v1Var.j = iG;
        v1Var.w(1, iC);
        if (i10 >= iG) {
            i10++;
            i11++;
        }
        v1Var.f17335c[iG] = objG;
        v1Var.f17341i = i10;
        v1Var.j = i11;
    }
}
