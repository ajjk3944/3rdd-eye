package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2417d2 extends AbstractC2432g2 {
    @Override // j$.util.stream.AbstractC2432g2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.f21002h.f21011r) {
            J0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC2432g2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f21002h.f21011r) {
            J0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2407b2(this, EnumC2413c3.f21038r);
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
