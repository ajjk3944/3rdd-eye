package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2508w extends AbstractC2523z {
    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final C sequential() {
        this.f21002h.f21011r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final C parallel() {
        this.f21002h.f21011r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC2523z, j$.util.stream.C
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.f21002h.f21011r) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC2523z.L0(J0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2523z, j$.util.stream.C
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.f21002h.f21011r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC2523z.L0(J0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new r(this, EnumC2413c3.f21038r, 1);
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
