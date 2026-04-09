package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qj extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final qj zzl;
    private static volatile po1 zzm;
    private int zzf;
    private int zzg = 1000;
    private gj zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        qj qjVar = new qj();
        zzl = qjVar;
        qn1.u(qj.class, qjVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", qc.f15310x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new qj();
        }
        if (iC == 4) {
            return new ur1(zzl);
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
        synchronized (qj.class) {
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
