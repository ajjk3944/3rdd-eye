package Ii;

import Ii.X;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: Ii.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3062j0 extends AbstractC3064k0 implements X {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9332f = AtomicReferenceFieldUpdater.newUpdater(AbstractC3062j0.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9333g = AtomicReferenceFieldUpdater.newUpdater(AbstractC3062j0.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9334h = AtomicIntegerFieldUpdater.newUpdater(AbstractC3062j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: Ii.j0$a */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3069n f9335c;

        public a(long j10, InterfaceC3069n interfaceC3069n) {
            super(j10);
            this.f9335c = interfaceC3069n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9335c.J(AbstractC3062j0.this, Yg.J.f24997a);
        }

        @Override // Ii.AbstractC3062j0.c
        public String toString() {
            return super.toString() + this.f9335c;
        }
    }

    /* renamed from: Ii.j0$b */
    private static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f9337c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f9337c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9337c.run();
        }

        @Override // Ii.AbstractC3062j0.c
        public String toString() {
            return super.toString() + this.f9337c;
        }
    }

    /* renamed from: Ii.j0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC3052e0, Ni.M {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f9338a;

        /* renamed from: b, reason: collision with root package name */
        private int f9339b = -1;

        public c(long j10) {
            this.f9338a = j10;
        }

        @Override // Ni.M
        public Ni.L b() {
            Object obj = this._heap;
            if (obj instanceof Ni.L) {
                return (Ni.L) obj;
            }
            return null;
        }

        @Override // Ni.M
        public void c(Ni.L l10) {
            if (this._heap == AbstractC3068m0.f9343a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = l10;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f9338a - cVar.f9338a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // Ii.InterfaceC3052e0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC3068m0.f9343a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC3068m0.f9343a;
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final int g(long j10, d dVar, AbstractC3062j0 abstractC3062j0) {
            synchronized (this) {
                if (this._heap == AbstractC3068m0.f9343a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC3062j0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f9340c = j10;
                        } else {
                            long j11 = cVar.f9338a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f9340c > 0) {
                                dVar.f9340c = j10;
                            }
                        }
                        long j12 = this.f9338a;
                        long j13 = dVar.f9340c;
                        if (j12 - j13 < 0) {
                            this.f9338a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // Ni.M
        public int getIndex() {
            return this.f9339b;
        }

        public final boolean h(long j10) {
            return j10 - this.f9338a >= 0;
        }

        @Override // Ni.M
        public void setIndex(int i10) {
            this.f9339b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f9338a + ']';
        }
    }

    /* renamed from: Ii.j0$d */
    public static final class d extends Ni.L {

        /* renamed from: c, reason: collision with root package name */
        public long f9340c;

        public d(long j10) {
            this.f9340c = j10;
        }
    }

    private final void F0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9332f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f9332f, this, null, AbstractC3068m0.f9344b)) {
                    return;
                }
            } else if (obj instanceof Ni.p) {
                ((Ni.p) obj).d();
                return;
            } else {
                if (obj == AbstractC3068m0.f9344b) {
                    return;
                }
                Ni.p pVar = new Ni.p(8, true);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                pVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f9332f, this, obj, pVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable G0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9332f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Ni.p) {
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Ni.p pVar = (Ni.p) obj;
                Object objM = pVar.m();
                if (objM != Ni.p.f16615h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f9332f, this, obj, pVar.l());
            } else {
                if (obj == AbstractC3068m0.f9344b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f9332f, this, obj, null)) {
                    AbstractC6492s.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void I0() {
        Ni.M mI;
        d dVar = (d) f9333g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC3047c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Ni.M mB = dVar.b();
                    if (mB != null) {
                        c cVar = (c) mB;
                        mI = cVar.h(jNanoTime) ? J0(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((c) mI) != null);
    }

    private final boolean J0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9332f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f9332f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof Ni.p) {
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                Ni.p pVar = (Ni.p) obj;
                int iA = pVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f9332f, this, obj, pVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC3068m0.f9344b) {
                    return false;
                }
                Ni.p pVar2 = new Ni.p(8, true);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                pVar2.a((Runnable) obj);
                pVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f9332f, this, obj, pVar2)) {
                    return true;
                }
            }
        }
    }

    private final void O0() {
        c cVar;
        AbstractC3047c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f9333g.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                C0(jNanoTime, cVar);
            }
        }
    }

    private final int R0(long j10, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f9333g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f9333g, this, null, new d(j10));
            Object obj = f9333g.get(this);
            AbstractC6492s.f(obj);
            dVar = (d) obj;
        }
        return cVar.g(j10, dVar, this);
    }

    private final void T0(boolean z10) {
        f9334h.set(this, z10 ? 1 : 0);
    }

    private final boolean U0(c cVar) {
        d dVar = (d) f9333g.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f9334h.get(this) == 1;
    }

    public void H0(Runnable runnable) {
        I0();
        if (J0(runnable)) {
            D0();
        } else {
            T.f9282i.H0(runnable);
        }
    }

    @Override // Ii.X
    public void J(long j10, InterfaceC3069n interfaceC3069n) {
        long jC = AbstractC3068m0.c(j10);
        if (jC < 4611686018427387903L) {
            AbstractC3047c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC3069n);
            Q0(jNanoTime, aVar);
            r.a(interfaceC3069n, aVar);
        }
    }

    protected boolean N0() {
        if (!x0()) {
            return false;
        }
        d dVar = (d) f9333g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f9332f.get(this);
        if (obj != null) {
            if (obj instanceof Ni.p) {
                return ((Ni.p) obj).j();
            }
            if (obj != AbstractC3068m0.f9344b) {
                return false;
            }
        }
        return true;
    }

    protected final void P0() {
        f9332f.set(this, null);
        f9333g.set(this, null);
    }

    public final void Q0(long j10, c cVar) {
        int iR0 = R0(j10, cVar);
        if (iR0 == 0) {
            if (U0(cVar)) {
                D0();
            }
        } else if (iR0 == 1) {
            C0(j10, cVar);
        } else if (iR0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final InterfaceC3052e0 S0(long j10, Runnable runnable) {
        long jC = AbstractC3068m0.c(j10);
        if (jC >= 4611686018427387903L) {
            return K0.f9274a;
        }
        AbstractC3047c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        Q0(jNanoTime, bVar);
        return bVar;
    }

    @Override // Ii.J
    public final void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        H0(runnable);
    }

    public InterfaceC3052e0 p(long j10, Runnable runnable, InterfaceC5384i interfaceC5384i) {
        return X.a.a(this, j10, runnable, interfaceC5384i);
    }

    @Override // Ii.AbstractC3060i0
    public void shutdown() {
        U0.f9286a.c();
        T0(true);
        F0();
        while (y0() <= 0) {
        }
        O0();
    }

    @Override // Ii.AbstractC3060i0
    protected long t0() {
        c cVar;
        if (super.t0() == 0) {
            return 0L;
        }
        Object obj = f9332f.get(this);
        if (obj != null) {
            if (!(obj instanceof Ni.p)) {
                return obj == AbstractC3068m0.f9344b ? Long.MAX_VALUE : 0L;
            }
            if (!((Ni.p) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f9333g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f9338a;
        AbstractC3047c.a();
        return AbstractC7978m.e(j10 - System.nanoTime(), 0L);
    }

    @Override // Ii.AbstractC3060i0
    public long y0() {
        if (z0()) {
            return 0L;
        }
        I0();
        Runnable runnableG0 = G0();
        if (runnableG0 == null) {
            return t0();
        }
        runnableG0.run();
        return 0L;
    }
}
