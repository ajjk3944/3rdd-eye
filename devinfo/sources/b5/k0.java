package b5;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x.n0 f1829b = new x.n0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f1830a;

    public k0(u0 u0Var) {
        this.f1830a = u0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        x.n0 n0Var = f1829b;
        x.n0 n0Var2 = (x.n0) n0Var.get(classLoader);
        if (n0Var2 == null) {
            n0Var2 = new x.n0(0);
            n0Var.put(classLoader, n0Var2);
        }
        Class cls = (Class) n0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        n0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e10) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final z a(String str) {
        try {
            return (z) c(this.f1830a.f1898x.f1766b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e10) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new ac.m(d.h.t("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
