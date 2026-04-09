package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2430g0 extends AbstractC2445j0 {
    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final InterfaceC2460m0 sequential() {
        this.f21002h.f21011r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final InterfaceC2460m0 parallel() {
        this.f21002h.f21011r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC2445j0, j$.util.stream.InterfaceC2460m0
    public final void forEach(LongConsumer longConsumer) {
        if (this.f21002h.f21011r) {
            super.forEach(longConsumer);
        } else {
            AbstractC2445j0.L0(J0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2445j0, j$.util.stream.InterfaceC2460m0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f21002h.f21011r) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC2445j0.L0(J0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2493t(this, EnumC2413c3.f21038r, 4);
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
