package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Cy extends AbstractC1096eL {
    private static final Cy zzc;
    private static volatile CL zzd;
    private int zza;
    private I5 zzb;

    static {
        Cy cy = new Cy();
        zzc = cy;
        AbstractC1096eL.u(Cy.class, cy);
    }

    public static By A() {
        return (By) zzc.r();
    }

    public final /* synthetic */ void B(I5 i52) {
        this.zzb = i52;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new Cy();
        }
        if (iC == 4) {
            return new By(zzc);
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
        synchronized (Cy.class) {
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
