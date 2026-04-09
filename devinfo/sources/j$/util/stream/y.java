package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class y extends a implements b0 {
    @Override // j$.util.stream.b0
    public final j$.util.b0 findAny() {
        return (j$.util.b0) z0(d0.f26549d);
    }

    @Override // j$.util.stream.b0
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) z0(d0.f26548c);
    }

    @Override // j$.util.stream.b0
    public final b0 sorted() {
        return new f6(this, a7.f26489q | a7.f26487o, 0);
    }

    public static j$.util.u0 L0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.u0) {
            return (j$.util.u0) spliterator;
        }
        if (i8.f26621a) {
            i8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z0(new l0(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z0(new l0(doubleConsumer, true));
    }

    @Override // j$.util.stream.a
    public final b7 D0() {
        return b7.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 B0(a aVar, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        return v3.Z(aVar, spliterator, z3);
    }

    @Override // j$.util.stream.a
    public final Spliterator K0(a aVar, Supplier supplier, boolean z3) {
        return new l7(aVar, supplier, z3);
    }

    @Override // j$.util.stream.a
    public final boolean C0(Spliterator spliterator, m5 m5Var) {
        DoubleConsumer e0Var;
        boolean zE;
        j$.util.u0 u0VarL0 = L0(spliterator);
        if (m5Var instanceof DoubleConsumer) {
            e0Var = (DoubleConsumer) m5Var;
        } else {
            if (i8.f26621a) {
                i8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(m5Var);
            e0Var = new j$.util.e0(m5Var, 1);
        }
        do {
            zE = m5Var.e();
            if (zE) {
                break;
            }
        } while (u0VarL0.tryAdvance(e0Var));
        return zE;
    }

    @Override // j$.util.stream.v3
    public final w1 t0(long j, IntFunction intFunction) {
        return v3.f0(j);
    }

    @Override // j$.util.stream.g
    public final j$.util.h0 iterator() {
        j$.util.u0 u0VarSpliterator = spliterator();
        Objects.requireNonNull(u0VarSpliterator);
        return new j$.util.h1(u0VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.u0 spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.b0
    public final Stream boxed() {
        return new p(this, 0, new j$.time.format.a(22), 0);
    }

    @Override // j$.util.stream.b0
    public final b0 map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new q(this, a7.f26488p | a7.f26486n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.b0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new p(this, a7.f26488p | a7.f26486n, doubleFunction, 0);
    }

    @Override // j$.util.stream.b0
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new r(this, a7.f26488p | a7.f26486n, 0);
    }

    @Override // j$.util.stream.b0
    public final k1 v() {
        Objects.requireNonNull(null);
        return new s(this, a7.f26488p | a7.f26486n, 0);
    }

    @Override // j$.util.stream.b0
    public final b0 d(j$.util.q qVar) {
        Objects.requireNonNull(qVar);
        return new q(this, a7.f26488p | a7.f26486n | a7.f26492t, qVar, 1);
    }

    @Override // j$.util.stream.b0
    public final b0 b() {
        Objects.requireNonNull(null);
        return new u(this, a7.f26492t, 1);
    }

    @Override // j$.util.stream.b0
    public final b0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new q(this, doubleConsumer);
    }

    @Override // j$.util.stream.b0
    public final b0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return x5.e(this, 0L, j);
    }

    @Override // j$.util.stream.b0
    public final b0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : x5.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.b0
    public final b0 a() {
        int i4 = e9.f26569a;
        Objects.requireNonNull(null);
        return new f6(this, e9.f26569a, 1);
    }

    @Override // j$.util.stream.b0
    public final b0 c() {
        int i4 = e9.f26569a;
        Objects.requireNonNull(null);
        return new f6(this, e9.f26570b, 2);
    }

    @Override // j$.util.stream.b0
    public final b0 distinct() {
        return ((e5) boxed()).distinct().mapToDouble(new j$.time.format.a(23));
    }

    @Override // j$.util.stream.b0
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.format.a(26), new j$.time.format.a(27), new j$.time.format.a(15));
        int i4 = j.f26622a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // j$.util.stream.b0
    public final j$.util.b0 min() {
        return reduce(new j$.time.format.a(16));
    }

    @Override // j$.util.stream.b0
    public final j$.util.b0 max() {
        return reduce(new j$.time.format.a(25));
    }

    @Override // j$.util.stream.b0
    public final j$.util.b0 average() {
        double[] dArr = (double[]) collect(new j$.time.format.a(17), new j$.time.format.a(18), new j$.time.format.a(19));
        if (dArr[2] <= 0.0d) {
            return j$.util.b0.f26287c;
        }
        int i4 = j.f26622a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return new j$.util.b0(d10 / dArr[2]);
    }

    @Override // j$.util.stream.b0
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.time.format.a(9), new j$.time.format.a(20), new j$.time.format.a(21));
    }

    @Override // j$.util.stream.b0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        n nVar = new n(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(nVar);
        return z0(new a4(b7.DOUBLE_VALUE, nVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.b0
    public final boolean p() {
        return ((Boolean) z0(v3.q0(r1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.b0
    public final boolean u() {
        return ((Boolean) z0(v3.q0(r1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.b0
    public final boolean C() {
        return ((Boolean) z0(v3.q0(r1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.b0
    public final double[] toArray() {
        return (double[]) v3.k0((y1) A0(new j$.time.format.a(24))).b();
    }

    @Override // j$.util.stream.b0
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z0(new e4(b7.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.b0
    public final j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.b0) z0(new y3(b7.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.b0
    public final long count() {
        return ((Long) z0(new c4(1))).longValue();
    }
}
