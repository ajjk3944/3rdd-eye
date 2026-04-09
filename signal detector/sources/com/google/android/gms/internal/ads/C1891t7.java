package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891t7 extends AbstractC1096eL {
    private static final C1891t7 zzc;
    private static volatile CL zzd;
    private int zza;
    private C2053w7 zzb;

    static {
        C1891t7 c1891t7 = new C1891t7();
        zzc = c1891t7;
        AbstractC1096eL.u(C1891t7.class, c1891t7);
    }

    public static C1891t7 B(byte[] bArr, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zzc, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C1891t7) abstractC1096eLY;
    }

    public final C2053w7 A() {
        C2053w7 c2053w7 = this.zzb;
        return c2053w7 == null ? C2053w7.E() : c2053w7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new C1891t7();
        }
        if (iC == 4) {
            return new L5(zzc);
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
        synchronized (C1891t7.class) {
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
