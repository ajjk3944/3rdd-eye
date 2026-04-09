package Y2;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f4385a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final y f4386b = new y();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
