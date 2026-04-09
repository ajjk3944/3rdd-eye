package j$.util.stream;

import j$.util.C2387g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final class I1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f20883h;
    public final /* synthetic */ BiConsumer i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Supplier f20884j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2444j f20885k;

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        return new J1(this.f20884j, this.i, this.f20883h);
    }

    @Override // j$.util.stream.AbstractC2510w1, j$.util.stream.I3
    public final int v() {
        Set<Collector.Characteristics> setCharacteristics = this.f20885k.f21094a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof EnumC2439i) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC2439i enumC2439i = (EnumC2439i) it.next();
                        hashSet.add(enumC2439i == null ? null : enumC2439i == EnumC2439i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC2439i == EnumC2439i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e6) {
                        C2387g.a(e6, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C2387g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC2439i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC2439i.UNORDERED : EnumC2439i.IDENTITY_FINISH);
                    } catch (ClassCastException e7) {
                        C2387g.a(e7, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(EnumC2439i.UNORDERED)) {
            return EnumC2413c3.f21038r;
        }
        return 0;
    }

    public I1(EnumC2418d3 enumC2418d3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C2444j c2444j) {
        this.f20883h = binaryOperator;
        this.i = biConsumer;
        this.f20884j = supplier;
        this.f20885k = c2444j;
    }
}
