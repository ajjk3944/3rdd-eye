package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class up1 extends qn1 {
    private static final up1 zzb;
    private static volatile po1 zzc;
    private xn1 zza = so1.f16499e;

    static {
        up1 up1Var = new up1();
        zzb = up1Var;
        qn1.u(up1.class, up1Var);
    }

    public static tp1 A() {
        return (tp1) zzb.r();
    }

    public final void B(sp1 sp1Var) {
        xn1 xn1Var = this.zza;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zza = xn1Var.n(size + size);
        }
        this.zza.add(sp1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", sp1.class});
        }
        if (iC == 3) {
            return new up1();
        }
        if (iC == 4) {
            return new tp1(zzb);
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
        synchronized (up1.class) {
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
