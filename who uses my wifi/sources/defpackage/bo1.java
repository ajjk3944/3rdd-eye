package defpackage;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bo1 extends Thread {
    public static final boolean l = ro1.a;
    public final BlockingQueue f;
    public final BlockingQueue g;
    public final wo1 h;
    public volatile boolean i = false;
    public final mc2 j;
    public final f20 k;

    public bo1(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, wo1 wo1Var, f20 f20Var) {
        this.f = priorityBlockingQueue;
        this.g = priorityBlockingQueue2;
        this.h = wo1Var;
        this.k = f20Var;
        this.j = new mc2(this, priorityBlockingQueue2, f20Var);
    }

    public final void a() {
        jo1 jo1Var = (jo1) this.f.take();
        jo1Var.a("cache-queue-take");
        jo1Var.c();
        try {
            synchronized (jo1Var.j) {
            }
            wo1 wo1Var = this.h;
            ao1 ao1VarA = wo1Var.a(jo1Var.d());
            if (ao1VarA == null) {
                jo1Var.a("cache-miss");
                if (!this.j.u(jo1Var)) {
                    this.g.put(jo1Var);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ao1VarA.e < jCurrentTimeMillis) {
                    jo1Var.a("cache-hit-expired");
                    jo1Var.o = ao1VarA;
                    if (!this.j.u(jo1Var)) {
                        this.g.put(jo1Var);
                    }
                } else {
                    jo1Var.a("cache-hit");
                    byte[] bArr = ao1VarA.a;
                    Map map = ao1VarA.g;
                    rl rlVarH = jo1Var.h(new ho1(200, bArr, map, ho1.a(map), false));
                    jo1Var.a("cache-hit-parsed");
                    if (!(((oo1) rlVarH.i) == null)) {
                        jo1Var.a("cache-parsing-failed");
                        String strD = jo1Var.d();
                        synchronized (wo1Var) {
                            ao1 ao1VarA2 = wo1Var.a(strD);
                            if (ao1VarA2 != null) {
                                ao1VarA2.f = 0L;
                                ao1VarA2.e = 0L;
                                wo1Var.b(strD, ao1VarA2);
                            }
                        }
                        jo1Var.o = null;
                        if (!this.j.u(jo1Var)) {
                            this.g.put(jo1Var);
                        }
                    } else if (ao1VarA.f < jCurrentTimeMillis) {
                        jo1Var.a("cache-hit-refresh-needed");
                        jo1Var.o = ao1VarA;
                        rlVarH.f = true;
                        if (this.j.u(jo1Var)) {
                            this.k.l(jo1Var, rlVarH, null);
                        } else {
                            this.k.l(jo1Var, rlVarH, new jq3(this, jo1Var, 23, false));
                        }
                    } else {
                        this.k.l(jo1Var, rlVarH, null);
                    }
                }
            }
            jo1Var.c();
        } catch (Throwable th) {
            jo1Var.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (l) {
            ro1.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.h.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ro1.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
