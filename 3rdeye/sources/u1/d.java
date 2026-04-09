package U1;

import C.T;
import H7.e;
import T1.r;
import T1.y;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* compiled from: TimeLimiter.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f12373a;

    /* renamed from: b, reason: collision with root package name */
    public final y f12374b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12375c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12376d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f12377e;

    public d(e runnableScheduler, y yVar) {
        l.f(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f12373a = runnableScheduler;
        this.f12374b = yVar;
        this.f12375c = millis;
        this.f12376d = new Object();
        this.f12377e = new LinkedHashMap();
    }

    public final void a(r token) {
        Runnable runnable;
        l.f(token, "token");
        synchronized (this.f12376d) {
            runnable = (Runnable) this.f12377e.remove(token);
        }
        if (runnable != null) {
            this.f12373a.a(runnable);
        }
    }

    public final void b(r rVar) {
        T t10 = new T(9, this, rVar);
        synchronized (this.f12376d) {
        }
        this.f12373a.g(t10, this.f12375c);
    }
}
