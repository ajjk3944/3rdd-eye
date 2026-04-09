package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lf {
    public static final lf c = new lf();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, kf kfVar, t50 t50Var, Class cls) {
        t50 t50Var2 = (t50) map.get(kfVar);
        if (t50Var2 == null || t50Var == t50Var2) {
            if (t50Var2 == null) {
                map.put(kfVar, t50Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + kfVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + t50Var2 + ", new value " + t50Var);
    }

    public final jf a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            jf jfVarA = (jf) map2.get(superclass);
            if (jfVarA == null) {
                jfVarA = a(superclass, null);
            }
            map.putAll(jfVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            jf jfVarA2 = (jf) map2.get(cls2);
            if (jfVarA2 == null) {
                jfVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : jfVarA2.b.entrySet()) {
                b(map, (kf) entry.getKey(), (t50) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            hj0 hj0Var = (hj0) method.getAnnotation(hj0.class);
            if (hj0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!b60.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                t50 t50VarValue = hj0Var.value();
                if (parameterTypes.length > 1) {
                    if (!t50.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (t50VarValue != t50.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new kf(i, method), t50VarValue, cls);
                z = true;
            }
        }
        jf jfVar = new jf(map);
        map2.put(cls, jfVar);
        this.b.put(cls, Boolean.valueOf(z));
        return jfVar;
    }
}
