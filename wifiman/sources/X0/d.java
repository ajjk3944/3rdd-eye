package X0;

import f.AbstractC5487d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;
import lh.C6597b;

/* loaded from: classes.dex */
public abstract class d {
    public static final Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            c.f24009a.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    public static final Object[] b(Class cls, int i10) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i11 = 0;
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            boolean z10 = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i11 < length) {
                    Constructor<?> constructor2 = constructors[i11];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        constructor = constructor2;
                    }
                    i11++;
                } else if (!z10) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            AbstractC6492s.g(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            AbstractC5487d.a(objNewInstance);
            if (i10 < 0) {
                throw null;
            }
            throw null;
        } catch (C6597b unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
