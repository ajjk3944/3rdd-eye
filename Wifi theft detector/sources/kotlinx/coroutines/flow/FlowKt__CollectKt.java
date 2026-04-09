package kotlinx.coroutines.flow;

import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__CollectKt {
    public static final Object a(b bVar, c9.c cVar) {
        Object objCollect = bVar.collect(kotlinx.coroutines.flow.internal.k.f22479a, cVar);
        return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : y8.s.f25199a;
    }

    public static final Object b(b bVar, l9.p pVar, c9.c cVar) {
        Object objI = d.i(r.b(d.y(bVar, pVar), 0, null, 2, null), cVar);
        return objI == kotlin.coroutines.intrinsics.a.f() ? objI : y8.s.f25199a;
    }

    public static final Object c(c cVar, b bVar, c9.c cVar2) {
        d.p(cVar);
        Object objCollect = bVar.collect(cVar, cVar2);
        return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : y8.s.f25199a;
    }

    public static final r1 d(b bVar, kotlinx.coroutines.j0 j0Var) {
        return kotlinx.coroutines.k.d(j0Var, null, null, new FlowKt__CollectKt$launchIn$1(bVar, null), 3, null);
    }
}
