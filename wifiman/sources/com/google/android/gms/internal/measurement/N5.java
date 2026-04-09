package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.snmp4j.util.SnmpConfigurator;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class N5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f35076a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f35077b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f35078c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f35079d;

    /* renamed from: e, reason: collision with root package name */
    private static final b f35080e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f35081f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f35082g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f35083h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f35084i;

    private static final class a extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void b(Object obj, long j10, byte b10) {
            if (N5.f35084i) {
                N5.u(obj, j10, b10);
            } else {
                N5.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void g(Object obj, long j10, boolean z10) {
            if (N5.f35084i) {
                N5.k(obj, j10, z10);
            } else {
                N5.r(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final boolean k(Object obj, long j10) {
            return N5.f35084i ? N5.D(obj, j10) : N5.E(obj, j10);
        }
    }

    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f35085a;

        b(Unsafe unsafe) {
            this.f35085a = unsafe;
        }

        public abstract double a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f35085a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f35085a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public final boolean h() {
            Unsafe unsafe = this.f35085a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                N5.l(th2);
                return false;
            }
        }

        public abstract float i(Object obj, long j10);

        public final boolean j() {
            Unsafe unsafe = this.f35085a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return N5.C() != null;
            } catch (Throwable th2) {
                N5.l(th2);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j10);

        public final int l(Object obj, long j10) {
            return this.f35085a.getInt(obj, j10);
        }

        public final long m(Object obj, long j10) {
            return this.f35085a.getLong(obj, j10);
        }
    }

    private static final class c extends b {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void b(Object obj, long j10, byte b10) {
            if (N5.f35084i) {
                N5.u(obj, j10, b10);
            } else {
                N5.y(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final void g(Object obj, long j10, boolean z10) {
            if (N5.f35084i) {
                N5.k(obj, j10, z10);
            } else {
                N5.r(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.N5.b
        public final boolean k(Object obj, long j10) {
            return N5.f35084i ? N5.D(obj, j10) : N5.E(obj, j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            com.google.android.gms.internal.measurement.N5.f35076a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.S3.a()
            com.google.android.gms.internal.measurement.N5.f35077b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            com.google.android.gms.internal.measurement.N5.f35078c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            com.google.android.gms.internal.measurement.N5.f35079d = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.N5$c r1 = new com.google.android.gms.internal.measurement.N5$c
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.N5$a r1 = new com.google.android.gms.internal.measurement.N5$a
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.N5.f35080e = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.j()
        L3a:
            com.google.android.gms.internal.measurement.N5.f35081f = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.h()
        L44:
            com.google.android.gms.internal.measurement.N5.f35082g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.N5.f35083h = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            o(r2)
            s(r2)
            java.lang.Class<int[]> r2 = int[].class
            o(r2)
            s(r2)
            java.lang.Class<long[]> r2 = long[].class
            o(r2)
            s(r2)
            java.lang.Class<float[]> r2 = float[].class
            o(r2)
            s(r2)
            java.lang.Class<double[]> r2 = double[].class
            o(r2)
            s(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            o(r2)
            s(r2)
            java.lang.reflect.Field r2 = C()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.f35085a
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.measurement.N5.f35084i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.<clinit>():void");
    }

    private static boolean A(Class cls) {
        try {
            Class cls2 = f35077b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Object B(Object obj, long j10) {
        return f35080e.f35085a.getObject(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field C() {
        Field fieldD = d(Buffer.class, "effectiveDirectAddress");
        if (fieldD != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, SnmpConfigurator.O_ADDRESS);
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    static /* synthetic */ boolean D(Object obj, long j10) {
        return ((byte) (t(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) (t(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j10) {
        return f35080e.k(obj, j10);
    }

    static double a(Object obj, long j10) {
        return f35080e.a(obj, j10);
    }

    static Object b(Class cls) {
        try {
            return f35076a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j10, double d10) {
        f35080e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f35080e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f35080e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f35080e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f35080e.f35085a.putObject(obj, j10, obj2);
    }

    static /* synthetic */ void k(Object obj, long j10, boolean z10) {
        u(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(N5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th2));
    }

    static void m(byte[] bArr, long j10, byte b10) {
        f35080e.b(bArr, f35083h + j10, b10);
    }

    static float n(Object obj, long j10) {
        return f35080e.i(obj, j10);
    }

    private static int o(Class cls) {
        if (f35082g) {
            return f35080e.f35085a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new P5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j10, boolean z10) {
        y(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static int s(Class cls) {
        if (f35082g) {
            return f35080e.f35085a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j10) {
        return f35080e.l(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iT = t(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (iT & (~(255 << i10))));
    }

    static void v(Object obj, long j10, boolean z10) {
        f35080e.g(obj, j10, z10);
    }

    static boolean w() {
        return f35082g;
    }

    static long x(Object obj, long j10) {
        return f35080e.m(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (t(obj, j11) & (~(255 << i10))));
    }

    static boolean z() {
        return f35081f;
    }
}
