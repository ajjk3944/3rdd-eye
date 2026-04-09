package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y0;

/* loaded from: classes4.dex */
public final class l extends CoroutineDispatcher implements q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22545g = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f22546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f22548d;

    /* renamed from: e, reason: collision with root package name */
    public final p f22549e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22550f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f22551a;

        public a(Runnable runnable) {
            this.f22551a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f22551a.run();
                } catch (Throwable th) {
                    kotlinx.coroutines.h0.a(EmptyCoroutineContext.f21979a, th);
                }
                Runnable runnableE0 = l.this.e0();
                if (runnableE0 == null) {
                    return;
                }
                this.f22551a = runnableE0;
                i10++;
                if (i10 >= 16 && l.this.f22546b.Z(l.this)) {
                    l.this.f22546b.X(l.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(CoroutineDispatcher coroutineDispatcher, int i10) {
        this.f22546b = coroutineDispatcher;
        this.f22547c = i10;
        q0 q0Var = coroutineDispatcher instanceof q0 ? (q0) coroutineDispatcher : null;
        this.f22548d = q0Var == null ? n0.a() : q0Var;
        this.f22549e = new p(false);
        this.f22550f = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable runnableE0;
        this.f22549e.a(runnable);
        if (f22545g.get(this) >= this.f22547c || !f0() || (runnableE0 = e0()) == null) {
            return;
        }
        this.f22546b.X(this, new a(runnableE0));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void Y(kotlin.coroutines.d dVar, Runnable runnable) {
        Runnable runnableE0;
        this.f22549e.a(runnable);
        if (f22545g.get(this) >= this.f22547c || !f0() || (runnableE0 = e0()) == null) {
            return;
        }
        this.f22546b.Y(this, new a(runnableE0));
    }

    @Override // kotlinx.coroutines.q0
    public void b(long j10, kotlinx.coroutines.o oVar) {
        this.f22548d.b(j10, oVar);
    }

    @Override // kotlinx.coroutines.q0
    public y0 e(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return this.f22548d.e(j10, runnable, dVar);
    }

    public final Runnable e0() {
        while (true) {
            Runnable runnable = (Runnable) this.f22549e.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f22550f) {
                f22545g.decrementAndGet(this);
                if (this.f22549e.c() == 0) {
                    return null;
                }
                f22545g.incrementAndGet(this);
            }
        }
    }

    public final boolean f0() {
        synchronized (this.f22550f) {
            if (f22545g.get(this) >= this.f22547c) {
                return false;
            }
            f22545g.incrementAndGet(this);
            return true;
        }
    }
}
