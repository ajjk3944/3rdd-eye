package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fo1 extends Thread {
    public final BlockingQueue f;
    public final eo1 g;
    public final wo1 h;
    public volatile boolean i = false;
    public final f20 j;

    public fo1(PriorityBlockingQueue priorityBlockingQueue, vq2 vq2Var, wo1 wo1Var, f20 f20Var) {
        this.f = priorityBlockingQueue;
        this.g = vq2Var;
        this.h = wo1Var;
        this.j = f20Var;
    }

    public final void a() {
        f20 f20Var = this.j;
        jo1 jo1Var = (jo1) this.f.take();
        SystemClock.elapsedRealtime();
        jo1Var.c();
        try {
            try {
                jo1Var.a("network-queue-take");
                synchronized (jo1Var.j) {
                }
                TrafficStats.setThreadStatsTag(jo1Var.i);
                ho1 ho1VarC = this.g.c(jo1Var);
                jo1Var.a("network-http-complete");
                if (ho1VarC.e && jo1Var.g()) {
                    jo1Var.b("not-modified");
                    jo1Var.k();
                } else {
                    rl rlVarH = jo1Var.h(ho1VarC);
                    jo1Var.a("network-parse-complete");
                    ao1 ao1Var = (ao1) rlVarH.h;
                    if (ao1Var != null) {
                        this.h.b(jo1Var.d(), ao1Var);
                        jo1Var.a("network-cache-written");
                    }
                    synchronized (jo1Var.j) {
                        jo1Var.n = true;
                    }
                    f20Var.l(jo1Var, rlVarH, null);
                    jo1Var.j(rlVarH);
                }
            } catch (oo1 e) {
                SystemClock.elapsedRealtime();
                f20Var.getClass();
                jo1Var.a("post-error");
                ((vb1) f20Var.g).g.post(new gi(jo1Var, new rl(e), (Object) null, 11));
                jo1Var.k();
            } catch (Exception e2) {
                Log.e("Volley", ro1.c("Unhandled exception %s", e2.toString()), e2);
                oo1 oo1Var = new oo1(e2);
                SystemClock.elapsedRealtime();
                f20Var.getClass();
                jo1Var.a("post-error");
                ((vb1) f20Var.g).g.post(new gi(jo1Var, new rl(oo1Var), (Object) null, 11));
                jo1Var.k();
            }
            jo1Var.c();
        } catch (Throwable th) {
            jo1Var.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ro1.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
