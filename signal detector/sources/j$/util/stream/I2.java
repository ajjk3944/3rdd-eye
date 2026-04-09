package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class I2 extends Z {
    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        Objects.requireNonNull(interfaceC2472o2);
        return EnumC2413c3.SORTED.d(i) ? interfaceC2472o2 : EnumC2413c3.SIZED.d(i) ? new N2(interfaceC2472o2) : new F2(interfaceC2472o2);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2413c3.SORTED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
            return abstractC2510w1.h0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((C0) abstractC2510w1.h0(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C2406b1(iArr);
    }
}
