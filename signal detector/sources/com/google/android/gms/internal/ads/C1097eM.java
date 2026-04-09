package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.eM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097eM extends AbstractC1096eL {
    private static final C1097eM zzc;
    private static volatile CL zzd;
    private InterfaceC1314iL zza;
    private InterfaceC1314iL zzb;

    static {
        C1097eM c1097eM = new C1097eM();
        zzc = c1097eM;
        AbstractC1096eL.u(C1097eM.class, c1097eM);
    }

    public C1097eM() {
        C1151fL c1151fL = C1151fL.f14062e;
        this.zza = c1151fL;
        this.zzb = c1151fL;
    }

    public static C1097eM A(byte[] bArr, XK xk) {
        return (C1097eM) AbstractC1096eL.n(zzc, bArr, xk);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new C1097eM();
        }
        if (iC == 4) {
            return new C1194g9(zzc);
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
        synchronized (C1097eM.class) {
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
