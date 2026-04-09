package zc;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class z0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27279a;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue f27280d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27281g = false;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f27282r;

    public z0(a1 a1Var, String str, BlockingQueue blockingQueue) {
        this.f27282r = a1Var;
        cc.s.h(blockingQueue);
        this.f27279a = new Object();
        this.f27280d = blockingQueue;
        setName(str);
    }

    public final void a() {
        a1 a1Var = this.f27282r;
        synchronized (a1Var.F) {
            try {
                if (!this.f27281g) {
                    a1Var.G.release();
                    a1Var.F.notifyAll();
                    if (this == a1Var.f26854r) {
                        a1Var.f26854r = null;
                    } else if (this == a1Var.f26855x) {
                        a1Var.f26855x = null;
                    } else {
                        j0 j0Var = ((c1) a1Var.f1504d).f26889y;
                        c1.g(j0Var);
                        j0Var.B.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f27281g = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f27282r.G.acquire();
                z10 = true;
            } catch (InterruptedException e4) {
                j0 j0Var = ((c1) this.f27282r.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.F.c(e4, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f27280d;
                y0 y0Var = (y0) blockingQueue.poll();
                if (y0Var != null) {
                    Process.setThreadPriority(true != y0Var.f27270d ? 10 : threadPriority);
                    y0Var.run();
                } else {
                    Object obj = this.f27279a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f27282r.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                j0 j0Var2 = ((c1) this.f27282r.f1504d).f26889y;
                                c1.g(j0Var2);
                                j0Var2.F.c(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f27282r.F) {
                        if (this.f27280d.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
