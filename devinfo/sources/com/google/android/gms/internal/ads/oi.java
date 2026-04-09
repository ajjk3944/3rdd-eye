package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oi extends qn1 {
    private static final oi zzB;
    private static volatile po1 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private xn1 zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private ak zzo;
    private ck zzp;
    private xn1 zzu;
    private dk zzv;
    private xi zzw;
    private ri zzx;
    private kk zzy;
    private lk zzz;

    static {
        oi oiVar = new oi();
        zzB = oiVar;
        qn1.u(oi.class, oiVar);
    }

    public oi() {
        so1 so1Var = so1.f16499e;
        this.zzu = so1Var;
        this.zzA = so1Var;
    }

    public static oi A() {
        return zzB;
    }

    public final void B(mi miVar) {
        this.zzm = miVar.f13907a;
        this.zzl |= 1;
    }

    public final void C(ck ckVar) {
        this.zzp = ckVar;
        this.zzl |= 8;
    }

    public final ck D() {
        ck ckVar = this.zzp;
        return ckVar == null ? ck.A() : ckVar;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", qc.f15302p, "zzn", qc.f15310x, "zzo", "zzp", "zzu", zj.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", ej.class});
        }
        if (iC == 3) {
            return new oi();
        }
        if (iC == 4) {
            return new ni(zzB);
        }
        if (iC == 5) {
            return zzB;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzC;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (oi.class) {
            try {
                pn1Var = zzC;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzB);
                    zzC = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
