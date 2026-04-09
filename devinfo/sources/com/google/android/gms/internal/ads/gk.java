package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gk extends qn1 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final gk zzj;
    private static volatile po1 zzk;
    private int zze;
    private int zzf;
    private dj zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        gk gkVar = new gk();
        zzj = gkVar;
        qn1.u(gk.class, gkVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", qc.f15309w, "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new gk();
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
        synchronized (gk.class) {
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
