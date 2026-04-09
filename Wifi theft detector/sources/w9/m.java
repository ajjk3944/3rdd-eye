package w9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24864b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24865c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24866d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24867e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f24868a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f24864b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        if (e() == 127) {
            return gVar;
        }
        if (gVar.f24852b.b() == 1) {
            f24867e.incrementAndGet(this);
        }
        int i10 = f24865c.get(this) & 127;
        while (this.f24868a.get(i10) != null) {
            Thread.yield();
        }
        this.f24868a.lazySet(i10, gVar);
        f24865c.incrementAndGet(this);
        return null;
    }

    public final void c(g gVar) {
        if (gVar == null || gVar.f24852b.b() != 1) {
            return;
        }
        f24867e.decrementAndGet(this);
    }

    public final int e() {
        return f24865c.get(this) - f24866d.get(this);
    }

    public final int i() {
        return f24864b.get(this) != null ? e() + 1 : e();
    }

    public final void j(c cVar) {
        g gVar = (g) f24864b.getAndSet(this, null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        while (n(cVar)) {
        }
    }

    public final g k() {
        g gVar = (g) f24864b.getAndSet(this, null);
        return gVar == null ? m() : gVar;
    }

    public final g l() {
        return o(true);
    }

    public final g m() {
        g gVar;
        while (true) {
            int i10 = f24866d.get(this);
            if (i10 - f24865c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f24866d.compareAndSet(this, i10, i10 + 1) && (gVar = (g) this.f24868a.getAndSet(i11, null)) != null) {
                c(gVar);
                return gVar;
            }
        }
    }

    public final boolean n(c cVar) {
        g gVarM = m();
        if (gVarM == null) {
            return false;
        }
        cVar.a(gVarM);
        return true;
    }

    public final g o(boolean z10) {
        g gVar;
        do {
            gVar = (g) f24864b.get(this);
            if (gVar != null) {
                if ((gVar.f24852b.b() == 1) == z10) {
                }
            }
            int i10 = f24866d.get(this);
            int i11 = f24865c.get(this);
            while (i10 != i11) {
                if (z10 && f24867e.get(this) == 0) {
                    return null;
                }
                i11--;
                g gVarQ = q(i11, z10);
                if (gVarQ != null) {
                    return gVarQ;
                }
            }
            return null;
        } while (!t.a.a(f24864b, this, gVar, null));
        return gVar;
    }

    public final g p(int i10) {
        int i11 = f24866d.get(this);
        int i12 = f24865c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f24867e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            g gVarQ = q(i11, z10);
            if (gVarQ != null) {
                return gVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    public final g q(int i10, boolean z10) {
        int i11 = i10 & 127;
        g gVar = (g) this.f24868a.get(i11);
        if (gVar != null) {
            if ((gVar.f24852b.b() == 1) == z10 && kotlinx.coroutines.channels.f.a(this.f24868a, i11, gVar, null)) {
                if (z10) {
                    f24867e.decrementAndGet(this);
                }
                return gVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i10, Ref$ObjectRef ref$ObjectRef) {
        T tM = i10 == 3 ? m() : p(i10);
        if (tM == 0) {
            return s(i10, ref$ObjectRef);
        }
        ref$ObjectRef.element = tM;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, w9.g] */
    public final long s(int i10, Ref$ObjectRef ref$ObjectRef) {
        ?? r02;
        do {
            r02 = (g) f24864b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.f24852b.b() != 1 ? 2 : 1) & i10) == 0) {
                return -2L;
            }
            long jA = k.f24860f.a() - r02.f24851a;
            long j10 = k.f24856b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!t.a.a(f24864b, this, r02, null));
        ref$ObjectRef.element = r02;
        return -1L;
    }
}
