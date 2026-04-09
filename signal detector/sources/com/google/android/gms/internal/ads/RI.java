package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class RI extends AbstractC1096eL {
    private static final RI zzb;
    private static volatile CL zzc;
    private int zza;

    static {
        RI ri = new RI();
        zzb = ri;
        AbstractC1096eL.u(RI.class, ri);
    }

    public static QI B() {
        return (QI) zzb.r();
    }

    public static RI C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    public final /* synthetic */ void D(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new RI();
        }
        if (iC == 4) {
            return new QI(zzb);
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
        synchronized (RI.class) {
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
