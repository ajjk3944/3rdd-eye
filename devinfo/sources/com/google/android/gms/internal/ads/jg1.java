package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jg1 extends qn1 {
    private static final jg1 zzc;
    private static volatile po1 zzd;
    private int zza;
    private int zzb;

    static {
        jg1 jg1Var = new jg1();
        zzc = jg1Var;
        qn1.u(jg1.class, jg1Var);
    }

    public static jg1 C(bn1 bn1Var, jn1 jn1Var) {
        return (jg1) qn1.m(zzc, bn1Var, jn1Var);
    }

    public static ig1 D() {
        return (ig1) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i4) {
        this.zza = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new jg1();
        }
        if (iC == 4) {
            return new ig1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzd;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (jg1.class) {
            try {
                pn1Var = zzd;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzc);
                    zzd = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
