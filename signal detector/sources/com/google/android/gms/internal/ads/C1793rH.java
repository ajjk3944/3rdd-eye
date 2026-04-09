package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.rH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1793rH extends AbstractC1096eL {
    private static final C1793rH zzb;
    private static volatile CL zzc;
    private int zza;

    static {
        C1793rH c1793rH = new C1793rH();
        zzb = c1793rH;
        AbstractC1096eL.u(C1793rH.class, c1793rH);
    }

    public static C1740qH B() {
        return (C1740qH) zzb.r();
    }

    public static C1793rH C() {
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
            return new C1793rH();
        }
        if (iC == 4) {
            return new C1740qH(zzb);
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
        synchronized (C1793rH.class) {
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
