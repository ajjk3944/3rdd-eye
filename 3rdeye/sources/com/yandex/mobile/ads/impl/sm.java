package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.nm;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes3.dex */
public final class sm extends Thread {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f33116h = gi2.f27765a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f33117b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f33118c;

    /* renamed from: d, reason: collision with root package name */
    private final nm f33119d;

    /* renamed from: e, reason: collision with root package name */
    private final zq1 f33120e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f33121f = false;

    /* renamed from: g, reason: collision with root package name */
    private final ui2 f33122g;

    public sm(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, nm nmVar, zq1 zq1Var) {
        this.f33117b = priorityBlockingQueue;
        this.f33118c = priorityBlockingQueue2;
        this.f33119d = nmVar;
        this.f33120e = zq1Var;
        this.f33122g = new ui2(this, priorityBlockingQueue2, zq1Var);
    }

    public final void b() {
        this.f33121f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f33116h) {
            fp0.e(new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f33119d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f33121f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                fp0.b(new Object[0]);
            } catch (Throwable unused2) {
                fp0.b(new Object[0]);
                return;
            }
        }
    }

    private void a() throws InterruptedException {
        op1<?> op1VarTake = this.f33117b.take();
        op1VarTake.a("cache-queue-take");
        op1VarTake.a(1);
        try {
            if (op1VarTake.n()) {
                op1VarTake.c("cache-discard-canceled");
            } else {
                nm.a aVar = this.f33119d.get(op1VarTake.d());
                if (aVar == null) {
                    op1VarTake.a("cache-miss");
                    if (!this.f33122g.a(op1VarTake)) {
                        this.f33118c.put(op1VarTake);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (aVar.f30933e < jCurrentTimeMillis) {
                        op1VarTake.a("cache-hit-expired");
                        op1VarTake.a(aVar);
                        if (!this.f33122g.a(op1VarTake)) {
                            this.f33118c.put(op1VarTake);
                        }
                    } else {
                        op1VarTake.a("cache-hit");
                        rq1<?> rq1VarA = op1VarTake.a(new nc1(200, aVar.f30929a, aVar.f30935g, false));
                        op1VarTake.a("cache-hit-parsed");
                        if (rq1VarA.f32765c != null) {
                            op1VarTake.a("cache-parsing-failed");
                            this.f33119d.a(op1VarTake.d());
                            op1VarTake.a((nm.a) null);
                            if (!this.f33122g.a(op1VarTake)) {
                                this.f33118c.put(op1VarTake);
                            }
                        } else if (aVar.f30934f < jCurrentTimeMillis) {
                            op1VarTake.a("cache-hit-refresh-needed");
                            op1VarTake.a(aVar);
                            rq1VarA.f32766d = true;
                            if (this.f33122g.a(op1VarTake)) {
                                ((c60) this.f33120e).a(op1VarTake, rq1VarA, null);
                            } else {
                                ((c60) this.f33120e).a(op1VarTake, rq1VarA, new rm(this, op1VarTake));
                            }
                        } else {
                            ((c60) this.f33120e).a(op1VarTake, rq1VarA, null);
                        }
                    }
                }
            }
            op1VarTake.a(2);
        } catch (Throwable th) {
            op1VarTake.a(2);
            throw th;
        }
    }
}
