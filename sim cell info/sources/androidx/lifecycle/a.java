package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    static a f1812c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class, C0013a> f1813a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class, Boolean> f1814b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0013a {

        /* renamed from: a, reason: collision with root package name */
        final Map<d.a, List<b>> f1815a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, d.a> f1816b;

        C0013a(Map<b, d.a> map) {
            this.f1816b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> arrayList = this.f1815a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f1815a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        void a(g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.f1815a.get(aVar), gVar, aVar, obj);
            b(this.f1815a.get(d.a.ON_ANY), gVar, aVar, obj);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f1817a;

        /* renamed from: b, reason: collision with root package name */
        final Method f1818b;

        b(int i2, Method method) {
            this.f1817a = i2;
            this.f1818b = method;
            method.setAccessible(true);
        }

        void a(g gVar, d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i2 = this.f1817a;
                if (i2 == 0) {
                    this.f1818b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f1818b.invoke(obj, gVar);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f1818b.invoke(obj, gVar, aVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1817a == bVar.f1817a && this.f1818b.getName().equals(bVar.f1818b.getName());
        }

        public int hashCode() {
            return (this.f1817a * 31) + this.f1818b.getName().hashCode();
        }
    }

    a() {
    }

    private C0013a a(Class cls, Method[] methodArr) {
        int i2;
        C0013a c0013aC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0013aC = c(superclass)) != null) {
            map.putAll(c0013aC.f1816b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : c(cls2).f1816b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                d.a aVarValue = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i2, method), aVarValue, cls);
                z2 = true;
            }
        }
        C0013a c0013a = new C0013a(map);
        this.f1813a.put(cls, c0013a);
        this.f1814b.put(cls, Boolean.valueOf(z2));
        return c0013a;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1818b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    C0013a c(Class cls) {
        C0013a c0013a = this.f1813a.get(cls);
        return c0013a != null ? c0013a : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = this.f1814b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f1814b.put(cls, Boolean.FALSE);
        return false;
    }
}
