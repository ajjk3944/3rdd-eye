package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ti1 extends qn1 {
    private static final ti1 zze;
    private static volatile po1 zzf;
    private int zza;
    private vi1 zzb;
    private int zzc;
    private bn1 zzd = bn1.f9729b;

    static {
        ti1 ti1Var = new ti1();
        zze = ti1Var;
        qn1.u(ti1.class, ti1Var);
    }

    public static ti1 D(bn1 bn1Var, jn1 jn1Var) {
        return (ti1) qn1.m(zze, bn1Var, jn1Var);
    }

    public static si1 E() {
        return (si1) zze.r();
    }

    public final vi1 A() {
        vi1 vi1Var = this.zzb;
        return vi1Var == null ? vi1.E() : vi1Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(vi1 vi1Var) {
        this.zzb = vi1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i4) {
        this.zzc = i4;
    }

    public final /* synthetic */ void H(zm1 zm1Var) {
        this.zzd = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new ti1();
        }
        if (iC == 4) {
            return new si1(zze);
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
        synchronized (ti1.class) {
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
