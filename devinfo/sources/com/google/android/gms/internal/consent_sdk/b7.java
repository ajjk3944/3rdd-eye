package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f19278a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f19279b;

    /* renamed from: c, reason: collision with root package name */
    public static final a7 f19280c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f19281d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f19282e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f19283f;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.b7.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f19282e) {
            f19280c.f19266a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i4 = n5.f19444a;
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
        Unsafe unsafe = f19280c.f19266a;
        long j8 = (-4) & j;
        int i4 = unsafe.getInt(obj, j8);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i10) | (i4 & (~(255 << i10))));
    }

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = f19280c.f19266a;
        long j8 = (-4) & j;
        int i4 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i4) | (unsafe.getInt(obj, j8) & (~(255 << i4))));
    }

    public static int e(Object obj, long j) {
        return f19280c.f19266a.getInt(obj, j);
    }

    public static long f(Object obj, long j) {
        return f19280c.f19266a.getLong(obj, j);
    }

    public static Object g(Class cls) {
        try {
            return f19278a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object h(Object obj, long j) {
        return f19280c.f19266a.getObject(obj, j);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(long j, Object obj, int i4) {
        f19280c.f19266a.putInt(obj, j, i4);
    }

    public static void k(Object obj, long j, long j8) {
        f19280c.f19266a.putLong(obj, j, j8);
    }

    public static void l(Object obj, long j, Object obj2) {
        f19280c.f19266a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj, long j) {
        return ((byte) ((f19280c.f19266a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj, long j) {
        return ((byte) ((f19280c.f19266a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Class cls) {
        int i4 = n5.f19444a;
        try {
            Class cls2 = f19279b;
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

    public static int p(Class cls) {
        if (f19282e) {
            return f19280c.f19266a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
