package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f1337a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1338b;

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f1339c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1340d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1341e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f1342f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1343g;

    static {
        Unsafe unsafeI = i();
        f1337a = unsafeI;
        f1338b = c.f1251a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        p1 o1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                o1Var = new o1(unsafeI);
            } else if (zH) {
                o1Var = new n1(unsafeI, 1);
            } else if (zH2) {
                o1Var = new n1(unsafeI, 0);
            }
        }
        f1339c = o1Var;
        f1340d = o1Var == null ? false : o1Var.r();
        f1341e = o1Var == null ? false : o1Var.q();
        f1342f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && o1Var != null) {
            o1Var.i(fieldG);
        }
        f1343g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(Object obj, long j) {
        return ((byte) ((f1339c.f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j) {
        return ((byte) ((f1339c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f1337a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int e(Class cls) {
        if (f1341e) {
            return f1339c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f1341e) {
            f1339c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
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

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1338b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        f1339c.k(bArr, f1342f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j7 = (-4) & j;
        int iF = f1339c.f(obj, j7);
        int i10 = ((~((int) j)) & 3) << 3;
        m(((255 & b2) << i10) | (iF & (~(255 << i10))), j7, obj);
    }

    public static void l(Object obj, long j, byte b2) {
        long j7 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        m(((255 & b2) << i10) | (f1339c.f(obj, j7) & (~(255 << i10))), j7, obj);
    }

    public static void m(int i10, long j, Object obj) {
        f1339c.n(i10, j, obj);
    }

    public static void n(Object obj, long j, long j7) {
        f1339c.o(obj, j, j7);
    }

    public static void o(Object obj, long j, Object obj2) {
        f1339c.p(obj, j, obj2);
    }
}
