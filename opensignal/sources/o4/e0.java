package o4;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u.i0 f18791b = new u.i0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.d f18792a;

    public e0(androidx.fragment.app.d dVar) {
        this.f18792a = dVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        u.i0 i0Var = f18791b;
        u.i0 i0Var2 = (u.i0) i0Var.get(classLoader);
        if (i0Var2 == null) {
            i0Var2 = new u.i0(0);
            i0Var.put(classLoader, i0Var2);
        }
        Class cls = (Class) i0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        i0Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e10) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final androidx.fragment.app.b a(String str) {
        try {
            return (androidx.fragment.app.b) c(this.f18792a.f1456w.f18878r.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e10) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new bf.n(h0.b.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
