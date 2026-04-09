package v2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.snmp4j.asn1.BER;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8187a {

    /* renamed from: a, reason: collision with root package name */
    private static long f63414a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f63415b;

    public static void a(String str) {
        AbstractC8188b.a(f(str));
    }

    public static void b() {
        AbstractC8188b.b();
    }

    private static void c(String str, Exception exc) {
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
        return Build.VERSION.SDK_INT >= 29 ? c.a() : e();
    }

    private static boolean e() {
        try {
            if (f63415b == null) {
                f63414a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f63415b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f63415b.invoke(null, Long.valueOf(f63414a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, BER.MAX_OID_LENGTH);
    }
}
