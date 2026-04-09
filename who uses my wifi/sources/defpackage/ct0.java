package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ct0 {
    public static final List a = zf.j0(Application.class, qs0.class);
    public static final List b = zt0.o(qs0.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        i30.m(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        i30.m(constructors, "array");
        int i = 0;
        while (true) {
            if (!(i < constructors.length)) {
                return null;
            }
            int i2 = i + 1;
            try {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                i30.l(parameterTypes, "getParameterTypes(...)");
                int length = parameterTypes.length;
                List arrayList = length != 0 ? length != 1 ? new ArrayList(new k8(parameterTypes)) : zt0.o(parameterTypes[0]) : ns.f;
                if (list.equals(arrayList)) {
                    return constructor;
                }
                if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    public static final m61 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (m61) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
