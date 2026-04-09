package Ni;

import Ii.InterfaceC3052e0;
import Ii.InterfaceC3069n;
import Ii.U;
import Ii.X;
import dh.C5385j;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ni.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3408j extends Ii.J implements X {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f16598i = AtomicIntegerFieldUpdater.newUpdater(C3408j.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f16599c;

    /* renamed from: d, reason: collision with root package name */
    private final Ii.J f16600d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16601e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16602f;

    /* renamed from: g, reason: collision with root package name */
    private final o f16603g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f16604h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: Ni.j$a */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f16605a;

        public a(Runnable runnable) {
            this.f16605a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f16605a.run();
                } catch (Throwable th2) {
                    Ii.L.a(C5385j.f46088a, th2);
                }
                Runnable runnableS0 = C3408j.this.s0();
                if (runnableS0 == null) {
                    return;
                }
                this.f16605a = runnableS0;
                i10++;
                if (i10 >= 16 && AbstractC3406h.d(C3408j.this.f16600d, C3408j.this)) {
                    AbstractC3406h.c(C3408j.this.f16600d, C3408j.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3408j(Ii.J j10, int i10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f16599c = x10 == null ? U.a() : x10;
        this.f16600d = j10;
        this.f16601e = i10;
        this.f16602f = str;
        this.f16603g = new o(false);
        this.f16604h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable s0() {
        while (true) {
            Runnable runnable = (Runnable) this.f16603g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f16604h) {
                f16598i.decrementAndGet(this);
                if (this.f16603g.c() == 0) {
                    return null;
                }
                f16598i.incrementAndGet(this);
            }
        }
    }

    private final boolean t0() {
        synchronized (this.f16604h) {
            if (f16598i.get(this) >= this.f16601e) {
                return false;
            }
            f16598i.incrementAndGet(this);
            return true;
        }
    }

    @Override // Ii.X
    public void J(long j10, InterfaceC3069n interfaceC3069n) {
        this.f16599c.J(j10, interfaceC3069n);
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        Runnable runnableS0;
        this.f16603g.a(runnable);
        if (f16598i.get(this) >= this.f16601e || !t0() || (runnableS0 = s0()) == null) {
            return;
        }
        AbstractC3406h.c(this.f16600d, this, new a(runnableS0));
    }

    @Override // Ii.J
    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        Runnable runnableS0;
        this.f16603g.a(runnable);
        if (f16598i.get(this) >= this.f16601e || !t0() || (runnableS0 = s0()) == null) {
            return;
        }
        this.f16600d.b0(this, new a(runnableS0));
    }

    @Override // Ii.J
    public Ii.J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return i10 >= this.f16601e ? AbstractC3409k.b(this, str) : super.n0(i10, str);
    }

    @Override // Ii.X
    public InterfaceC3052e0 p(long j10, Runnable runnable, InterfaceC5384i interfaceC5384i) {
        return this.f16599c.p(j10, runnable, interfaceC5384i);
    }

    @Override // Ii.J
    public String toString() {
        String str = this.f16602f;
        if (str != null) {
            return str;
        }
        return this.f16600d + ".limitedParallelism(" + this.f16601e + ')';
    }
}
