package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.zI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2226zI extends AbstractC1096eL {
    private static final C2226zI zzb;
    private static volatile CL zzc;
    private int zza;

    static {
        C2226zI c2226zI = new C2226zI();
        zzb = c2226zI;
        AbstractC1096eL.u(C2226zI.class, c2226zI);
    }

    public static C2172yI B() {
        return (C2172yI) zzb.r();
    }

    public static C2226zI C() {
        return zzb;
    }

    public final RH A() {
        RH rhB = RH.b(this.zza);
        return rhB == null ? RH.UNRECOGNIZED : rhB;
    }

    public final /* synthetic */ void D(RH rh) {
        this.zza = rh.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new C2226zI();
        }
        if (iC == 4) {
            return new C2172yI(zzb);
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
        synchronized (C2226zI.class) {
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
