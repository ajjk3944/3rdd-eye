package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gg extends qn1 {
    private static final gg zze;
    private static volatile po1 zzf;
    private int zza;
    private kg zzb;
    private bn1 zzc;
    private bn1 zzd;

    static {
        gg ggVar = new gg();
        zze = ggVar;
        qn1.u(gg.class, ggVar);
    }

    public gg() {
        zm1 zm1Var = bn1.f9729b;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
    }

    public static gg D(zm1 zm1Var, jn1 jn1Var) {
        return (gg) qn1.m(zze, zm1Var, jn1Var);
    }

    public static gg E(byte[] bArr, jn1 jn1Var) throws ao1 {
        qn1 qn1VarY = qn1.y(zze, bArr, bArr.length, jn1Var);
        qn1.z(qn1VarY);
        return (gg) qn1VarY;
    }

    public final kg A() {
        kg kgVar = this.zzb;
        return kgVar == null ? kg.I() : kgVar;
    }

    public final bn1 B() {
        return this.zzc;
    }

    public final bn1 C() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new gg();
        }
        if (iC == 4) {
            return new sc(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzf;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (gg.class) {
            try {
                pn1Var = zzf;
                if (pn1Var == null) {
                    pn1Var = new pn1(zze);
                    zzf = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
