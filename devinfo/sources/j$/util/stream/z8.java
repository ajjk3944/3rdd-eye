package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class z8 extends a9 {
    @Override // j$.util.stream.d9
    public final Spliterator b(Spliterator spliterator) {
        return new z8((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.a9, j$.util.c1
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        tryAdvance((IntConsumer) obj);
        return false;
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f26561c && a() && ((Spliterator.OfInt) this.f26559a).tryAdvance((IntConsumer) this)) {
            IntPredicate intPredicate = null;
            intPredicate.test(this.f26501e);
            throw null;
        }
        this.f26561c = false;
        return false;
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        if (this.f26560b.get()) {
            return null;
        }
        return (Spliterator.OfInt) super.trySplit();
    }
}
