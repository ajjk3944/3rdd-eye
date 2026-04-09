package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class p6 extends v6 implements j$.util.u0 {
    public final /* synthetic */ q6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.v6
    public final void a(int i4, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i4]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 b(Object obj, int i4, int i10) {
        double[] dArr = (double[]) obj;
        int i11 = i10 + i4;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i4, i11);
        return new j$.util.j1(dArr, i4, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, int i4, int i10, int i11, int i12) {
        super(q6Var, i4, i10, i11, i12);
        this.g = q6Var;
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 c(int i4, int i10, int i11, int i12) {
        return new p6(this.g, i4, i10, i11, i12);
    }
}
