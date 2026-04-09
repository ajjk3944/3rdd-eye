package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5189a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5190b;

    /* renamed from: c, reason: collision with root package name */
    public static final r6 f5191c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5192d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5193e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5194f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5195g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s6.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f5193e) {
            f5191c.f5183a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i10 = u4.f5216a;
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

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = f5191c.f5183a;
        long j7 = (-4) & j;
        int i10 = unsafe.getInt(obj, j7);
        int i11 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b2) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = f5191c.f5183a;
        long j7 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b2) << i10) | (unsafe.getInt(obj, j7) & (~(255 << i10))));
    }

    public static Object e(Class cls) {
        try {
            return f5189a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int f(Object obj, long j) {
        return f5191c.f5183a.getInt(obj, j);
    }

    public static void g(int i10, long j, Object obj) {
        f5191c.f5183a.putInt(obj, j, i10);
    }

    public static long h(Object obj, long j) {
        return f5191c.f5183a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j7) {
        f5191c.f5183a.putLong(obj, j, j7);
    }

    public static Object j(Object obj, long j) {
        return f5191c.f5183a.getObject(obj, j);
    }

    public static void k(Object obj, long j, Object obj2) {
        f5191c.f5183a.putObject(obj, j, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i10 = u4.f5216a;
        try {
            Class cls2 = f5190b;
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
        return ((byte) ((f5191c.f5183a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(Object obj, long j) {
        return ((byte) ((f5191c.f5183a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f5193e) {
            return f5191c.f5183a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
