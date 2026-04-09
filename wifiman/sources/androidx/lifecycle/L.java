package androidx.lifecycle;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final List f31619a = AbstractC3689v.o(Application.class, E.class);

    /* renamed from: b, reason: collision with root package name */
    private static final List f31620b = AbstractC3689v.e(E.class);

    public static final Constructor c(Class modelClass, List signature) throws SecurityException {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        AbstractC6492s.h(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC6492s.h(parameterTypes, "constructor.parameterTypes");
            List listD1 = AbstractC3682n.d1(parameterTypes);
            if (AbstractC6492s.d(signature, listD1)) {
                AbstractC6492s.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listD1.size() && listD1.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final N d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(constructor, "constructor");
        AbstractC6492s.i(params, "params");
        try {
            return (N) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
