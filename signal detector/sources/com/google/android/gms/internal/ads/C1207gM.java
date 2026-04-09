package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.gM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207gM extends AbstractC1096eL {
    private static final C1207gM zzd;
    private static volatile CL zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        C1207gM c1207gM = new C1207gM();
        zzd = c1207gM;
        AbstractC1096eL.u(C1207gM.class, c1207gM);
    }

    public static C1152fM A() {
        return (C1152fM) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zzc = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C1207gM();
        }
        if (iC == 4) {
            return new C1152fM(zzd);
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
        synchronized (C1207gM.class) {
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
