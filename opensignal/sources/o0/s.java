package o0;

import n0.s1;
import n0.v1;

/* loaded from: classes.dex */
public final class s extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final s f18726d = new s(0, 3, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        io.sentry.t tVar;
        s1 s1Var = (s1) lVar.g(1);
        n0.a aVar = (n0.a) lVar.g(0);
        c cVar2 = (c) lVar.g(2);
        v1 v1VarD = s1Var.d();
        if (g0Var != null) {
            try {
                tVar = new io.sentry.t(g0Var, v1Var);
            } catch (Throwable th2) {
                v1VarD.e(false);
                throw th2;
            }
        } else {
            tVar = null;
        }
        if (!cVar2.f18696b.c0()) {
            n0.q.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f18695a.b0(cVar, v1VarD, gVar, tVar);
        v1VarD.e(true);
        v1Var.d();
        aVar.getClass();
        v1Var.y(s1Var, s1Var.a(aVar));
        v1Var.k();
    }
}
