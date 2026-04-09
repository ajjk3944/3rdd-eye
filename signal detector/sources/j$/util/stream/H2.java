package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class H2 extends AbstractC2513x {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f20875s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H2(AbstractC2404b abstractC2404b, int i, int i3) {
        super(abstractC2404b, i);
        this.f20875s = i3;
    }

    @Override // j$.util.stream.AbstractC2404b
    public Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        switch (this.f20875s) {
            case 1:
                return EnumC2413c3.ORDERED.d(abstractC2404b.f21006m) ? E0(abstractC2404b, spliterator, new Z1(10)).spliterator() : new c4((j$.util.F) abstractC2404b.y0(spliterator), 1);
            default:
                return super.F0(abstractC2404b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f20875s) {
            case 0:
                if (EnumC2413c3.SORTED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
                    return abstractC2510w1.h0(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((A0) abstractC2510w1.h0(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new S0(dArr);
            default:
                return (G0) new b4(this, abstractC2510w1, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        switch (this.f20875s) {
            case 0:
                Objects.requireNonNull(interfaceC2472o2);
                if (EnumC2413c3.SORTED.d(i)) {
                    return interfaceC2472o2;
                }
                return EnumC2413c3.SIZED.d(i) ? new M2(interfaceC2472o2) : new E2(interfaceC2472o2);
            default:
                return new V3(this, interfaceC2472o2);
        }
    }
}
