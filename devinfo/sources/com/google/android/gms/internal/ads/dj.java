package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dj extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final dj zzh;
    private static volatile po1 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        dj djVar = new dj();
        zzh = djVar;
        qn1.u(dj.class, djVar);
    }

    public static cj B() {
        return (cj) zzh.r();
    }

    public final void A(int i4) {
        this.zzd |= 4;
        this.zzg = i4;
    }

    public final void C(int i4) {
        this.zzd |= 1;
        this.zze = i4;
    }

    public final void D(int i4) {
        this.zzd |= 2;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iC == 3) {
            return new dj();
        }
        if (iC == 4) {
            return new cj(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzi;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (dj.class) {
            try {
                pn1Var = zzi;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzh);
                    zzi = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
