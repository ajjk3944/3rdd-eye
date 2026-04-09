package j$.util.stream;

import j$.util.C2389i;
import j$.util.C2393m;
import j$.util.C2396p;
import j$.util.InterfaceC2398s;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2523z extends AbstractC2404b implements C {
    @Override // j$.util.stream.C
    public final C2393m findAny() {
        return (C2393m) z0(E.f20847d);
    }

    @Override // j$.util.stream.C
    public final C2393m findFirst() {
        return (C2393m) z0(E.f20846c);
    }

    @Override // j$.util.stream.C
    public final C sorted() {
        return new H2(this, EnumC2413c3.f21037q | EnumC2413c3.f21035o, 0);
    }

    public static j$.util.F L0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.F) {
            return (j$.util.F) spliterator;
        }
        if (K3.f20903a) {
            K3.a(AbstractC2404b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z0(new L(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z0(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC2404b
    public final EnumC2418d3 D0() {
        return EnumC2418d3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 B0(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        return AbstractC2510w1.Z(abstractC2404b, spliterator, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator K0(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6) {
        return new C2468n3(abstractC2404b, supplier, z6);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final boolean C0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        DoubleConsumer c2396p;
        boolean zE;
        j$.util.F fL0 = L0(spliterator);
        if (interfaceC2472o2 instanceof DoubleConsumer) {
            c2396p = (DoubleConsumer) interfaceC2472o2;
        } else {
            if (K3.f20903a) {
                K3.a(AbstractC2404b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC2472o2);
            c2396p = new C2396p(interfaceC2472o2, 1);
        }
        do {
            zE = interfaceC2472o2.e();
            if (zE) {
                break;
            }
        } while (fL0.tryAdvance(c2396p));
        return zE;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2519y0 t0(long j6, IntFunction intFunction) {
        return AbstractC2510w1.f0(j6);
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2398s iterator() {
        j$.util.F fSpliterator = spliterator();
        Objects.requireNonNull(fSpliterator);
        return new j$.util.T(fSpliterator);
    }

    @Override // j$.util.stream.AbstractC2404b, j$.util.stream.InterfaceC2434h
    public final j$.util.F spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.C
    public final Stream boxed() {
        return new C2479q(this, 0, new C2399a(14), 0);
    }

    @Override // j$.util.stream.C
    public final C e() {
        Objects.requireNonNull(null);
        return new r(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 0);
    }

    @Override // j$.util.stream.C
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C2479q(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, doubleFunction, 0);
    }

    @Override // j$.util.stream.C
    public final IntStream y() {
        Objects.requireNonNull(null);
        return new C2488s(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 0);
    }

    @Override // j$.util.stream.C
    public final InterfaceC2460m0 u() {
        Objects.requireNonNull(null);
        return new C2493t(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n, 0);
    }

    @Override // j$.util.stream.C
    public final C d(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return new C2503v(this, EnumC2413c3.f21036p | EnumC2413c3.f21034n | EnumC2413c3.f21040t, gVar, 0);
    }

    @Override // j$.util.stream.C
    public final C b() {
        Objects.requireNonNull(null);
        return new r(this, EnumC2413c3.f21040t, 2);
    }

    @Override // j$.util.stream.C
    public final C peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C2503v(this, doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final C limit(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(Long.toString(j6));
        }
        return AbstractC2526z2.e(this, 0L, j6);
    }

    @Override // j$.util.stream.C
    public final C skip(long j6) {
        if (j6 >= 0) {
            return j6 == 0 ? this : AbstractC2526z2.e(this, j6, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j6));
    }

    @Override // j$.util.stream.C
    public final C a() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new H2(this, j4.f21102a, 1);
    }

    @Override // j$.util.stream.C
    public final C c() {
        int i = j4.f21102a;
        Objects.requireNonNull(null);
        return new X3(this, j4.f21103b);
    }

    @Override // j$.util.stream.C
    public final C distinct() {
        return ((AbstractC2432g2) boxed()).distinct().mapToDouble(new C2399a(15));
    }

    @Override // j$.util.stream.C
    public final double sum() {
        double[] dArr = (double[]) collect(new C2399a(18), new C2399a(19), new C2399a(7));
        int i = AbstractC2449k.f21104a;
        double d6 = dArr[0] + dArr[1];
        double d7 = dArr[dArr.length - 1];
        return (Double.isNaN(d6) && Double.isInfinite(d7)) ? d7 : d6;
    }

    @Override // j$.util.stream.C
    public final C2393m min() {
        return reduce(new C2399a(8));
    }

    @Override // j$.util.stream.C
    public final C2393m max() {
        return reduce(new C2399a(17));
    }

    @Override // j$.util.stream.C
    public final C2393m average() {
        double[] dArr = (double[]) collect(new C2399a(9), new C2399a(10), new C2399a(11));
        if (dArr[2] <= 0.0d) {
            return C2393m.f20807c;
        }
        int i = AbstractC2449k.f21104a;
        double d6 = dArr[0] + dArr[1];
        double d7 = dArr[dArr.length - 1];
        if (Double.isNaN(d6) && Double.isInfinite(d7)) {
            d6 = d7;
        }
        return new C2393m(d6 / dArr[2]);
    }

    @Override // j$.util.stream.C
    public final C2389i summaryStatistics() {
        return (C2389i) collect(new C2399a(1), new C2399a(12), new C2399a(13));
    }

    @Override // j$.util.stream.C
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C2469o c2469o = new C2469o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c2469o);
        return z0(new B1(EnumC2418d3.DOUBLE_VALUE, c2469o, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.C
    public final boolean n() {
        return ((Boolean) z0(AbstractC2510w1.q0(EnumC2494t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean t() {
        return ((Boolean) z0(AbstractC2510w1.q0(EnumC2494t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean B() {
        return ((Boolean) z0(AbstractC2510w1.q0(EnumC2494t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final double[] toArray() {
        return (double[]) AbstractC2510w1.k0((A0) A0(new C2399a(16))).b();
    }

    @Override // j$.util.stream.C
    public final double reduce(double d6, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z0(new F1(EnumC2418d3.DOUBLE_VALUE, doubleBinaryOperator, d6))).doubleValue();
    }

    @Override // j$.util.stream.C
    public final C2393m reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C2393m) z0(new C2525z1(EnumC2418d3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.C
    public final long count() {
        return ((Long) z0(new D1(1))).longValue();
    }
}
