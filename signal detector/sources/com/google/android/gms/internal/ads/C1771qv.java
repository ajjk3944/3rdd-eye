package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771qv extends AbstractC1096eL {
    private static final C1771qv zzb;
    private static volatile CL zzc;
    private InterfaceC1474lL zza = FL.f8088e;

    static {
        C1771qv c1771qv = new C1771qv();
        zzb = c1771qv;
        AbstractC1096eL.u(C1771qv.class, c1771qv);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C1717pv.class});
        }
        if (iC == 3) {
            return new C1771qv();
        }
        if (iC == 4) {
            return new C1194g9(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzc;
        if (cl != null) {
            return cl;
        }
        synchronized (C1771qv.class) {
            try {
                c1042dL = zzc;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzb);
                    zzc = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
