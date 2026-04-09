package androidx.fragment.app;

import N7.C1154e9;
import androidx.fragment.app.ComponentCallbacksC1759l;
import m0.C5316i;

/* compiled from: FragmentFactory.java */
/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1765s {

    /* renamed from: a, reason: collision with root package name */
    public static final C5316i<ClassLoader, C5316i<String, Class<?>>> f15950a = new C5316i<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C5316i<ClassLoader, C5316i<String, Class<?>>> c5316i = f15950a;
        C5316i<String, Class<?>> c5316i2 = c5316i.get(classLoader);
        if (c5316i2 == null) {
            c5316i2 = new C5316i<>();
            c5316i.put(classLoader, c5316i2);
        }
        Class<?> cls = c5316i2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c5316i2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends ComponentCallbacksC1759l> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e4) {
            throw new ComponentCallbacksC1759l.C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e10) {
            throw new ComponentCallbacksC1759l.C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public ComponentCallbacksC1759l a(String str) {
        throw null;
    }
}
