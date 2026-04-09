package Q8;

import android.os.Handler;
import android.os.Looper;

/* compiled from: AndroidSchedulers.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11380a;

    /* compiled from: AndroidSchedulers.java */
    /* renamed from: Q8.a$a, reason: collision with other inner class name */
    public static final class C0148a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11381a = new b(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            b bVar = C0148a.f11381a;
            if (bVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f11380a = bVar;
        } catch (Throwable th) {
            int i = Y8.a.f13805a;
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw new RuntimeException(th);
            }
        }
    }
}
