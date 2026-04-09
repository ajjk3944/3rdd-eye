package j$.util.concurrent;

import j$.util.d0;
import j$.util.stream.B;
import j$.util.stream.C2430g0;
import j$.util.stream.C2455l0;
import j$.util.stream.C2508w;
import j$.util.stream.EnumC2413c3;
import j$.util.stream.IntStream;
import j$.util.stream.Y;
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
    public long f20725a;

    /* renamed from: b, reason: collision with root package name */
    public int f20726b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20727c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f20721d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f20722e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public static final v f20723f = new v();

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f20724g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ ThreadLocalRandom(int i) {
        this();
    }

    public static int e(long j6) {
        long j7 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        return (int) (((j7 ^ (j7 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j6) {
        long j7 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        long j8 = (j7 ^ (j7 >>> 33)) * (-4265267296055464877L);
        return j8 ^ (j8 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f20727c = true;
    }

    public static final void d() {
        int iAddAndGet = f20722e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jF = f(f20724g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20723f.get();
        threadLocalRandom.f20725a = jF;
        threadLocalRandom.f20726b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20723f.get();
        if (threadLocalRandom.f20726b == 0) {
            d();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j6) {
        if (this.f20727c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j6 = this.f20725a - 7046029254386353131L;
        this.f20725a = j6;
        return j6;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    public final long c(long j6, long j7) {
        long jF = f(g());
        if (j6 >= j7) {
            return jF;
        }
        long j8 = j7 - j6;
        long j9 = j8 - 1;
        if ((j8 & j9) == 0) {
            return (jF & j9) + j6;
        }
        if (j8 > 0) {
            while (true) {
                long j10 = jF >>> 1;
                long j11 = j10 + j9;
                long j12 = j10 % j8;
                if (j11 - j12 >= 0) {
                    return j12 + j6;
                }
                jF = f(g());
            }
        } else {
            while (true) {
                if (jF >= j6 && jF < j7) {
                    return jF;
                }
                jF = f(g());
            }
        }
    }

    public final int b(int i, int i3) {
        int iE = e(g());
        if (i >= i3) {
            return iE;
        }
        int i6 = i3 - i;
        int i7 = i6 - 1;
        if ((i6 & i7) == 0) {
            return (iE & i7) + i;
        }
        if (i6 > 0) {
            int iE2 = iE >>> 1;
            while (true) {
                int i8 = iE2 + i7;
                int i9 = iE2 % i6;
                if (i8 - i9 >= 0) {
                    return i9 + i;
                }
                iE2 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (iE >= i && iE < i3) {
                    return iE;
                }
                iE = e(g());
            }
        }
    }

    public final double a(double d6, double d7) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d6 >= d7) {
            return dNextLong;
        }
        double d8 = ((d7 - d6) * dNextLong) + d6;
        return d8 >= d7 ? Double.longBitsToDouble(Double.doubleToLongBits(d7) - 1) : d8;
    }

    @Override // java.util.Random
    public int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iE = e(g());
        int i3 = i - 1;
        if ((i & i3) == 0) {
            return iE & i3;
        }
        while (true) {
            int i6 = iE >>> 1;
            int i7 = i6 + i3;
            int i8 = i6 % i;
            if (i7 - i8 >= 0) {
                return i8;
            }
            iE = e(g());
        }
    }

    public final int nextInt(int i, int i3) {
        if (i >= i3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i, i3);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public final long nextLong(long j6) {
        if (j6 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jF = f(g());
        long j7 = j6 - 1;
        if ((j6 & j7) == 0) {
            return jF & j7;
        }
        while (true) {
            long j8 = jF >>> 1;
            long j9 = j8 + j7;
            long j10 = j8 % j6;
            if (j9 - j10 >= 0) {
                return j10;
            }
            jF = f(g());
        }
    }

    public final long nextLong(long j6, long j7) {
        if (j6 >= j7) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j6, j7);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d6) {
        if (d6 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dF = (f(g()) >>> 11) * 1.1102230246251565E-16d * d6;
        return dF < d6 ? dF : Double.longBitsToDouble(Double.doubleToLongBits(d6) - 1);
    }

    public final double nextDouble(double d6, double d7) {
        if (d6 >= d7) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d6, d7);
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
        ThreadLocal threadLocal = f20721d;
        Double d6 = (Double) threadLocal.get();
        if (d6 != null) {
            threadLocal.set(null);
            return d6.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d7 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d7 < 1.0d && d7 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d7) * (-2.0d)) / d7);
                f20721d.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        x xVar = new x(0L, j6, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new Y(xVar, EnumC2413c3.c(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        x xVar = new x(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0);
        return IntStream.Wrapper.convert(new Y(xVar, EnumC2413c3.c(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j6, int i, int i3) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i >= i3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, j6, i, i3);
        return IntStream.Wrapper.convert(new Y(xVar, EnumC2413c3.c(xVar), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i, int i3) {
        if (i >= i3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        x xVar = new x(0L, Long.MAX_VALUE, i, i3);
        return IntStream.Wrapper.convert(new Y(xVar, EnumC2413c3.c(xVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        y yVar = new y(0L, j6, Long.MAX_VALUE, 0L);
        return C2455l0.f(new C2430g0(yVar, EnumC2413c3.c(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        y yVar = new y(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L);
        return C2455l0.f(new C2430g0(yVar, EnumC2413c3.c(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j6, long j7, long j8) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j7 >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, j6, j7, j8);
        return C2455l0.f(new C2430g0(yVar, EnumC2413c3.c(yVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j6, long j7) {
        if (j6 >= j7) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        y yVar = new y(0L, Long.MAX_VALUE, j6, j7);
        return C2455l0.f(new C2430g0(yVar, EnumC2413c3.c(yVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        w wVar = new w(0L, j6, Double.MAX_VALUE, 0.0d);
        return B.f(new C2508w(wVar, EnumC2413c3.c(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        w wVar = new w(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d);
        return B.f(new C2508w(wVar, EnumC2413c3.c(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j6, double d6, double d7) {
        if (j6 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d6 >= d7) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, j6, d6, d7);
        return B.f(new C2508w(wVar, EnumC2413c3.c(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d6, double d7) {
        if (d6 >= d7) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, Long.MAX_VALUE, d6, d7);
        return B.f(new C2508w(wVar, EnumC2413c3.c(wVar), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new d0(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j6 = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j6 = (j6 << 8) | (seed[i] & 255);
            }
            f20724g.set(j6);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f20725a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
