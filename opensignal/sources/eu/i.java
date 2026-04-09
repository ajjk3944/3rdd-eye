package eu;

import bu.r;
import bu.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lq.b0;
import wt.q1;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8354c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8355d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8356e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8357f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8358g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8359a;

    /* renamed from: b, reason: collision with root package name */
    public final b f8360b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i10, int i11) {
        this.f8359a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(h0.b.h(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(h0.b.h(i10, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i10 - i11;
        this.f8360b = new b(1, this);
    }

    public final boolean a(q1 q1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8356e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f8357f.getAndIncrement(this);
        g gVar = g.E;
        long j = andIncrement / k.f8366f;
        loop0: while (true) {
            objB = bu.a.b(lVar, j, gVar);
            if (!bu.a.e(objB)) {
                r rVarC = bu.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2987c >= rVarC.f2987c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) bu.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = lVar2.f8367e;
        int i10 = (int) (andIncrement % k.f8366f);
        while (!atomicReferenceArray.compareAndSet(i10, null, q1Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                t tVar = k.f8362b;
                t tVar2 = k.f8363c;
                while (!atomicReferenceArray.compareAndSet(i10, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i10) != tVar) {
                        return false;
                    }
                }
                ((wt.f) q1Var).j(b0.f15562a, this.f8360b);
                return true;
            }
        }
        q1Var.a(lVar2, i10);
        return true;
    }

    public final void b() {
        int i10;
        Object objB;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8358g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f8359a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8354c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8355d.getAndIncrement(this);
            long j = andIncrement2 / k.f8366f;
            h hVar = h.E;
            while (true) {
                objB = bu.a.b(lVar, j, hVar);
                if (bu.a.e(objB)) {
                    break;
                }
                r rVarC = bu.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2987c >= rVarC.f2987c) {
                        break;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            }
            l lVar2 = (l) bu.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = lVar2.f8367e;
            lVar2.a();
            z10 = false;
            if (lVar2.f2987c <= j) {
                int i12 = (int) (andIncrement2 % k.f8366f);
                Object andSet = atomicReferenceArray.getAndSet(i12, k.f8362b);
                if (andSet == null) {
                    int i13 = k.f8361a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == k.f8363c) {
                            z10 = true;
                            break;
                        }
                    }
                    t tVar = k.f8362b;
                    t tVar2 = k.f8364d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i12) != tVar) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = !z10;
                } else if (andSet != k.f8365e) {
                    if (!(andSet instanceof wt.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    wt.f fVar = (wt.f) andSet;
                    t tVarK = fVar.k(b0.f15562a, this.f8360b);
                    if (tVarK != null) {
                        fVar.n(tVarK);
                        z10 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z10);
    }
}
