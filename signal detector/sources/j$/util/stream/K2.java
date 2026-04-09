package j$.util.stream;

import j$.util.EnumC2386f;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class K2 extends AbstractC2422e2 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20901s;

    /* renamed from: t, reason: collision with root package name */
    public final Comparator f20902t;

    public K2(AbstractC2432g2 abstractC2432g2) {
        super(abstractC2432g2, EnumC2413c3.f21037q | EnumC2413c3.f21035o);
        this.f20901s = true;
        this.f20902t = EnumC2386f.INSTANCE;
    }

    public K2(AbstractC2432g2 abstractC2432g2, Comparator comparator) {
        super(abstractC2432g2, EnumC2413c3.f21037q | EnumC2413c3.f21036p);
        this.f20901s = false;
        this.f20902t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        Objects.requireNonNull(interfaceC2472o2);
        if (EnumC2413c3.SORTED.d(i) && this.f20901s) {
            return interfaceC2472o2;
        }
        if (EnumC2413c3.SIZED.d(i)) {
            return new P2(interfaceC2472o2, this.f20902t);
        }
        return new L2(interfaceC2472o2, this.f20902t);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2413c3.SORTED.d(((AbstractC2404b) abstractC2510w1).f21006m) && this.f20901s) {
            return abstractC2510w1.h0(spliterator, false, intFunction);
        }
        Object[] objArrN = abstractC2510w1.h0(spliterator, true, intFunction).n(intFunction);
        Arrays.sort(objArrN, this.f20902t);
        return new J0(objArrN);
    }
}
