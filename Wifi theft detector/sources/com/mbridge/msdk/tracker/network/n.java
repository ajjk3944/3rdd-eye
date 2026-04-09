package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f18310a;

    /* renamed from: b, reason: collision with root package name */
    private final m f18311b;

    /* renamed from: c, reason: collision with root package name */
    private final b f18312c;

    /* renamed from: d, reason: collision with root package name */
    private final w f18313d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18314e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f18310a = blockingQueue;
        this.f18311b = mVar;
        this.f18312c = bVar;
        this.f18313d = wVar;
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                } catch (b0 e10) {
                    e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    a(tVar, e10);
                    tVar.x();
                }
            } catch (Exception e11) {
                c0.a(e11, "Unhandled exception %s", e11.toString());
                a0 a0Var = new a0(e11);
                a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f18313d.a(tVar, a0Var);
                tVar.x();
            }
            if (tVar.v()) {
                tVar.c("network-discard-cancelled");
                tVar.x();
                return;
            }
            if (tVar.y()) {
                a(tVar);
            }
            q qVarA = this.f18311b.a(tVar);
            tVar.a("network-http-complete");
            if (qVarA.f18345e && tVar.u()) {
                tVar.c("not-modified");
                tVar.x();
                return;
            }
            v<?> vVarA = tVar.a(qVarA);
            tVar.a("network-parse-complete");
            if (tVar.z() && vVarA.f18418b != null) {
                this.f18312c.a(tVar.e(), vVarA.f18418b);
                tVar.a("network-cache-written");
            }
            tVar.w();
            this.f18313d.a(tVar, vVarA);
            tVar.a(vVarA);
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f18314e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        b(this.f18310a.take());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f18313d.a(tVar, tVar.c(b0Var));
    }
}
