package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xx0 extends qn1 {
    private static final xx0 zzl;
    private static volatile po1 zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        xx0 xx0Var = new xx0();
        zzl = xx0Var;
        qn1.u(xx0.class, xx0Var);
    }

    public static wx0 H() {
        return (wx0) zzl.r();
    }

    public static xx0 I() {
        return zzl;
    }

    public final boolean A() {
        return this.zzd;
    }

    public final long B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final long F() {
        return this.zzj;
    }

    public final long G() {
        return this.zzk;
    }

    public final /* synthetic */ void J(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new xx0();
        }
        if (iC == 4) {
            return new wx0(zzl);
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
        synchronized (xx0.class) {
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
