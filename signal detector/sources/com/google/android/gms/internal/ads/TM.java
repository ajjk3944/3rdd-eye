package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class TM extends AbstractC1096eL {
    private static final TM zzh;
    private static volatile CL zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private InterfaceC1314iL zzd = C1151fL.f14062e;
    private InterfaceC1474lL zzf = FL.f8088e;
    private QK zzg = QK.f10609b;

    static {
        TM tm = new TM();
        zzh = tm;
        AbstractC1096eL.u(TM.class, tm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", SM.class, "zzg"});
        }
        if (iC == 3) {
            return new TM();
        }
        if (iC == 4) {
            return new C1691pM(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzi;
        if (cl != null) {
            return cl;
        }
        synchronized (TM.class) {
            try {
                c1042dL = zzi;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzh);
                    zzi = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
