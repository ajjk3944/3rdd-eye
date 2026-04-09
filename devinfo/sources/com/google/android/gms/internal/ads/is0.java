package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class is0 extends qn1 {
    private static final is0 zzd;
    private static volatile po1 zze;
    private int zza;
    private xn1 zzb = so1.f16499e;
    private pp1 zzc;

    static {
        is0 is0Var = new is0();
        zzd = is0Var;
        qn1.u(is0.class, is0Var);
    }

    public static fs0 B() {
        return (fs0) zzd.r();
    }

    public final int A() {
        return this.zzb.size();
    }

    public final void C(hs0 hs0Var) {
        xn1 xn1Var = this.zzb;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzb = xn1Var.n(size + size);
        }
        this.zzb.add(hs0Var);
    }

    public final void D() {
        this.zzb = so1.f16499e;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", hs0.class, "zzc"});
        }
        if (iC == 3) {
            return new is0();
        }
        if (iC == 4) {
            return new fs0(zzd);
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
        synchronized (is0.class) {
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
