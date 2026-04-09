package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class w0 extends z0 {
    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream sequential() {
        this.f26458h.f26467r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream parallel() {
        this.f26458h.f26467r = true;
        return this;
    }

    @Override // j$.util.stream.z0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f26458h.f26467r) {
            super.forEach(intConsumer);
        } else {
            z0.L0(J0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.z0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f26458h.f26467r) {
            super.forEachOrdered(intConsumer);
        } else {
            z0.L0(J0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !a7.ORDERED.l(this.f26462m) ? this : new r(this, a7.f26490r, 2);
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
