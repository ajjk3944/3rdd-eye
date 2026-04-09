package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class d4 extends f4 {
    @Override // j$.util.stream.i4
    public final Spliterator b(Spliterator spliterator) {
        return new d4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z6 = this.f21092c;
        Spliterator spliterator = this.f21090a;
        if (z6) {
            this.f21092c = false;
            boolean zTryAdvance = ((Spliterator.OfInt) spliterator).tryAdvance((IntConsumer) this);
            if (zTryAdvance && a()) {
                IntPredicate intPredicate = null;
                intPredicate.test(this.f21077e);
                throw null;
            }
            if (zTryAdvance) {
                intConsumer.accept(this.f21077e);
            }
            return zTryAdvance;
        }
        return ((Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
    }
}
