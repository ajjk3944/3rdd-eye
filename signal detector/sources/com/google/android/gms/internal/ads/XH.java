package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class XH extends AbstractC1096eL {
    private static final XH zzc;
    private static volatile CL zzd;
    private int zza;
    private int zzb;

    static {
        XH xh = new XH();
        zzc = xh;
        AbstractC1096eL.u(XH.class, xh);
    }

    public static WH C() {
        return (WH) zzc.r();
    }

    public static XH D() {
        return zzc;
    }

    public final RH A() {
        RH rhB = RH.b(this.zza);
        return rhB == null ? RH.UNRECOGNIZED : rhB;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(RH rh) {
        this.zza = rh.a();
    }

    public final /* synthetic */ void F(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new XH();
        }
        if (iC == 4) {
            return new WH(zzc);
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
        synchronized (XH.class) {
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
