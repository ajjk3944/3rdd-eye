package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class g6 extends x0 {
    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        Objects.requireNonNull(m5Var);
        return a7.SORTED.l(i4) ? m5Var : a7.SIZED.l(i4) ? new l6(m5Var) : new d6(m5Var);
    }

    @Override // j$.util.stream.a
    public final e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        if (a7.SORTED.l(((a) v3Var).f26462m)) {
            return v3Var.h0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((a2) v3Var.h0(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new a3(iArr);
    }
}
