package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class N3 extends AbstractC2422e2 implements Y3 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Predicate f20927s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(AbstractC2432g2 abstractC2432g2, int i, Predicate predicate) {
        super(abstractC2432g2, i);
        this.f20927s = predicate;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        return EnumC2413c3.ORDERED.d(abstractC2404b.f21006m) ? E0(abstractC2404b, spliterator, new T(22)).spliterator() : new h4(abstractC2404b.y0(spliterator), this.f20927s, 0);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        return (G0) new a4(this, abstractC2510w1, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        return new M3(this, interfaceC2472o2, false);
    }

    @Override // j$.util.stream.Y3
    public final Z3 i(InterfaceC2519y0 interfaceC2519y0, boolean z6) {
        return new M3(this, interfaceC2519y0, z6);
    }
}
