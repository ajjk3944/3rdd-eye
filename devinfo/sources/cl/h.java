package cl;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import xk.b0;
import xk.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends xk.r implements b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2917h = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f2918c;

    /* renamed from: d, reason: collision with root package name */
    public final xk.r f2919d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2920e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2921f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(xk.r rVar, int i4) {
        b0 b0Var = rVar instanceof b0 ? (b0) rVar : null;
        this.f2918c = b0Var == null ? xk.z.f37261a : b0Var;
        this.f2919d = rVar;
        this.f2920e = i4;
        this.f2921f = new l();
        this.g = new Object();
    }

    @Override // xk.b0
    public final void A(long j, xk.h hVar) {
        this.f2918c.A(j, hVar);
    }

    @Override // xk.b0
    public final i0 F(long j, Runnable runnable, ck.h hVar) {
        return this.f2918c.F(j, runnable, hVar);
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        Runnable runnableX;
        this.f2921f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2917h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f2920e || !Y() || (runnableX = X()) == null) {
            return;
        }
        try {
            b.i(this.f2919d, this, new vd.a(this, false, runnableX, 6));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // xk.r
    public final void U(ck.h hVar, Runnable runnable) {
        Runnable runnableX;
        this.f2921f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2917h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f2920e || !Y() || (runnableX = X()) == null) {
            return;
        }
        try {
            this.f2919d.U(this, new vd.a(this, false, runnableX, 6));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    public final Runnable X() {
        while (true) {
            Runnable runnable = (Runnable) this.f2921f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2917h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2921f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean Y() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2917h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f2920e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // xk.r
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2919d);
        sb2.append(".limitedParallelism(");
        return d.h.u(sb2, this.f2920e, ')');
    }
}
