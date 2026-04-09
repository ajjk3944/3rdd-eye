package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xp1 extends qn1 {
    private static final xp1 zzy;
    private static volatile po1 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private xn1 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private xn1 zzo;
    private boolean zzp;
    private long zzu;
    private un1 zzv;
    private boolean zzw;
    private un1 zzx;

    static {
        xp1 xp1Var = new xp1();
        zzy = xp1Var;
        qn1.u(xp1.class, xp1Var);
    }

    public xp1() {
        so1 so1Var = so1.f16499e;
        this.zze = so1Var;
        this.zzj = "";
        this.zzo = so1Var;
        rn1 rn1Var = rn1.f15714e;
        this.zzv = rn1Var;
        this.zzx = rn1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", wp1.f18123c, "zzc", "zzd", "zze", "zzf", qc.E, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", vp1.class, "zzp", "zzu", "zzv", qc.C, "zzw", "zzx", wp1.f18122b});
        }
        if (iC == 3) {
            return new xp1();
        }
        if (iC == 4) {
            return new rj(zzy);
        }
        if (iC == 5) {
            return zzy;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzz;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (xp1.class) {
            try {
                pn1Var = zzz;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzy);
                    zzz = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
