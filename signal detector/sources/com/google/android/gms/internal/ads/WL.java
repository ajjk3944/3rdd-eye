package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class WL {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12212a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12213b;

    /* renamed from: c, reason: collision with root package name */
    public static final VL f12214c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12215d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12216e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12217f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f12218g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f12219h;

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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WL.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f12216e) {
            return ((Unsafe) f12214c.f11985a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f12216e) {
            ((Unsafe) f12214c.f11985a).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i = JK.f9277a;
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

    public static void d(Object obj, long j6, byte b5) {
        Unsafe unsafe = (Unsafe) f12214c.f11985a;
        long j7 = (-4) & j6;
        int i = unsafe.getInt(obj, j7);
        int i3 = ((~((int) j6)) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b5) << i3) | (i & (~(255 << i3))));
    }

    public static void e(Object obj, long j6, byte b5) {
        Unsafe unsafe = (Unsafe) f12214c.f11985a;
        long j7 = (-4) & j6;
        int i = (((int) j6) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b5) << i) | (unsafe.getInt(obj, j7) & (~(255 << i))));
    }

    public static Object f(Class cls) {
        try {
            return f12212a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int g(long j6, Object obj) {
        return ((Unsafe) f12214c.f11985a).getInt(obj, j6);
    }

    public static void h(long j6, Object obj, int i) {
        ((Unsafe) f12214c.f11985a).putInt(obj, j6, i);
    }

    public static long i(long j6, Object obj) {
        return ((Unsafe) f12214c.f11985a).getLong(obj, j6);
    }

    public static void j(Object obj, long j6, long j7) {
        ((Unsafe) f12214c.f11985a).putLong(obj, j6, j7);
    }

    public static Object k(long j6, Object obj) {
        return ((Unsafe) f12214c.f11985a).getObject(obj, j6);
    }

    public static void l(Object obj, long j6, Object obj2) {
        ((Unsafe) f12214c.f11985a).putObject(obj, j6, obj2);
    }

    public static void m(byte[] bArr, long j6, byte b5) {
        f12214c.Q(bArr, f12217f + j6, b5);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) f12214c.f11985a).getLong(byteBuffer, f12218g);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new SL());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean p(Class cls) {
        int i = JK.f9277a;
        try {
            Class cls2 = f12213b;
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

    public static /* synthetic */ boolean q(long j6, Object obj) {
        return ((byte) ((((Unsafe) f12214c.f11985a).getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean r(long j6, Object obj) {
        return ((byte) ((((Unsafe) f12214c.f11985a).getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }
}
