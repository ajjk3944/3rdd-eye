package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class p54 extends s44 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, p54> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected b74 zzt;

    public p54() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = b74.f;
    }

    public static Object j(Method method, p54 p54Var, Object... objArr) {
        try {
            return method.invoke(p54Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static e64 k(v54 v54Var) {
        e64 e64Var = (e64) v54Var;
        int i = e64Var.h;
        return e64Var.z(i + i);
    }

    public static p54 l(p54 p54Var, m0 m0Var, h54 h54Var) throws a64 {
        p54 p54VarP = p54Var.p();
        try {
            v64 v64VarA = p64.c.a(p54VarP.getClass());
            o9 o9Var = (o9) m0Var.h;
            if (o9Var == null) {
                o9Var = new o9(m0Var);
            }
            v64VarA.c(p54VarP, o9Var, h54Var);
            v64VarA.h(p54VarP);
            return p54VarP;
        } catch (a64 e) {
            if (e.f) {
                throw new a64(e.getMessage(), e);
            }
            throw e;
        } catch (a74 e2) {
            throw new a64(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof a64) {
                throw ((a64) e3.getCause());
            }
            throw new a64(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof a64) {
                throw ((a64) e4.getCause());
            }
            throw e4;
        }
    }

    public static p54 m(p54 p54Var, a54 a54Var, h54 h54Var) throws a64 {
        m0 m0VarL = a54Var.l();
        p54 p54VarL = l(p54Var, m0VarL, h54Var);
        m0VarL.k(0);
        z(p54VarL);
        return p54VarL;
    }

    public static p54 n(p54 p54Var, byte[] bArr, h54 h54Var) throws a64 {
        p54 p54VarY = y(p54Var, bArr, bArr.length, h54Var);
        z(p54VarY);
        return p54VarY;
    }

    public static p54 t(Class cls) throws ClassNotFoundException {
        p54 p54Var = zzd.get(cls);
        if (p54Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p54Var = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (p54Var != null) {
            return p54Var;
        }
        p54 p54Var2 = (p54) ((p54) g74.f(cls)).w(6, null);
        if (p54Var2 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, p54Var2);
        return p54Var2;
    }

    public static void u(Class cls, p54 p54Var) {
        p54Var.i();
        zzd.put(cls, p54Var);
    }

    public static final boolean x(p54 p54Var, boolean z) {
        byte bByteValue = ((Byte) p54Var.w(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = p64.c.a(p54Var.getClass()).f(p54Var);
        if (z) {
            p54Var.w(2, true == zF ? p54Var : null);
        }
        return zF;
    }

    public static p54 y(p54 p54Var, byte[] bArr, int i, h54 h54Var) throws a64 {
        if (i == 0) {
            return p54Var;
        }
        p54 p54VarP = p54Var.p();
        try {
            v64 v64VarA = p64.c.a(p54VarP.getClass());
            v64VarA.i(p54VarP, bArr, 0, i, new v44(h54Var));
            v64VarA.h(p54VarP);
            return p54VarP;
        } catch (a64 e) {
            if (e.f) {
                throw new a64(e.getMessage(), e);
            }
            throw e;
        } catch (a74 e2) {
            throw new a64(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof a64) {
                throw ((a64) e3.getCause());
            }
            throw new a64(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void z(p54 p54Var) throws a64 {
        if (p54Var != null && !x(p54Var, true)) {
            throw new a64(new a74().getMessage());
        }
    }

    @Override // defpackage.s44
    public final int d(v64 v64Var) {
        int iG;
        int iG2;
        if (h()) {
            if (v64Var == null) {
                iG2 = p64.c.a(getClass()).g(this);
            } else {
                iG2 = v64Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(ex0.j(new StringBuilder(String.valueOf(iG2).length() + 42), "serialized size must be non-negative, was ", iG2));
        }
        int i = this.zzc;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (v64Var == null) {
            iG = p64.c.a(getClass()).g(this);
        } else {
            iG = v64Var.g(this);
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
        return p64.c.a(getClass()).j(this, (p54) obj);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(ex0.j(new StringBuilder(String.valueOf(i).length() + 42), "serialized size must be non-negative, was ", i));
        }
        this.zzc = i | (this.zzc & zza);
    }

    public final boolean h() {
        return (this.zzc & zza) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return p64.c.a(getClass()).b(this);
        }
        if (this.zzq == 0) {
            this.zzq = p64.c.a(getClass()).b(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final n64 o() {
        return (n64) w(7, null);
    }

    public final p54 p() {
        return (p54) w(4, null);
    }

    public final void q() {
        p64.c.a(getClass()).h(this);
        i();
    }

    public final n54 r() {
        return (n54) w(5, null);
    }

    public final n54 s() {
        n54 n54Var = (n54) w(5, null);
        n54Var.e(this);
        return n54Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = j64.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        j64.b(this, sb, 0);
        return sb.toString();
    }

    public final void v(g54 g54Var) {
        v64 v64VarA = p64.c.a(getClass());
        it3 it3Var = g54Var.s;
        if (it3Var == null) {
            it3Var = new it3(g54Var);
        }
        v64VarA.e(this, it3Var);
    }

    public abstract Object w(int i, p54 p54Var);
}
