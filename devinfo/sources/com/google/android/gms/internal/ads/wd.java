package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wd extends qn1 {
    private static final wd zzf;
    private static volatile po1 zzg;
    private int zza;
    private xn1 zzb = so1.f16499e;
    private bn1 zzc = bn1.f9729b;
    private int zzd = 1;
    private int zze = 1;

    static {
        wd wdVar = new wd();
        zzf = wdVar;
        qn1.u(wd.class, wdVar);
    }

    public static vd A() {
        return (vd) zzf.r();
    }

    public final void B(zm1 zm1Var) {
        xn1 xn1Var = this.zzb;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzb = xn1Var.n(size + size);
        }
        this.zzb.add(zm1Var);
    }

    public final /* synthetic */ void C(zm1 zm1Var) {
        this.zza |= 1;
        this.zzc = zm1Var;
    }

    public final /* synthetic */ void D(int i4) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void E(int i4) {
        this.zze = i4 - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", qc.f15300n, "zze", qc.f15298l});
        }
        if (iC == 3) {
            return new wd();
        }
        if (iC == 4) {
            return new vd(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzg;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (wd.class) {
            try {
                pn1Var = zzg;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzf);
                    zzg = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
