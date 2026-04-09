package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ip1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12410a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12411b;

    /* renamed from: c, reason: collision with root package name */
    public static final hp1 f12412c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12413d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12414e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12415f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f12416h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ip1.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f12414e) {
            return ((Unsafe) f12412c.f11937a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f12414e) {
            ((Unsafe) f12412c.f11937a).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i4 = um1.f17262a;
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

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = (Unsafe) f12412c.f11937a;
        long j8 = (-4) & j;
        int i4 = unsafe.getInt(obj, j8);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i10) | (i4 & (~(255 << i10))));
    }

    public static void e(Object obj, long j, byte b10) {
        Unsafe unsafe = (Unsafe) f12412c.f11937a;
        long j8 = (-4) & j;
        int i4 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b10) << i4) | (unsafe.getInt(obj, j8) & (~(255 << i4))));
    }

    public static Object f(Class cls) {
        try {
            return f12410a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int g(Object obj, long j) {
        return ((Unsafe) f12412c.f11937a).getInt(obj, j);
    }

    public static void h(long j, Object obj, int i4) {
        ((Unsafe) f12412c.f11937a).putInt(obj, j, i4);
    }

    public static long i(Object obj, long j) {
        return ((Unsafe) f12412c.f11937a).getLong(obj, j);
    }

    public static void j(Object obj, long j, long j8) {
        ((Unsafe) f12412c.f11937a).putLong(obj, j, j8);
    }

    public static Object k(Object obj, long j) {
        return ((Unsafe) f12412c.f11937a).getObject(obj, j);
    }

    public static void l(Object obj, long j, Object obj2) {
        ((Unsafe) f12412c.f11937a).putObject(obj, j, obj2);
    }

    public static void m(byte[] bArr, long j, byte b10) {
        f12412c.G(bArr, f12415f + j, b10);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) f12412c.f11937a).getLong(byteBuffer, g);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ep1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean p(Class cls) {
        int i4 = um1.f17262a;
        try {
            Class cls2 = f12411b;
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

    public static /* synthetic */ boolean q(Object obj, long j) {
        return ((byte) ((((Unsafe) f12412c.f11937a).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean r(Object obj, long j) {
        return ((byte) ((((Unsafe) f12412c.f11937a).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
