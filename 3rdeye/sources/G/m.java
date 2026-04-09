package G;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MainThreadAsyncHandler.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Handler f1842a;

    public static Handler a() {
        if (f1842a != null) {
            return f1842a;
        }
        synchronized (m.class) {
            try {
                if (f1842a == null) {
                    f1842a = G0.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1842a;
    }
}
