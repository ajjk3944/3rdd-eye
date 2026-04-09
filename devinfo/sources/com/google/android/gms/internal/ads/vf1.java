package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vf1 extends qn1 {
    private static final vf1 zze;
    private static volatile po1 zzf;
    private int zza;
    private int zzb;
    private zf1 zzc;
    private bn1 zzd = bn1.f9729b;

    static {
        vf1 vf1Var = new vf1();
        zze = vf1Var;
        qn1.u(vf1.class, vf1Var);
    }

    public static uf1 D() {
        return (uf1) zze.r();
    }

    public static vf1 E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final zf1 B() {
        zf1 zf1Var = this.zzc;
        return zf1Var == null ? zf1.C() : zf1Var;
    }

    public final bn1 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(zf1 zf1Var) {
        this.zzc = zf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(bn1 bn1Var) {
        this.zzd = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new vf1();
        }
        if (iC == 4) {
            return new uf1(zze);
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
        synchronized (vf1.class) {
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
