package j$.util.stream;

import j$.util.C2390j;
import j$.util.C2393m;
import j$.util.C2394n;
import j$.util.C2528t;
import j$.util.InterfaceC2531w;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2405b0 extends AbstractC2404b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final C2394n findAny() {
        return (C2394n) z0(F.f20858d);
    }

    @Override // j$.util.stream.IntStream
    public final C2394n findFirst() {
        return (C2394n) z0(F.f20857c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new I2(this, EnumC2413c3.f21037q | EnumC2413c3.f21035o);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z0(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z0(new M(intConsumer, true));
    }

    public static Spliterator.OfInt L0(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (K3.f20903a) {
            K3.a(AbstractC2404b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC2404b
    public final EnumC2418d3 D0() {
        return EnumC2418d3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 B0(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC2510w1.a0(abstractC2404b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator K0(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6) {
        return new C2478p3(abstractC2404b, supplier, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final boolean C0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        IntConsumer c2528t;
        boolean zE;
        Spliterator.OfInt ofIntL0 = L0(spliterator);
        if (interfaceC2472o2 instanceof IntConsumer) {
            c2528t = (IntConsumer) interfaceC2472o2;
        } else {
            if (K3.f20903a) {
                K3.a(AbstractC2404b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2472o2);
            c2528t = new C2528t(interfaceC2472o2, 1);
        }
        do {
            zE = interfaceC2472o2.e();
            if (zE) {
                break;
            }
        } while (ofIntL0.tryAdvance(c2528t));
        return zE;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2519y0 t0(long j6, IntFunction intFunction) {
        return AbstractC2510w1.o0(j6);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2531w iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.Q(ofIntSpliterator);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final Spliterator.OfInt spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2460m0 asLongStream() {
        return new C2493t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C asDoubleStream() {
        return new r(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C2479q(this, 0, new T(1), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new C2488s(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C2479q(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2460m0 l() {
        Objects.requireNonNull(null);
        return new C2493t(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final C g() {
        Objects.requireNonNull(null);
        return new r(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) z0(new M1(EnumC2418d3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(K k6) {
        Objects.requireNonNull(k6);
        return new V(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, k6, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C2394n reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (C2394n) z0(new C2525z1(EnumC2418d3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C2488s(this, EnumC2413c3.f21040t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new V(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(Long.toString(j6));
        }
        return AbstractC2526z2.f(this, 0L, j6);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : AbstractC2526z2.f(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new P3(this, j4.f21102a);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new R3(this, j4.f21103b);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) z0(new D1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC2432g2) boxed()).distinct().mapToInt(new T(0));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new T(5));
    }

    @Override // j$.util.stream.IntStream
    public final C2394n min() {
        return reduce(new T(2));
    }

    @Override // j$.util.stream.IntStream
    public final C2394n max() {
        return reduce(new T(6));
    }

    @Override // j$.util.stream.IntStream
    public final C2393m average() {
        long j6 = ((long[]) collect(new T(7), new T(8), new T(9)))[0];
        return j6 > 0 ? new C2393m(r0[1] / j6) : C2393m.f20807c;
    }

    @Override // j$.util.stream.IntStream
    public final C2390j summaryStatistics() {
        return (C2390j) collect(new C2399a(2), new T(3), new T(4));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2469o c2469o = new C2469o(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c2469o);
        return z0(new B1(EnumC2418d3.INT_VALUE, c2469o, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean x() {
        return ((Boolean) z0(AbstractC2510w1.r0(EnumC2494t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((Boolean) z0(AbstractC2510w1.r0(EnumC2494t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) z0(AbstractC2510w1.r0(EnumC2494t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC2510w1.l0((C0) A0(new C2399a(29))).b();
    }
}
