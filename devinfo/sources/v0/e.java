package v0;

import u0.e2;
import u0.v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f35571c = new e(0, 2, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        u0.a aVar = (u0.a) kVar.j(0);
        Object objJ = kVar.j(1);
        if (objJ instanceof v1) {
            v1 v1Var = (v1) objJ;
            ((w0.e) oVar.f2573e).b(v1Var);
            ((x.f0) oVar.f2575h).a(v1Var);
        }
        if (e2Var.f34790n != 0) {
            u0.r.a("Can only append a slot if not current inserting");
        }
        int i4 = e2Var.f34786i;
        int i10 = e2Var.j;
        int iC = e2Var.c(aVar);
        int iG = e2Var.g(e2Var.r(iC + 1), e2Var.f34780b);
        e2Var.f34786i = iG;
        e2Var.j = iG;
        e2Var.x(1, iC);
        if (i4 >= iG) {
            i4++;
            i10++;
        }
        e2Var.f34781c[iG] = objJ;
        e2Var.f34786i = i4;
        e2Var.j = i10;
    }
}
