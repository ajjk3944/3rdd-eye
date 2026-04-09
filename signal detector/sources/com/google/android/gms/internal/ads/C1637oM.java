package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.oM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637oM extends AbstractC1096eL {
    private static final C1637oM zzc;
    private static volatile CL zzd;
    private int zza;
    private String zzb = "";

    static {
        C1637oM c1637oM = new C1637oM();
        zzc = c1637oM;
        AbstractC1096eL.u(C1637oM.class, c1637oM);
    }

    public static C1583nM A() {
        return (C1583nM) zzc.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new C1637oM();
        }
        if (iC == 4) {
            return new C1583nM(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzd;
        if (cl != null) {
            return cl;
        }
        synchronized (C1637oM.class) {
            try {
                c1042dL = zzd;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzc);
                    zzd = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
