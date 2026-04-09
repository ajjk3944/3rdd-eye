package Ri;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.N;
import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19996b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19997c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19998d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19999e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f20000a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f19987b) {
            f19999e.incrementAndGet(this);
        }
        int i10 = f19997c.get(this) & BER.MAX_OID_LENGTH;
        while (this.f20000a.get(i10) != null) {
            Thread.yield();
        }
        this.f20000a.lazySet(i10, hVar);
        f19997c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f19987b) {
            return;
        }
        f19999e.decrementAndGet(this);
    }

    private final int e() {
        return f19997c.get(this) - f19998d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f19998d.get(this);
            if (i10 - f19997c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & BER.MAX_OID_LENGTH;
            if (f19998d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f20000a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f19996b.get(this);
            if (hVar == null || hVar.f19987b != z10) {
                int i10 = f19998d.get(this);
                int i11 = f19997c.get(this);
                while (i10 != i11) {
                    if (z10 && f19999e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f19996b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f19998d.get(this);
        int i12 = f19997c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f19999e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & BER.MAX_OID_LENGTH;
        h hVar = (h) this.f20000a.get(i11);
        if (hVar == null || hVar.f19987b != z10 || !Ki.l.a(this.f20000a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f19999e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, N n10) {
        h hVar;
        do {
            hVar = (h) f19996b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f19987b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f19994f.a() - hVar.f19986a;
            long j10 = j.f19990b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f19996b, this, hVar, null));
        n10.f51689a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f19996b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f19996b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f19996b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f19996b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, N n10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, n10);
        }
        n10.f51689a = hVarM;
        return -1L;
    }
}
