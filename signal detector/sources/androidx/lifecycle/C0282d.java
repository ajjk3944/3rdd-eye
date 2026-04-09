package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0282d f5238c = new C0282d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5239a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5240b = new HashMap();

    public static void b(HashMap map, C0281c c0281c, EnumC0291m enumC0291m, Class cls) {
        EnumC0291m enumC0291m2 = (EnumC0291m) map.get(c0281c);
        if (enumC0291m2 == null || enumC0291m == enumC0291m2) {
            if (enumC0291m2 == null) {
                map.put(c0281c, enumC0291m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0281c.f5237b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0291m2 + ", new value " + enumC0291m);
    }

    public final C0280b a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f5239a;
        if (superclass != null) {
            C0280b c0280bA = (C0280b) map2.get(superclass);
            if (c0280bA == null) {
                c0280bA = a(superclass, null);
            }
            map.putAll(c0280bA.f5235b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0280b c0280bA2 = (C0280b) map2.get(cls2);
            if (c0280bA2 == null) {
                c0280bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0280bA2.f5235b.entrySet()) {
                b(map, (C0281c) entry.getKey(), (EnumC0291m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            F f2 = (F) method.getAnnotation(F.class);
            if (f2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0298u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0291m enumC0291mValue = f2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0291m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0291mValue != EnumC0291m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0281c(i, method), enumC0291mValue, cls);
                z6 = true;
            }
        }
        C0280b c0280b = new C0280b(map);
        map2.put(cls, c0280b);
        this.f5240b.put(cls, Boolean.valueOf(z6));
        return c0280b;
    }
}
