package jf;

import android.util.Log;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f13706d = new c();

    /* renamed from: a, reason: collision with root package name */
    public final b f13707a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13708b;

    /* renamed from: c, reason: collision with root package name */
    public final b f13709c;

    public d(ExecutorService executorService, ExecutorService executorService2) {
        l.e(executorService, "backgroundExecutorService");
        l.e(executorService2, "blockingExecutorService");
        this.f13707a = new b(executorService);
        this.f13708b = new b(executorService);
        e5.u(null);
        this.f13709c = new b(executorService2);
    }

    public static final void a() {
        if (((Boolean) new bp.a(0, f13706d, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 28).c()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public static final void b() {
        if (((Boolean) new bp.a(0, f13706d, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 29).c()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
