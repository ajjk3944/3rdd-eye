package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jh1 extends qn1 {
    private static final jh1 zze;
    private static volatile po1 zzf;
    private int zza;
    private lh1 zzb;
    private int zzc;
    private int zzd;

    static {
        jh1 jh1Var = new jh1();
        zze = jh1Var;
        qn1.u(jh1.class, jh1Var);
    }

    public static jh1 D(bn1 bn1Var, jn1 jn1Var) {
        return (jh1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static ih1 E() {
        return (ih1) zze.r();
    }

    public static jh1 F() {
        return zze;
    }

    public final lh1 A() {
        lh1 lh1Var = this.zzb;
        return lh1Var == null ? lh1.D() : lh1Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(lh1 lh1Var) {
        this.zzb = lh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i4) {
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new jh1();
        }
        if (iC == 4) {
            return new ih1(zze);
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
        synchronized (jh1.class) {
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
