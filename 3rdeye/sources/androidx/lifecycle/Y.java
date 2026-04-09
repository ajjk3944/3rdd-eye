package androidx.lifecycle;

import N7.H7;
import android.app.Application;
import c9.C2091l;
import c9.C2092m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f16115a = C2092m.W(Application.class, Q.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f16116b = E.u.G(Q.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> signature) throws SecurityException {
        kotlin.jvm.internal.l.f(signature, "signature");
        Object[] constructors = cls.getConstructors();
        kotlin.jvm.internal.l.e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.e(parameterTypes, "constructor.parameterTypes");
            List listT = C2091l.t(parameterTypes);
            if (signature.equals(listT)) {
                return constructor;
            }
            if (signature.size() == listT.size() && listT.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends b0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(H7.o(cls, "Failed to access "), e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(H7.o(cls, "An exception happened in constructor of "), e11.getCause());
        }
    }
}
