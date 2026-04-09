package E9;

import D9.InterfaceC0645g;
import b9.C1992A;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.z;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1570a;

    /* compiled from: SafeCollector.kt */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements p9.q<InterfaceC0645g<? super Object>, Object, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1571b = new a(3, InterfaceC0645g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // p9.q
        public final Object invoke(InterfaceC0645g<? super Object> interfaceC0645g, Object obj, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return interfaceC0645g.emit(obj, interfaceC4347e);
        }
    }

    static {
        a aVar = a.f1571b;
        kotlin.jvm.internal.l.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        z.b(3, aVar);
        f1570a = aVar;
    }
}
