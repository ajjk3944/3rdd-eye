package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f51 {
    public final s8 a;
    public final s8 b;
    public final s8 c;

    public f51(s8 s8Var, s8 s8Var2, s8 s8Var3) {
        this.a = s8Var;
        this.b = s8Var2;
        this.c = s8Var3;
    }

    public abstract g51 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        s8 s8Var = this.c;
        Class cls2 = (Class) s8Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        s8Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        s8 s8Var = this.a;
        Method method = (Method) s8Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, f51.class.getClassLoader()).getDeclaredMethod("read", f51.class);
        s8Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        s8 s8Var = this.b;
        Method method = (Method) s8Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, f51.class);
        s8Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((g51) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((g51) this).e.readParcelable(g51.class.getClassLoader());
    }

    public final h51 h() {
        String string = ((g51) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (h51) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((g51) this).e.writeInt(i);
    }

    public final void k(h51 h51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (h51Var == null) {
            ((g51) this).e.writeString(null);
            return;
        }
        try {
            ((g51) this).e.writeString(b(h51Var.getClass()).getName());
            g51 g51VarA = a();
            try {
                d(h51Var.getClass()).invoke(null, h51Var, g51VarA);
                Parcel parcel = g51VarA.e;
                int i = g51VarA.i;
                if (i >= 0) {
                    int i2 = g51VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(h51Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
