package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mj extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final mj zzf;
    private static volatile po1 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        mj mjVar = new mj();
        zzf = mjVar;
        qn1.u(mj.class, mjVar);
    }

    public static lj A() {
        return (lj) zzf.r();
    }

    public static mj B() {
        return zzf;
    }

    public final void C(boolean z3) {
        this.zzc |= 1;
        this.zzd = z3;
    }

    public final void D(int i4) {
        this.zzc |= 2;
        this.zze = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new mj();
        }
        if (iC == 4) {
            return new lj(zzf);
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
        synchronized (mj.class) {
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
