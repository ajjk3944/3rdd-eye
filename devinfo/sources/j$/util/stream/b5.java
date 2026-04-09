package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class b5 extends e5 {
    @Override // j$.util.stream.e5, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.f26458h.f26467r) {
            J0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f26458h.f26467r) {
            J0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !a7.ORDERED.l(this.f26462m) ? this : new z4(this, a7.f26490r);
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
