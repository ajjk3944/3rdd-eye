package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g74 {
    public static final Unsafe a;
    public static final Class b;
    public static final f74 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g74.<clinit>():void");
    }

    public static int a(Class cls) {
        if (e) {
            return ((Unsafe) c.g).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            ((Unsafe) c.g).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i = u44.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.g;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void e(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.g;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object f(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int g(long j, Object obj) {
        return ((Unsafe) c.g).getInt(obj, j);
    }

    public static void h(long j, Object obj, int i) {
        ((Unsafe) c.g).putInt(obj, j, i);
    }

    public static long i(long j, Object obj) {
        return ((Unsafe) c.g).getLong(obj, j);
    }

    public static void j(Object obj, long j, long j2) {
        ((Unsafe) c.g).putLong(obj, j, j2);
    }

    public static Object k(long j, Object obj) {
        return ((Unsafe) c.g).getObject(obj, j);
    }

    public static void l(Object obj, long j, Object obj2) {
        ((Unsafe) c.g).putObject(obj, j, obj2);
    }

    public static void m(byte[] bArr, long j, byte b2) {
        c.q1(bArr, f + j, b2);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) c.g).getLong(byteBuffer, g);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c74());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean p(Class cls) {
        int i = u44.a;
        try {
            Class cls2 = b;
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

    public static /* synthetic */ boolean q(long j, Object obj) {
        return ((byte) ((((Unsafe) c.g).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean r(long j, Object obj) {
        return ((byte) ((((Unsafe) c.g).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
