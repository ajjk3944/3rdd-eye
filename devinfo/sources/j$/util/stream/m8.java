package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m8 extends x0 {
    @Override // j$.util.stream.a
    public final Spliterator F0(a aVar, Spliterator spliterator) {
        return a7.ORDERED.l(aVar.f26462m) ? E0(aVar, spliterator, new f2(14)).spliterator() : new z8((Spliterator.OfInt) aVar.y0(spliterator));
    }

    @Override // j$.util.stream.a
    public final e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        return (e2) new w8(this, v3Var, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        return new l8(this, m5Var);
    }
}
