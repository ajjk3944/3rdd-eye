package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class P3 extends Z {
    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        return EnumC2413c3.ORDERED.d(abstractC2404b.f21006m) ? E0(abstractC2404b, spliterator, new Z1(6)).spliterator() : new e4((Spliterator.OfInt) abstractC2404b.y0(spliterator));
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        return (G0) new b4(this, abstractC2510w1, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        return new O3(this, interfaceC2472o2);
    }
}
