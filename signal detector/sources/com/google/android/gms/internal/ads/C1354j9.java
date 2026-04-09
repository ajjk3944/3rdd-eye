package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354j9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1354j9 zzh;
    private static volatile CL zzi;
    private int zzd;
    private int zze = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private V8 zzf;
    private Q8 zzg;

    static {
        C1354j9 c1354j9 = new C1354j9();
        zzh = c1354j9;
        AbstractC1096eL.u(C1354j9.class, c1354j9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", J5.f9253x, "zzf", "zzg"});
        }
        if (iC == 3) {
            return new C1354j9();
        }
        if (iC == 4) {
            return new C1194g9(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzi;
        if (cl != null) {
            return cl;
        }
        synchronized (C1354j9.class) {
            try {
                c1042dL = zzi;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzh);
                    zzi = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
