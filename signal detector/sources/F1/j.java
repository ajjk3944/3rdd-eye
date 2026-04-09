package f1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20051b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f20053d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f20050a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f20052c = new Object();

    public j(Executor executor) {
        this.f20051b = executor;
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f20052c) {
            z6 = !this.f20050a.isEmpty();
        }
        return z6;
    }

    public final void b() {
        synchronized (this.f20052c) {
            try {
                Runnable runnable = (Runnable) this.f20050a.poll();
                this.f20053d = runnable;
                if (runnable != null) {
                    this.f20051b.execute(this.f20053d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f20052c) {
            try {
                this.f20050a.add(new i(this, 0, runnable));
                if (this.f20053d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
