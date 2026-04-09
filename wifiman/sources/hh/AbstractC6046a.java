package hh;

import gh.AbstractC5916a;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: hh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6046a extends AbstractC5916a {

    /* renamed from: hh.a$a, reason: collision with other inner class name */
    private static final class C1806a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1806a f48749a = new C1806a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f48750b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f48750b = num;
        }

        private C1806a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1806a.f48750b;
        return num == null || num.intValue() >= i10;
    }

    @Override // gh.AbstractC5916a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(cause, "cause");
        AbstractC6492s.i(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
