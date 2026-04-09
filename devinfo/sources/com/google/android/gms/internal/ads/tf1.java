package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tf1 extends qn1 {
    private static final tf1 zzd;
    private static volatile po1 zze;
    private int zza;
    private xf1 zzb;
    private jh1 zzc;

    static {
        tf1 tf1Var = new tf1();
        zzd = tf1Var;
        qn1.u(tf1.class, tf1Var);
    }

    public static tf1 C(bn1 bn1Var, jn1 jn1Var) {
        return (tf1) qn1.m(zzd, bn1Var, jn1Var);
    }

    public static sf1 D() {
        return (sf1) zzd.r();
    }

    public final xf1 A() {
        xf1 xf1Var = this.zzb;
        return xf1Var == null ? xf1.D() : xf1Var;
    }

    public final jh1 B() {
        jh1 jh1Var = this.zzc;
        return jh1Var == null ? jh1.F() : jh1Var;
    }

    public final /* synthetic */ void E(xf1 xf1Var) {
        this.zzb = xf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(jh1 jh1Var) {
        this.zzc = jh1Var;
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
            return new to1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new tf1();
        }
        if (iC == 4) {
            return new sf1(zzd);
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
        synchronized (tf1.class) {
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
