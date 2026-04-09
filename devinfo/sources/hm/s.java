package hm;

import com.applovin.shadow.okio.Segment;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f25212a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f25213b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f25214c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f25213b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i4 = 0; i4 < iHighestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f25214c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        nk.k.e(rVar, "segment");
        if (rVar.f25211f != null || rVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (rVar.f25209d) {
            return;
        }
        AtomicReference atomicReference = f25214c[(int) (Thread.currentThread().getId() & (f25213b - 1))];
        r rVar2 = f25212a;
        r rVar3 = (r) atomicReference.getAndSet(rVar2);
        if (rVar3 == rVar2) {
            return;
        }
        int i4 = rVar3 != null ? rVar3.f25208c : 0;
        if (i4 >= 65536) {
            atomicReference.set(rVar3);
            return;
        }
        rVar.f25211f = rVar3;
        rVar.f25207b = 0;
        rVar.f25208c = i4 + Segment.SIZE;
        atomicReference.set(rVar);
    }

    public static final r b() {
        AtomicReference atomicReference = f25214c[(int) (Thread.currentThread().getId() & (f25213b - 1))];
        r rVar = f25212a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f25211f);
        rVar2.f25211f = null;
        rVar2.f25208c = 0;
        return rVar2;
    }
}
