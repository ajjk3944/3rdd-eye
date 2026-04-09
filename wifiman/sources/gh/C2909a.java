package Gh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Gh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2909a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2909a f7457a = new C2909a();

    /* renamed from: b, reason: collision with root package name */
    private static C0301a f7458b;

    /* renamed from: Gh.a$a, reason: collision with other inner class name */
    public static final class C0301a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7459a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7460b;

        public C0301a(Method method, Method method2) {
            this.f7459a = method;
            this.f7460b = method2;
        }

        public final Method a() {
            return this.f7460b;
        }

        public final Method b() {
            return this.f7459a;
        }
    }

    private C2909a() {
    }

    private final C0301a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0301a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0301a(null, null);
        }
    }

    private final C0301a b(Object obj) {
        C0301a c0301a = f7458b;
        if (c0301a != null) {
            return c0301a;
        }
        C0301a c0301aA = a(obj);
        f7458b = c0301aA;
        return c0301aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
