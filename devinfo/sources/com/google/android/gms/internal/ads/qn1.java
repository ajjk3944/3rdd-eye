package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class qn1 extends qm1 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, qn1> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected dp1 zzt;

    public qn1() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = dp1.f10535f;
    }

    public static Object j(Method method, qn1 qn1Var, Object... objArr) {
        try {
            return method.invoke(qn1Var, objArr);
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

    public static fo1 k(wn1 wn1Var) {
        fo1 fo1Var = (fo1) wn1Var;
        int i4 = fo1Var.f11249c;
        return fo1Var.n(i4 + i4);
    }

    public static qn1 l(qn1 qn1Var, en1 en1Var, jn1 jn1Var) throws ao1 {
        qn1 qn1VarP = qn1Var.p();
        try {
            xo1 xo1VarA = ro1.f15723c.a(qn1VarP.getClass());
            androidx.datastore.preferences.protobuf.k kVar = en1Var.f10838c;
            if (kVar == null) {
                kVar = new androidx.datastore.preferences.protobuf.k(en1Var);
            }
            xo1VarA.d(qn1VarP, kVar, jn1Var);
            xo1VarA.a(qn1VarP);
            return qn1VarP;
        } catch (ao1 e2) {
            if (e2.f9377a) {
                throw new ao1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (cp1 e10) {
            throw new ao1(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof ao1) {
                throw ((ao1) e11.getCause());
            }
            throw new ao1(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof ao1) {
                throw ((ao1) e12.getCause());
            }
            throw e12;
        }
    }

    public static qn1 m(qn1 qn1Var, bn1 bn1Var, jn1 jn1Var) {
        en1 en1VarR = bn1Var.r();
        qn1 qn1VarL = l(qn1Var, en1VarR, jn1Var);
        en1VarR.i(0);
        z(qn1VarL);
        return qn1VarL;
    }

    public static qn1 n(qn1 qn1Var, byte[] bArr, jn1 jn1Var) throws ao1 {
        qn1 qn1VarY = y(qn1Var, bArr, bArr.length, jn1Var);
        z(qn1VarY);
        return qn1VarY;
    }

    public static qn1 t(Class cls) throws ClassNotFoundException {
        qn1 qn1Var = zzd.get(cls);
        if (qn1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qn1Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (qn1Var != null) {
            return qn1Var;
        }
        qn1 qn1Var2 = (qn1) ((qn1) ip1.f(cls)).w(6, null);
        if (qn1Var2 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, qn1Var2);
        return qn1Var2;
    }

    public static void u(Class cls, qn1 qn1Var) {
        qn1Var.i();
        zzd.put(cls, qn1Var);
    }

    public static final boolean x(qn1 qn1Var, boolean z3) {
        byte bByteValue = ((Byte) qn1Var.w(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = ro1.f15723c.a(qn1Var.getClass()).f(qn1Var);
        if (z3) {
            qn1Var.w(2, true == zF ? qn1Var : null);
        }
        return zF;
    }

    public static qn1 y(qn1 qn1Var, byte[] bArr, int i4, jn1 jn1Var) throws ao1 {
        if (i4 == 0) {
            return qn1Var;
        }
        qn1 qn1VarP = qn1Var.p();
        try {
            xo1 xo1VarA = ro1.f15723c.a(qn1VarP.getClass());
            xo1VarA.j(qn1VarP, bArr, 0, i4, new vm1(jn1Var));
            xo1VarA.a(qn1VarP);
            return qn1VarP;
        } catch (ao1 e2) {
            if (e2.f9377a) {
                throw new ao1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (cp1 e10) {
            throw new ao1(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof ao1) {
                throw ((ao1) e11.getCause());
            }
            throw new ao1(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void z(qn1 qn1Var) {
        if (qn1Var != null && !x(qn1Var, true)) {
            throw new ao1(new cp1().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.qm1
    public final int d(xo1 xo1Var) {
        int iG;
        int iG2;
        if (h()) {
            if (xo1Var == null) {
                iG2 = ro1.f15723c.a(getClass()).g(this);
            } else {
                iG2 = xo1Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(d.h.q(iG2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iG2).length() + 42)));
        }
        int i4 = this.zzc;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (xo1Var == null) {
            iG = ro1.f15723c.a(getClass()).g(this);
        } else {
            iG = xo1Var.g(this);
        }
        g(iG);
        return iG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ro1.f15723c.a(getClass()).e(this, (qn1) obj);
    }

    public final void g(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException(d.h.q(i4, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i4).length() + 42)));
        }
        this.zzc = i4 | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return ro1.f15723c.a(getClass()).i(this);
        }
        if (this.zzq == 0) {
            this.zzq = ro1.f15723c.a(getClass()).i(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final po1 o() {
        return (po1) w(7, null);
    }

    public final qn1 p() {
        return (qn1) w(4, null);
    }

    public final void q() {
        ro1.f15723c.a(getClass()).a(this);
        i();
    }

    public final on1 r() {
        return (on1) w(5, null);
    }

    public final on1 s() {
        on1 on1Var = (on1) w(5, null);
        on1Var.f(this);
        return on1Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = lo1.f13565a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        lo1.b(this, sb2, 0);
        return sb2.toString();
    }

    public final void v(hn1 hn1Var) {
        xo1 xo1VarA = ro1.f15723c.a(getClass());
        rg0 rg0Var = hn1Var.f11929b;
        if (rg0Var == null) {
            rg0Var = new rg0(hn1Var);
        }
        xo1VarA.h(this, rg0Var);
    }

    public abstract Object w(int i4, qn1 qn1Var);
}
