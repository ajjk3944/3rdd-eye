package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class r6 extends v6 implements Spliterator.OfInt {
    public final /* synthetic */ s6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.stream.v6
    public final void a(int i4, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i4]);
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 b(Object obj, int i4, int i10) {
        return Spliterators.spliterator((int[]) obj, i4, i10 + i4, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, int i4, int i10, int i11, int i12) {
        super(s6Var, i4, i10, i11, i12);
        this.g = s6Var;
    }

    @Override // j$.util.stream.v6
    public final j$.util.c1 c(int i4, int i10, int i11, int i12) {
        return new r6(this.g, i4, i10, i11, i12);
    }
}
