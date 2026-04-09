package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mq1 extends qn1 {
    private static final mq1 zzi;
    private static volatile po1 zzj;
    private int zza;
    private lq1 zzb;
    private bn1 zzd;
    private bn1 zze;
    private int zzf;
    private bn1 zzg;
    private byte zzh = 2;
    private xn1 zzc = so1.f16499e;

    static {
        mq1 mq1Var = new mq1();
        zzi = mq1Var;
        qn1.u(mq1.class, mq1Var);
    }

    public mq1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzd = zm1Var;
        this.zze = zm1Var;
        this.zzg = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        switch (i3.e.c(i4)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = qn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new to1(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", hq1.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new mq1();
            case 4:
                return new bq1(zzi);
            case 5:
                return zzi;
            case 6:
                po1 po1Var = zzj;
                if (po1Var != null) {
                    return po1Var;
                }
                synchronized (mq1.class) {
                    try {
                        pn1Var = zzj;
                        if (pn1Var == null) {
                            pn1Var = new pn1(zzi);
                            zzj = pn1Var;
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
