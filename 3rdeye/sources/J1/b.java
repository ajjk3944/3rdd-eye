package J1;

import android.os.Trace;

/* compiled from: TraceApi29Impl.java */
/* loaded from: classes.dex */
public final class b {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static void b(int i, String str) {
        Trace.setCounter(str, i);
    }
}
