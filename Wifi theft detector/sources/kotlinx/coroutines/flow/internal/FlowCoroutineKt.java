package kotlinx.coroutines.flow.internal;

import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public abstract class FlowCoroutineKt {

    public static final class a implements kotlinx.coroutines.flow.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f22463a;

        public a(q qVar) {
            this.f22463a = qVar;
        }

        @Override // kotlinx.coroutines.flow.b
        public Object collect(kotlinx.coroutines.flow.c cVar, c9.c cVar2) {
            Object objA = FlowCoroutineKt.a(new FlowCoroutineKt$scopedFlow$1$1(this.f22463a, cVar, null), cVar2);
            return objA == kotlin.coroutines.intrinsics.a.f() ? objA : s.f25199a;
        }
    }

    public static final Object a(l9.p pVar, c9.c cVar) {
        g gVar = new g(cVar.getContext(), cVar);
        Object objB = v9.b.b(gVar, gVar, pVar);
        if (objB == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objB;
    }

    public static final kotlinx.coroutines.flow.b b(q qVar) {
        return new a(qVar);
    }
}
