package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g60 extends lk implements zn {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(g60.class, "runningWorkers$volatile");
    public final lk h;
    public final int i;
    public final /* synthetic */ zn j;
    public final c80 k;
    public final Object l;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g60(lk lkVar, int i) {
        this.h = lkVar;
        this.i = i;
        zn znVar = lkVar instanceof zn ? (zn) lkVar : null;
        this.j = znVar == null ? bn.a : znVar;
        this.k = new c80();
        this.l = new Object();
    }

    @Override // defpackage.zn
    public final jp c(long j, u11 u11Var, hk hkVar) {
        return this.j.c(j, u11Var, hkVar);
    }

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) {
        this.k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
        if (atomicIntegerFieldUpdater.get(this) < this.i) {
            synchronized (this.l) {
                if (atomicIntegerFieldUpdater.get(this) >= this.i) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM = m();
                if (runnableM == null) {
                    return;
                }
                this.h.k(this, new jq3(this, runnableM, 11, false));
            }
        }
    }

    public final Runnable m() {
        while (true) {
            Runnable runnable = (Runnable) this.k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
