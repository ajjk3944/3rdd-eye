package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.kI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417kI extends AbstractC1096eL {
    private static final C1417kI zze;
    private static volatile CL zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        C1417kI c1417kI = new C1417kI();
        zze = c1417kI;
        AbstractC1096eL.u(C1417kI.class, c1417kI);
    }

    public static C1363jI A() {
        return (C1363jI) zze.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void D(EnumC1956uI enumC1956uI) {
        this.zzd = enumC1956uI.a();
    }

    public final void E(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzb = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1417kI();
        }
        if (iC == 4) {
            return new C1363jI(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzf;
        if (cl != null) {
            return cl;
        }
        synchronized (C1417kI.class) {
            try {
                c1042dL = zzf;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zze);
                    zzf = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
