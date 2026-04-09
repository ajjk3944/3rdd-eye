package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class d1 extends e1 implements q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22304e = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_queue$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22305f = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_delayed$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22306g = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final o f22307c;

        public a(long j10, o oVar) {
            super(j10);
            this.f22307c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22307c.z(d1.this, y8.s.f25199a);
        }

        @Override // kotlinx.coroutines.d1.c
        public String toString() {
            return super.toString() + this.f22307c;
        }
    }

    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f22309c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f22309c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22309c.run();
        }

        @Override // kotlinx.coroutines.d1.c
        public String toString() {
            return super.toString() + this.f22309c;
        }
    }

    public static abstract class c implements Runnable, Comparable, y0, kotlinx.coroutines.internal.i0 {

        @Nullable
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f22310a;

        /* renamed from: b, reason: collision with root package name */
        public int f22311b = -1;

        public c(long j10) {
            this.f22310a = j10;
        }

        @Override // kotlinx.coroutines.internal.i0
        public void a(kotlinx.coroutines.internal.h0 h0Var) {
            if (this._heap == g1.f22498a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = h0Var;
        }

        @Override // kotlinx.coroutines.internal.i0
        public kotlinx.coroutines.internal.h0 c() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.h0) {
                return (kotlinx.coroutines.internal.h0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.y0
        public final void d() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == g1.f22498a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = g1.f22498a;
                    y8.s sVar = y8.s.f25199a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f22310a - cVar.f22310a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int g(long j10, d dVar, d1 d1Var) {
            synchronized (this) {
                if (this._heap == g1.f22498a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (d1Var.d()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f22312c = j10;
                        } else {
                            long j11 = cVar.f22310a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f22312c > 0) {
                                dVar.f22312c = j10;
                            }
                        }
                        long j12 = this.f22310a;
                        long j13 = dVar.f22312c;
                        if (j12 - j13 < 0) {
                            this.f22310a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.i0
        public int getIndex() {
            return this.f22311b;
        }

        public final boolean h(long j10) {
            return j10 - this.f22310a >= 0;
        }

        @Override // kotlinx.coroutines.internal.i0
        public void setIndex(int i10) {
            this.f22311b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f22310a + ']';
        }
    }

    public static final class d extends kotlinx.coroutines.internal.h0 {

        /* renamed from: c, reason: collision with root package name */
        public long f22312c;

        public d(long j10) {
            this.f22312c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return f22306g.get(this) != 0;
    }

    public final void A0() {
        f22304e.set(this, null);
        f22305f.set(this, null);
    }

    public final void B0(long j10, c cVar) {
        int iC0 = C0(j10, cVar);
        if (iC0 == 0) {
            if (F0(cVar)) {
                p0();
            }
        } else if (iC0 == 1) {
            o0(j10, cVar);
        } else if (iC0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int C0(long j10, c cVar) {
        if (d()) {
            return 1;
        }
        d dVar = (d) f22305f.get(this);
        if (dVar == null) {
            t.a.a(f22305f, this, null, new d(j10));
            Object obj = f22305f.get(this);
            kotlin.jvm.internal.p.b(obj);
            dVar = (d) obj;
        }
        return cVar.g(j10, dVar, this);
    }

    public final y0 D0(long j10, Runnable runnable) {
        long jC = g1.c(j10);
        if (jC >= 4611686018427387903L) {
            return f2.f22359a;
        }
        kotlinx.coroutines.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        B0(jNanoTime, bVar);
        return bVar;
    }

    public final void E0(boolean z10) {
        f22306g.set(this, z10 ? 1 : 0);
    }

    public final boolean F0(c cVar) {
        d dVar = (d) f22305f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void X(kotlin.coroutines.d dVar, Runnable runnable) {
        t0(runnable);
    }

    @Override // kotlinx.coroutines.q0
    public void b(long j10, o oVar) {
        long jC = g1.c(j10);
        if (jC < 4611686018427387903L) {
            kotlinx.coroutines.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, oVar);
            B0(jNanoTime, aVar);
            r.a(oVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.q0
    public y0 e(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return q0.a.a(this, j10, runnable, dVar);
    }

    @Override // kotlinx.coroutines.c1
    public long f0() {
        c cVar;
        if (super.f0() == 0) {
            return 0L;
        }
        Object obj = f22304e.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.q)) {
                return obj == g1.f22499b ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f22305f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f22310a;
        kotlinx.coroutines.c.a();
        return q9.e.c(j10 - System.nanoTime(), 0L);
    }

    @Override // kotlinx.coroutines.c1
    public long k0() {
        kotlinx.coroutines.internal.i0 i0VarI;
        if (l0()) {
            return 0L;
        }
        d dVar = (d) f22305f.get(this);
        if (dVar != null && !dVar.e()) {
            kotlinx.coroutines.c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        kotlinx.coroutines.internal.i0 i0VarB = dVar.b();
                        if (i0VarB != null) {
                            c cVar = (c) i0VarB;
                            i0VarI = cVar.h(jNanoTime) ? u0(cVar) : false ? dVar.i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) i0VarI) != null);
        }
        Runnable runnableS0 = s0();
        if (runnableS0 == null) {
            return f0();
        }
        runnableS0.run();
        return 0L;
    }

    public final void r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22304e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (t.a.a(f22304e, this, null, g1.f22499b)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                ((kotlinx.coroutines.internal.q) obj).d();
                return;
            } else {
                if (obj == g1.f22499b) {
                    return;
                }
                kotlinx.coroutines.internal.q qVar = new kotlinx.coroutines.internal.q(8, true);
                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                qVar.a((Runnable) obj);
                if (t.a.a(f22304e, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable s0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22304e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                Object objM = qVar.m();
                if (objM != kotlinx.coroutines.internal.q.f22558h) {
                    return (Runnable) objM;
                }
                t.a.a(f22304e, this, obj, qVar.l());
            } else {
                if (obj == g1.f22499b) {
                    return null;
                }
                if (t.a.a(f22304e, this, obj, null)) {
                    kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.c1
    public void shutdown() {
        p2.f22589a.c();
        E0(true);
        r0();
        while (k0() <= 0) {
        }
        z0();
    }

    public void t0(Runnable runnable) {
        if (u0(runnable)) {
            p0();
        } else {
            m0.f22576h.t0(runnable);
        }
    }

    public final boolean u0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22304e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (t.a.a(f22304e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    t.a.a(f22304e, this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == g1.f22499b) {
                    return false;
                }
                kotlinx.coroutines.internal.q qVar2 = new kotlinx.coroutines.internal.q(8, true);
                kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (t.a.a(f22304e, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean y0() {
        if (!j0()) {
            return false;
        }
        d dVar = (d) f22305f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f22304e.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof kotlinx.coroutines.internal.q ? ((kotlinx.coroutines.internal.q) obj).j() : obj == g1.f22499b;
    }

    public final void z0() {
        c cVar;
        kotlinx.coroutines.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f22305f.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                o0(jNanoTime, cVar);
            }
        }
    }
}
