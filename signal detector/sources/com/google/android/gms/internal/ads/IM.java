package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class IM extends AbstractC1096eL {
    private static final IM zzf;
    private static volatile CL zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private QK zzd;
    private QK zze;

    static {
        IM im = new IM();
        zzf = im;
        AbstractC1096eL.u(IM.class, im);
    }

    public IM() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
    }

    public static HM A() {
        return (HM) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void C(QK qk) {
        qk.getClass();
        this.zza |= 4;
        this.zzd = qk;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", C1421kM.f15119j, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new IM();
        }
        if (iC == 4) {
            return new HM(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (IM.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
