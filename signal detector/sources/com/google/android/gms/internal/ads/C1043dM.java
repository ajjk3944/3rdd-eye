package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.dM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043dM extends AbstractC1096eL {
    private static final C1043dM zzd;
    private static volatile CL zze;
    private int zza;
    private String zzb = "";
    private InterfaceC1314iL zzc = C1151fL.f14062e;

    static {
        C1043dM c1043dM = new C1043dM();
        zzd = c1043dM;
        AbstractC1096eL.u(C1043dM.class, c1043dM);
    }

    public static C0988cM A() {
        return (C0988cM) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = 15;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C1043dM();
        }
        if (iC == 4) {
            return new C0988cM(zzd);
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
        synchronized (C1043dM.class) {
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
