package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class HI extends AbstractC1096eL {
    private static final HI zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        HI hi = new HI();
        zzd = hi;
        AbstractC1096eL.u(HI.class, hi);
    }

    public static GI D() {
        return (GI) zzd.r();
    }

    public static HI E() {
        return zzd;
    }

    public final RH A() {
        RH rhB = RH.b(this.zza);
        return rhB == null ? RH.UNRECOGNIZED : rhB;
    }

    public final RH B() {
        RH rhB = RH.b(this.zzb);
        return rhB == null ? RH.UNRECOGNIZED : rhB;
    }

    public final int C() {
        return this.zzc;
    }

    public final /* synthetic */ void F(RH rh) {
        this.zza = rh.a();
    }

    public final /* synthetic */ void G(RH rh) {
        this.zzb = rh.a();
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new HI();
        }
        if (iC == 4) {
            return new GI(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zze;
        if (cl != null) {
            return cl;
        }
        synchronized (HI.class) {
            try {
                c1042dL = zze;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzd);
                    zze = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
