package n0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static long f23523a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f23524b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f23525c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f23526d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f23527e;

    public static class a {
        @DoNotInline
        public static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        @DoNotInline
        public static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        @DoNotInline
        public static boolean c() {
            return Trace.isEnabled();
        }

        @DoNotInline
        public static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f23523a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f23524b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f23525c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f23526d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f23527e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
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

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f23524b.invoke(null, Long.valueOf(f23523a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
