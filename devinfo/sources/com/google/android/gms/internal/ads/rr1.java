package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rr1 extends qn1 {
    private static final rr1 zzj;
    private static volatile po1 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private xn1 zzd;
    private xn1 zze;
    private xn1 zzf;
    private int zzg;
    private jr1 zzh;
    private String zzi;

    static {
        rr1 rr1Var = new rr1();
        zzj = rr1Var;
        qn1.u(rr1.class, rr1Var);
    }

    public rr1() {
        so1 so1Var = so1.f16499e;
        this.zzd = so1Var;
        this.zze = so1Var;
        this.zzf = so1Var;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", lr1.class, "zze", or1.class, "zzg", "zzb", "zzf", vr1.class, "zzi", "zzh"});
        }
        if (iC == 3) {
            return new rr1();
        }
        if (iC == 4) {
            return new bq1(zzj);
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
        synchronized (rr1.class) {
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
