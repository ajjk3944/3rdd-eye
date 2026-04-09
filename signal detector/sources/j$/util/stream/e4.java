package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class e4 extends f4 {
    @Override // j$.util.stream.i4
    public final Spliterator b(Spliterator spliterator) {
        return new e4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.f4, j$.util.N
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        tryAdvance((IntConsumer) obj);
        return false;
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f21092c && a() && ((Spliterator.OfInt) this.f21090a).tryAdvance((IntConsumer) this)) {
            IntPredicate intPredicate = null;
            intPredicate.test(this.f21077e);
            throw null;
        }
        this.f21092c = false;
        return false;
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        if (this.f21091b.get()) {
            return null;
        }
        return (Spliterator.OfInt) super.trySplit();
    }
}
