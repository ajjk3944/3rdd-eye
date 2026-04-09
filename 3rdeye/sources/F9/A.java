package F9;

import A9.M0;
import f9.InterfaceC4350h;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1727a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final a f1728b = a.f1731g;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1729c = b.f1732g;

    /* renamed from: d, reason: collision with root package name */
    public static final c f1730d = c.f1733g;

    /* compiled from: ThreadContext.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.p<Object, InterfaceC4350h.a, Object> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f1731g = new a(2);

        @Override // p9.p
        public final Object invoke(Object obj, InterfaceC4350h.a aVar) {
            InterfaceC4350h.a aVar2 = aVar;
            if (!(aVar2 instanceof M0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? aVar2 : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.p<M0<?>, InterfaceC4350h.a, M0<?>> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f1732g = new b(2);

        @Override // p9.p
        public final M0<?> invoke(M0<?> m02, InterfaceC4350h.a aVar) {
            M0<?> m03 = m02;
            InterfaceC4350h.a aVar2 = aVar;
            if (m03 != null) {
                return m03;
            }
            if (aVar2 instanceof M0) {
                return (M0) aVar2;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.p<F, InterfaceC4350h.a, F> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f1733g = new c(2);

        @Override // p9.p
        public final F invoke(F f10, InterfaceC4350h.a aVar) {
            F f11 = f10;
            InterfaceC4350h.a aVar2 = aVar;
            if (aVar2 instanceof M0) {
                M0<Object> m02 = (M0) aVar2;
                Object objW = m02.W(f11.f1740a);
                int i = f11.f1743d;
                f11.f1741b[i] = objW;
                f11.f1743d = i + 1;
                f11.f1742c[i] = m02;
            }
            return f11;
        }
    }

    public static final void a(InterfaceC4350h interfaceC4350h, Object obj) {
        if (obj == f1727a) {
            return;
        }
        if (!(obj instanceof F)) {
            Object objFold = interfaceC4350h.fold(null, f1729c);
            kotlin.jvm.internal.l.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((M0) objFold).u0(obj);
            return;
        }
        F f10 = (F) obj;
        M0<Object>[] m0Arr = f10.f1742c;
        int length = m0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            M0<Object> m02 = m0Arr[length];
            kotlin.jvm.internal.l.c(m02);
            m02.u0(f10.f1741b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(InterfaceC4350h interfaceC4350h) {
        Object objFold = interfaceC4350h.fold(0, f1728b);
        kotlin.jvm.internal.l.c(objFold);
        return objFold;
    }

    public static final Object c(InterfaceC4350h interfaceC4350h, Object obj) {
        if (obj == null) {
            obj = b(interfaceC4350h);
        }
        return obj == 0 ? f1727a : obj instanceof Integer ? interfaceC4350h.fold(new F(((Number) obj).intValue(), interfaceC4350h), f1730d) : ((M0) obj).W(interfaceC4350h);
    }
}
