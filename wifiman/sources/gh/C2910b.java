package Gh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Gh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2910b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2910b f7461a = new C2910b();

    /* renamed from: b, reason: collision with root package name */
    private static a f7462b;

    /* renamed from: Gh.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7463a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7464b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f7465c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f7466d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f7463a = method;
            this.f7464b = method2;
            this.f7465c = method3;
            this.f7466d = method4;
        }

        public final Method a() {
            return this.f7464b;
        }

        public final Method b() {
            return this.f7466d;
        }

        public final Method c() {
            return this.f7465c;
        }

        public final Method d() {
            return this.f7463a;
        }
    }

    private C2910b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f7462b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f7462b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class clazz) {
        AbstractC6492s.i(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
