package j$.util.concurrent;

import j$.util.r1;
import j$.util.stream.IntStream;
import j$.util.stream.a0;
import j$.util.stream.a7;
import j$.util.stream.e1;
import j$.util.stream.j1;
import j$.util.stream.w0;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a, reason: collision with root package name */
    public long f26312a;

    /* renamed from: b, reason: collision with root package name */
    public int f26313b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26314c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f26309d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f26310e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public static final v f26311f = new v();
    public static final AtomicLong g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ ThreadLocalRandom(int i4) {
        this();
    }

    public static int e(long j) {
        long j8 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j8 ^ (j8 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j) {
        long j8 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j9 = (j8 ^ (j8 >>> 33)) * (-4265267296055464877L);
        return j9 ^ (j9 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f26314c = true;
    }

    public static final void d() {
        int iAddAndGet = f26310e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jF = f(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f26311f.get();
        threadLocalRandom.f26312a = jF;
        threadLocalRandom.f26313b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f26311f.get();
        if (threadLocalRandom.f26313b == 0) {
            d();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f26314c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j = this.f26312a - 7046029254386353131L;
        this.f26312a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i4) {
        return nextInt() >>> (32 - i4);
    }

    public final long c(long j, long j8) {
        long jF = f(g());
        if (j >= j8) {
            return jF;
        }
        long j9 = j8 - j;
        long j10 = j9 - 1;
        if ((j9 & j10) == 0) {
            return (jF & j10) + j;
        }
        if (j9 > 0) {
            while (true) {
                long j11 = jF >>> 1;
                long j12 = j11 + j10;
                long j13 = j11 % j9;
                if (j12 - j13 >= 0) {
                    return j13 + j;
                }
                jF = f(g());
            }
        } else {
            while (true) {
                if (jF >= j && jF < j8) {
                    return jF;
                }
                jF = f(g());
            }
        }
    }

    public final int b(int i4, int i10) {
        int iE = e(g());
        if (i4 >= i10) {
            return iE;
        }
        int i11 = i10 - i4;
        int i12 = i11 - 1;
        if ((i11 & i12) == 0) {
            return (iE & i12) + i4;
        }
        if (i11 > 0) {
            int iE2 = iE >>> 1;
            while (true) {
                int i13 = iE2 + i12;
                int i14 = iE2 % i11;
                if (i13 - i14 >= 0) {
                    return i14 + i4;
                }
                iE2 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (iE >= i4 && iE < i10) {
                    return iE;
                }
                iE = e(g());
            }
        }
    }

    public final double a(double d10, double d11) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return dNextLong;
        }
        double d12 = ((d11 - d10) * dNextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    @Override // java.util.Random
    public int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iE = e(g());
        int i10 = i4 - 1;
        if ((i4 & i10) == 0) {
            return iE & i10;
        }
        while (true) {
            int i11 = iE >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i4;
            if (i12 - i13 >= 0) {
                return i13;
            }
            iE = e(g());
        }
    }

    public int nextInt(int i4, int i10) {
        if (i4 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i4, i10);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jF = f(g());
        long j8 = j - 1;
        if ((j & j8) == 0) {
            return jF & j8;
        }
        while (true) {
            long j9 = jF >>> 1;
            long j10 = j9 + j8;
            long j11 = j9 % j;
            if (j10 - j11 >= 0) {
                return j11;
            }
            jF = f(g());
        }
    }

    public final long nextLong(long j, long j8) {
        if (j >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j, j8);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dF = (f(g()) >>> 11) * 1.1102230246251565E-16d * d10;
        return dF < d10 ? dF : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
    }

    public final double nextDouble(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d10, d11);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return e(g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (e(g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f26309d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                f26309d.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        x xVar = new x(0L, j, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new w0(xVar, a7.k(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        x xVar = new x(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new w0(xVar, a7.k(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i4, int i10) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i4 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, j, i4, i10);
        return IntStream.Wrapper.convert(new w0(xVar, a7.k(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i4, int i10) {
        if (i4 >= i10) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, Long.MAX_VALUE, i4, i10);
        return IntStream.Wrapper.convert(new w0(xVar, a7.k(xVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        y yVar = new y(0L, j, Long.MAX_VALUE, 0L);
        return j1.f(new e1(yVar, a7.k(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        y yVar = new y(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L);
        return j1.f(new e1(yVar, a7.k(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j8, long j9) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j8 >= j9) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, j, j8, j9);
        return j1.f(new e1(yVar, a7.k(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j8) {
        if (j >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, Long.MAX_VALUE, j, j8);
        return j1.f(new e1(yVar, a7.k(yVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        w wVar = new w(0L, j, Double.MAX_VALUE, 0.0d);
        return a0.f(new j$.util.stream.v(wVar, a7.k(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        w wVar = new w(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d);
        return a0.f(new j$.util.stream.v(wVar, a7.k(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d10, double d11) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, j, d10, d11);
        return a0.f(new j$.util.stream.v(wVar, a7.k(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, Long.MAX_VALUE, d10, d11);
        return a0.f(new j$.util.stream.v(wVar, a7.k(wVar), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new r1(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i4 = 1; i4 < 8; i4++) {
                j = (j << 8) | (seed[i4] & 255);
            }
            g.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f26312a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
