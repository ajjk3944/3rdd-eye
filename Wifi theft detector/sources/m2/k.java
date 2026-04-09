package m2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class k implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f23390b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f23392d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f23389a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f23391c = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final k f23393a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f23394b;

        public a(k kVar, Runnable runnable) {
            this.f23393a = kVar;
            this.f23394b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23394b.run();
            } finally {
                this.f23393a.b();
            }
        }
    }

    public k(Executor executor) {
        this.f23390b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f23391c) {
            z10 = !this.f23389a.isEmpty();
        }
        return z10;
    }

    public void b() {
        synchronized (this.f23391c) {
            try {
                Runnable runnable = (Runnable) this.f23389a.poll();
                this.f23392d = runnable;
                if (runnable != null) {
                    this.f23390b.execute(this.f23392d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f23391c) {
            try {
                this.f23389a.add(new a(this, runnable));
                if (this.f23392d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
