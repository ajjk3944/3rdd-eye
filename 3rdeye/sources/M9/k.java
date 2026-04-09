package M9;

import D9.G;
import E.u;
import Q9.C1544n;
import Q9.C1553s;
import Q9.InterfaceC1543m0;
import Q9.u0;
import Q9.y0;
import T1.B;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p9.p;
import w9.InterfaceC5748c;

/* compiled from: SerializersCache.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final y0<? extends Object> f4353a;

    /* renamed from: b, reason: collision with root package name */
    public static final y0<Object> f4354b;

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC1543m0<? extends Object> f4355c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC1543m0<Object> f4356d;

    /* compiled from: SerializersCache.kt */
    public static final class a extends kotlin.jvm.internal.m implements p<InterfaceC5748c<Object>, List<? extends w9.j>, M9.b<? extends Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f4357g = new a(2);

        @Override // p9.p
        public final M9.b<? extends Object> invoke(InterfaceC5748c<Object> interfaceC5748c, List<? extends w9.j> list) {
            InterfaceC5748c<Object> clazz = interfaceC5748c;
            List<? extends w9.j> types = list;
            kotlin.jvm.internal.l.f(clazz, "clazz");
            kotlin.jvm.internal.l.f(types, "types");
            ArrayList arrayListM = u.M(T9.b.f12338a, types, true);
            kotlin.jvm.internal.l.c(arrayListM);
            return u.J(clazz, arrayListM, new j(types));
        }
    }

    /* compiled from: SerializersCache.kt */
    public static final class b extends kotlin.jvm.internal.m implements p<InterfaceC5748c<Object>, List<? extends w9.j>, M9.b<Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f4358g = new b(2);

        @Override // p9.p
        public final M9.b<Object> invoke(InterfaceC5748c<Object> interfaceC5748c, List<? extends w9.j> list) {
            InterfaceC5748c<Object> clazz = interfaceC5748c;
            List<? extends w9.j> types = list;
            kotlin.jvm.internal.l.f(clazz, "clazz");
            kotlin.jvm.internal.l.f(types, "types");
            ArrayList arrayListM = u.M(T9.b.f12338a, types, true);
            kotlin.jvm.internal.l.c(arrayListM);
            M9.b bVarJ = u.J(clazz, arrayListM, new l(types));
            if (bVarJ != null) {
                return N9.a.b(bVarJ);
            }
            return null;
        }
    }

    /* compiled from: SerializersCache.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<InterfaceC5748c<?>, M9.b<? extends Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f4359g = new c(1);

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
        @Override // p9.l
        public final M9.b<? extends Object> invoke(InterfaceC5748c<?> interfaceC5748c) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
            InterfaceC5748c<?> it = interfaceC5748c;
            kotlin.jvm.internal.l.f(it, "it");
            M9.b<? extends Object> bVarC = B.c(it, new M9.b[0]);
            return bVarC == null ? (M9.b) u0.f11534a.get(it) : bVarC;
        }
    }

    /* compiled from: SerializersCache.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<InterfaceC5748c<?>, M9.b<Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f4360g = new d(1);

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
        @Override // p9.l
        public final M9.b<Object> invoke(InterfaceC5748c<?> interfaceC5748c) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
            InterfaceC5748c<?> it = interfaceC5748c;
            kotlin.jvm.internal.l.f(it, "it");
            M9.b bVarC = B.c(it, new M9.b[0]);
            if (bVarC == null) {
                bVarC = (M9.b) u0.f11534a.get(it);
            }
            if (bVarC != null) {
                return N9.a.b(bVarC);
            }
            return null;
        }
    }

    static {
        boolean z10 = C1544n.f11504a;
        c factory = c.f4359g;
        kotlin.jvm.internal.l.f(factory, "factory");
        boolean z11 = C1544n.f11504a;
        f4353a = z11 ? new C1553s(factory) : new K4.b(factory);
        d factory2 = d.f4360g;
        kotlin.jvm.internal.l.f(factory2, "factory");
        f4354b = z11 ? new C1553s(factory2) : new K4.b(factory2);
        a factory3 = a.f4357g;
        kotlin.jvm.internal.l.f(factory3, "factory");
        f4355c = z11 ? new G(factory3) : new C1553s(factory3);
        b factory4 = b.f4358g;
        kotlin.jvm.internal.l.f(factory4, "factory");
        f4356d = z11 ? new G(factory4) : new C1553s(factory4);
    }
}
