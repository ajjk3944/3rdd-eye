package androidx.lifecycle;

import android.app.Application;
import d5.AbstractC2283k;
import d5.C2279g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5223a = AbstractC2283k.M(Application.class, N.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f5224b = a4.p.l(N.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        q5.i.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        q5.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            q5.i.d(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new C2279g(parameterTypes, false)) : a4.p.l(parameterTypes[0]) : d5.s.f19824a;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final X b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (X) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
