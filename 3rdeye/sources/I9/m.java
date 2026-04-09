package I9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2641b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2642c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2643d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2644e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<h> f2645a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2642c;
        if (atomicIntegerFieldUpdater.get(this) - f2643d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f2629c.f2630a == 1) {
            f2644e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<h> atomicReferenceArray = this.f2645a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2643d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f2642c.get(this) == 0) {
                return null;
            }
            int i10 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f2645a.getAndSet(i10, null)) != null) {
                if (andSet.f2629c.f2630a == 1) {
                    f2644e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final h c(int i, boolean z10) {
        int i10 = i & 127;
        AtomicReferenceArray<h> atomicReferenceArray = this.f2645a;
        h hVar = atomicReferenceArray.get(i10);
        if (hVar != null) {
            if ((hVar.f2629c.f2630a == 1) == z10) {
                while (!atomicReferenceArray.compareAndSet(i10, hVar, null)) {
                    if (atomicReferenceArray.get(i10) != hVar) {
                    }
                }
                if (z10) {
                    f2644e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
