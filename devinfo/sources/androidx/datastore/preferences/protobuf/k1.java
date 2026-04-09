package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f1004a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1005b;

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f1006c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1007d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1008e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f1009f;
    public static final boolean g;

    static {
        Unsafe unsafeI = i();
        f1004a = unsafeI;
        f1005b = c.f952a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        j1 i1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                i1Var = new i1(unsafeI);
            } else if (zH) {
                i1Var = new h1(unsafeI, 1);
            } else if (zH2) {
                i1Var = new h1(unsafeI, 0);
            }
        }
        f1006c = i1Var;
        f1007d = i1Var == null ? false : i1Var.r();
        f1008e = i1Var == null ? false : i1Var.q();
        f1009f = e(byte[].class);
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
        if (fieldG != null && i1Var != null) {
            i1Var.i(fieldG);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(k1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(Object obj, long j) {
        return ((byte) ((f1006c.f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j) {
        return ((byte) ((f1006c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f1004a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f1008e) {
            return f1006c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f1008e) {
            f1006c.b(cls);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1005b;
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
            return (Unsafe) AccessController.doPrivileged(new g1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b10) {
        f1006c.k(bArr, f1009f + j, b10);
    }

    public static void k(Object obj, long j, byte b10) {
        long j8 = (-4) & j;
        int iF = f1006c.f(obj, j8);
        int i4 = ((~((int) j)) & 3) << 3;
        m(j8, obj, ((255 & b10) << i4) | (iF & (~(255 << i4))));
    }

    public static void l(Object obj, long j, byte b10) {
        long j8 = (-4) & j;
        int i4 = (((int) j) & 3) << 3;
        m(j8, obj, ((255 & b10) << i4) | (f1006c.f(obj, j8) & (~(255 << i4))));
    }

    public static void m(long j, Object obj, int i4) {
        f1006c.n(j, obj, i4);
    }

    public static void n(Object obj, long j, long j8) {
        f1006c.o(obj, j, j8);
    }

    public static void o(Object obj, long j, Object obj2) {
        f1006c.p(obj, j, obj2);
    }
}
