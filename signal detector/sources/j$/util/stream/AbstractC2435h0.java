package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2435h0 extends AbstractC2445j0 {
    @Override // j$.util.stream.AbstractC2404b
    public final boolean G0() {
        return true;
    }

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

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2493t(this, EnumC2413c3.f21038r, 4);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
