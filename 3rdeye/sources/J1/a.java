package J1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f2715a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2716b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2717c;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a();
        }
        try {
            if (f2716b == null) {
                f2715a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2716b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2716b.invoke(null, Long.valueOf(f2715a))).booleanValue();
        } catch (Exception e4) {
            a("isTagEnabled", e4);
            return false;
        }
    }

    public static void c(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(i, d(str));
            return;
        }
        String strD = d(str);
        try {
            if (f2717c == null) {
                f2717c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f2717c.invoke(null, Long.valueOf(f2715a), strD, Integer.valueOf(i));
        } catch (Exception e4) {
            a("traceCounter", e4);
        }
    }

    public static String d(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
