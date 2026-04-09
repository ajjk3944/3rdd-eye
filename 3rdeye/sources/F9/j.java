package F9;

import A9.C0583j;
import A9.I;
import A9.K;
import A9.N;
import A9.P0;
import A9.W;
import f9.C4351i;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes3.dex */
public final class j extends A9.A implements N {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1759h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final A9.A f1760c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f1762e;

    /* renamed from: f, reason: collision with root package name */
    public final n<Runnable> f1763f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1764g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public Runnable f1765b;

        public a(Runnable runnable) {
            this.f1765b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.f1765b.run();
                } catch (Throwable th) {
                    A9.C.a(C4351i.f37871b, th);
                }
                j jVar = j.this;
                Runnable runnableR0 = jVar.R0();
                if (runnableR0 == null) {
                    return;
                }
                this.f1765b = runnableR0;
                i++;
                if (i >= 16) {
                    A9.A a10 = jVar.f1760c;
                    if (a10.P0(jVar)) {
                        a10.N0(jVar, this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(A9.A a10, int i) {
        this.f1760c = a10;
        this.f1761d = i;
        N n9 = a10 instanceof N ? (N) a10 : null;
        this.f1762e = n9 == null ? K.f197a : n9;
        this.f1763f = new n<>();
        this.f1764g = new Object();
    }

    @Override // A9.N
    public final W B0(long j4, P0 p02, InterfaceC4350h interfaceC4350h) {
        return this.f1762e.B0(j4, p02, interfaceC4350h);
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        Runnable runnableR0;
        this.f1763f.a(runnable);
        if (f1759h.get(this) >= this.f1761d || !S0() || (runnableR0 = R0()) == null) {
            return;
        }
        this.f1760c.N0(this, new a(runnableR0));
    }

    @Override // A9.A
    public final void O0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        Runnable runnableR0;
        this.f1763f.a(runnable);
        if (f1759h.get(this) >= this.f1761d || !S0() || (runnableR0 = R0()) == null) {
            return;
        }
        this.f1760c.O0(this, new a(runnableR0));
    }

    @Override // A9.A
    public final A9.A Q0(int i) {
        I.n(1);
        return 1 >= this.f1761d ? this : super.Q0(1);
    }

    public final Runnable R0() {
        while (true) {
            Runnable runnableD = this.f1763f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f1764g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1759h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1763f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean S0() {
        synchronized (this.f1764g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1759h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1761d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // A9.N
    public final void y0(long j4, C0583j c0583j) {
        this.f1762e.y0(j4, c0583j);
    }
}
