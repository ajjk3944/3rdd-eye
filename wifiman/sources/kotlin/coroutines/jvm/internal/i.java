package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f51675a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f51676b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f51677c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f51678a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f51679b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f51680c;

        public a(Method method, Method method2, Method method3) {
            this.f51678a = method;
            this.f51679b = method2;
            this.f51680c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f51677c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f51676b;
            f51677c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC6492s.i(continuation, "continuation");
        a aVarA = f51677c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f51676b || (method = aVarA.f51678a) == null || (objInvoke = method.invoke(continuation.getClass(), null)) == null || (method2 = aVarA.f51679b) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = aVarA.f51680c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
