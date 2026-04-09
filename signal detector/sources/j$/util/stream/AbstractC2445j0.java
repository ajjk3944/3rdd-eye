package j$.util.stream;

import j$.util.C2392l;
import j$.util.C2393m;
import j$.util.C2395o;
import j$.util.C2532x;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2445j0 extends AbstractC2404b implements InterfaceC2460m0 {
    @Override // j$.util.stream.InterfaceC2460m0
    public final C2395o findAny() {
        return (C2395o) z0(G.f20864d);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2395o findFirst() {
        return (C2395o) z0(G.f20863c);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 sorted() {
        return new J2(this, EnumC2413c3.f21037q | EnumC2413c3.f21035o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z0(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z0(new N(longConsumer, true));
    }

    public static j$.util.K L0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.K) {
            return (j$.util.K) spliterator;
        }
        if (K3.f20903a) {
            K3.a(AbstractC2404b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC2404b
    public final EnumC2418d3 D0() {
        return EnumC2418d3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 B0(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC2510w1.b0(abstractC2404b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator K0(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6) {
        return new C2487r3(abstractC2404b, supplier, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final boolean C0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        LongConsumer c2532x;
        boolean zE;
        j$.util.K kL0 = L0(spliterator);
        if (interfaceC2472o2 instanceof LongConsumer) {
            c2532x = (LongConsumer) interfaceC2472o2;
        } else {
            if (K3.f20903a) {
                K3.a(AbstractC2404b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2472o2);
            c2532x = new C2532x(interfaceC2472o2, 1);
        }
        do {
            zE = interfaceC2472o2.e();
            if (zE) {
                break;
            }
        } while (kL0.tryAdvance(c2532x));
        return zE;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2519y0 t0(long j6, IntFunction intFunction) {
        return AbstractC2510w1.p0(j6);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final j$.util.A iterator() {
        j$.util.K kSpliterator = spliterator();
        Objects.requireNonNull(kSpliterator);
        return new j$.util.S(kSpliterator);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final j$.util.K spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C asDoubleStream() {
        return new r(this, EnumC2413c3.f21034n, 5);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final Stream boxed() {
        return new C2479q(this, 0, new T(15), 2);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 e() {
        Objects.requireNonNull(null);
        return new C2493t(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 3);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C2479q(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new C2488s(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 4);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C k() {
        Objects.requireNonNull(null);
        return new r(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 6);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 d(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new C2425f0(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 0);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 b() {
        Objects.requireNonNull(null);
        return new C2493t(this, EnumC2413c3.f21040t, 5);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C2425f0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 limit(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(Long.toString(j6));
        }
        return AbstractC2526z2.g(this, 0L, j6);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : AbstractC2526z2.g(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 a() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new J2(this, j4.f21102a, 1);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 c() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new U3(this, j4.f21103b);
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final InterfaceC2460m0 distinct() {
        return ((AbstractC2432g2) boxed()).distinct().mapToLong(new T(12));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final long sum() {
        return reduce(0L, new T(20));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2395o min() {
        return reduce(new T(11));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2395o max() {
        return reduce(new T(19));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2393m average() {
        long j6 = ((long[]) collect(new T(16), new T(17), new T(18)))[0];
        return j6 > 0 ? new C2393m(r0[1] / j6) : C2393m.f20807c;
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final long reduce(long j6, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z0(new C2515x1(EnumC2418d3.LONG_VALUE, longBinaryOperator, j6))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2392l summaryStatistics() {
        return (C2392l) collect(new C2399a(3), new T(10), new T(13));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2469o c2469o = new C2469o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c2469o);
        return z0(new B1(EnumC2418d3.LONG_VALUE, c2469o, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final boolean p() {
        return ((Boolean) z0(AbstractC2510w1.s0(EnumC2494t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final C2395o reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C2395o) z0(new C2525z1(EnumC2418d3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final boolean w() {
        return ((Boolean) z0(AbstractC2510w1.s0(EnumC2494t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final boolean m() {
        return ((Boolean) z0(AbstractC2510w1.s0(EnumC2494t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final long[] toArray() {
        return (long[]) AbstractC2510w1.m0((E0) A0(new T(14))).b();
    }

    @Override // j$.util.stream.InterfaceC2460m0
    public final long count() {
        return ((Long) z0(new D1(0))).longValue();
    }
}
