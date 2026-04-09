package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081e6 extends AbstractC1096eL {
    private static final C1081e6 zzj;
    private static volatile CL zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        C1081e6 c1081e6 = new C1081e6();
        zzj = c1081e6;
        AbstractC1096eL.u(C1081e6.class, c1081e6);
    }

    public static C1027d6 A() {
        return (C1027d6) zzj.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 1;
        this.zzb = j6;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 4;
        this.zzd = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 8;
        this.zze = j6;
    }

    public final /* synthetic */ void E(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    public final /* synthetic */ void F(long j6) {
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
            return new GL(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new C1081e6();
        }
        if (iC == 4) {
            return new C1027d6(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzk;
        if (cl != null) {
            return cl;
        }
        synchronized (C1081e6.class) {
            try {
                c1042dL = zzk;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzj);
                    zzk = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
