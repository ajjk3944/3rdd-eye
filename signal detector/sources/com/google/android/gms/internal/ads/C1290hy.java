package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.hy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290hy extends AbstractC1096eL {
    private static final C1290hy zzl;
    private static volatile CL zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        C1290hy c1290hy = new C1290hy();
        zzl = c1290hy;
        AbstractC1096eL.u(C1290hy.class, c1290hy);
    }

    public static C1236gy H() {
        return (C1236gy) zzl.r();
    }

    public static C1290hy I() {
        return zzl;
    }

    public final boolean A() {
        return this.zzd;
    }

    public final long B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final long F() {
        return this.zzj;
    }

    public final long G() {
        return this.zzk;
    }

    public final /* synthetic */ void J(boolean z6) {
        this.zza |= 4;
        this.zzd = z6;
    }

    public final /* synthetic */ void K(long j6) {
        this.zza |= 64;
        this.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new C1290hy();
        }
        if (iC == 4) {
            return new C1236gy(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzm;
        if (cl != null) {
            return cl;
        }
        synchronized (C1290hy.class) {
            try {
                c1042dL = zzm;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzl);
                    zzm = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
