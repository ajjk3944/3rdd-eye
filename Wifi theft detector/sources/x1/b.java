package x1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static long f24872a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f24873b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f24873b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        try {
            if (f24873b == null) {
                f24872a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f24873b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f24873b.invoke(null, Long.valueOf(f24872a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }
}
