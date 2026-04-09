package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dg1 extends qn1 {
    private static final dg1 zzd;
    private static volatile po1 zze;
    private int zza;
    private fg1 zzb;
    private int zzc;

    static {
        dg1 dg1Var = new dg1();
        zzd = dg1Var;
        qn1.u(dg1.class, dg1Var);
    }

    public static dg1 C(bn1 bn1Var, jn1 jn1Var) {
        return (dg1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static cg1 D() {
        return (cg1) zzd.r();
    }

    public final fg1 A() {
        fg1 fg1Var = this.zzb;
        return fg1Var == null ? fg1.C() : fg1Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(fg1 fg1Var) {
        this.zzb = fg1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i4) {
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
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new dg1();
        }
        if (iC == 4) {
            return new cg1(zzd);
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
        synchronized (dg1.class) {
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
