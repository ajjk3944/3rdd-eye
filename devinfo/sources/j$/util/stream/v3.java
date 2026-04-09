package j$.util.stream;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public abstract class v3 implements g8 {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f26774a = new x2();

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f26775b = new v2();

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f26776c = new w2();

    /* renamed from: d, reason: collision with root package name */
    public static final u2 f26777d = new u2();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f26778e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f26779f = new long[0];
    public static final double[] g = new double[0];

    public abstract void d0(Spliterator spliterator, m5 m5Var);

    public abstract boolean e0(Spliterator spliterator, m5 m5Var);

    public abstract e2 h0(Spliterator spliterator, boolean z3, IntFunction intFunction);

    public abstract long i0(Spliterator spliterator);

    public abstract w1 t0(long j, IntFunction intFunction);

    public abstract q4 v0();

    @Override // j$.util.stream.g8
    public /* synthetic */ int w() {
        return 0;
    }

    public abstract m5 w0(Spliterator spliterator, m5 m5Var);

    public abstract m5 x0(m5 m5Var);

    public abstract Spliterator y0(Spliterator spliterator);

    public static j$.util.q n0(Function function) {
        j$.util.q qVar = new j$.util.q(5);
        qVar.f26444b = function;
        return qVar;
    }

    public static j$.util.concurrent.t u0(r1 r1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(b7.REFERENCE, r1Var, new j$.util.concurrent.t(5, r1Var, predicate));
    }

    public static y2 g0(b7 b7Var) {
        int i4 = g2.f26585a[b7Var.ordinal()];
        if (i4 == 1) {
            return f26774a;
        }
        if (i4 == 2) {
            return f26775b;
        }
        if (i4 == 3) {
            return f26776c;
        }
        if (i4 == 4) {
            return f26777d;
        }
        throw new IllegalStateException("Unknown shape " + b7Var);
    }

    public static j$.util.concurrent.t r0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(b7.INT_VALUE, r1Var, new l1(r1Var, 1));
    }

    public static e2 W(e2 e2Var, long j, long j8, IntFunction intFunction) {
        if (j == 0 && j8 == e2Var.count()) {
            return e2Var;
        }
        Spliterator spliterator = e2Var.spliterator();
        long j9 = j8 - j;
        w1 w1VarX = X(j9, intFunction);
        w1VarX.c(j9);
        for (int i4 = 0; i4 < j && spliterator.tryAdvance(new e0(29)); i4++) {
        }
        if (j8 == e2Var.count()) {
            spliterator.forEachRemaining(w1VarX);
        } else {
            for (int i10 = 0; i10 < j9 && spliterator.tryAdvance(w1VarX); i10++) {
            }
        }
        w1VarX.end();
        return w1VarX.build();
    }

    public static h2 c0(b7 b7Var, e2 e2Var, e2 e2Var2) {
        int i4 = g2.f26585a[b7Var.ordinal()];
        if (i4 == 1) {
            return new q2(e2Var, e2Var2);
        }
        if (i4 == 2) {
            return new n2((a2) e2Var, (a2) e2Var2);
        }
        if (i4 == 3) {
            return new o2((c2) e2Var, (c2) e2Var2);
        }
        if (i4 != 4) {
            throw new IllegalStateException("Unknown shape " + b7Var);
        }
        return new m2((y1) e2Var, (y1) e2Var2);
    }

    public static j$.util.concurrent.t s0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(b7.LONG_VALUE, r1Var, new l1(r1Var, 0));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t q0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(b7.DOUBLE_VALUE, r1Var, new l1(r1Var, 2));
    }

    public static void L() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static w1 X(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new z2(j, intFunction);
        }
        return new r3();
    }

    public static void D() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void G(k5 k5Var, Integer num) {
        if (i8.f26621a) {
            i8.a(k5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        k5Var.accept(num.intValue());
    }

    public static void I(l5 l5Var, Long l10) {
        if (i8.f26621a) {
            i8.a(l5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        l5Var.accept(l10.longValue());
    }

    public static u1 o0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new c3();
        }
        return new b3(j);
    }

    public static void E(j5 j5Var, Double d10) {
        if (i8.f26621a) {
            i8.a(j5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        j5Var.accept(d10.doubleValue());
    }

    public static v1 p0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new l3();
        }
        return new k3(j);
    }

    public static Object[] M(d2 d2Var, IntFunction intFunction) {
        if (i8.f26621a) {
            i8.a(d2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (d2Var.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) d2Var.count());
        d2Var.k(objArr, 0);
        return objArr;
    }

    public static t1 f0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new t2();
        }
        return new s2(j);
    }

    public static e2 Y(v3 v3Var, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        long jI0 = v3Var.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            k0 k0Var = new k0();
            k0Var.f26641a = intFunction;
            e2 e2Var = (e2) new k2(v3Var, spliterator, k0Var, new f2(7), 3).invoke();
            return z3 ? j0(e2Var, intFunction) : e2Var;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jI0);
        new p3(spliterator, v3Var, objArr).invoke();
        return new i2(objArr);
    }

    public static void R(a2 a2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            a2Var.g((IntConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(a2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) a2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void O(a2 a2Var, Integer[] numArr, int i4) {
        if (i8.f26621a) {
            i8.a(a2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) a2Var.b();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i4 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static a2 U(a2 a2Var, long j, long j8) {
        if (j == 0 && j8 == a2Var.count()) {
            return a2Var;
        }
        long j9 = j8 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) a2Var.spliterator();
        u1 u1VarO0 = o0(j9);
        u1VarO0.c(j9);
        for (int i4 = 0; i4 < j && ofInt.tryAdvance((IntConsumer) new z1(0)); i4++) {
        }
        if (j8 == a2Var.count()) {
            ofInt.forEachRemaining((IntConsumer) u1VarO0);
        } else {
            for (int i10 = 0; i10 < j9 && ofInt.tryAdvance((IntConsumer) u1VarO0); i10++) {
            }
        }
        u1VarO0.end();
        return u1VarO0.build();
    }

    public static a2 a0(v3 v3Var, Spliterator spliterator, boolean z3) {
        long jI0 = v3Var.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            a2 a2Var = (a2) new k2(v3Var, spliterator, new f2(3), new f2(4), 1).invoke();
            return z3 ? l0(a2Var) : a2Var;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jI0];
        new n3(spliterator, v3Var, iArr).invoke();
        return new a3(iArr);
    }

    public static c2 b0(v3 v3Var, Spliterator spliterator, boolean z3) {
        long jI0 = v3Var.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            c2 c2Var = (c2) new k2(v3Var, spliterator, new f2(5), new f2(6), 2).invoke();
            return z3 ? m0(c2Var) : c2Var;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jI0];
        new o3(spliterator, v3Var, jArr).invoke();
        return new j3(jArr);
    }

    public static void S(c2 c2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c2Var.g((LongConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(c2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.z0) c2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void P(c2 c2Var, Long[] lArr, int i4) {
        if (i8.f26621a) {
            i8.a(c2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) c2Var.b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i4 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static c2 V(c2 c2Var, long j, long j8) {
        if (j == 0 && j8 == c2Var.count()) {
            return c2Var;
        }
        long j9 = j8 - j;
        j$.util.z0 z0Var = (j$.util.z0) c2Var.spliterator();
        v1 v1VarP0 = p0(j9);
        v1VarP0.c(j9);
        for (int i4 = 0; i4 < j && z0Var.tryAdvance((LongConsumer) new b2(0)); i4++) {
        }
        if (j8 == c2Var.count()) {
            z0Var.forEachRemaining((LongConsumer) v1VarP0);
        } else {
            for (int i10 = 0; i10 < j9 && z0Var.tryAdvance((LongConsumer) v1VarP0); i10++) {
            }
        }
        v1VarP0.end();
        return v1VarP0.build();
    }

    public static y1 Z(v3 v3Var, Spliterator spliterator, boolean z3) {
        long jI0 = v3Var.i0(spliterator);
        if (jI0 < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            y1 y1Var = (y1) new k2(v3Var, spliterator, new f2(1), new f2(2), 0).invoke();
            return z3 ? k0(y1Var) : y1Var;
        }
        if (jI0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jI0];
        new m3(spliterator, v3Var, dArr).invoke();
        return new r2(dArr);
    }

    public static e2 j0(e2 e2Var, IntFunction intFunction) {
        if (e2Var.o() <= 0) {
            return e2Var;
        }
        long jCount = e2Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new u3(e2Var, objArr, 1).invoke();
        return new i2(objArr);
    }

    public static void Q(y1 y1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            y1Var.g((DoubleConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(y1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.u0) y1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static a2 l0(a2 a2Var) {
        if (a2Var.o() <= 0) {
            return a2Var;
        }
        long jCount = a2Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new t3(a2Var, iArr, 0).invoke();
        return new a3(iArr);
    }

    public static void N(y1 y1Var, Double[] dArr, int i4) {
        if (i8.f26621a) {
            i8.a(y1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) y1Var.b();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i4 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static y1 T(y1 y1Var, long j, long j8) {
        if (j == 0 && j8 == y1Var.count()) {
            return y1Var;
        }
        long j9 = j8 - j;
        j$.util.u0 u0Var = (j$.util.u0) y1Var.spliterator();
        t1 t1VarF0 = f0(j9);
        t1VarF0.c(j9);
        for (int i4 = 0; i4 < j && u0Var.tryAdvance((DoubleConsumer) new x1(0)); i4++) {
        }
        if (j8 == y1Var.count()) {
            u0Var.forEachRemaining((DoubleConsumer) t1VarF0);
        } else {
            for (int i10 = 0; i10 < j9 && u0Var.tryAdvance((DoubleConsumer) t1VarF0); i10++) {
            }
        }
        t1VarF0.end();
        return t1VarF0.build();
    }

    public static c2 m0(c2 c2Var) {
        if (c2Var.o() <= 0) {
            return c2Var;
        }
        long jCount = c2Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new s3(c2Var, jArr, 0).invoke();
        return new j3(jArr);
    }

    public static y1 k0(y1 y1Var) {
        if (y1Var.o() <= 0) {
            return y1Var;
        }
        long jCount = y1Var.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new s3(y1Var, dArr, 0).invoke();
        return new r2(dArr);
    }

    @Override // j$.util.stream.g8
    public Object f(a aVar, Spliterator spliterator) {
        q4 q4VarV0 = v0();
        aVar.w0(spliterator, q4VarV0);
        return q4VarV0.get();
    }

    @Override // j$.util.stream.g8
    public Object j(v3 v3Var, Spliterator spliterator) {
        return ((q4) new x4(this, v3Var, spliterator).invoke()).get();
    }
}
