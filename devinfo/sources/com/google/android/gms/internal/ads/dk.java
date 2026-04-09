package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dk extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final dk zzn;
    private static volatile po1 zzo;
    private int zzg;
    private int zzh;
    private bj zzi;
    private bj zzj;
    private bj zzk;
    private xn1 zzl = so1.f16499e;
    private int zzm;

    static {
        dk dkVar = new dk();
        zzn = dkVar;
        qn1.u(dk.class, dkVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", bj.class, "zzm"});
        }
        if (iC == 3) {
            return new dk();
        }
        if (iC == 4) {
            return new rj(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzo;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (dk.class) {
            try {
                pn1Var = zzo;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzn);
                    zzo = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
