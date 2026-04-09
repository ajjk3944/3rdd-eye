package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1115a = cm.g.t(Application.class, v0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f1116b = cm.g.s(v0.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        nk.k.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        nk.k.d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            nk.k.d(parameterTypes, "getParameterTypes(...)");
            List listE0 = zj.m.e0(parameterTypes);
            if (list.equals(listE0)) {
                return constructor;
            }
            if (list.size() == listE0.size() && listE0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final e1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (e1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
