package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class KM extends AbstractC1096eL {
    private static final KM zzl;
    private static volatile CL zzm;
    private int zza;
    private int zzb;
    private C2176yM zzd;
    private AM zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private InterfaceC1314iL zzg = C1151fL.f14062e;
    private String zzh = "";
    private InterfaceC1474lL zzj = FL.f8088e;

    static {
        KM km = new KM();
        zzl = km;
        AbstractC1096eL.u(KM.class, km);
    }

    public static JM C() {
        return (JM) zzl.r();
    }

    public final String A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzj.size();
    }

    public final /* synthetic */ void D(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void F(C2176yM c2176yM) {
        this.zzd = c2176yM;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        InterfaceC1474lL interfaceC1474lL = this.zzj;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzj = interfaceC1474lL.B(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        switch (AbstractC2984e.c(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = abstractC1096eL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new GL(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C1421kM.f15121l, "zzj"});
            case 3:
                return new KM();
            case 4:
                return new JM(zzl);
            case 5:
                return zzl;
            case 6:
                CL cl = zzm;
                if (cl != null) {
                    return cl;
                }
                synchronized (KM.class) {
                    try {
                        c1042dL = zzm;
                        if (c1042dL == null) {
                            c1042dL = new C1042dL(zzl);
                            zzm = c1042dL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1042dL;
            default:
                throw null;
        }
    }
}
