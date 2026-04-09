package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class jc1 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f29103b;

    /* renamed from: c, reason: collision with root package name */
    private final ic1 f29104c;

    /* renamed from: d, reason: collision with root package name */
    private final nm f29105d;

    /* renamed from: e, reason: collision with root package name */
    private final zq1 f29106e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f29107f = false;

    public jc1(PriorityBlockingQueue priorityBlockingQueue, ic1 ic1Var, nm nmVar, zq1 zq1Var) {
        this.f29103b = priorityBlockingQueue;
        this.f29104c = ic1Var;
        this.f29105d = nmVar;
        this.f29106e = zq1Var;
    }

    private void a() throws InterruptedException {
        op1<?> op1VarTake = this.f29103b.take();
        SystemClock.elapsedRealtime();
        op1VarTake.a(3);
        try {
            try {
                op1VarTake.a("network-queue-take");
                if (op1VarTake.n()) {
                    op1VarTake.c("network-discard-cancelled");
                    op1VarTake.p();
                } else {
                    TrafficStats.setThreadStatsTag(op1VarTake.k());
                    nc1 nc1VarA = this.f29104c.a(op1VarTake);
                    op1VarTake.a("network-http-complete");
                    if (nc1VarA.f30839e && op1VarTake.m()) {
                        op1VarTake.c("not-modified");
                        op1VarTake.p();
                    } else {
                        rq1<?> rq1VarA = op1VarTake.a(nc1VarA);
                        op1VarTake.a("network-parse-complete");
                        if (op1VarTake.t() && rq1VarA.f32764b != null) {
                            this.f29105d.a(op1VarTake.d(), rq1VarA.f32764b);
                            op1VarTake.a("network-cache-written");
                        }
                        op1VarTake.o();
                        ((c60) this.f29106e).a(op1VarTake, rq1VarA, null);
                        op1VarTake.a(rq1VarA);
                    }
                }
            } catch (fi2 e4) {
                SystemClock.elapsedRealtime();
                ((c60) this.f29106e).a(op1VarTake, op1VarTake.b(e4));
                op1VarTake.p();
            } catch (Exception e10) {
                e10.toString();
                boolean z10 = gi2.f27765a;
                int i = fp0.f27419b;
                fi2 fi2Var = new fi2((Throwable) e10);
                SystemClock.elapsedRealtime();
                ((c60) this.f29106e).a(op1VarTake, fi2Var);
                op1VarTake.p();
            }
            op1VarTake.a(4);
        } catch (Throwable th) {
            op1VarTake.a(4);
            throw th;
        }
    }

    public final void b() {
        this.f29107f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f29107f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z10 = gi2.f27765a;
                    fp0.b(new Object[0]);
                }
            } catch (Throwable unused2) {
                boolean z11 = gi2.f27765a;
                fp0.b(new Object[0]);
                return;
            }
        }
    }
}
