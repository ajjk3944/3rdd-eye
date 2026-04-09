package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1096eL extends FK {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC1096eL> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected RL zzt;

    public AbstractC1096eL() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = RL.f10898f;
    }

    public static Object j(Method method, AbstractC1096eL abstractC1096eL, Object... objArr) {
        try {
            return method.invoke(abstractC1096eL, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static C1851sL k(InterfaceC1420kL interfaceC1420kL) {
        C1851sL c1851sL = (C1851sL) interfaceC1420kL;
        int i = c1851sL.f16710c;
        return c1851sL.B(i + i);
    }

    public static AbstractC1096eL l(AbstractC1096eL abstractC1096eL, D5.b bVar, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLP = abstractC1096eL.p();
        try {
            JL jlA = EL.f7942c.a(abstractC1096eLP.getClass());
            C1506m c1506m = (C1506m) bVar.f1296c;
            if (c1506m == null) {
                c1506m = new C1506m(bVar);
            }
            jlA.h(abstractC1096eLP, c1506m, xk);
            jlA.e(abstractC1096eLP);
            return abstractC1096eLP;
        } catch (QL e6) {
            throw new C1636oL(e6.getMessage());
        } catch (C1636oL e7) {
            if (e7.f15934a) {
                throw new C1636oL(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof C1636oL) {
                throw ((C1636oL) e8.getCause());
            }
            throw new C1636oL(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof C1636oL) {
                throw ((C1636oL) e9.getCause());
            }
            throw e9;
        }
    }

    public static AbstractC1096eL m(AbstractC1096eL abstractC1096eL, QK qk, XK xk) {
        D5.b bVarN = qk.n();
        AbstractC1096eL abstractC1096eLL = l(abstractC1096eL, bVarN, xk);
        bVarN.o(0);
        z(abstractC1096eLL);
        return abstractC1096eLL;
    }

    public static AbstractC1096eL n(AbstractC1096eL abstractC1096eL, byte[] bArr, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLY = y(abstractC1096eL, bArr, bArr.length, xk);
        z(abstractC1096eLY);
        return abstractC1096eLY;
    }

    public static AbstractC1096eL t(Class cls) throws ClassNotFoundException {
        AbstractC1096eL abstractC1096eL = zzd.get(cls);
        if (abstractC1096eL == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1096eL = zzd.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1096eL != null) {
            return abstractC1096eL;
        }
        AbstractC1096eL abstractC1096eL2 = (AbstractC1096eL) ((AbstractC1096eL) WL.f(cls)).w(6, null);
        if (abstractC1096eL2 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, abstractC1096eL2);
        return abstractC1096eL2;
    }

    public static void u(Class cls, AbstractC1096eL abstractC1096eL) {
        abstractC1096eL.i();
        zzd.put(cls, abstractC1096eL);
    }

    public static final boolean x(AbstractC1096eL abstractC1096eL, boolean z6) {
        byte bByteValue = ((Byte) abstractC1096eL.w(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = EL.f7942c.a(abstractC1096eL.getClass()).d(abstractC1096eL);
        if (z6) {
            abstractC1096eL.w(2, true == zD ? abstractC1096eL : null);
        }
        return zD;
    }

    public static AbstractC1096eL y(AbstractC1096eL abstractC1096eL, byte[] bArr, int i, XK xk) throws C1636oL {
        if (i == 0) {
            return abstractC1096eL;
        }
        AbstractC1096eL abstractC1096eLP = abstractC1096eL.p();
        try {
            JL jlA = EL.f7942c.a(abstractC1096eLP.getClass());
            jlA.j(abstractC1096eLP, bArr, 0, i, new KK(xk));
            jlA.e(abstractC1096eLP);
            return abstractC1096eLP;
        } catch (QL e6) {
            throw new C1636oL(e6.getMessage());
        } catch (C1636oL e7) {
            if (e7.f15934a) {
                throw new C1636oL(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof C1636oL) {
                throw ((C1636oL) e8.getCause());
            }
            throw new C1636oL(e8.getMessage(), e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void z(AbstractC1096eL abstractC1096eL) {
        if (abstractC1096eL != null && !x(abstractC1096eL, true)) {
            throw new C1636oL(new QL().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.FK
    public final int d(JL jl) {
        int iG;
        int iG2;
        if (h()) {
            if (jl == null) {
                iG2 = EL.f7942c.a(getClass()).g(this);
            } else {
                iG2 = jl.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(A.f.i(iG2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iG2).length() + 42)));
        }
        int i = this.zzc;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (jl == null) {
            iG = EL.f7942c.a(getClass()).g(this);
        } else {
            iG = jl.g(this);
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
        return EL.f7942c.a(getClass()).c(this, (AbstractC1096eL) obj);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(A.f.i(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        this.zzc = i | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return EL.f7942c.a(getClass()).i(this);
        }
        if (this.zzq == 0) {
            this.zzq = EL.f7942c.a(getClass()).i(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final CL o() {
        return (CL) w(7, null);
    }

    public final AbstractC1096eL p() {
        return (AbstractC1096eL) w(4, null);
    }

    public final void q() {
        EL.f7942c.a(getClass()).e(this);
        i();
    }

    public final AbstractC0987cL r() {
        return (AbstractC0987cL) w(5, null);
    }

    public final AbstractC0987cL s() {
        AbstractC0987cL abstractC0987cL = (AbstractC0987cL) w(5, null);
        abstractC0987cL.e(this);
        return abstractC0987cL;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC2175yL.f17712a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC2175yL.b(this, sb, 0);
        return sb.toString();
    }

    public final void v(VK vk) {
        JL jlA = EL.f7942c.a(getClass());
        C1014cu c1014cu = vk.f11983b;
        if (c1014cu == null) {
            c1014cu = new C1014cu(vk);
        }
        jlA.f(this, c1014cu);
    }

    public abstract Object w(int i, AbstractC1096eL abstractC1096eL);
}
