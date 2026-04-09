package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wq1 extends qn1 {
    private static final wq1 zzl;
    private static volatile po1 zzm;
    private int zza;
    private int zzb;
    private kq1 zzd;
    private mq1 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private un1 zzg = rn1.f15714e;
    private String zzh = "";
    private xn1 zzj = so1.f16499e;

    static {
        wq1 wq1Var = new wq1();
        zzl = wq1Var;
        qn1.u(wq1.class, wq1Var);
    }

    public static vq1 C() {
        return (vq1) zzl.r();
    }

    public final String A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzj.size();
    }

    public final /* synthetic */ void D(int i4) {
        this.zza |= 1;
        this.zzb = i4;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void F(kq1 kq1Var) {
        this.zzd = kq1Var;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        xn1 xn1Var = this.zzj;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzj = xn1Var.n(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i4) {
        this.zzi = i4 - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        switch (i3.e.c(i4)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = qn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new to1(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", wp1.f18130l, "zzj"});
            case 3:
                return new wq1();
            case 4:
                return new vq1(zzl);
            case 5:
                return zzl;
            case 6:
                po1 po1Var = zzm;
                if (po1Var != null) {
                    return po1Var;
                }
                synchronized (wq1.class) {
                    try {
                        pn1Var = zzm;
                        if (pn1Var == null) {
                            pn1Var = new pn1(zzl);
                            zzm = pn1Var;
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
