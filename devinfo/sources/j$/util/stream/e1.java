package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class e1 extends h1 {
    @Override // j$.util.stream.a, j$.util.stream.g
    public final k1 sequential() {
        this.f26458h.f26467r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final k1 parallel() {
        this.f26458h.f26467r = true;
        return this;
    }

    @Override // j$.util.stream.h1, j$.util.stream.k1
    public final void forEach(LongConsumer longConsumer) {
        if (this.f26458h.f26467r) {
            super.forEach(longConsumer);
        } else {
            h1.L0(J0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.h1, j$.util.stream.k1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f26458h.f26467r) {
            super.forEachOrdered(longConsumer);
        } else {
            h1.L0(J0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !a7.ORDERED.l(this.f26462m) ? this : new s(this, a7.f26490r, 4);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.a
    public final boolean G0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        throw new UnsupportedOperationException();
    }
}
