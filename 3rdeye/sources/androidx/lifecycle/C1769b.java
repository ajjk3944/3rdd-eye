package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1769b f16125c = new C1769b();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16126a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16127b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f16128a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f16129b;

        public a(HashMap map) {
            this.f16129b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1781n.a aVar = (AbstractC1781n.a) entry.getValue();
                List arrayList = (List) this.f16128a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f16128a.put(aVar, arrayList);
                }
                arrayList.add((C0244b) entry.getKey());
            }
        }

        public static void a(List list, InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar, InterfaceC1789w interfaceC1789w) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0244b c0244b = (C0244b) list.get(size);
                    c0244b.getClass();
                    try {
                        int i = c0244b.f16130a;
                        Method method = c0244b.f16131b;
                        if (i == 0) {
                            method.invoke(interfaceC1789w, new Object[0]);
                        } else if (i == 1) {
                            method.invoke(interfaceC1789w, interfaceC1790x);
                        } else if (i == 2) {
                            method.invoke(interfaceC1789w, interfaceC1790x, aVar);
                        }
                    } catch (IllegalAccessException e4) {
                        throw new RuntimeException(e4);
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    public static final class C0244b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16130a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f16131b;

        public C0244b(int i, Method method) throws SecurityException {
            this.f16130a = i;
            this.f16131b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0244b)) {
                return false;
            }
            C0244b c0244b = (C0244b) obj;
            return this.f16130a == c0244b.f16130a && this.f16131b.getName().equals(c0244b.f16131b.getName());
        }

        public final int hashCode() {
            return this.f16131b.getName().hashCode() + (this.f16130a * 31);
        }
    }

    public static void b(HashMap map, C0244b c0244b, AbstractC1781n.a aVar, Class cls) {
        AbstractC1781n.a aVar2 = (AbstractC1781n.a) map.get(c0244b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0244b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0244b.f16131b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public final a a(Class<?> cls, Method[] methodArr) throws SecurityException {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f16126a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f16129b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : aVarA2.f16129b.entrySet()) {
                b(map, (C0244b) entry.getKey(), (AbstractC1781n.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            G g10 = (G) method.getAnnotation(G.class);
            if (g10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1790x.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC1781n.a aVarValue = g10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1781n.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1781n.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0244b(i, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f16127b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }
}
