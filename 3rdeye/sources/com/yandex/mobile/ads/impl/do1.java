package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class do1 {

    public static final class a {
        private a() {
        }

        public static final Class[] a(Object... objArr) {
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Class<?> cls = obj != null ? obj.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return (Class[]) arrayList.toArray(new Class[0]);
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static Object a(Object obj, Class clazz, String methodName, Class[] argumentsTypes, Object... arguments) {
            kotlin.jvm.internal.l.f(clazz, "clazz");
            kotlin.jvm.internal.l.f(methodName, "methodName");
            kotlin.jvm.internal.l.f(argumentsTypes, "argumentsTypes");
            kotlin.jvm.internal.l.f(arguments, "arguments");
            Object objInvoke = null;
            try {
                Method methodA = a(clazz, methodName, argumentsTypes);
                if (methodA == null) {
                    return null;
                }
                methodA.setAccessible(true);
                objInvoke = methodA.invoke(obj, Arrays.copyOf(arguments, arguments.length));
                methodA.setAccessible(false);
                return objInvoke;
            } catch (Throwable unused) {
                int i = fp0.f27419b;
                return objInvoke;
            }
        }

        public static Object a(Object obj, String methodName, Object... arguments) {
            kotlin.jvm.internal.l.f(obj, "obj");
            kotlin.jvm.internal.l.f(methodName, "methodName");
            kotlin.jvm.internal.l.f(arguments, "arguments");
            Object[] objArrCopyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList();
            int length = objArrCopyOf.length;
            for (int i = 0; i < length; i++) {
                Object obj2 = objArrCopyOf[i];
                Class<?> cls = obj2 != null ? obj2.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return a(obj, obj.getClass(), methodName, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(arguments, arguments.length));
        }

        private static Method a(Class cls, String str, Class[] clsArr) throws SecurityException {
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                kotlin.jvm.internal.l.c(declaredMethods);
                for (Method method : declaredMethods) {
                    kotlin.jvm.internal.l.c(method);
                    Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                    if (kotlin.jvm.internal.l.b(str, method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == clsArr2.length) {
                            int length = parameterTypes.length;
                            for (int i = 0; i < length; i++) {
                                if (!parameterTypes[i].isAssignableFrom(clsArr2[i])) {
                                    break;
                                }
                            }
                            return method;
                        }
                        continue;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }

        public static Object a(String className, Object... arguments) throws Throwable {
            kotlin.jvm.internal.l.f(className, "className");
            kotlin.jvm.internal.l.f(arguments, "arguments");
            Class<?> cls = Class.forName(className);
            Object[] objArrCopyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList(objArrCopyOf.length);
            for (Object obj : objArrCopyOf) {
                arrayList.add(obj.getClass());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                boolean zIsAccessible = declaredConstructor.isAccessible();
                if (!zIsAccessible) {
                    declaredConstructor.setAccessible(true);
                }
                Object objNewInstance = declaredConstructor.newInstance(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                if (!zIsAccessible) {
                    declaredConstructor.setAccessible(false);
                }
                return objNewInstance;
            } catch (Throwable unused) {
                Arrays.toString(objArrCopyOf);
                int i = fp0.f27419b;
                return null;
            }
        }
    }

    public static Object a(Class clazz, String methodName, Object... arguments) {
        kotlin.jvm.internal.l.f(clazz, "clazz");
        kotlin.jvm.internal.l.f(methodName, "methodName");
        kotlin.jvm.internal.l.f(arguments, "arguments");
        return a.a(null, clazz, methodName, a.a(Arrays.copyOf(arguments, arguments.length)), Arrays.copyOf(arguments, arguments.length));
    }
}
