package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class Z extends AbstractC2405b0 {
    @Override // j$.util.stream.AbstractC2404b
    public final boolean G0() {
        return true;
    }

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

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h unordered() {
        return !EnumC2413c3.ORDERED.d(this.f21006m) ? this : new C2488s(this, EnumC2413c3.f21038r, 2);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
