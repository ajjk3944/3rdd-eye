package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class AM extends AbstractC1096eL {
    private static final AM zzi;
    private static volatile CL zzj;
    private int zza;
    private C2230zM zzb;
    private QK zzd;
    private QK zze;
    private int zzf;
    private QK zzg;
    private byte zzh = 2;
    private InterfaceC1474lL zzc = FL.f8088e;

    static {
        AM am = new AM();
        zzi = am;
        AbstractC1096eL.u(AM.class, am);
    }

    public AM() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
        this.zzg = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        switch (AbstractC2984e.c(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = abstractC1096eL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new GL(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", C2014vM.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new AM();
            case 4:
                return new C1691pM(zzi);
            case 5:
                return zzi;
            case 6:
                CL cl = zzj;
                if (cl != null) {
                    return cl;
                }
                synchronized (AM.class) {
                    try {
                        c1042dL = zzj;
                        if (c1042dL == null) {
                            c1042dL = new C1042dL(zzi);
                            zzj = c1042dL;
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
