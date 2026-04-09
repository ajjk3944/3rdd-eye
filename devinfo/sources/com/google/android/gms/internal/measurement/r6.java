package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f19895a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f19896b;

    /* renamed from: c, reason: collision with root package name */
    public static final q6 f19897c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f19898d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f19899e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f19900f;
    public static final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r6.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f19899e) {
            f19897c.f19885a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i4 = u4.f19947a;
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

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = f19897c.f19885a;
        long j8 = (-4) & j;
        int i4 = unsafe.getInt(obj, j8);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i10) | (i4 & (~(255 << i10))));
    }

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = f19897c.f19885a;
        long j8 = (-4) & j;
        int i4 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i4) | (unsafe.getInt(obj, j8) & (~(255 << i4))));
    }

    public static Object e(Class cls) {
        try {
            return f19895a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int f(Object obj, long j) {
        return f19897c.f19885a.getInt(obj, j);
    }

    public static void g(long j, Object obj, int i4) {
        f19897c.f19885a.putInt(obj, j, i4);
    }

    public static long h(Object obj, long j) {
        return f19897c.f19885a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j8) {
        f19897c.f19885a.putLong(obj, j, j8);
    }

    public static Object j(Object obj, long j) {
        return f19897c.f19885a.getObject(obj, j);
    }

    public static void k(Object obj, long j, Object obj2) {
        f19897c.f19885a.putObject(obj, j, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        int i4 = u4.f19947a;
        try {
            Class cls2 = f19896b;
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

    public static /* synthetic */ boolean n(Object obj, long j) {
        return ((byte) ((f19897c.f19885a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(Object obj, long j) {
        return ((byte) ((f19897c.f19885a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f19899e) {
            return f19897c.f19885a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
