package Q0;

import Q0.A;

/* renamed from: Q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3428e {
    public static final A a(A.a aVar) {
        return aVar.h();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(A a10, int i10) {
        return b(a10.compareTo(a(A.f18971b)) >= 0, v.f(i10, v.f19100b.a()));
    }
}
