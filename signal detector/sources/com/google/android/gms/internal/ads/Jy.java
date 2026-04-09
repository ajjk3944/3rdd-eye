package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Jy extends AbstractC1096eL {
    private static final Jy zzf;
    private static volatile CL zzg;
    private int zza;
    private Ly zzb;
    private QK zzc;
    private QK zzd;
    private int zze;

    static {
        Jy jy = new Jy();
        zzf = jy;
        AbstractC1096eL.u(Jy.class, jy);
    }

    public Jy() {
        OK ok = QK.f10609b;
        this.zzc = ok;
        this.zzd = ok;
    }

    public static Iy D() {
        return (Iy) zzf.r();
    }

    public final Ly A() {
        Ly ly = this.zzb;
        return ly == null ? Ly.F() : ly;
    }

    public final QK B() {
        return this.zzc;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(Ly ly) {
        this.zzb = ly;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(QK qk) {
        qk.getClass();
        this.zza |= 2;
        this.zzc = qk;
    }

    public final /* synthetic */ void G(QK qk) {
        qk.getClass();
        this.zza |= 4;
        this.zzd = qk;
    }

    public final int H() {
        int iB = C1476lN.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final /* synthetic */ void I(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", J5.f9228B});
        }
        if (iC == 3) {
            return new Jy();
        }
        if (iC == 4) {
            return new Iy(zzf);
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
        synchronized (Jy.class) {
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
