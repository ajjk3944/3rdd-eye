package ec;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k1 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22833a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f22834b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22835c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f22836d;

    public k1(l1 l1Var, String str, BlockingQueue blockingQueue) {
        this.f22836d = l1Var;
        pb.y.h(blockingQueue);
        this.f22833a = new Object();
        this.f22834b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f22833a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        l1 l1Var = this.f22836d;
        synchronized (l1Var.j) {
            try {
                if (!this.f22835c) {
                    l1Var.f22864k.release();
                    l1Var.j.notifyAll();
                    if (this == l1Var.f22859d) {
                        l1Var.f22859d = null;
                    } else if (this == l1Var.f22860e) {
                        l1Var.f22860e = null;
                    } else {
                        s0 s0Var = ((o1) l1Var.f218b).f22954f;
                        o1.m(s0Var);
                        s0Var.g.d("Current scheduler thread is neither worker nor network");
                    }
                    this.f22835c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z3 = false;
        while (!z3) {
            try {
                this.f22836d.f22864k.acquire();
                z3 = true;
            } catch (InterruptedException e2) {
                s0 s0Var = ((o1) this.f22836d.f218b).f22954f;
                o1.m(s0Var);
                s0Var.j.e(e2, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f22834b;
                j1 j1Var = (j1) blockingQueue.poll();
                if (j1Var != null) {
                    Process.setThreadPriority(true != j1Var.f22812b ? 10 : threadPriority);
                    j1Var.run();
                } else {
                    Object obj = this.f22833a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f22836d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                s0 s0Var2 = ((o1) this.f22836d.f218b).f22954f;
                                o1.m(s0Var2);
                                s0Var2.j.e(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f22836d.j) {
                        if (this.f22834b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
