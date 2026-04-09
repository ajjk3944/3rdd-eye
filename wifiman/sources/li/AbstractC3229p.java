package Li;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: Li.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3229p {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f11926a = new InterfaceC6835l() { // from class: Li.n
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC3229p.d(obj);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6839p f11927b = new InterfaceC6839p() { // from class: Li.o
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC3229p.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return AbstractC6492s.d(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final InterfaceC3220g e(InterfaceC3220g interfaceC3220g) {
        return interfaceC3220g instanceof N ? interfaceC3220g : h(interfaceC3220g, f11926a, f11927b);
    }

    public static final InterfaceC3220g f(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
        InterfaceC6835l interfaceC6835l = f11926a;
        AbstractC6492s.g(interfaceC6839p, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return h(interfaceC3220g, interfaceC6835l, (InterfaceC6839p) V.f(interfaceC6839p, 2));
    }

    public static final InterfaceC3220g g(InterfaceC3220g interfaceC3220g, InterfaceC6835l interfaceC6835l) {
        return h(interfaceC3220g, interfaceC6835l, f11927b);
    }

    private static final InterfaceC3220g h(InterfaceC3220g interfaceC3220g, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
        if (interfaceC3220g instanceof C3218e) {
            C3218e c3218e = (C3218e) interfaceC3220g;
            if (c3218e.f11908b == interfaceC6835l && c3218e.f11909c == interfaceC6839p) {
                return interfaceC3220g;
            }
        }
        return new C3218e(interfaceC3220g, interfaceC6835l, interfaceC6839p);
    }
}
