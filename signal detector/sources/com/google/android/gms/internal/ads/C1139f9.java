package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139f9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C1139f9 zzl;
    private static volatile CL zzm;
    private int zzf;
    private int zzg = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private V8 zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        C1139f9 c1139f9 = new C1139f9();
        zzl = c1139f9;
        AbstractC1096eL.u(C1139f9.class, c1139f9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", J5.f9253x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new C1139f9();
        }
        if (iC == 4) {
            return new C1262hN(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzm;
        if (cl != null) {
            return cl;
        }
        synchronized (C1139f9.class) {
            try {
                c1042dL = zzm;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzl);
                    zzm = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
