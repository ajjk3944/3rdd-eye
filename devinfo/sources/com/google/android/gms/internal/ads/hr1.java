package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hr1 extends qn1 {
    private static final hr1 zzp;
    private static volatile po1 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private xn1 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private xn1 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        hr1 hr1Var = new hr1();
        zzp = hr1Var;
        qn1.u(hr1.class, hr1Var);
    }

    public hr1() {
        so1 so1Var = so1.f16499e;
        this.zze = so1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = so1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", wp1.f18136r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", gr1.class, "zzc", "zzk", wp1.f18135q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iC == 3) {
            return new hr1();
        }
        if (iC == 4) {
            return new bq1(zzp);
        }
        if (iC == 5) {
            return zzp;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzu;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (hr1.class) {
            try {
                pn1Var = zzu;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzp);
                    zzu = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
