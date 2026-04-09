package io.sentry.backpressure;

import io.sentry.b5;
import io.sentry.e1;
import io.sentry.q;
import io.sentry.v3;
import io.sentry.x5;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class a implements b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12085a;

    /* renamed from: d, reason: collision with root package name */
    public final v3 f12086d;

    /* renamed from: g, reason: collision with root package name */
    public int f12087g;

    /* renamed from: r, reason: collision with root package name */
    public volatile Future f12088r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.util.a f12089x;

    public a(x5 x5Var) {
        v3 v3Var = v3.f12830a;
        this.f12087g = 0;
        this.f12088r = null;
        this.f12089x = new io.sentry.util.a();
        this.f12085a = x5Var;
        this.f12086d = v3Var;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.f12087g;
    }

    public final void b(int i10) {
        e1 executorService = this.f12085a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        q qVarA = this.f12089x.a();
        try {
            try {
                this.f12088r = executorService.q(this, i10);
            } catch (RejectedExecutionException e4) {
                this.f12085a.getLogger().g(b5.WARNING, "Backpressure monitor reschedule task rejected", e4);
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.f12088r;
        if (future != null) {
            q qVarA = this.f12089x.a();
            try {
                future.cancel(true);
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE = this.f12086d.e();
        x5 x5Var = this.f12085a;
        if (zE) {
            if (this.f12087g > 0) {
                x5Var.getLogger().m(b5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f12087g = 0;
        } else {
            int i10 = this.f12087g;
            if (i10 < 10) {
                this.f12087g = i10 + 1;
                x5Var.getLogger().m(b5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f12087g));
            }
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
