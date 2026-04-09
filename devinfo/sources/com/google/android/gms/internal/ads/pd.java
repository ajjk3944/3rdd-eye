package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pd extends qn1 {
    private static final pd zzf;
    private static volatile po1 zzg;
    private int zza;
    private bn1 zzb;
    private bn1 zzc;
    private bn1 zzd;
    private bn1 zze;

    static {
        pd pdVar = new pd();
        zzf = pdVar;
        qn1.u(pd.class, pdVar);
    }

    public pd() {
        zm1 zm1Var = bn1.f9729b;
        this.zzb = zm1Var;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static pd E(byte[] bArr, jn1 jn1Var) throws ao1 {
        qn1 qn1VarY = qn1.y(zzf, bArr, bArr.length, jn1Var);
        qn1.z(qn1VarY);
        return (pd) qn1VarY;
    }

    public static od F() {
        return (od) zzf.r();
    }

    public final bn1 A() {
        return this.zzb;
    }

    public final bn1 B() {
        return this.zzc;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final bn1 D() {
        return this.zze;
    }

    public final /* synthetic */ void G(bn1 bn1Var) {
        this.zza |= 1;
        this.zzb = bn1Var;
    }

    public final /* synthetic */ void H(zm1 zm1Var) {
        this.zza |= 2;
        this.zzc = zm1Var;
    }

    public final /* synthetic */ void I(bn1 bn1Var) {
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final /* synthetic */ void J(zm1 zm1Var) {
        this.zza |= 8;
        this.zze = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new pd();
        }
        if (iC == 4) {
            return new od(zzf);
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
        synchronized (pd.class) {
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
