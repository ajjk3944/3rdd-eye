package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class V5 extends AbstractC1096eL {
    private static final V5 zze;
    private static volatile CL zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzd = TTAdConstant.STYLE_SIZE_RADIO_1_1;

    static {
        V5 v52 = new V5();
        zze = v52;
        AbstractC1096eL.u(V5.class, v52);
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
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", j52, "zzd", j52});
        }
        if (iC == 3) {
            return new V5();
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
        synchronized (V5.class) {
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
