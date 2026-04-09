package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fi1 extends qn1 {
    private static final fi1 zzd;
    private static volatile po1 zze;
    private int zza;
    private int zzb;
    private hi1 zzc;

    static {
        fi1 fi1Var = new fi1();
        zzd = fi1Var;
        qn1.u(fi1.class, fi1Var);
    }

    public static fi1 C(bn1 bn1Var, jn1 jn1Var) {
        return (fi1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static ei1 D() {
        return (ei1) zzd.r();
    }

    public static po1 E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final hi1 B() {
        hi1 hi1Var = this.zzc;
        return hi1Var == null ? hi1.E() : hi1Var;
    }

    public final /* synthetic */ void F(hi1 hi1Var) {
        this.zzc = hi1Var;
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
            return new fi1();
        }
        if (iC == 4) {
            return new ei1(zzd);
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
        synchronized (fi1.class) {
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
