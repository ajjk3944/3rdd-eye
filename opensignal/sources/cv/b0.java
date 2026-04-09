package cv;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f6688a = new a0(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f6689b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f6690c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f6689b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f6690c = atomicReferenceArr;
    }

    public static final void a(a0 a0Var) {
        br.l.e(a0Var, "segment");
        if (a0Var.f6683f != null || a0Var.f6684g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (a0Var.f6681d) {
            return;
        }
        AtomicReference atomicReference = f6690c[(int) (Thread.currentThread().getId() & (f6689b - 1))];
        a0 a0Var2 = f6688a;
        a0 a0Var3 = (a0) atomicReference.getAndSet(a0Var2);
        if (a0Var3 == a0Var2) {
            return;
        }
        int i10 = a0Var3 != null ? a0Var3.f6680c : 0;
        if (i10 >= 65536) {
            atomicReference.set(a0Var3);
            return;
        }
        a0Var.f6683f = a0Var3;
        a0Var.f6679b = 0;
        a0Var.f6680c = i10 + 8192;
        atomicReference.set(a0Var);
    }

    public static final a0 b() {
        AtomicReference atomicReference = f6690c[(int) (Thread.currentThread().getId() & (f6689b - 1))];
        a0 a0Var = f6688a;
        a0 a0Var2 = (a0) atomicReference.getAndSet(a0Var);
        if (a0Var2 == a0Var) {
            return new a0();
        }
        if (a0Var2 == null) {
            atomicReference.set(null);
            return new a0();
        }
        atomicReference.set(a0Var2.f6683f);
        a0Var2.f6683f = null;
        a0Var2.f6680c = 0;
        return a0Var2;
    }
}
