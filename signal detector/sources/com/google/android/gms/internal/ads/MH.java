package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class MH extends AbstractC1096eL {
    private static final MH zzb;
    private static volatile CL zzc;
    private int zza;

    static {
        MH mh = new MH();
        zzb = mh;
        AbstractC1096eL.u(MH.class, mh);
    }

    public static MH B(QK qk, XK xk) {
        return (MH) AbstractC1096eL.m(zzb, qk, xk);
    }

    public static MH C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
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
            return new MH();
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
        synchronized (MH.class) {
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
