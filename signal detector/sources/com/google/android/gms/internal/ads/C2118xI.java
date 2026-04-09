package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2118xI extends AbstractC1096eL {
    private static final C2118xI zze;
    private static volatile CL zzf;
    private int zza;
    private C2226zI zzb;
    private int zzc;
    private QK zzd = QK.f10609b;

    static {
        C2118xI c2118xI = new C2118xI();
        zze = c2118xI;
        AbstractC1096eL.u(C2118xI.class, c2118xI);
    }

    public static C2118xI D(QK qk, XK xk) {
        return (C2118xI) AbstractC1096eL.m(zze, qk, xk);
    }

    public static C2064wI E() {
        return (C2064wI) zze.r();
    }

    public final C2226zI A() {
        C2226zI c2226zI = this.zzb;
        return c2226zI == null ? C2226zI.C() : c2226zI;
    }

    public final int B() {
        return this.zzc;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C2226zI c2226zI) {
        this.zzb = c2226zI;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void H(OK ok) {
        this.zzd = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C2118xI();
        }
        if (iC == 4) {
            return new C2064wI(zze);
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
        synchronized (C2118xI.class) {
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
