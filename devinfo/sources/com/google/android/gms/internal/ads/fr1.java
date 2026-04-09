package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fr1 extends qn1 {
    private static final fr1 zzh;
    private static volatile po1 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private un1 zzd = rn1.f15714e;
    private xn1 zzf = so1.f16499e;
    private bn1 zzg = bn1.f9729b;

    static {
        fr1 fr1Var = new fr1();
        zzh = fr1Var;
        qn1.u(fr1.class, fr1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", er1.class, "zzg"});
        }
        if (iC == 3) {
            return new fr1();
        }
        if (iC == 4) {
            return new bq1(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzi;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (fr1.class) {
            try {
                pn1Var = zzi;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzh);
                    zzi = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
