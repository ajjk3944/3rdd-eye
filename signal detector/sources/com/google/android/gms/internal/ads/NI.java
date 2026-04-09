package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class NI extends AbstractC1096eL {
    private static final NI zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private RI zzc;
    private QK zzd = QK.f10609b;

    static {
        NI ni = new NI();
        zze = ni;
        AbstractC1096eL.u(NI.class, ni);
    }

    public static NI D(QK qk, XK xk) {
        return (NI) AbstractC1096eL.m(zze, qk, xk);
    }

    public static MI E() {
        return (MI) zze.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final RI B() {
        RI ri = this.zzc;
        return ri == null ? RI.C() : ri;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(RI ri) {
        this.zzc = ri;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zzd = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new NI();
        }
        if (iC == 4) {
            return new MI(zze);
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
        synchronized (NI.class) {
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
