package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hi1 extends qn1 {
    private static final hi1 zzd;
    private static volatile po1 zze;
    private int zza;
    private String zzb = "";
    private qh1 zzc;

    static {
        hi1 hi1Var = new hi1();
        zzd = hi1Var;
        qn1.u(hi1.class, hi1Var);
    }

    public static hi1 C(bn1 bn1Var, jn1 jn1Var) {
        return (hi1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static gi1 D() {
        return (gi1) zzd.r();
    }

    public static hi1 E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final qh1 B() {
        qh1 qh1Var = this.zzc;
        return qh1Var == null ? qh1.F() : qh1Var;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(qh1 qh1Var) {
        qh1Var.getClass();
        this.zzc = qh1Var;
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
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new hi1();
        }
        if (iC == 4) {
            return new gi1(zzd);
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
        synchronized (hi1.class) {
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
