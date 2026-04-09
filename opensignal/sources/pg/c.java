package pg;

import com.google.android.gms.internal.measurement.e5;
import dd.r;
import io.sentry.n4;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.q;
import p.l2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f20492d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final e7.d f20493e = new e7.d(0);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20494a;

    /* renamed from: b, reason: collision with root package name */
    public final n f20495b;

    /* renamed from: c, reason: collision with root package name */
    public r f20496c = null;

    public c(Executor executor, n nVar) {
        this.f20494a = executor;
        this.f20495b = nVar;
    }

    public static Object a(r rVar) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        l2 l2Var = new l2(2);
        Executor executor = f20493e;
        rVar.d(executor, l2Var);
        rVar.c(executor, l2Var);
        rVar.a(executor, l2Var);
        if (!((CountDownLatch) l2Var.f20100d).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (rVar.j()) {
            return rVar.h();
        }
        throw new ExecutionException(rVar.g());
    }

    public final synchronized r b() {
        try {
            r rVar = this.f20496c;
            if (rVar == null || (rVar.i() && !this.f20496c.j())) {
                this.f20496c = e5.n(this.f20494a, new hf.n(3, this.f20495b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20496c;
    }

    public final d c() {
        synchronized (this) {
            try {
                r rVar = this.f20496c;
                if (rVar != null && rVar.j()) {
                    return (d) this.f20496c.h();
                }
                try {
                    r rVarB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (d) a(rVarB);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r d(d dVar) {
        n4 n4Var = new n4(this, 8, dVar);
        Executor executor = this.f20494a;
        return e5.n(executor, n4Var).k(executor, new q(this, 3, dVar));
    }
}
