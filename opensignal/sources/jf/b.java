package jf;

import com.google.android.gms.internal.measurement.e5;
import dd.r;
import io.sentry.android.replay.capture.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13703a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13704d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public r f13705g = e5.u(null);

    public b(ExecutorService executorService) {
        this.f13703a = executorService;
    }

    public final r a(Runnable runnable) {
        r rVarF;
        synchronized (this.f13704d) {
            rVarF = this.f13705g.f(this.f13703a, new e(9, runnable));
            this.f13705g = rVarF;
        }
        return rVarF;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13703a.execute(runnable);
    }
}
