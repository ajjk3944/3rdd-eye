package com.google.android.gms.internal.consent_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class w5 extends l5 {
    private static final Map zzb = new ConcurrentHashMap();
    protected v6 zzc;
    private int zzd;

    public w5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = v6.f19547e;
    }

    public static w5 h(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        w5 w5Var = (w5) map.get(cls);
        if (w5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                w5Var = (w5) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (w5Var != null) {
            return w5Var;
        }
        w5 w5Var2 = (w5) ((w5) b7.g(cls)).f(6);
        if (w5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, w5Var2);
        return w5Var2;
    }

    public static Object i(Method method, w5 w5Var, Object... objArr) {
        try {
            return method.invoke(w5Var, objArr);
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

    public static void l(Class cls, w5 w5Var) {
        w5Var.k();
        zzb.put(cls, w5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l5
    public final void a(q5 q5Var) {
        q6 q6VarA = n6.f19445c.a(getClass());
        e6 e6Var = q5Var.f19495b;
        if (e6Var == null) {
            e6Var = new e6(q5Var);
        }
        q6VarA.d(this, e6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l5
    public final int b(q6 q6Var) {
        if (e()) {
            int iF = q6Var.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(je.u.r(iF, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iF2 = q6Var.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(je.u.r(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iF2;
        return iF2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l5
    public final int c() {
        if (e()) {
            int iF = n6.f19445c.a(getClass()).f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(je.u.r(iF, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iF2 = n6.f19445c.a(getClass()).f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(je.u.r(iF2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iF2;
        return iF2;
    }

    public final void d() {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return n6.f19445c.a(getClass()).c(this, (w5) obj);
    }

    public abstract Object f(int i4);

    public final v5 g() {
        return (v5) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return n6.f19445c.a(getClass()).b(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int iB = n6.f19445c.a(getClass()).b(this);
        this.zza = iB;
        return iB;
    }

    public final void j() {
        n6.f19445c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = j6.f19385a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        j6.c(this, sb2, 0);
        return sb2.toString();
    }
}
