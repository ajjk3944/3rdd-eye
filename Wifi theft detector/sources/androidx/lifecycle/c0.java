package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3497a = z8.r.l(Application.class, z.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f3498b = z8.q.e(z.class);

    public static final Constructor c(Class modelClass, List signature) throws SecurityException {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        kotlin.jvm.internal.p.e(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.p.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.p.d(parameterTypes, "constructor.parameterTypes");
            List listR = z8.o.R(parameterTypes);
            if (kotlin.jvm.internal.p.a(signature, listR)) {
                kotlin.jvm.internal.p.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listR.size() && listR.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final e0 d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        kotlin.jvm.internal.p.e(constructor, "constructor");
        kotlin.jvm.internal.p.e(params, "params");
        try {
            return (e0) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
