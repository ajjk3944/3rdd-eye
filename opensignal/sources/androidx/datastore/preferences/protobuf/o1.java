package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class o1 extends p1 {
    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean c(Object obj, long j) {
        return this.f1334a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final double d(Object obj, long j) {
        return this.f1334a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final float e(Object obj, long j) {
        return this.f1334a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void j(Object obj, long j, boolean z10) {
        this.f1334a.putBoolean(obj, j, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void k(Object obj, long j, byte b2) {
        this.f1334a.putByte(obj, j, b2);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void l(Object obj, long j, double d6) {
        this.f1334a.putDouble(obj, j, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void m(Object obj, long j, float f10) {
        this.f1334a.putFloat(obj, j, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f1334a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            q1.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean r() {
        Unsafe unsafe = this.f1334a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (q1.g() != null) {
                    try {
                        Class<?> cls3 = this.f1334a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        q1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                q1.a(th3);
            }
        }
        return false;
    }
}
