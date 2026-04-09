package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xy0 extends qn1 {
    private static final xy0 zzf;
    private static volatile po1 zzg;
    private int zza;
    private zy0 zzb;
    private bn1 zzc;
    private bn1 zzd;
    private int zze;

    static {
        xy0 xy0Var = new xy0();
        zzf = xy0Var;
        qn1.u(xy0.class, xy0Var);
    }

    public xy0() {
        zm1 zm1Var = bn1.f9729b;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
    }

    public static wy0 D() {
        return (wy0) zzf.r();
    }

    public final zy0 A() {
        zy0 zy0Var = this.zzb;
        return zy0Var == null ? zy0.F() : zy0Var;
    }

    public final bn1 B() {
        return this.zzc;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(zy0 zy0Var) {
        this.zzb = zy0Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 2;
        this.zzc = bn1Var;
    }

    public final /* synthetic */ void G(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final int H() {
        int iB = yr1.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final /* synthetic */ void I(int i4) {
        this.zze = i4 - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", qc.B});
        }
        if (iC == 3) {
            return new xy0();
        }
        if (iC == 4) {
            return new wy0(zzf);
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
        synchronized (xy0.class) {
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
