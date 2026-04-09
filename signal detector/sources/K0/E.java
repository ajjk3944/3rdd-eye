package k0;

import java.lang.reflect.InvocationTargetException;
import u.C2940i;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C2940i f21479b = new C2940i(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f21480a;

    public E(K k6) {
        this.f21480a = k6;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C2940i c2940i = f21479b;
        C2940i c2940i2 = (C2940i) c2940i.get(classLoader);
        if (c2940i2 == null) {
            c2940i2 = new C2940i(0);
            c2940i.put(classLoader, c2940i2);
        }
        Class cls = (Class) c2940i2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2940i2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e6) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e7) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final AbstractComponentCallbacksC2617v a(String str) {
        try {
            return (AbstractComponentCallbacksC2617v) c(this.f21480a.f21522u.f21726j.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e6) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e7) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new J0.c(A.f.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }
}
