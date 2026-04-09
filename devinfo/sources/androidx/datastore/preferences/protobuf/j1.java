package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f999a;

    public j1(Unsafe unsafe) {
        this.f999a = unsafe;
    }

    public final int a(Class cls) {
        return this.f999a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f999a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract double d(Object obj, long j);

    public abstract float e(Object obj, long j);

    public final int f(Object obj, long j) {
        return this.f999a.getInt(obj, j);
    }

    public final long g(Object obj, long j) {
        return this.f999a.getLong(obj, j);
    }

    public final Object h(Object obj, long j) {
        return this.f999a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f999a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z3);

    public abstract void k(Object obj, long j, byte b10);

    public abstract void l(Object obj, long j, double d10);

    public abstract void m(Object obj, long j, float f10);

    public final void n(long j, Object obj, int i4) {
        this.f999a.putInt(obj, j, i4);
    }

    public final void o(Object obj, long j, long j8) {
        this.f999a.putLong(obj, j, j8);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f999a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f999a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            k1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
