package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hg extends qn1 {
    private static final hg zzd;
    private static volatile po1 zze;
    private int zza;
    private ig zzb;
    private bn1 zzc = bn1.f9729b;

    static {
        hg hgVar = new hg();
        zzd = hgVar;
        qn1.u(hg.class, hgVar);
    }

    public static hg E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final ig B() {
        ig igVar = this.zzb;
        return igVar == null ? ig.D() : igVar;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final bn1 D() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new hg();
        }
        if (iC == 4) {
            return new sc(zzd);
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
        synchronized (hg.class) {
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
