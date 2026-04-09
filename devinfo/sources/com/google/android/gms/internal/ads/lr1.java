package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lr1 extends qn1 {
    private static final lr1 zzn;
    private static volatile po1 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private nr1 zzk;
    private kr1 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        lr1 lr1Var = new lr1();
        zzn = lr1Var;
        qn1.u(lr1.class, lr1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", wp1.f18139u, "zze", wp1.f18138t, "zzf", "zzg", "zzh", "zzi", "zzj", wp1.f18137s, "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new lr1();
        }
        if (iC == 4) {
            return new bq1(zzn);
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
        synchronized (lr1.class) {
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
