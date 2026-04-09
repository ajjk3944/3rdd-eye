package o0;

import n0.v1;
import n0.w0;

/* loaded from: classes.dex */
public final class h extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final h f18705d = new h(0, 4, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        w0 w0Var = (w0) lVar.g(2);
        n0.s sVar = (n0.s) lVar.g(1);
        sVar.j(w0Var);
        n0.q.d("Could not resolve state for movable content");
        throw new bf.n();
    }
}
