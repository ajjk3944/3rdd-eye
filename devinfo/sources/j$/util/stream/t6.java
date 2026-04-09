package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class t6 extends v6 implements j$.util.z0 {
    public final /* synthetic */ u6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.stream.v6
    public final void a(int i4, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i4]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 b(Object obj, int i4, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = i10 + i4;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i4, i11);
        return new j$.util.q1(jArr, i4, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(u6 u6Var, int i4, int i10, int i11, int i12) {
        super(u6Var, i4, i10, i11, i12);
        this.g = u6Var;
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 c(int i4, int i10, int i11, int i12) {
        return new t6(this.g, i4, i10, i11, i12);
    }
}
