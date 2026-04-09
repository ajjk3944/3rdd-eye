package d2;

import androidx.lifecycle.N;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5285d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5285d f45722a = new C5285d();

    private C5285d() {
    }

    public final N a(Class modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            AbstractC6492s.h(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (N) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}
