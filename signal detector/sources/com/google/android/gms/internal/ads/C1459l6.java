package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459l6 extends AbstractC1096eL {
    private static final C1459l6 zzh;
    private static volatile CL zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        C1459l6 c1459l6 = new C1459l6();
        zzh = c1459l6;
        AbstractC1096eL.u(C1459l6.class, c1459l6);
    }

    public static C1405k6 A() {
        return (C1405k6) zzh.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 4;
        this.zzd = j6;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    public final /* synthetic */ void G(long j6) {
        this.zza |= 32;
        this.zzg = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iC == 3) {
            return new C1459l6();
        }
        if (iC == 4) {
            return new C1405k6(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzi;
        if (cl != null) {
            return cl;
        }
        synchronized (C1459l6.class) {
            try {
                c1042dL = zzi;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzh);
                    zzi = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
