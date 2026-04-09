package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15678a = Logger.getLogger(o0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f15679b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f15680c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f15681d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f15682e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f15683f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f15684g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f15685h;

    /* compiled from: UnsafeUtil.java */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class b extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final boolean c(Object obj, long j4) {
            return o0.f15685h ? o0.g(obj, j4) != 0 : o0.h(obj, j4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final byte d(Object obj, long j4) {
            return o0.f15685h ? o0.g(obj, j4) : o0.h(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final double e(Object obj, long j4) {
            return Double.longBitsToDouble(h(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final float f(Object obj, long j4) {
            return Float.intBitsToFloat(g(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void k(Object obj, long j4, boolean z10) {
            if (o0.f15685h) {
                o0.k(obj, j4, z10 ? (byte) 1 : (byte) 0);
            } else {
                o0.l(obj, j4, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void l(Object obj, long j4, byte b10) {
            if (o0.f15685h) {
                o0.k(obj, j4, b10);
            } else {
                o0.l(obj, j4, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void m(Object obj, long j4, double d10) {
            p(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void n(Object obj, long j4, float f10) {
            o(obj, j4, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final boolean c(Object obj, long j4) {
            return o0.f15685h ? o0.g(obj, j4) != 0 : o0.h(obj, j4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final byte d(Object obj, long j4) {
            return o0.f15685h ? o0.g(obj, j4) : o0.h(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final double e(Object obj, long j4) {
            return Double.longBitsToDouble(h(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final float f(Object obj, long j4) {
            return Float.intBitsToFloat(g(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void k(Object obj, long j4, boolean z10) {
            if (o0.f15685h) {
                o0.k(obj, j4, z10 ? (byte) 1 : (byte) 0);
            } else {
                o0.l(obj, j4, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void l(Object obj, long j4, byte b10) {
            if (o0.f15685h) {
                o0.k(obj, j4, b10);
            } else {
                o0.l(obj, j4, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void m(Object obj, long j4, double d10) {
            p(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void n(Object obj, long j4, float f10) {
            o(obj, j4, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final boolean c(Object obj, long j4) {
            return this.f15686a.getBoolean(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final byte d(Object obj, long j4) {
            return this.f15686a.getByte(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final double e(Object obj, long j4) {
            return this.f15686a.getDouble(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final float f(Object obj, long j4) {
            return this.f15686a.getFloat(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void k(Object obj, long j4, boolean z10) {
            this.f15686a.putBoolean(obj, j4, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void l(Object obj, long j4, byte b10) {
            this.f15686a.putByte(obj, j4, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void m(Object obj, long j4, double d10) {
            this.f15686a.putDouble(obj, j4, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.o0.e
        public final void n(Object obj, long j4, float f10) {
            this.f15686a.putFloat(obj, j4, f10);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f15686a;

        public e(Unsafe unsafe) {
            this.f15686a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f15686a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f15686a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j4);

        public abstract byte d(Object obj, long j4);

        public abstract double e(Object obj, long j4);

        public abstract float f(Object obj, long j4);

        public final int g(Object obj, long j4) {
            return this.f15686a.getInt(obj, j4);
        }

        public final long h(Object obj, long j4) {
            return this.f15686a.getLong(obj, j4);
        }

        public final Object i(Object obj, long j4) {
            return this.f15686a.getObject(obj, j4);
        }

        public final long j(Field field) {
            return this.f15686a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j4, boolean z10);

        public abstract void l(Object obj, long j4, byte b10);

        public abstract void m(Object obj, long j4, double d10);

        public abstract void n(Object obj, long j4, float f10);

        public final void o(Object obj, long j4, int i) {
            this.f15686a.putInt(obj, j4, i);
        }

        public final void p(Object obj, long j4, long j10) {
            this.f15686a.putLong(obj, j4, j10);
        }

        public final void q(Object obj, long j4, Object obj2) {
            this.f15686a.putObject(obj, j4, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0269  */
    static {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f15679b.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int b(Class<?> cls) {
        if (f15683f) {
            return f15681d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f15683f) {
            f15681d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (C1726d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class<?> cls) {
        if (!C1726d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f15680c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static byte f(byte[] bArr, long j4) {
        return f15681d.d(bArr, f15684g + j4);
    }

    public static byte g(Object obj, long j4) {
        return (byte) ((f15681d.g(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static byte h(Object obj, long j4) {
        return (byte) ((f15681d.g(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j4, byte b10) {
        f15681d.l(bArr, f15684g + j4, b10);
    }

    public static void k(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int iG = f15681d.g(obj, j10);
        int i = ((~((int) j4)) & 3) << 3;
        m(obj, j10, ((255 & b10) << i) | (iG & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void l(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        m(obj, j10, ((255 & b10) << i) | (f15681d.g(obj, j10) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void m(Object obj, long j4, int i) {
        f15681d.o(obj, j4, i);
    }

    public static void n(Object obj, long j4, long j10) {
        f15681d.p(obj, j4, j10);
    }

    public static void o(Object obj, long j4, Object obj2) {
        f15681d.q(obj, j4, obj2);
    }
}
