package v0;

import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f35573c = new f(0, 2, 1);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        c1.i iVar = (c1.i) kVar.j(1);
        int i4 = iVar != null ? iVar.f2562a : 0;
        a aVar = (a) kVar.j(0);
        if (i4 > 0) {
            n3.f fVar = new n3.f();
            fVar.f29628c = cVar;
            fVar.f29626a = i4;
            cVar = fVar;
        }
        aVar.T(cVar, e2Var, oVar, k0Var != null ? new km.o(false, k0Var, e2Var) : null);
    }
}
