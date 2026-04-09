package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2464n extends AbstractC2422e2 {
    public static K0 L0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        C2399a c2399a = new C2399a(4);
        C2399a c2399a2 = new C2399a(5);
        C2399a c2399a3 = new C2399a(6);
        Objects.requireNonNull(c2399a);
        Objects.requireNonNull(c2399a2);
        Objects.requireNonNull(c2399a3);
        return new K0((Collection) new B1(EnumC2418d3.REFERENCE, c2399a3, c2399a2, c2399a, 3).j(abstractC2510w1, spliterator));
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        AbstractC2404b abstractC2404b = (AbstractC2404b) abstractC2510w1;
        if (EnumC2413c3.DISTINCT.d(abstractC2404b.f21006m)) {
            return abstractC2510w1.h0(spliterator, false, intFunction);
        }
        if (EnumC2413c3.ORDERED.d(abstractC2404b.f21006m)) {
            return L0(abstractC2510w1, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new O(tVar, false).a(abstractC2510w1, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new K0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        if (EnumC2413c3.DISTINCT.d(abstractC2404b.f21006m)) {
            return abstractC2404b.y0(spliterator);
        }
        if (EnumC2413c3.ORDERED.d(abstractC2404b.f21006m)) {
            return L0(abstractC2404b, spliterator).spliterator();
        }
        return new C2458l3(abstractC2404b.y0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        Objects.requireNonNull(interfaceC2472o2);
        if (EnumC2413c3.DISTINCT.d(i)) {
            return interfaceC2472o2;
        }
        if (EnumC2413c3.SORTED.d(i)) {
            return new C2454l(interfaceC2472o2);
        }
        return new C2459m(interfaceC2472o2);
    }
}
