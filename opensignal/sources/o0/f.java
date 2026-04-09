package o0;

import n0.v1;

/* loaded from: classes.dex */
public final class f extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final f f18702d = new f(0, 2, 1);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        v0.e eVar = (v0.e) lVar.g(1);
        int i10 = eVar != null ? eVar.f23741a : 0;
        a aVar = (a) lVar.g(0);
        if (i10 > 0) {
            cVar = new com.squareup.picasso.s(cVar, i10);
        }
        aVar.a0(cVar, v1Var, gVar, g0Var != null ? new io.sentry.t(g0Var, v1Var) : null);
    }
}
