package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f26027b;

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f26028a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f26027b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    public a(Unsafe unsafe) {
        this.f26028a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e2) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e2);
        }
    }

    public final int e(q qVar, long j) {
        while (true) {
            int intVolatile = this.f26028a.getIntVolatile(qVar, j);
            q qVar2 = qVar;
            long j8 = j;
            if (this.f26028a.compareAndSwapInt(qVar2, j8, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j = j8;
        }
    }

    public final long i(Field field) {
        return this.f26028a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError("Cannot find field:", e2);
        }
    }

    public final int a(Class cls) {
        return this.f26028a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f26028a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j) {
        return this.f26028a.getObjectVolatile(obj, j);
    }

    public final void j(Object obj, long j, l lVar) {
        this.f26028a.putObjectVolatile(obj, j, lVar);
    }

    public final boolean c(Object obj, long j, int i4, int i10) {
        return this.f26028a.compareAndSwapInt(obj, j, i4, i10);
    }

    public final boolean d(Object obj, long j, long j8, long j9) {
        return this.f26028a.compareAndSwapLong(obj, j, j8, j9);
    }
}
