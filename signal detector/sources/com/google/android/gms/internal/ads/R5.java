package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class R5 extends AbstractC1096eL {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10844a = 0;
    private static final R5 zzg;
    private static volatile CL zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        R5 r52 = new R5();
        zzg = r52;
        AbstractC1096eL.u(R5.class, r52);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new R5();
        }
        if (iC == 4) {
            return new L5(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzh;
        if (cl != null) {
            return cl;
        }
        synchronized (R5.class) {
            try {
                c1042dL = zzh;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzg);
                    zzh = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
