package w;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f3354a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f3355b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f3356c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f3357d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f3358e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 18 || i2 >= 29) {
            return;
        }
        try {
            f3354a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f3355b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f3356c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f3357d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f3358e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
