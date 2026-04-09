package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2432g2 extends AbstractC2404b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new K2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C2464n(this, EnumC2413c3.f21033m | EnumC2413c3.f21040t);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) z0(H.f20870d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) z0(H.f20869c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new K2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return z0(new B1(EnumC2418d3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return z0(new B1(EnumC2418d3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z0(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z0(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC2404b
    public final EnumC2418d3 D0() {
        return EnumC2418d3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) z0(new C2525z1(EnumC2418d3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 B0(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC2510w1.Y(abstractC2404b, spliterator, z6, intFunction);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator K0(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6) {
        return new G3(abstractC2404b, supplier, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final boolean C0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        boolean zE;
        do {
            zE = interfaceC2472o2.e();
            if (zE) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC2472o2));
        return zE;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2519y0 t0(long j6, IntFunction intFunction) {
        return AbstractC2510w1.X(j6, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.P(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C2479q(this, EnumC2413c3.f21040t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C2479q(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new V(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return z0(new B1(EnumC2418d3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2460m0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C2425f0(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final C mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C2503v(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) z0(new D1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new C2479q(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream C(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new V(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final C z(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new C2503v(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(j$.util.stream.C2444j r10) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC2432g2.h(j$.util.stream.j):java.lang.Object");
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2460m0 r(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new C2425f0(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C2479q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(Long.toString(j6));
        }
        return AbstractC2526z2.h(this, 0L, j6);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : AbstractC2526z2.h(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = j4.f21102a;
        Objects.requireNonNull(predicate);
        return new L3(this, j4.f21102a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = j4.f21102a;
        Objects.requireNonNull(predicate);
        return new N3(this, j4.f21103b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC2510w1.j0(A0(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new Z1(0));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) z0(AbstractC2510w1.u0(EnumC2494t0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) z0(AbstractC2510w1.u0(EnumC2494t0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) z0(AbstractC2510w1.u0(EnumC2494t0.NONE, predicate))).booleanValue();
    }
}
