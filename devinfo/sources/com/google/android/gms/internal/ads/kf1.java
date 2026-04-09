package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kf1 extends qn1 {
    private static final kf1 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb;
    private bn1 zzc = bn1.f9729b;
    private pf1 zzd;

    static {
        kf1 kf1Var = new kf1();
        zze = kf1Var;
        qn1.u(kf1.class, kf1Var);
    }

    public static kf1 D(bn1 bn1Var, jn1 jn1Var) {
        return (kf1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static jf1 E() {
        return (jf1) zze.r();
    }

    public static po1 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final bn1 B() {
        return this.zzc;
    }

    public final pf1 C() {
        pf1 pf1Var = this.zzd;
        return pf1Var == null ? pf1.C() : pf1Var;
    }

    public final /* synthetic */ void G(bn1 bn1Var) {
        this.zzc = bn1Var;
    }

    public final /* synthetic */ void H(pf1 pf1Var) {
        this.zzd = pf1Var;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new kf1();
        }
        if (iC == 4) {
            return new jf1(zze);
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
        synchronized (kf1.class) {
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
