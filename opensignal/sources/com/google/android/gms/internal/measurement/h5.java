package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class h5 extends s4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected n6 zzc;

    public h5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = n6.f5136f;
    }

    public static h5 l(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        h5 h5Var = (h5) map.get(cls);
        if (h5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                h5Var = (h5) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (h5Var != null) {
            return h5Var;
        }
        h5 h5Var2 = (h5) ((h5) s6.e(cls)).o(6);
        if (h5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, h5Var2);
        return h5Var2;
    }

    public static void m(Class cls, h5 h5Var) {
        h5Var.f();
        zzd.put(cls, h5Var);
    }

    public static Object n(Method method, h5 h5Var, Object... objArr) {
        try {
            return method.invoke(h5Var, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final int b(j6 j6Var) {
        if (e()) {
            int iB = j6Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(w.g.e("serialized size must be non-negative, was ", String.valueOf(iB).length() + 42, iB));
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iB2 = j6Var.b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(w.g.e("serialized size must be non-negative, was ", String.valueOf(iB2).length() + 42, iB2));
        }
        this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public final void d(z4 z4Var) {
        j6 j6VarA = g6.f5043c.a(getClass());
        w5 w5Var = z4Var.f5282c;
        if (w5Var == null) {
            w5Var = new w5(z4Var);
        }
        j6VarA.c(this, w5Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return g6.f5043c.a(getClass()).e(this, (h5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        g6.f5043c.a(getClass()).f(this);
        f();
    }

    public final g5 h() {
        return (g5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return g6.f5043c.a(getClass()).h(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iH = g6.f5043c.a(getClass()).h(this);
        this.zza = iH;
        return iH;
    }

    public final g5 i() {
        g5 g5Var = (g5) o(5);
        g5Var.f(this);
        return g5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iB = g6.f5043c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(w.g.e("serialized size must be non-negative, was ", String.valueOf(iB).length() + 42, iB));
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iB2 = g6.f5043c.a(getClass()).b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(w.g.e("serialized size must be non-negative, was ", String.valueOf(iB2).length() + 42, iB2));
        }
        this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public abstract Object o(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = b6.f4920a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        b6.b(this, sb2, 0);
        return sb2.toString();
    }
}
