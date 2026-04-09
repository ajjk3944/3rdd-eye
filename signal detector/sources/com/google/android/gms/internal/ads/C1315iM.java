package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.iM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315iM extends AbstractC1096eL {
    private static final C1315iM zzb;
    private static volatile CL zzc;
    private InterfaceC1474lL zza = FL.f8088e;

    static {
        C1315iM c1315iM = new C1315iM();
        zzb = c1315iM;
        AbstractC1096eL.u(C1315iM.class, c1315iM);
    }

    public static C1261hM A() {
        return (C1261hM) zzb.r();
    }

    public final void B(C1207gM c1207gM) {
        InterfaceC1474lL interfaceC1474lL = this.zza;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zza = interfaceC1474lL.B(size + size);
        }
        this.zza.add(c1207gM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C1207gM.class});
        }
        if (iC == 3) {
            return new C1315iM();
        }
        if (iC == 4) {
            return new C1261hM(zzb);
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
        synchronized (C1315iM.class) {
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
