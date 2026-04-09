package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class Y extends AbstractC2405b0 {
    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final IntStream sequential() {
        this.f21002h.f21011r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final IntStream parallel() {
        this.f21002h.f21011r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC2405b0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f21002h.f21011r) {
            super.forEach(intConsumer);
        } else {
            AbstractC2405b0.L0(J0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2405b0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f21002h.f21011r) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC2405b0.L0(J0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2488s(this, EnumC2413c3.f21038r, 2);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final boolean G0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        throw new UnsupportedOperationException();
    }
}
