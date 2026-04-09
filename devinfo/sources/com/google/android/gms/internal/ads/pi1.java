package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pi1 extends qn1 {
    private static final pi1 zzj;
    private static volatile po1 zzk;
    private int zza;
    private int zzb;
    private ri1 zzc;
    private bn1 zzd;
    private bn1 zze;
    private bn1 zzf;
    private bn1 zzg;
    private bn1 zzh;
    private bn1 zzi;

    static {
        pi1 pi1Var = new pi1();
        zzj = pi1Var;
        qn1.u(pi1.class, pi1Var);
    }

    public pi1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzd = zm1Var;
        this.zze = zm1Var;
        this.zzf = zm1Var;
        this.zzg = zm1Var;
        this.zzh = zm1Var;
        this.zzi = zm1Var;
    }

    public static pi1 I(bn1 bn1Var, jn1 jn1Var) {
        return (pi1) qn1.m(zzj, bn1Var, jn1Var);
    }

    public static oi1 J() {
        return (oi1) zzj.r();
    }

    public static po1 K() {
        return zzj.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final ri1 B() {
        ri1 ri1Var = this.zzc;
        return ri1Var == null ? ri1.G() : ri1Var;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final bn1 D() {
        return this.zze;
    }

    public final bn1 E() {
        return this.zzf;
    }

    public final bn1 F() {
        return this.zzg;
    }

    public final bn1 G() {
        return this.zzh;
    }

    public final bn1 H() {
        return this.zzi;
    }

    public final /* synthetic */ void L() {
        this.zzb = 0;
    }

    public final /* synthetic */ void M(ri1 ri1Var) {
        this.zzc = ri1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void N(zm1 zm1Var) {
        this.zzd = zm1Var;
    }

    public final /* synthetic */ void O(zm1 zm1Var) {
        this.zze = zm1Var;
    }

    public final /* synthetic */ void P(zm1 zm1Var) {
        this.zzf = zm1Var;
    }

    public final /* synthetic */ void Q(zm1 zm1Var) {
        this.zzg = zm1Var;
    }

    public final /* synthetic */ void R(zm1 zm1Var) {
        this.zzh = zm1Var;
    }

    public final /* synthetic */ void S(zm1 zm1Var) {
        this.zzi = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new pi1();
        }
        if (iC == 4) {
            return new oi1(zzj);
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
        synchronized (pi1.class) {
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
