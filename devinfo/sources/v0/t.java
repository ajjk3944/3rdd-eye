package v0;

import u0.b2;
import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f35600c = new t(0, 3, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        km.o oVar2;
        b2 b2Var = (b2) kVar.j(1);
        u0.a aVar = (u0.a) kVar.j(0);
        c cVar2 = (c) kVar.j(2);
        e2 e2VarF = b2Var.f();
        if (k0Var != null) {
            try {
                oVar2 = new km.o(false, k0Var, e2Var);
            } catch (Throwable th2) {
                e2VarF.e(false);
                throw th2;
            }
        } else {
            oVar2 = null;
        }
        if (!cVar2.f35567f.V()) {
            u0.r.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f35566e.U(cVar, e2VarF, oVar, oVar2);
        e2VarF.e(true);
        e2Var.d();
        aVar.getClass();
        e2Var.A(b2Var, b2Var.a(aVar));
        e2Var.k();
    }
}
