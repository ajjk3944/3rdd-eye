package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.vI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010vI extends AbstractC1096eL {
    public static final /* synthetic */ int zza = 0;
    private static final C2010vI zzd;
    private static volatile CL zze;
    private String zzb = "";
    private InterfaceC1474lL zzc = FL.f8088e;

    static {
        C2010vI c2010vI = new C2010vI();
        zzd = c2010vI;
        AbstractC1096eL.u(C2010vI.class, c2010vI);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", C1039dI.class});
        }
        if (iC == 3) {
            return new C2010vI();
        }
        if (iC == 4) {
            return new C1194g9(zzd);
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
        synchronized (C2010vI.class) {
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
