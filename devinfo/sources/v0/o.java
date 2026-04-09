package v0;

import java.util.ArrayList;
import u0.e2;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o f35592c = new o(0, 1, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        w0.e eVar;
        m1 m1Var = (m1) kVar.j(0);
        x.e0 e0Var = (x.e0) oVar.f2577k;
        if (e0Var == null || ((c1.j) e0Var.g(m1Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) oVar.f2569a;
        if (arrayList != null && (eVar = (w0.e) arrayList.remove(arrayList.size() - 1)) != null) {
            oVar.f2573e = eVar;
        }
        e0Var.k(m1Var);
    }
}
