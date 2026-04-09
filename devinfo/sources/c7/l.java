package c7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2786a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f2787b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f2788c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2789d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2790e;

    public l(Executor executor, int i4) {
        this.f2786a = i4;
        switch (i4) {
            case 1:
                nk.k.e(executor, "executor");
                this.f2787b = executor;
                this.f2788c = new ArrayDeque();
                this.f2790e = new Object();
                break;
            default:
                this.f2787b = executor;
                this.f2788c = new ArrayDeque();
                this.f2790e = new Object();
                break;
        }
    }

    private final void a(Runnable runnable) {
        synchronized (this.f2790e) {
            try {
                this.f2788c.add(new vd.a(4, this, runnable));
                if (this.f2789d == null) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b(Runnable runnable) {
        nk.k.e(runnable, "command");
        synchronized (this.f2790e) {
            this.f2788c.offer(new k1.b(19, runnable, this));
            if (this.f2789d == null) {
                c();
            }
        }
    }

    private final void d() {
        synchronized (this.f2790e) {
            Object objPoll = this.f2788c.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f2789d = runnable;
            if (objPoll != null) {
                this.f2787b.execute(runnable);
            }
        }
    }

    public final void c() {
        switch (this.f2786a) {
            case 0:
                Runnable runnable = (Runnable) this.f2788c.poll();
                this.f2789d = runnable;
                if (runnable != null) {
                    this.f2787b.execute(runnable);
                    return;
                }
                return;
            case 1:
                d();
                return;
            default:
                synchronized (this.f2790e) {
                    try {
                        Runnable runnable2 = (Runnable) this.f2788c.poll();
                        this.f2789d = runnable2;
                        if (runnable2 != null) {
                            ((ae.d) this.f2787b).execute(runnable2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2786a) {
            case 0:
                a(runnable);
                return;
            case 1:
                b(runnable);
                return;
            default:
                synchronized (this.f2790e) {
                    try {
                        this.f2788c.add(new aj.d(18, this, runnable));
                        if (this.f2789d == null) {
                            c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public l(ae.d dVar) {
        this.f2786a = 2;
        this.f2790e = new Object();
        this.f2788c = new ArrayDeque();
        this.f2787b = dVar;
    }
}
