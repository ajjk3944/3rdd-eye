package C0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class B implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1025a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1026b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1027c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f1028d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1029e;

    public B(Executor executor) {
        this.f1025a = 0;
        q5.i.e(executor, "executor");
        this.f1029e = executor;
        this.f1027c = new ArrayDeque();
        this.f1026b = new Object();
    }

    private final void a(Runnable runnable) {
        q5.i.e(runnable, "command");
        synchronized (this.f1026b) {
            this.f1027c.offer(new A(runnable, 0, this));
            if (this.f1028d == null) {
                b();
            }
        }
    }

    private final void c() {
        synchronized (this.f1026b) {
            Object objPoll = this.f1027c.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f1028d = runnable;
            if (objPoll != null) {
                this.f1029e.execute(runnable);
            }
        }
    }

    public final void b() {
        switch (this.f1025a) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f1026b) {
                    try {
                        Runnable runnable = (Runnable) this.f1027c.poll();
                        this.f1028d = runnable;
                        if (runnable != null) {
                            ((H1.f) this.f1029e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1025a) {
            case 0:
                a(runnable);
                return;
            default:
                synchronized (this.f1026b) {
                    try {
                        this.f1027c.add(new A(this, runnable));
                        if (this.f1028d == null) {
                            b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public B(H1.f fVar) {
        this.f1025a = 1;
        this.f1026b = new Object();
        this.f1027c = new ArrayDeque();
        this.f1029e = fVar;
    }
}
