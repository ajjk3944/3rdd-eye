package ej;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f46533a = new z();

    /* renamed from: b, reason: collision with root package name */
    private static final int f46534b = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;

    /* renamed from: c, reason: collision with root package name */
    private static final y f46535c = new y(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f46536d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f46537e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f46536d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f46537e = atomicReferenceArr;
    }

    private z() {
    }

    private final AtomicReference a() {
        return f46537e[(int) (Thread.currentThread().getId() & (f46536d - 1))];
    }

    public static final void b(y segment) {
        AbstractC6492s.i(segment, "segment");
        if (segment.f46531f != null || segment.f46532g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f46529d) {
            return;
        }
        AtomicReference atomicReferenceA = f46533a.a();
        y yVar = f46535c;
        y yVar2 = (y) atomicReferenceA.getAndSet(yVar);
        if (yVar2 == yVar) {
            return;
        }
        int i10 = yVar2 != null ? yVar2.f46528c : 0;
        if (i10 >= f46534b) {
            atomicReferenceA.set(yVar2);
            return;
        }
        segment.f46531f = yVar2;
        segment.f46527b = 0;
        segment.f46528c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final y c() {
        AtomicReference atomicReferenceA = f46533a.a();
        y yVar = f46535c;
        y yVar2 = (y) atomicReferenceA.getAndSet(yVar);
        if (yVar2 == yVar) {
            return new y();
        }
        if (yVar2 == null) {
            atomicReferenceA.set(null);
            return new y();
        }
        atomicReferenceA.set(yVar2.f46531f);
        yVar2.f46531f = null;
        yVar2.f46528c = 0;
        return yVar2;
    }
}
