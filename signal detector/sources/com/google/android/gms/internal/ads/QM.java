package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class QM extends AbstractC1096eL {
    private static final QM zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        QM qm = new QM();
        zzd = qm;
        AbstractC1096eL.u(QM.class, qm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", C1421kM.f15125p, "zzc"});
        }
        if (iC == 3) {
            return new QM();
        }
        if (iC == 4) {
            return new C1691pM(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zze;
        if (cl != null) {
            return cl;
        }
        synchronized (QM.class) {
            try {
                c1042dL = zze;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzd);
                    zze = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
