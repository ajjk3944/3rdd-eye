package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rf1 extends qn1 {
    private static final rf1 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb;
    private vf1 zzc;
    private hh1 zzd;

    static {
        rf1 rf1Var = new rf1();
        zze = rf1Var;
        qn1.u(rf1.class, rf1Var);
    }

    public static rf1 D(bn1 bn1Var, jn1 jn1Var) {
        return (rf1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static qf1 E() {
        return (qf1) zze.r();
    }

    public static po1 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final vf1 B() {
        vf1 vf1Var = this.zzc;
        return vf1Var == null ? vf1.E() : vf1Var;
    }

    public final hh1 C() {
        hh1 hh1Var = this.zzd;
        return hh1Var == null ? hh1.F() : hh1Var;
    }

    public final /* synthetic */ void G(vf1 vf1Var) {
        this.zzc = vf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(hh1 hh1Var) {
        this.zzd = hh1Var;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new rf1();
        }
        if (iC == 4) {
            return new qf1(zze);
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
        synchronized (rf1.class) {
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
