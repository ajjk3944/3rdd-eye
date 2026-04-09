package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sw {
    public static final bw0 b = new bw0(0);
    public final /* synthetic */ xw a;

    public sw(xw xwVar) {
        this.a = xwVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        bw0 bw0Var = b;
        bw0 bw0Var2 = (bw0) bw0Var.get(classLoader);
        if (bw0Var2 == null) {
            bw0Var2 = new bw0(0);
            bw0Var.put(classLoader, bw0Var2);
        }
        Class cls = (Class) bw0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        bw0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final iw a(String str) {
        try {
            return (iw) c(this.a.t.x.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new rg(ex0.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
