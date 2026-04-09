package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4005c {

    /* renamed from: c, reason: collision with root package name */
    static C4005c f31643c = new C4005c();

    /* renamed from: a, reason: collision with root package name */
    private final Map f31644a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f31645b = new HashMap();

    /* renamed from: androidx.lifecycle.c$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f31646a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f31647b;

        a(Map map) {
            this.f31647b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC4013k.a aVar = (AbstractC4013k.a) entry.getValue();
                List arrayList = (List) this.f31646a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f31646a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC4017o, aVar, obj);
                }
            }
        }

        void a(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b((List) this.f31646a.get(aVar), interfaceC4017o, aVar, obj);
            b((List) this.f31646a.get(AbstractC4013k.a.ON_ANY), interfaceC4017o, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f31648a;

        /* renamed from: b, reason: collision with root package name */
        final Method f31649b;

        b(int i10, Method method) throws SecurityException {
            this.f31648a = i10;
            this.f31649b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i10 = this.f31648a;
                if (i10 == 0) {
                    this.f31649b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f31649b.invoke(obj, interfaceC4017o);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f31649b.invoke(obj, interfaceC4017o, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31648a == bVar.f31648a && this.f31649b.getName().equals(bVar.f31649b.getName());
        }

        public int hashCode() {
            return (this.f31648a * 31) + this.f31649b.getName().hashCode();
        }
    }

    C4005c() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f31647b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f31647b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC4013k.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            w wVar = (w) method.getAnnotation(w.class);
            if (wVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC4017o.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC4013k.a aVarValue = wVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC4013k.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC4013k.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f31644a.put(cls, aVar);
        this.f31645b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, AbstractC4013k.a aVar, Class cls) {
        AbstractC4013k.a aVar2 = (AbstractC4013k.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f31649b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f31644a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f31645b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((w) method.getAnnotation(w.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f31645b.put(cls, Boolean.FALSE);
        return false;
    }
}
