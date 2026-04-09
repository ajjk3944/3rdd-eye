package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.hv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287hv extends AbstractC1096eL {
    private static final C1287hv zzi;
    private static volatile CL zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        C1287hv c1287hv = new C1287hv();
        zzi = c1287hv;
        AbstractC1096eL.u(C1287hv.class, c1287hv);
    }

    public static C1233gv A() {
        return (C1233gv) zzi.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zzc = j6;
    }

    public final /* synthetic */ void E(boolean z6) {
        this.zzd = z6;
    }

    public final /* synthetic */ void F(long j6) {
        this.zze = j6;
    }

    public final /* synthetic */ void G(long j6) {
        this.zzf = j6;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void I(int i) {
        this.zzh = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new C1287hv();
        }
        if (iC == 4) {
            return new C1233gv(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzj;
        if (cl != null) {
            return cl;
        }
        synchronized (C1287hv.class) {
            try {
                c1042dL = zzj;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzi);
                    zzj = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
