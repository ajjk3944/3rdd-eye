package gl;

import cl.s;
import d0.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import je.u;
import xk.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24762c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24763d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24764e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24765f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f24766a;

    /* renamed from: b, reason: collision with root package name */
    public final w f24767b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i4, int i10) {
        this.f24766a = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException(u.r(i4, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0 || i10 > i4) {
            throw new IllegalArgumentException(u.r(i4, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i4 - i10;
        this.f24767b = new w(2, this);
    }

    public final boolean a(u1 u1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24764e;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f24765f.getAndIncrement(this);
        e eVar = e.f24760i;
        long j = andIncrement / i.f24773f;
        loop0: while (true) {
            objB = cl.b.b(jVar, j, eVar);
            if (!cl.b.e(objB)) {
                s sVarC = cl.b.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f2939c >= sVarC.f2939c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) cl.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.f24774e;
        int i4 = (int) (andIncrement % i.f24773f);
        while (!atomicReferenceArray.compareAndSet(i4, null, u1Var)) {
            if (atomicReferenceArray.get(i4) != null) {
                cl.u uVar = i.f24769b;
                cl.u uVar2 = i.f24770c;
                while (!atomicReferenceArray.compareAndSet(i4, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i4) != uVar) {
                        return false;
                    }
                }
                ((xk.g) u1Var).f(yj.u.f37649a, this.f24767b);
                return true;
            }
        }
        u1Var.a(jVar2, i4);
        return true;
    }

    public final void b() {
        int i4;
        Object objB;
        boolean z3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f24766a;
            if (andIncrement >= i10) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24762c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f24763d.getAndIncrement(this);
            long j = andIncrement2 / i.f24773f;
            f fVar = f.f24761i;
            while (true) {
                objB = cl.b.b(jVar, j, fVar);
                if (cl.b.e(objB)) {
                    break;
                }
                s sVarC = cl.b.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f2939c >= sVarC.f2939c) {
                        break;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            }
            j jVar2 = (j) cl.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.f24774e;
            jVar2.a();
            z3 = false;
            if (jVar2.f2939c <= j) {
                int i11 = (int) (andIncrement2 % i.f24773f);
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f24769b);
                if (andSet == null) {
                    int i12 = i.f24768a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == i.f24770c) {
                            z3 = true;
                            break;
                        }
                    }
                    cl.u uVar = i.f24769b;
                    cl.u uVar2 = i.f24771d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, uVar, uVar2)) {
                            if (atomicReferenceArray.get(i11) != uVar) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = !z3;
                } else if (andSet != i.f24772e) {
                    boolean z10 = andSet instanceof xk.g;
                    yj.u uVar3 = yj.u.f37649a;
                    if (!z10) {
                        if (!(andSet instanceof fl.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((fl.e) ((fl.f) andSet)).g(this, uVar3) == 0) {
                            z3 = true;
                            break;
                            break;
                        }
                    } else {
                        xk.g gVar = (xk.g) andSet;
                        cl.u uVarJ = gVar.j(uVar3, this.f24767b);
                        if (uVarJ != null) {
                            gVar.n(uVarJ);
                            z3 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z3);
    }
}
