package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1999v7 extends AbstractC1096eL {
    private static final C1999v7 zze;
    private static volatile CL zzf;
    private int zza;
    private C2215z7 zzb;
    private QK zzc;
    private QK zzd;

    static {
        C1999v7 c1999v7 = new C1999v7();
        zze = c1999v7;
        AbstractC1096eL.u(C1999v7.class, c1999v7);
    }

    public C1999v7() {
        OK ok = QK.f10609b;
        this.zzc = ok;
        this.zzd = ok;
    }

    public static C1999v7 D(OK ok, XK xk) {
        return (C1999v7) AbstractC1096eL.m(zze, ok, xk);
    }

    public static C1999v7 E(byte[] bArr, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zze, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C1999v7) abstractC1096eLY;
    }

    public final C2215z7 A() {
        C2215z7 c2215z7 = this.zzb;
        return c2215z7 == null ? C2215z7.I() : c2215z7;
    }

    public final QK B() {
        return this.zzc;
    }

    public final QK C() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1999v7();
        }
        if (iC == 4) {
            return new L5(zze);
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
        synchronized (C1999v7.class) {
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
