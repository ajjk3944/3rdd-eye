package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6492s {

    /* renamed from: kotlin.jvm.internal.s$a */
    public static class a {
    }

    public static boolean a(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean c(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 != null) {
                return false;
            }
        } else if (f11 == null || f10.floatValue() != f11.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) n(new IllegalStateException(str + " must not be null")));
    }

    public static void f(Object obj) {
        if (obj == null) {
            q();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) n(new NullPointerException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static int k(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int l(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC6492s.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable n(Throwable th2) {
        return o(th2, AbstractC6492s.class.getName());
    }

    static Throwable o(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th2;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        throw ((NullPointerException) n(new NullPointerException()));
    }

    public static void r(String str) {
        throw ((NullPointerException) n(new NullPointerException(str)));
    }

    private static void s(String str) {
        throw ((IllegalArgumentException) n(new IllegalArgumentException(m(str))));
    }

    private static void t(String str) {
        throw ((NullPointerException) n(new NullPointerException(m(str))));
    }

    public static void u(String str) {
        throw ((UninitializedPropertyAccessException) n(new UninitializedPropertyAccessException(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
