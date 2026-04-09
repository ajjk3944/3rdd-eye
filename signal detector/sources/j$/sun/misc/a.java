package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20637b;

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f20638a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f20637b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e6) {
            throw new AssertionError("Couldn't get the Unsafe", e6);
        }
    }

    public a(Unsafe unsafe) {
        this.f20638a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e6) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e6);
        }
    }

    public final int e(q qVar, long j6) {
        while (true) {
            int intVolatile = this.f20638a.getIntVolatile(qVar, j6);
            q qVar2 = qVar;
            long j7 = j6;
            if (this.f20638a.compareAndSwapInt(qVar2, j7, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j6 = j7;
        }
    }

    public final long i(Field field) {
        return this.f20638a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e6) {
            throw new AssertionError("Cannot find field:", e6);
        }
    }

    public final int a(Class cls) {
        return this.f20638a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f20638a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j6) {
        return this.f20638a.getObjectVolatile(obj, j6);
    }

    public final void j(Object obj, long j6, l lVar) {
        this.f20638a.putObjectVolatile(obj, j6, lVar);
    }

    public final boolean c(Object obj, long j6, int i, int i3) {
        return this.f20638a.compareAndSwapInt(obj, j6, i, i3);
    }

    public final boolean d(Object obj, long j6, long j7, long j8) {
        return this.f20638a.compareAndSwapLong(obj, j6, j7, j8);
    }
}
