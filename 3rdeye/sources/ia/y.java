package ia;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final x f38695a = new x(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f38696b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<x>[] f38697c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f38696b = iHighestOneBit;
        AtomicReference<x>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f38697c = atomicReferenceArr;
    }

    public static final void a(x segment) {
        kotlin.jvm.internal.l.f(segment, "segment");
        if (segment.f38693f != null || segment.f38694g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f38691d) {
            return;
        }
        AtomicReference<x> atomicReference = f38697c[(int) (Thread.currentThread().getId() & (f38696b - 1))];
        x xVar = f38695a;
        x andSet = atomicReference.getAndSet(xVar);
        if (andSet == xVar) {
            return;
        }
        int i = andSet != null ? andSet.f38690c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f38693f = andSet;
        segment.f38689b = 0;
        segment.f38690c = i + 8192;
        atomicReference.set(segment);
    }

    public static final x b() {
        AtomicReference<x> atomicReference = f38697c[(int) (Thread.currentThread().getId() & (f38696b - 1))];
        x xVar = f38695a;
        x andSet = atomicReference.getAndSet(xVar);
        if (andSet == xVar) {
            return new x();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new x();
        }
        atomicReference.set(andSet.f38693f);
        andSet.f38693f = null;
        andSet.f38690c = 0;
        return andSet;
    }
}
