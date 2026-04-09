package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785r9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C1785r9 zzl;
    private static volatile CL zzm;
    private int zzf;
    private String zzg = "";
    private InterfaceC1474lL zzh = FL.f8088e;
    private int zzi = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzj = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzk = TTAdConstant.STYLE_SIZE_RADIO_1_1;

    static {
        C1785r9 c1785r9 = new C1785r9();
        zzl = c1785r9;
        AbstractC1096eL.u(C1785r9.class, c1785r9);
    }

    public static C1785r9 A() {
        return zzl;
    }

    public final void B(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            J5 j52 = J5.f9253x;
            return new GL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", C1624o9.class, "zzi", j52, "zzj", j52, "zzk", j52});
        }
        if (iC == 3) {
            return new C1785r9();
        }
        if (iC == 4) {
            return new C1732q9(zzl);
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
        synchronized (C1785r9.class) {
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
