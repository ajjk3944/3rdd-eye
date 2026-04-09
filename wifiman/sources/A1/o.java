package A1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static long f229a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f230b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f231c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f232d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f233e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f229a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f230b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f231c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f232d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f233e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
