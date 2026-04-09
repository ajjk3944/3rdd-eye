package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nd extends qn1 {
    private static final nd zzl;
    private static volatile po1 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private un1 zze = rn1.f15714e;
    private xn1 zzh = so1.f16499e;

    static {
        nd ndVar = new nd();
        zzl = ndVar;
        qn1.u(nd.class, ndVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", qd.class, "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new nd();
        }
        if (iC == 4) {
            return new sc(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzm;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (nd.class) {
            try {
                pn1Var = zzm;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzl);
                    zzm = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
