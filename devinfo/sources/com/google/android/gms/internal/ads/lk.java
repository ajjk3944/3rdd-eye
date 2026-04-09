package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lk extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final lk zzj;
    private static volatile po1 zzk;
    private int zze;
    private jk zzf;
    private xn1 zzg = so1.f16499e;
    private int zzh;
    private bj zzi;

    static {
        lk lkVar = new lk();
        zzj = lkVar;
        qn1.u(lk.class, lkVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", aj.class, "zzh", qc.f15310x, "zzi"});
        }
        if (iC == 3) {
            return new lk();
        }
        if (iC == 4) {
            return new rj(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzk;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (lk.class) {
            try {
                pn1Var = zzk;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzj);
                    zzk = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
