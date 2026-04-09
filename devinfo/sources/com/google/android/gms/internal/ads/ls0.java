package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ls0 extends qn1 {
    private static final ls0 zzi;
    private static volatile po1 zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        ls0 ls0Var = new ls0();
        zzi = ls0Var;
        qn1.u(ls0.class, ls0Var);
    }

    public static ks0 A() {
        return (ks0) zzi.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zzc = j;
    }

    public final /* synthetic */ void E(boolean z3) {
        this.zzd = z3;
    }

    public final /* synthetic */ void F(long j) {
        this.zze = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zzf = j;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void I(int i4) {
        this.zzh = i4 - 2;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new ls0();
        }
        if (iC == 4) {
            return new ks0(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzj;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ls0.class) {
            try {
                pn1Var = zzj;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzi);
                    zzj = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
