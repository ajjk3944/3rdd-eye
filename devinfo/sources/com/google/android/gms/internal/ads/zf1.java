package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zf1 extends qn1 {
    private static final zf1 zzb;
    private static volatile po1 zzc;
    private int zza;

    static {
        zf1 zf1Var = new zf1();
        zzb = zf1Var;
        qn1.u(zf1.class, zf1Var);
    }

    public static yf1 B() {
        return (yf1) zzb.r();
    }

    public static zf1 C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    public final /* synthetic */ void D(int i4) {
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
            return new to1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new zf1();
        }
        if (iC == 4) {
            return new yf1(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzc;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (zf1.class) {
            try {
                pn1Var = zzc;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzb);
                    zzc = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
