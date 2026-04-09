package io.sentry.logger;

import androidx.lifecycle.f0;
import b4.e;
import g1.f;
import i.g0;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.e5;
import io.sentry.transport.q;
import io.sentry.x5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kg.r;

/* loaded from: classes.dex */
public final class c implements b {
    public static final io.sentry.util.a D = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12425a;

    /* renamed from: d, reason: collision with root package name */
    public final f f12426d;

    /* renamed from: r, reason: collision with root package name */
    public final r f12428r;

    /* renamed from: x, reason: collision with root package name */
    public volatile Future f12429x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f12430y = false;
    public final g0 B = new g0(7);

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f12427g = new ConcurrentLinkedQueue();

    public c(x5 x5Var, f fVar) {
        this.f12425a = x5Var;
        this.f12426d = fVar;
        this.f12428r = new r(x5Var);
    }

    @Override // io.sentry.logger.b
    public final void a(boolean z10) {
        r rVar = this.f12428r;
        if (z10) {
            e(true, true);
            rVar.submit(new f0(28, this));
        } else {
            rVar.d(this.f12425a.getShutdownTimeoutMillis());
            while (!this.f12427g.isEmpty()) {
                d();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void b(d5 d5Var) {
        q.b((q) this.B.f11051a);
        this.f12427g.offer(d5Var);
        e(false, false);
    }

    @Override // io.sentry.logger.b
    public final void c(long j) throws InterruptedException {
        e(true, true);
        try {
            g0 g0Var = this.B;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            g0Var.getClass();
            ((q) g0Var.f11051a).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e4) {
            this.f12425a.getLogger().g(b5.ERROR, "Failed to flush log events", e4);
            Thread.currentThread().interrupt();
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f12427g;
            d5 d5Var = (d5) concurrentLinkedQueue.poll();
            if (d5Var != null) {
                arrayList.add(d5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        e5 e5Var = new e5(i10, arrayList);
        f fVar = this.f12426d;
        fVar.getClass();
        try {
            fVar.C(fVar.s(e5Var), null);
        } catch (IOException e4) {
            ((x5) fVar.f9209d).getLogger().f(b5.WARNING, e4, "Capturing log failed.", new Object[0]);
        }
        while (i10 < arrayList.size()) {
            q qVar = (q) this.B.f11051a;
            int i11 = q.f12781a;
            qVar.releaseShared(1);
            i10++;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.f12430y || z10) {
            io.sentry.q qVarA = D.a();
            try {
                Future future = this.f12429x;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.f12430y = true;
                    try {
                        this.f12429x = this.f12428r.q(new e(18, this), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e4) {
                        this.f12430y = false;
                        this.f12425a.getLogger().g(b5.WARNING, "Logs batch processor flush task rejected", e4);
                    }
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
    }
}
