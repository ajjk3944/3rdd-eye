package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f6176a;

    /* renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    public static class C0000a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f6177a;

        /* renamed from: b, reason: collision with root package name */
        public final T f6178b;
    }

    static {
        HashMap map = new HashMap();
        f6176a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        map.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        map.put(cls, cls);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        map.put(cls5, cls5);
        map.put(cls6, cls6);
        map.put(cls7, cls7);
        map.put(cls8, cls8);
    }

    public static <T> T a(String str, String str2, Object... objArr) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?>[] parameterTypes;
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                clsArr[i] = (obj == null || !(obj instanceof C0000a)) ? obj == null ? null : obj.getClass() : ((C0000a) obj).f6177a;
            }
            while (true) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (method.getName().equals(str2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
                        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
                            if (!parameterTypes[i6].isAssignableFrom(clsArr[i6])) {
                                Map<Class<?>, Class<?>> map = f6176a;
                                if (map.containsKey(parameterTypes[i6]) && map.get(parameterTypes[i6]).equals(map.get(clsArr[i6]))) {
                                }
                            }
                        }
                        break;
                    }
                    i3++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i7 = 0; i7 < 4; i7++) {
                        Object obj2 = objArr[i7];
                        if (obj2 == null || !(obj2 instanceof C0000a)) {
                            objArr2[i7] = obj2;
                        } else {
                            objArr2[i7] = ((C0000a) obj2).f6178b;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
                if (cls.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                cls = cls.getSuperclass();
            }
        } catch (Exception e6) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e6);
            return null;
        }
    }
}
