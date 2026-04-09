package Mi;

import Li.InterfaceC3221h;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.V;

/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final mh.q f13306a;

    /* synthetic */ class a extends C6490p implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13307a = new a();

        a() {
            super(3, InterfaceC3221h.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // mh.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
            return interfaceC3221h.a(obj, interfaceC5380e);
        }
    }

    static {
        a aVar = a.f13307a;
        AbstractC6492s.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f13306a = (mh.q) V.f(aVar, 3);
    }
}
