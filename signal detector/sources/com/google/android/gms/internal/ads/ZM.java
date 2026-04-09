package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class ZM extends AbstractC1096eL {
    private static final ZM zzn;
    private static volatile CL zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private C0935bN zzk;
    private YM zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        ZM zm = new ZM();
        zzn = zm;
        AbstractC1096eL.u(ZM.class, zm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", C1421kM.f15130u, "zze", C1421kM.f15129t, "zzf", "zzg", "zzh", "zzi", "zzj", C1421kM.f15128s, "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new ZM();
        }
        if (iC == 4) {
            return new C1691pM(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzo;
        if (cl != null) {
            return cl;
        }
        synchronized (ZM.class) {
            try {
                c1042dL = zzo;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzn);
                    zzo = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
