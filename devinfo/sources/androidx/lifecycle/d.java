package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1117c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1118a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1119b = new HashMap();

    public static void b(HashMap map, c cVar, r rVar, Class cls) {
        r rVar2 = (r) map.get(cVar);
        if (rVar2 == null || rVar == rVar2) {
            if (rVar2 == null) {
                map.put(cVar, rVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f1107b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + rVar2 + ", new value " + rVar);
    }

    public final b a(Class cls, Method[] methodArr) throws SecurityException {
        int i4;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1118a;
        if (superclass != null) {
            b bVarA = (b) map2.get(superclass);
            if (bVarA == null) {
                bVarA = a(superclass, null);
            }
            map.putAll(bVarA.f1098b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVarA2 = (b) map2.get(cls2);
            if (bVarA2 == null) {
                bVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : bVarA2.f1098b.entrySet()) {
                b(map, (c) entry.getKey(), (r) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            n0 n0Var = (n0) method.getAnnotation(n0.class);
            if (n0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!a0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                r rVarValue = n0Var.value();
                if (parameterTypes.length > 1) {
                    if (!r.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (rVarValue != r.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new c(i4, method), rVarValue, cls);
                z3 = true;
            }
        }
        b bVar = new b(map);
        map2.put(cls, bVar);
        this.f1119b.put(cls, Boolean.valueOf(z3));
        return bVar;
    }
}
