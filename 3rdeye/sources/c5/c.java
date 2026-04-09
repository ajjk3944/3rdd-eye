package C5;

import com.google.gson.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public static Class f923d;

    /* renamed from: b, reason: collision with root package name */
    public final Object f924b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f925c;

    public c() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f923d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f924b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f925c = declaredField;
    }

    @Override // C5.b
    public final void a(AccessibleObject accessibleObject) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Field field;
        Object obj = this.f924b;
        if (obj != null && (field = this.f925c) != null) {
            try {
                Long l5 = (Long) f923d.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
                l5.getClass();
                f923d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, l5, Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e4) {
            throw new h("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e4);
        }
    }
}
