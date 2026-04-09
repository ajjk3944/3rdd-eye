package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zg1 extends qn1 {
    private static final zg1 zzf;
    private static volatile po1 zzg;
    private int zza;
    private int zzb;
    private vg1 zzc;
    private bn1 zzd;
    private bn1 zze;

    static {
        zg1 zg1Var = new zg1();
        zzf = zg1Var;
        qn1.u(zg1.class, zg1Var);
    }

    public zg1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static zg1 E(bn1 bn1Var, jn1 jn1Var) {
        return (zg1) qn1.m(zzf, bn1Var, jn1Var);
    }

    public static yg1 F() {
        return (yg1) zzf.r();
    }

    public static zg1 G() {
        return zzf;
    }

    public static po1 H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final vg1 B() {
        vg1 vg1Var = this.zzc;
        return vg1Var == null ? vg1.C() : vg1Var;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final bn1 D() {
        return this.zze;
    }

    public final /* synthetic */ void I(vg1 vg1Var) {
        this.zzc = vg1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(zm1 zm1Var) {
        this.zzd = zm1Var;
    }

    public final /* synthetic */ void K(zm1 zm1Var) {
        this.zze = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new zg1();
        }
        if (iC == 4) {
            return new yg1(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzg;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (zg1.class) {
            try {
                pn1Var = zzg;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzf);
                    zzg = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
