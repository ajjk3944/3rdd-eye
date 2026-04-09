package K9;

import A9.InterfaceC0581i;
import A9.U0;
import F9.C0661d;
import F9.w;
import F9.y;
import b9.C1992A;
import g0.C4356c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import p9.l;
import p9.p;

/* compiled from: Semaphore.kt */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3762d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3763e = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3764f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3765g = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3766h = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f3767b;

    /* renamed from: c, reason: collision with root package name */
    public final b f3768c;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: Semaphore.kt */
    public /* synthetic */ class a extends k implements p<Long, j, j> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3769b = new a(2, i.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // p9.p
        public final j invoke(Long l5, j jVar) {
            int i = i.f3772a;
            return new j(l5.longValue(), jVar, 0);
        }
    }

    /* compiled from: Semaphore.kt */
    public static final class b extends m implements l<Throwable, C1992A> {
        public b() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Throwable th) {
            g.this.d();
            return C1992A.f18074a;
        }
    }

    public g(int i, int i10) {
        this.f3767b = i;
        if (i <= 0) {
            throw new IllegalArgumentException(C4356c.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0 || i10 > i) {
            throw new IllegalArgumentException(C4356c.h(i, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i - i10;
        this.f3768c = new b();
    }

    public final boolean b(U0 u02) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3764f;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f3765g.getAndIncrement(this);
        a aVar = a.f3769b;
        long j4 = andIncrement / i.f3777f;
        loop0: while (true) {
            objA = C0661d.a(jVar, j4, aVar);
            if (!C0661d.c(objA)) {
                w wVarB = C0661d.b(objA);
                while (true) {
                    w wVar = (w) atomicReferenceFieldUpdater.get(this);
                    if (wVar.f1786d >= wVarB.f1786d) {
                        break loop0;
                    }
                    if (!wVarB.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, wVarB)) {
                        if (atomicReferenceFieldUpdater.get(this) != wVar) {
                            if (wVarB.f()) {
                                wVarB.e();
                            }
                        }
                    }
                    if (wVar.f()) {
                        wVar.e();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) C0661d.b(objA);
        int i = (int) (andIncrement % i.f3777f);
        AtomicReferenceArray atomicReferenceArray = jVar2.f3778f;
        while (!atomicReferenceArray.compareAndSet(i, null, u02)) {
            if (atomicReferenceArray.get(i) != null) {
                y yVar = i.f3773b;
                y yVar2 = i.f3774c;
                while (!atomicReferenceArray.compareAndSet(i, yVar, yVar2)) {
                    if (atomicReferenceArray.get(i) != yVar) {
                        return false;
                    }
                }
                if (u02 instanceof InterfaceC0581i) {
                    ((InterfaceC0581i) u02).g(C1992A.f18074a, this.f3768c);
                    return true;
                }
                if (u02 instanceof J9.c) {
                    ((J9.c) u02).e(C1992A.f18074a);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + u02).toString());
            }
        }
        u02.c(jVar2, i);
        return true;
    }

    public final void d() {
        int i;
        Object objA;
        boolean zD;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3766h;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f3767b;
            if (andIncrement >= i10) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3762d;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f3763e.getAndIncrement(this);
            long j4 = andIncrement2 / i.f3777f;
            h hVar = h.f3771b;
            while (true) {
                objA = C0661d.a(jVar, j4, hVar);
                if (C0661d.c(objA)) {
                    break;
                }
                w wVarB = C0661d.b(objA);
                while (true) {
                    w wVar = (w) atomicReferenceFieldUpdater.get(this);
                    if (wVar.f1786d >= wVarB.f1786d) {
                        break;
                    }
                    if (!wVarB.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, wVarB)) {
                        if (atomicReferenceFieldUpdater.get(this) != wVar) {
                            if (wVarB.f()) {
                                wVarB.e();
                            }
                        }
                    }
                    if (wVar.f()) {
                        wVar.e();
                    }
                }
            }
            j jVar2 = (j) C0661d.b(objA);
            jVar2.b();
            zD = false;
            if (jVar2.f1786d <= j4) {
                int i11 = (int) (andIncrement2 % i.f3777f);
                y yVar = i.f3773b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f3778f;
                Object andSet = atomicReferenceArray.getAndSet(i11, yVar);
                if (andSet == null) {
                    int i12 = i.f3772a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == i.f3774c) {
                            zD = true;
                            break;
                        }
                    }
                    y yVar2 = i.f3773b;
                    y yVar3 = i.f3775d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, yVar2, yVar3)) {
                            if (atomicReferenceArray.get(i11) != yVar2) {
                                break;
                            }
                        } else {
                            zD = true;
                            break;
                        }
                    }
                    zD = !zD;
                } else if (andSet != i.f3776e) {
                    if (andSet instanceof InterfaceC0581i) {
                        InterfaceC0581i interfaceC0581i = (InterfaceC0581i) andSet;
                        y yVarJ = interfaceC0581i.j(C1992A.f18074a, this.f3768c);
                        if (yVarJ != null) {
                            interfaceC0581i.p(yVarJ);
                            zD = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof J9.c)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zD = ((J9.c) andSet).d(this, C1992A.f18074a);
                    }
                }
            }
        } while (!zD);
    }
}
