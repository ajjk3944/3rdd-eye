package p;

import android.os.Looper;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2767b extends I5.b {

    /* renamed from: j, reason: collision with root package name */
    public static volatile C2767b f22729j;

    /* renamed from: k, reason: collision with root package name */
    public static final ExecutorC2766a f22730k = new ExecutorC2766a(0);
    public final C2768c i = new C2768c();

    public static C2767b F() {
        if (f22729j != null) {
            return f22729j;
        }
        synchronized (C2767b.class) {
            try {
                if (f22729j == null) {
                    f22729j = new C2767b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f22729j;
    }

    public final void G(Runnable runnable) {
        C2768c c2768c = this.i;
        if (c2768c.f22732k == null) {
            synchronized (c2768c.i) {
                try {
                    if (c2768c.f22732k == null) {
                        c2768c.f22732k = C2768c.F(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c2768c.f22732k.post(runnable);
    }
}
