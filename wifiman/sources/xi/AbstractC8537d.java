package xi;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: xi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8537d {
    public static final boolean a(Throwable th2) {
        AbstractC6492s.i(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!AbstractC6492s.d(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        AbstractC6492s.i(e10, "e");
        throw e10;
    }
}
