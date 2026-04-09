package i6;

import android.os.Trace;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i4, String str) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(int i4, String str) {
        Trace.endAsyncSection(str, i4);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
