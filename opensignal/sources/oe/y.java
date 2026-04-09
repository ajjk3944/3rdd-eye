package oe;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class y extends a0 {
    public static a0 f(int i10) {
        return i10 < 0 ? a0.f19296b : i10 > 0 ? a0.f19297c : a0.f19295a;
    }

    @Override // oe.a0
    public final a0 a(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // oe.a0
    public final a0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // oe.a0
    public final a0 c(boolean z10, boolean z11) {
        return f(z10 == z11 ? 0 : z10 ? 1 : -1);
    }

    @Override // oe.a0
    public final a0 d(boolean z10, boolean z11) {
        return f(z11 == z10 ? 0 : z11 ? 1 : -1);
    }

    @Override // oe.a0
    public final int e() {
        return 0;
    }
}
