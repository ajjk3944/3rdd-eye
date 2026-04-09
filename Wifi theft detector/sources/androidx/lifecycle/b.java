package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static b f3485c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Map f3486a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f3487b = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f3488a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f3489b;

        public a(Map map) {
            this.f3489b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f3488a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f3488a.put(event, arrayList);
                }
                arrayList.add((C0032b) entry.getKey());
            }
        }

        public static void b(List list, n nVar, Lifecycle.Event event, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0032b) list.get(size)).a(nVar, event, obj);
                }
            }
        }

        public void a(n nVar, Lifecycle.Event event, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b((List) this.f3488a.get(event), nVar, event, obj);
            b((List) this.f3488a.get(Lifecycle.Event.ON_ANY), nVar, event, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    public static final class C0032b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3490a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f3491b;

        public C0032b(int i10, Method method) throws SecurityException {
            this.f3490a = i10;
            this.f3491b = method;
            method.setAccessible(true);
        }

        public void a(n nVar, Lifecycle.Event event, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i10 = this.f3490a;
                if (i10 == 0) {
                    this.f3491b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f3491b.invoke(obj, nVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f3491b.invoke(obj, nVar, event);
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
            if (!(obj instanceof C0032b)) {
                return false;
            }
            C0032b c0032b = (C0032b) obj;
            return this.f3490a == c0032b.f3490a && this.f3491b.getName().equals(c0032b.f3491b.getName());
        }

        public int hashCode() {
            return (this.f3490a * 31) + this.f3491b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f3489b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f3489b.entrySet()) {
                e(map, (C0032b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!n.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0032b(i10, method), eventValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f3486a.put(cls, aVar);
        this.f3487b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f3486a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f3487b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f3487b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, C0032b c0032b, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(c0032b);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(c0032b, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0032b.f3491b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }
}
