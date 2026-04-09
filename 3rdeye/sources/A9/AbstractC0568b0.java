package A9;

import b9.C1992A;
import c9.C2087h;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: EventLoop.common.kt */
/* renamed from: A9.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0568b0 extends AbstractC0570c0 implements N {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f225g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0568b0.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f226h = AtomicReferenceFieldUpdater.newUpdater(AbstractC0568b0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(AbstractC0568b0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: EventLoop.common.kt */
    /* renamed from: A9.b0$a */
    public final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public final C0583j f227d;

        public a(long j4, C0583j c0583j) {
            super(j4);
            this.f227d = c0583j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f227d.B(AbstractC0568b0.this, C1992A.f18074a);
        }

        @Override // A9.AbstractC0568b0.c
        public final String toString() {
            return super.toString() + this.f227d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: A9.b0$b */
    public static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        public final P0 f229d;

        public b(long j4, P0 p02) {
            super(j4);
            this.f229d = p02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f229d.run();
        }

        @Override // A9.AbstractC0568b0.c
        public final String toString() {
            return super.toString() + this.f229d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: A9.b0$c */
    public static abstract class c implements Runnable, Comparable<c>, W, F9.E {
        private volatile Object _heap;

        /* renamed from: b, reason: collision with root package name */
        public long f230b;

        /* renamed from: c, reason: collision with root package name */
        public int f231c = -1;

        public c(long j4) {
            this.f230b = j4;
        }

        @Override // F9.E
        public final void a(d dVar) {
            if (this._heap == C0572d0.f241a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        @Override // F9.E
        public final void c(int i) {
            this.f231c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j4 = this.f230b - cVar.f230b;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        public final F9.D<?> d() {
            Object obj = this._heap;
            if (obj instanceof F9.D) {
                return (F9.D) obj;
            }
            return null;
        }

        @Override // A9.W
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    F9.y yVar = C0572d0.f241a;
                    if (obj == yVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.c(this);
                    }
                    this._heap = yVar;
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j4, d dVar, AbstractC0568b0 abstractC0568b0) {
            synchronized (this) {
                if (this._heap == C0572d0.f241a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f1739a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0568b0.f225g;
                        abstractC0568b0.getClass();
                        if (AbstractC0568b0.i.get(abstractC0568b0) != 0) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f232c = j4;
                        } else {
                            long j10 = cVar.f230b;
                            if (j10 - j4 < 0) {
                                j4 = j10;
                            }
                            if (j4 - dVar.f232c > 0) {
                                dVar.f232c = j4;
                            }
                        }
                        long j11 = this.f230b;
                        long j12 = dVar.f232c;
                        if (j11 - j12 < 0) {
                            this.f230b = j12;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public String toString() {
            return androidx.work.s.f(new StringBuilder("Delayed[nanos="), this.f230b, ']');
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: A9.b0$d */
    public static final class d extends F9.D<c> {

        /* renamed from: c, reason: collision with root package name */
        public long f232c;
    }

    public W B0(long j4, P0 p02, InterfaceC4350h interfaceC4350h) {
        return K.f197a.B0(j4, p02, interfaceC4350h);
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        Y0(runnable);
    }

    @Override // A9.AbstractC0566a0
    public final long U0() {
        c cVarB;
        c cVarD;
        if (!V0()) {
            d dVar = (d) f226h.get(this);
            Runnable runnable = null;
            if (dVar != null && F9.D.f1738b.get(dVar) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (dVar) {
                        try {
                            Object[] objArr = dVar.f1739a;
                            Object obj = objArr != null ? objArr[0] : null;
                            if (obj == null) {
                                cVarD = null;
                            } else {
                                c cVar = (c) obj;
                                cVarD = ((jNanoTime - cVar.f230b) > 0L ? 1 : ((jNanoTime - cVar.f230b) == 0L ? 0 : -1)) >= 0 ? Z0(cVar) : false ? dVar.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (cVarD != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f225g;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 == null) {
                    break;
                }
                if (!(obj2 instanceof F9.o)) {
                    if (obj2 != C0572d0.f242b) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj2;
                        break loop1;
                    }
                    break;
                }
                F9.o oVar = (F9.o) obj2;
                Object objD = oVar.d();
                if (objD != F9.o.f1776g) {
                    runnable = (Runnable) objD;
                    break;
                }
                F9.o oVarC = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, oVarC) && atomicReferenceFieldUpdater.get(this) == obj2) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C2087h<S<?>> c2087h = this.f223e;
            if (((c2087h == null || c2087h.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = f225g.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof F9.o) {
                        long j4 = F9.o.f1775f.get((F9.o) obj3);
                        if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj3 == C0572d0.f242b) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar2 = (d) f226h.get(this);
                if (dVar2 != null && (cVarB = dVar2.b()) != null) {
                    long jNanoTime2 = cVarB.f230b - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void Y0(Runnable runnable) {
        if (!Z0(runnable)) {
            J.f192j.Y0(runnable);
            return;
        }
        Thread threadW0 = W0();
        if (Thread.currentThread() != threadW0) {
            LockSupport.unpark(threadW0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A9.AbstractC0568b0.f225g
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = A9.AbstractC0568b0.i
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof F9.o
            if (r2 == 0) goto L4c
            r2 = r1
            F9.o r2 = (F9.o) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            F9.o r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            F9.y r2 = A9.C0572d0.f242b
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            F9.o r2 = new F9.o
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.AbstractC0568b0.Z0(java.lang.Runnable):boolean");
    }

    public final boolean a1() {
        d dVar;
        C2087h<S<?>> c2087h = this.f223e;
        if (!(c2087h != null ? c2087h.isEmpty() : true) || ((dVar = (d) f226h.get(this)) != null && F9.D.f1738b.get(dVar) != 0)) {
            return false;
        }
        Object obj = f225g.get(this);
        if (obj != null) {
            if (obj instanceof F9.o) {
                long j4 = F9.o.f1775f.get((F9.o) obj);
                return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
            }
            if (obj != C0572d0.f242b) {
                return false;
            }
        }
        return true;
    }

    public final void b1(long j4, c cVar) {
        int iE;
        Thread threadW0;
        boolean z10 = i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f226h;
        if (z10) {
            iE = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.f232c = j4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.l.c(obj);
                dVar = (d) obj;
            }
            iE = cVar.e(j4, dVar, this);
        }
        if (iE != 0) {
            if (iE == 1) {
                X0(j4, cVar);
                return;
            } else {
                if (iE != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if ((dVar3 != null ? dVar3.b() : null) != cVar || Thread.currentThread() == (threadW0 = W0())) {
            return;
        }
        LockSupport.unpark(threadW0);
    }

    @Override // A9.AbstractC0566a0
    public void shutdown() {
        c cVarD;
        N0.f198a.set(null);
        i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f225g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            F9.y yVar = C0572d0.f242b;
            if (obj != null) {
                if (!(obj instanceof F9.o)) {
                    if (obj != yVar) {
                        F9.o oVar = new F9.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((F9.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, yVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (U0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f226h.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarD = F9.D.f1738b.get(dVar) > 0 ? dVar.d(0) : null;
            }
            c cVar = cVarD;
            if (cVar == null) {
                return;
            } else {
                X0(jNanoTime, cVar);
            }
        }
    }

    @Override // A9.N
    public final void y0(long j4, C0583j c0583j) {
        long j10 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j10 + jNanoTime, c0583j);
            b1(jNanoTime, aVar);
            c0583j.v(new X(aVar));
        }
    }
}
