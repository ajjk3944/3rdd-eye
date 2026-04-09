package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class td extends qn1 {
    private static final td zze;
    private static volatile po1 zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private bn1 zzd = bn1.f9729b;

    static {
        td tdVar = new td();
        zze = tdVar;
        qn1.u(td.class, tdVar);
    }

    public static td E() {
        return zze;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final long B() {
        return this.zzb;
    }

    public final String C() {
        return this.zzc;
    }

    public final bn1 D() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new td();
        }
        if (iC == 4) {
            return new sc(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzf;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (td.class) {
            try {
                pn1Var = zzf;
                if (pn1Var == null) {
                    pn1Var = new pn1(zze);
                    zzf = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
