package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class DI extends AbstractC1096eL {
    private static final DI zzf;
    private static volatile CL zzg;
    private int zza;
    private int zzb;
    private C2226zI zzc;
    private QK zzd;
    private QK zze;

    static {
        DI di = new DI();
        zzf = di;
        AbstractC1096eL.u(DI.class, di);
    }

    public DI() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
    }

    public static DI E(QK qk, XK xk) {
        return (DI) AbstractC1096eL.m(zzf, qk, xk);
    }

    public static CI F() {
        return (CI) zzf.r();
    }

    public static DI G() {
        return zzf;
    }

    public static CL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C2226zI B() {
        C2226zI c2226zI = this.zzc;
        return c2226zI == null ? C2226zI.C() : c2226zI;
    }

    public final QK C() {
        return this.zzd;
    }

    public final QK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(C2226zI c2226zI) {
        this.zzc = c2226zI;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(OK ok) {
        this.zzd = ok;
    }

    public final /* synthetic */ void K(OK ok) {
        this.zze = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new DI();
        }
        if (iC == 4) {
            return new CI(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (DI.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
