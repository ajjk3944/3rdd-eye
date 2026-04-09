package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Q5 extends AbstractC1096eL {
    private static final Q5 zzi;
    private static volatile CL zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        Q5 q52 = new Q5();
        zzi = q52;
        AbstractC1096eL.u(Q5.class, q52);
    }

    public static P5 A() {
        return (P5) zzi.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 1;
        this.zzb = j6;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j6) {
        this.zza |= 32;
        this.zzg = j6;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", J5.f9235e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new Q5();
        }
        if (iC == 4) {
            return new P5(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzj;
        if (cl != null) {
            return cl;
        }
        synchronized (Q5.class) {
            try {
                c1042dL = zzj;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzi);
                    zzj = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
