package g9;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a extends f9.a {

    /* renamed from: g9.a$a, reason: collision with other inner class name */
    public static final class C0404a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0404a f21246a = new C0404a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f21247b;

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
            f21247b = num;
        }
    }

    private final boolean c(int i10) {
        Integer num = C0404a.f21247b;
        return num == null || num.intValue() >= i10;
    }

    @Override // f9.a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p.e(cause, "cause");
        p.e(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
