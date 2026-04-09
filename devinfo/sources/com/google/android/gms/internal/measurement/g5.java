package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g5 extends s4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected m6 zzc;

    public g5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = m6.f19825f;
    }

    public static g5 l(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        g5 g5Var = (g5) map.get(cls);
        if (g5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g5Var = (g5) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (g5Var != null) {
            return g5Var;
        }
        g5 g5Var2 = (g5) ((g5) r6.e(cls)).o(6);
        if (g5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g5Var2);
        return g5Var2;
    }

    public static void m(Class cls, g5 g5Var) {
        g5Var.f();
        zzd.put(cls, g5Var);
    }

    public static Object n(Method method, g5 g5Var, Object... objArr) {
        try {
            return method.invoke(g5Var, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
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
    public final int b(i6 i6Var) {
        if (e()) {
            int iD = i6Var.d(this);
            if (iD >= 0) {
                return iD;
            }
            StringBuilder sb2 = new StringBuilder(r5.c.e(iD, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iD);
            throw new IllegalStateException(sb2.toString());
        }
        int i4 = this.zzb & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iD2 = i6Var.d(this);
        if (iD2 >= 0) {
            this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | iD2;
            return iD2;
        }
        StringBuilder sb3 = new StringBuilder(r5.c.e(iD2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iD2);
        throw new IllegalStateException(sb3.toString());
    }

    public final void d(y4 y4Var) {
        i6 i6VarA = f6.f19741c.a(getClass());
        v5 v5Var = y4Var.f20049a;
        if (v5Var == null) {
            v5Var = new v5(y4Var);
        }
        i6VarA.e(this, v5Var);
    }

    public final boolean e() {
        return (this.zzb & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return f6.f19741c.a(getClass()).f(this, (g5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        f6.f19741c.a(getClass()).g(this);
        f();
    }

    public final f5 h() {
        return (f5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return f6.f19741c.a(getClass()).i(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int i10 = f6.f19741c.a(getClass()).i(this);
        this.zza = i10;
        return i10;
    }

    public final f5 i() {
        f5 f5Var = (f5) o(5);
        f5Var.g(this);
        return f5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iD = f6.f19741c.a(getClass()).d(this);
            if (iD >= 0) {
                return iD;
            }
            StringBuilder sb2 = new StringBuilder(r5.c.e(iD, 42));
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iD);
            throw new IllegalStateException(sb2.toString());
        }
        int i4 = this.zzb & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iD2 = f6.f19741c.a(getClass()).d(this);
        if (iD2 >= 0) {
            this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | iD2;
            return iD2;
        }
        StringBuilder sb3 = new StringBuilder(r5.c.e(iD2, 42));
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iD2);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object o(int i4);

    public final String toString() {
        String string = super.toString();
        char[] cArr = a6.f19610a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        a6.b(this, sb2, 0);
        return sb2.toString();
    }
}
