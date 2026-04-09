package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kq1 extends qn1 {
    private static final kq1 zzh;
    private static volatile po1 zzi;
    private int zza;
    private jq1 zzb;
    private bn1 zzd;
    private bn1 zze;
    private int zzf;
    private byte zzg = 2;
    private xn1 zzc = so1.f16499e;

    static {
        kq1 kq1Var = new kq1();
        zzh = kq1Var;
        qn1.u(kq1.class, kq1Var);
    }

    public kq1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static iq1 A() {
        return (iq1) zzh.r();
    }

    public final void B(hq1 hq1Var) {
        xn1 xn1Var = this.zzc;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzc = xn1Var.n(size + size);
        }
        this.zzc.add(hq1Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        switch (i3.e.c(i4)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = qn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new to1(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", hq1.class, "zzd", "zze", "zzf"});
            case 3:
                return new kq1();
            case 4:
                return new iq1(zzh);
            case 5:
                return zzh;
            case 6:
                po1 po1Var = zzi;
                if (po1Var != null) {
                    return po1Var;
                }
                synchronized (kq1.class) {
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
            default:
                throw null;
        }
    }
}
