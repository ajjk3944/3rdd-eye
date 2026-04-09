package com.google.android.gms.internal.play_billing;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p1 extends b1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected p2 zzc;
    private int zzd;

    public p1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = p2.f20207f;
    }

    public static final boolean c(p1 p1Var, boolean z3) {
        byte bByteValue = ((Byte) p1Var.d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = i2.f20149c.a(p1Var.getClass()).a(p1Var);
        if (z3) {
            p1Var.d(2);
        }
        return zA;
    }

    public static p1 h(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        p1 p1Var = (p1) map.get(cls);
        if (p1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p1Var = (p1) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = (p1) ((p1) u2.g(cls)).d(6);
        if (p1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, p1Var2);
        return p1Var2;
    }

    public static Object i(Method method, p1 p1Var, Object... objArr) {
        try {
            return method.invoke(p1Var, objArr);
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

    public static void k(Class cls, p1 p1Var) {
        p1Var.j();
        zzb.put(cls, p1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.b1
    public final int b(l2 l2Var) {
        if (m()) {
            int iH = l2Var.h(this);
            if (iH >= 0) {
                return iH;
            }
            throw new IllegalStateException(je.u.r(iH, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iH2 = l2Var.h(this);
        if (iH2 < 0) {
            throw new IllegalStateException(je.u.r(iH2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iH2;
        return iH2;
    }

    public abstract Object d(int i4);

    public final int e() {
        if (m()) {
            int iH = i2.f20149c.a(getClass()).h(this);
            if (iH >= 0) {
                return iH;
            }
            throw new IllegalStateException(je.u.r(iH, "serialized size must be non-negative, was "));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iH2 = i2.f20149c.a(getClass()).h(this);
        if (iH2 < 0) {
            throw new IllegalStateException(je.u.r(iH2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iH2;
        return iH2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return i2.f20149c.a(getClass()).i(this, (p1) obj);
    }

    public final o1 f() {
        return (o1) d(5);
    }

    public final o1 g() {
        o1 o1Var = (o1) d(5);
        if (!o1Var.f20200a.equals(this)) {
            if (!o1Var.f20201b.m()) {
                p1 p1Var = (p1) o1Var.f20200a.d(4);
                i2.f20149c.a(p1Var.getClass()).e(p1Var, o1Var.f20201b);
                o1Var.f20201b = p1Var;
            }
            p1 p1Var2 = o1Var.f20201b;
            i2.f20149c.a(p1Var2.getClass()).e(p1Var2, this);
        }
        return o1Var;
    }

    public final int hashCode() {
        if (m()) {
            return i2.f20149c.a(getClass()).d(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int iD = i2.f20149c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | Integer.MAX_VALUE;
    }

    public final boolean m() {
        return (this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = e2.f20109a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        e2.c(this, sb2, 0);
        return sb2.toString();
    }
}
