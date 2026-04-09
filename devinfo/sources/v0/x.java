package v0;

import java.util.Set;
import u0.e2;
import u0.m1;
import u0.v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f35604c = new x(0, 1, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        m1 m1Var = (m1) kVar.j(0);
        Set set = (Set) oVar.f2570b;
        if (set == null) {
            return;
        }
        c1.j jVar = new c1.j(set);
        x.e0 e0Var = (x.e0) oVar.f2577k;
        if (e0Var == null) {
            long[] jArr = x.l0.f36914a;
            e0Var = new x.e0();
            oVar.f2577k = e0Var;
        }
        e0Var.m(m1Var, jVar);
        ((w0.e) oVar.f2573e).b(new v1(jVar, -1));
    }
}
