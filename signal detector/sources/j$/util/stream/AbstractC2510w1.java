package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2510w1 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f21183a = new Y0();

    /* renamed from: b, reason: collision with root package name */
    public static final W0 f21184b = new W0();

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f21185c = new X0();

    /* renamed from: d, reason: collision with root package name */
    public static final V0 f21186d = new V0();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21187e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f21188f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public static final double[] f21189g = new double[0];

    public abstract void d0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2);

    public abstract boolean e0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2);

    public abstract G0 h0(Spliterator spliterator, boolean z6, IntFunction intFunction);

    public abstract long i0(Spliterator spliterator);

    public abstract InterfaceC2519y0 t0(long j6, IntFunction intFunction);

    @Override // j$.util.stream.I3
    public /* synthetic */ int v() {
        return 0;
    }

    public abstract R1 v0();

    public abstract InterfaceC2472o2 w0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2);

    public abstract InterfaceC2472o2 x0(InterfaceC2472o2 interfaceC2472o2);

    public abstract Spliterator y0(Spliterator spliterator);

    public static j$.util.function.g n0(Function function) {
        j$.util.function.g gVar = new j$.util.function.g(4);
        gVar.f20799b = function;
        return gVar;
    }

    public static j$.util.concurrent.t u0(EnumC2494t0 enumC2494t0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC2494t0);
        return new j$.util.concurrent.t(EnumC2418d3.REFERENCE, enumC2494t0, new j$.util.concurrent.t(5, enumC2494t0, predicate));
    }

    public static Z0 g0(EnumC2418d3 enumC2418d3) {
        int i = H0.f20871a[enumC2418d3.ordinal()];
        if (i == 1) {
            return f21183a;
        }
        if (i == 2) {
            return f21184b;
        }
        if (i == 3) {
            return f21185c;
        }
        if (i == 4) {
            return f21186d;
        }
        throw new IllegalStateException("Unknown shape " + enumC2418d3);
    }

    public static j$.util.concurrent.t r0(EnumC2494t0 enumC2494t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2494t0);
        return new j$.util.concurrent.t(EnumC2418d3.INT_VALUE, enumC2494t0, new C2465n0(enumC2494t0, 1));
    }

    public static G0 W(G0 g02, long j6, long j7, IntFunction intFunction) {
        if (j6 == 0 && j7 == g02.count()) {
            return g02;
        }
        Spliterator spliterator = g02.spliterator();
        long j8 = j7 - j6;
        InterfaceC2519y0 interfaceC2519y0X = X(j8, intFunction);
        interfaceC2519y0X.c(j8);
        for (int i = 0; i < j6 && spliterator.tryAdvance(new T(21)); i++) {
        }
        if (j7 == g02.count()) {
            spliterator.forEachRemaining(interfaceC2519y0X);
        } else {
            for (int i3 = 0; i3 < j8 && spliterator.tryAdvance(interfaceC2519y0X); i3++) {
            }
        }
        interfaceC2519y0X.m();
        return interfaceC2519y0X.build();
    }

    public static I0 c0(EnumC2418d3 enumC2418d3, G0 g02, G0 g03) {
        int i = H0.f20871a[enumC2418d3.ordinal()];
        if (i == 1) {
            return new R0(g02, g03);
        }
        if (i == 2) {
            return new O0((C0) g02, (C0) g03);
        }
        if (i == 3) {
            return new P0((E0) g02, (E0) g03);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC2418d3);
        }
        return new N0((A0) g02, (A0) g03);
    }

    public static j$.util.concurrent.t s0(EnumC2494t0 enumC2494t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2494t0);
        return new j$.util.concurrent.t(EnumC2418d3.LONG_VALUE, enumC2494t0, new C2465n0(enumC2494t0, 0));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t q0(EnumC2494t0 enumC2494t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2494t0);
        return new j$.util.concurrent.t(EnumC2418d3.DOUBLE_VALUE, enumC2494t0, new C2465n0(enumC2494t0, 2));
    }

    public static void L() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC2519y0 X(long j6, IntFunction intFunction) {
        if (j6 >= 0 && j6 < 2147483639) {
            return new C2401a1(j6, intFunction);
        }
        return new C2490s1();
    }

    public static void D() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void G(InterfaceC2462m2 interfaceC2462m2, Integer num) {
        if (K3.f20903a) {
            K3.a(interfaceC2462m2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC2462m2.accept(num.intValue());
    }

    public static void I(InterfaceC2467n2 interfaceC2467n2, Long l2) {
        if (K3.f20903a) {
            K3.a(interfaceC2467n2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC2467n2.accept(l2.longValue());
    }

    public static InterfaceC2509w0 o0(long j6) {
        if (j6 < 0 || j6 >= 2147483639) {
            return new C2416d1();
        }
        return new C2411c1(j6);
    }

    public static void E(InterfaceC2457l2 interfaceC2457l2, Double d6) {
        if (K3.f20903a) {
            K3.a(interfaceC2457l2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC2457l2.accept(d6.doubleValue());
    }

    public static InterfaceC2514x0 p0(long j6) {
        if (j6 < 0 || j6 >= 2147483639) {
            return new C2461m1();
        }
        return new C2456l1(j6);
    }

    public static Object[] M(F0 f02, IntFunction intFunction) {
        if (K3.f20903a) {
            K3.a(f02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (f02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) f02.count());
        f02.k(objArr, 0);
        return objArr;
    }

    public static InterfaceC2504v0 f0(long j6) {
        if (j6 < 0 || j6 >= 2147483639) {
            return new U0();
        }
        return new T0(j6);
    }

    public static G0 Y(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, boolean z6, IntFunction intFunction) {
        long jI0 = abstractC2510w1.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(16384)) {
            K k6 = new K();
            k6.f20896a = intFunction;
            G0 g02 = (G0) new L0(abstractC2510w1, spliterator, k6, new T(29), 3).invoke();
            return z6 ? j0(g02, intFunction) : g02;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jI0);
        new C2481q1(spliterator, abstractC2510w1, objArr).invoke();
        return new J0(objArr);
    }

    public static void R(C0 c02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            c02.g((IntConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(c02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) c02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void O(C0 c02, Integer[] numArr, int i) {
        if (K3.f20903a) {
            K3.a(c02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c02.b();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            numArr[i + i3] = Integer.valueOf(iArr[i3]);
        }
    }

    public static C0 U(C0 c02, long j6, long j7) {
        if (j6 == 0 && j7 == c02.count()) {
            return c02;
        }
        long j8 = j7 - j6;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) c02.spliterator();
        InterfaceC2509w0 interfaceC2509w0O0 = o0(j8);
        interfaceC2509w0O0.c(j8);
        for (int i = 0; i < j6 && ofInt.tryAdvance((IntConsumer) new B0(0)); i++) {
        }
        if (j7 == c02.count()) {
            ofInt.forEachRemaining((IntConsumer) interfaceC2509w0O0);
        } else {
            for (int i3 = 0; i3 < j8 && ofInt.tryAdvance((IntConsumer) interfaceC2509w0O0); i3++) {
            }
        }
        interfaceC2509w0O0.m();
        return interfaceC2509w0O0.build();
    }

    public static C0 a0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, boolean z6) {
        long jI0 = abstractC2510w1.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c02 = (C0) new L0(abstractC2510w1, spliterator, new T(25), new T(26), 1).invoke();
            return z6 ? l0(c02) : c02;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jI0];
        new C2471o1(spliterator, abstractC2510w1, iArr).invoke();
        return new C2406b1(iArr);
    }

    public static E0 b0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, boolean z6) {
        long jI0 = abstractC2510w1.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e02 = (E0) new L0(abstractC2510w1, spliterator, new T(27), new T(28), 2).invoke();
            return z6 ? m0(e02) : e02;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jI0];
        new C2476p1(spliterator, abstractC2510w1, jArr).invoke();
        return new C2451k1(jArr);
    }

    public static void S(E0 e02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e02.g((LongConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(e02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.K) e02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void P(E0 e02, Long[] lArr, int i) {
        if (K3.f20903a) {
            K3.a(e02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) e02.b();
        for (int i3 = 0; i3 < jArr.length; i3++) {
            lArr[i + i3] = Long.valueOf(jArr[i3]);
        }
    }

    public static E0 V(E0 e02, long j6, long j7) {
        if (j6 == 0 && j7 == e02.count()) {
            return e02;
        }
        long j8 = j7 - j6;
        j$.util.K k6 = (j$.util.K) e02.spliterator();
        InterfaceC2514x0 interfaceC2514x0P0 = p0(j8);
        interfaceC2514x0P0.c(j8);
        for (int i = 0; i < j6 && k6.tryAdvance((LongConsumer) new D0(0)); i++) {
        }
        if (j7 == e02.count()) {
            k6.forEachRemaining((LongConsumer) interfaceC2514x0P0);
        } else {
            for (int i3 = 0; i3 < j8 && k6.tryAdvance((LongConsumer) interfaceC2514x0P0); i3++) {
            }
        }
        interfaceC2514x0P0.m();
        return interfaceC2514x0P0.build();
    }

    public static A0 Z(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, boolean z6) {
        long jI0 = abstractC2510w1.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a02 = (A0) new L0(abstractC2510w1, spliterator, new T(23), new T(24), 0).invoke();
            return z6 ? k0(a02) : a02;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jI0];
        new C2466n1(spliterator, abstractC2510w1, dArr).invoke();
        return new S0(dArr);
    }

    public static G0 j0(G0 g02, IntFunction intFunction) {
        if (g02.p() <= 0) {
            return g02;
        }
        long jCount = g02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C2505v1(g02, objArr, 1).invoke();
        return new J0(objArr);
    }

    public static void Q(A0 a02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            a02.g((DoubleConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(a02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.F) a02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static C0 l0(C0 c02) {
        if (c02.p() <= 0) {
            return c02;
        }
        long jCount = c02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C2500u1(c02, iArr, 0).invoke();
        return new C2406b1(iArr);
    }

    public static void N(A0 a02, Double[] dArr, int i) {
        if (K3.f20903a) {
            K3.a(a02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) a02.b();
        for (int i3 = 0; i3 < dArr2.length; i3++) {
            dArr[i + i3] = Double.valueOf(dArr2[i3]);
        }
    }

    public static A0 T(A0 a02, long j6, long j7) {
        if (j6 == 0 && j7 == a02.count()) {
            return a02;
        }
        long j8 = j7 - j6;
        j$.util.F f2 = (j$.util.F) a02.spliterator();
        InterfaceC2504v0 interfaceC2504v0F0 = f0(j8);
        interfaceC2504v0F0.c(j8);
        for (int i = 0; i < j6 && f2.tryAdvance((DoubleConsumer) new C2524z0(0)); i++) {
        }
        if (j7 == a02.count()) {
            f2.forEachRemaining((DoubleConsumer) interfaceC2504v0F0);
        } else {
            for (int i3 = 0; i3 < j8 && f2.tryAdvance((DoubleConsumer) interfaceC2504v0F0); i3++) {
            }
        }
        interfaceC2504v0F0.m();
        return interfaceC2504v0F0.build();
    }

    public static E0 m0(E0 e02) {
        if (e02.p() <= 0) {
            return e02;
        }
        long jCount = e02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C2495t1(e02, jArr, 0).invoke();
        return new C2451k1(jArr);
    }

    public static A0 k0(A0 a02) {
        if (a02.p() <= 0) {
            return a02;
        }
        long jCount = a02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C2495t1(a02, dArr, 0).invoke();
        return new S0(dArr);
    }

    @Override // j$.util.stream.I3
    public Object f(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        R1 r1V0 = v0();
        abstractC2404b.w0(spliterator, r1V0);
        return r1V0.get();
    }

    @Override // j$.util.stream.I3
    public Object j(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        return ((R1) new Y1(this, abstractC2510w1, spliterator).invoke()).get();
    }
}
