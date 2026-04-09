package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hq1 extends qn1 {
    private static final hq1 zze;
    private static volatile po1 zzf;
    private int zza;
    private bn1 zzb;
    private bn1 zzc;
    private byte zzd = 2;

    static {
        hq1 hq1Var = new hq1();
        zze = hq1Var;
        qn1.u(hq1.class, hq1Var);
    }

    public hq1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzb = zm1Var;
        this.zzc = zm1Var;
    }

    public static gq1 A() {
        return (gq1) zze.r();
    }

    public final /* synthetic */ void B(zm1 zm1Var) {
        this.zza |= 1;
        this.zzb = zm1Var;
    }

    public final /* synthetic */ void C(bn1 bn1Var) {
        this.zza |= 2;
        this.zzc = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        switch (i3.e.c(i4)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = qn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new to1(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new hq1();
            case 4:
                return new gq1(zze);
            case 5:
                return zze;
            case 6:
                po1 po1Var = zzf;
                if (po1Var != null) {
                    return po1Var;
                }
                synchronized (hq1.class) {
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
            default:
                throw null;
        }
    }
}
