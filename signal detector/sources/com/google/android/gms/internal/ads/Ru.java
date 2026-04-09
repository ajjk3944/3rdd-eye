package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Ru extends AbstractC1096eL {
    private static final Ru zzc;
    private static volatile CL zzd;
    private int zza;
    private long zzb;

    static {
        Ru ru = new Ru();
        zzc = ru;
        AbstractC1096eL.u(Ru.class, ru);
    }

    public static Qu A() {
        return (Qu) zzc.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new Ru();
        }
        if (iC == 4) {
            return new Qu(zzc);
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
        synchronized (Ru.class) {
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
