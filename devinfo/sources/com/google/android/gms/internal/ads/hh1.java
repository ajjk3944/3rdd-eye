package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hh1 extends qn1 {
    private static final hh1 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb;
    private lh1 zzc;
    private bn1 zzd = bn1.f9729b;

    static {
        hh1 hh1Var = new hh1();
        zze = hh1Var;
        qn1.u(hh1.class, hh1Var);
    }

    public static hh1 D(bn1 bn1Var, jn1 jn1Var) {
        return (hh1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static gh1 E() {
        return (gh1) zze.r();
    }

    public static hh1 F() {
        return zze;
    }

    public static po1 G() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final lh1 B() {
        lh1 lh1Var = this.zzc;
        return lh1Var == null ? lh1.D() : lh1Var;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void H(lh1 lh1Var) {
        this.zzc = lh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(bn1 bn1Var) {
        this.zzd = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new hh1();
        }
        if (iC == 4) {
            return new gh1(zze);
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
        synchronized (hh1.class) {
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
