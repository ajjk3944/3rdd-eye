package fl;

import nk.k;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a extends nk.i implements mk.f {

    /* renamed from: i, reason: collision with root package name */
    public static final a f24060i = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.f24061a;
        u uVar = u.f37649a;
        if (j <= 0) {
            ((e) fVar).f24079e = uVar;
            return uVar;
        }
        aj.d dVar = new aj.d(17, fVar, bVar);
        k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        ck.h hVar = eVar.f24075a;
        eVar.f24077c = x.m(hVar).F(j, dVar, hVar);
        return uVar;
    }
}
