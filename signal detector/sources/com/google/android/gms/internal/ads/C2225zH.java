package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.zH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2225zH extends AbstractC1096eL {
    private static final C2225zH zzc;
    private static volatile CL zzd;
    private int zza;
    private int zzb;

    static {
        C2225zH c2225zH = new C2225zH();
        zzc = c2225zH;
        AbstractC1096eL.u(C2225zH.class, c2225zH);
    }

    public static C2225zH C(QK qk, XK xk) {
        return (C2225zH) AbstractC1096eL.m(zzc, qk, xk);
    }

    public static C2171yH D() {
        return (C2171yH) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i) {
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
            return new GL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iC == 3) {
            return new C2225zH();
        }
        if (iC == 4) {
            return new C2171yH(zzc);
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
        synchronized (C2225zH.class) {
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
