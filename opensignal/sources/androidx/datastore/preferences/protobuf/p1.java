package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f1334a;

    public p1(Unsafe unsafe) {
        this.f1334a = unsafe;
    }

    public final int a(Class cls) {
        return this.f1334a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f1334a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract double d(Object obj, long j);

    public abstract float e(Object obj, long j);

    public final int f(Object obj, long j) {
        return this.f1334a.getInt(obj, j);
    }

    public final long g(Object obj, long j) {
        return this.f1334a.getLong(obj, j);
    }

    public final Object h(Object obj, long j) {
        return this.f1334a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f1334a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z10);

    public abstract void k(Object obj, long j, byte b2);

    public abstract void l(Object obj, long j, double d6);

    public abstract void m(Object obj, long j, float f10);

    public final void n(int i10, long j, Object obj) {
        this.f1334a.putInt(obj, j, i10);
    }

    public final void o(Object obj, long j, long j7) {
        this.f1334a.putLong(obj, j, j7);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f1334a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f1334a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            q1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
