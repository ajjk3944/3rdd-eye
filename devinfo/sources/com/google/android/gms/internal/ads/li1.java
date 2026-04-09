package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class li1 extends qn1 {
    private static final li1 zze;
    private static volatile po1 zzf;
    private int zza;
    private ni1 zzb;
    private int zzc;
    private bn1 zzd = bn1.f9729b;

    static {
        li1 li1Var = new li1();
        zze = li1Var;
        qn1.u(li1.class, li1Var);
    }

    public static li1 D(bn1 bn1Var, jn1 jn1Var) {
        return (li1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static ki1 E() {
        return (ki1) zze.r();
    }

    public final ni1 A() {
        ni1 ni1Var = this.zzb;
        return ni1Var == null ? ni1.C() : ni1Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(ni1 ni1Var) {
        this.zzb = ni1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i4) {
        this.zzc = i4;
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
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new li1();
        }
        if (iC == 4) {
            return new ki1(zze);
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
        synchronized (li1.class) {
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
