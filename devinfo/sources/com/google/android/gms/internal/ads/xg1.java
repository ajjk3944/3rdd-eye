package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xg1 extends qn1 {
    private static final xg1 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb;
    private zg1 zzc;
    private bn1 zzd = bn1.f9729b;

    static {
        xg1 xg1Var = new xg1();
        zze = xg1Var;
        qn1.u(xg1.class, xg1Var);
    }

    public static xg1 D(bn1 bn1Var, jn1 jn1Var) {
        return (xg1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static wg1 E() {
        return (wg1) zze.r();
    }

    public static po1 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final zg1 B() {
        zg1 zg1Var = this.zzc;
        return zg1Var == null ? zg1.G() : zg1Var;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(zg1 zg1Var) {
        this.zzc = zg1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(zm1 zm1Var) {
        this.zzd = zm1Var;
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
            return new xg1();
        }
        if (iC == 4) {
            return new wg1(zze);
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
        synchronized (xg1.class) {
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
