package Ni;

import Ii.T0;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final C f16576a = new C("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6839p f16577b = new InterfaceC6839p() { // from class: Ni.G
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return J.d(obj, (InterfaceC5384i.b) obj2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6839p f16578c = new InterfaceC6839p() { // from class: Ni.H
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return J.e((T0) obj, (InterfaceC5384i.b) obj2);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6839p f16579d = new InterfaceC6839p() { // from class: Ni.I
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return J.h((N) obj, (InterfaceC5384i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, InterfaceC5384i.b bVar) {
        if (!(bVar instanceof T0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T0 e(T0 t02, InterfaceC5384i.b bVar) {
        if (t02 != null) {
            return t02;
        }
        if (bVar instanceof T0) {
            return (T0) bVar;
        }
        return null;
    }

    public static final void f(InterfaceC5384i interfaceC5384i, Object obj) {
        if (obj == f16576a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(interfaceC5384i);
            return;
        }
        Object objFold = interfaceC5384i.fold(null, f16578c);
        AbstractC6492s.g(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((T0) objFold).T(interfaceC5384i, obj);
    }

    public static final Object g(InterfaceC5384i interfaceC5384i) {
        Object objFold = interfaceC5384i.fold(0, f16577b);
        AbstractC6492s.f(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N h(N n10, InterfaceC5384i.b bVar) {
        if (bVar instanceof T0) {
            T0 t02 = (T0) bVar;
            n10.a(t02, t02.f0(n10.f16582a));
        }
        return n10;
    }

    public static final Object i(InterfaceC5384i interfaceC5384i, Object obj) {
        if (obj == null) {
            obj = g(interfaceC5384i);
        }
        if (obj == 0) {
            return f16576a;
        }
        if (obj instanceof Integer) {
            return interfaceC5384i.fold(new N(interfaceC5384i, ((Number) obj).intValue()), f16579d);
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((T0) obj).f0(interfaceC5384i);
    }
}
