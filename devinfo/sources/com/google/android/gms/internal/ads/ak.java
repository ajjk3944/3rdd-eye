package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ak extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ak zzh;
    private static volatile po1 zzi;
    private int zzd;
    private String zze = "";
    private xn1 zzf = so1.f16499e;
    private int zzg;

    static {
        ak akVar = new ak();
        zzh = akVar;
        qn1.u(ak.class, akVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zj.class, "zzg", qc.f15310x});
        }
        if (iC == 3) {
            return new ak();
        }
        if (iC == 4) {
            return new rj(zzh);
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
        synchronized (ak.class) {
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
