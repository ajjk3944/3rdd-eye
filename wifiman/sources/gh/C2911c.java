package Gh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Gh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2911c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2911c f7467a = new C2911c();

    /* renamed from: b, reason: collision with root package name */
    private static a f7468b;

    /* renamed from: Gh.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f7469a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f7470b;

        public a(Method method, Method method2) {
            this.f7469a = method;
            this.f7470b = method2;
        }

        public final Method a() {
            return this.f7470b;
        }

        public final Method b() {
            return this.f7469a;
        }
    }

    private C2911c() {
    }

    public final a a(Member member) throws NoSuchMethodException, SecurityException {
        AbstractC6492s.i(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC2914f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodA;
        AbstractC6492s.i(member, "member");
        a aVarA = f7468b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f7468b;
                if (aVarA == null) {
                    aVarA = f7467a.a(member);
                    f7468b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            AbstractC6492s.g(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
