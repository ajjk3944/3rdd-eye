package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302i9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C1302i9 zzn;
    private static volatile CL zzo;
    private int zzg;
    private int zzh = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private V8 zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        C1302i9 c1302i9 = new C1302i9();
        zzn = c1302i9;
        AbstractC1096eL.u(C1302i9.class, c1302i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", J5.f9253x, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new C1302i9();
        }
        if (iC == 4) {
            return new C1194g9(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzo;
        if (cl != null) {
            return cl;
        }
        synchronized (C1302i9.class) {
            try {
                c1042dL = zzo;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzn);
                    zzo = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
