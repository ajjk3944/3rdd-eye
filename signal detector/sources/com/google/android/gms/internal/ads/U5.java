package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class U5 extends AbstractC1096eL {
    private static final U5 zzf;
    private static volatile CL zzg;
    private int zza;
    private int zzb = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzc = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzd = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zze = TTAdConstant.STYLE_SIZE_RADIO_1_1;

    static {
        U5 u52 = new U5();
        zzf = u52;
        AbstractC1096eL.u(U5.class, u52);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            J5 j52 = J5.f9242m;
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", j52, "zzc", j52, "zzd", j52, "zze", j52});
        }
        if (iC == 3) {
            return new U5();
        }
        if (iC == 4) {
            return new L5(zzf);
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
        synchronized (U5.class) {
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
