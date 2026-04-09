package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mf1 extends qn1 {
    private static final mf1 zzd;
    private static volatile po1 zze;
    private int zza;
    private int zzb;
    private pf1 zzc;

    static {
        mf1 mf1Var = new mf1();
        zzd = mf1Var;
        qn1.u(mf1.class, mf1Var);
    }

    public static mf1 C(bn1 bn1Var, jn1 jn1Var) {
        return (mf1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static lf1 D() {
        return (lf1) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final pf1 B() {
        pf1 pf1Var = this.zzc;
        return pf1Var == null ? pf1.C() : pf1Var;
    }

    public final /* synthetic */ void E(int i4) {
        this.zzb = i4;
    }

    public final /* synthetic */ void F(pf1 pf1Var) {
        this.zzc = pf1Var;
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
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new mf1();
        }
        if (iC == 4) {
            return new lf1(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zze;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (mf1.class) {
            try {
                pn1Var = zze;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzd);
                    zze = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
