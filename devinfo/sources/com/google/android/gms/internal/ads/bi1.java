package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bi1 extends qn1 {
    private static final bi1 zzd;
    private static volatile po1 zze;
    private int zza;
    private int zzb;
    private di1 zzc;

    static {
        bi1 bi1Var = new bi1();
        zzd = bi1Var;
        qn1.u(bi1.class, bi1Var);
    }

    public static bi1 C(bn1 bn1Var, jn1 jn1Var) {
        return (bi1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static ai1 D() {
        return (ai1) zzd.r();
    }

    public static po1 E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final di1 B() {
        di1 di1Var = this.zzc;
        return di1Var == null ? di1.D() : di1Var;
    }

    public final /* synthetic */ void F(di1 di1Var) {
        this.zzc = di1Var;
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
            return new bi1();
        }
        if (iC == 4) {
            return new ai1(zzd);
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
        synchronized (bi1.class) {
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
