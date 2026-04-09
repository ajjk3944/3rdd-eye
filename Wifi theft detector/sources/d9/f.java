package d9;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f20810a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final a f20811b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    public static a f20812c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f20813a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f20814b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f20815c;

        public a(Method method, Method method2, Method method3) {
            this.f20813a = method;
            this.f20814b = method2;
            this.f20815c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f20812c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f20811b;
            f20812c = aVar2;
            return aVar2;
        }
    }

    public final String b(BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        p.e(continuation, "continuation");
        a aVarA = f20812c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f20811b && (method = aVarA.f20813a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f20814b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f20815c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
