package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.zM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2230zM extends AbstractC1096eL {
    private static final C2230zM zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private QK zzc;
    private QK zzd;

    static {
        C2230zM c2230zM = new C2230zM();
        zze = c2230zM;
        AbstractC1096eL.u(C2230zM.class, c2230zM);
    }

    public C2230zM() {
        OK ok = QK.f10609b;
        this.zzc = ok;
        this.zzd = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C2230zM();
        }
        if (iC == 4) {
            return new C1691pM(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzf;
        if (cl != null) {
            return cl;
        }
        synchronized (C2230zM.class) {
            try {
                c1042dL = zzf;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zze);
                    zzf = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
