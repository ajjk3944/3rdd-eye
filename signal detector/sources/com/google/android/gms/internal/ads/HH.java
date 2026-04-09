package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class HH extends AbstractC1096eL {
    private static final HH zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        HH hh = new HH();
        zzd = hh;
        AbstractC1096eL.u(HH.class, hh);
    }

    public static GH B() {
        return (GH) zzd.r();
    }

    public static HH C() {
        return zzd;
    }

    public final RH A() {
        RH rhB = RH.b(this.zza);
        return rhB == null ? RH.UNRECOGNIZED : rhB;
    }

    public final /* synthetic */ void D(RH rh) {
        this.zza = rh.a();
    }

    public final int E() {
        int i = this.zzb;
        int i3 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int F() {
        int i = this.zzc;
        int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final void G(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzb = i - 2;
    }

    public final void H(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new HH();
        }
        if (iC == 4) {
            return new GH(zzd);
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
        synchronized (HH.class) {
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
