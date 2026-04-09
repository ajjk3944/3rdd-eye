package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1947u9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1947u9 zzv;
    private static volatile CL zzw;
    private int zzi;
    private Q8 zzk;
    private int zzl;
    private S8 zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzp = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zzu = TTAdConstant.STYLE_SIZE_RADIO_1_1;

    static {
        C1947u9 c1947u9 = new C1947u9();
        zzv = c1947u9;
        AbstractC1096eL.u(C1947u9.class, c1947u9);
    }

    public static C1947u9 A() {
        return zzv;
    }

    public final void B(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void C(S8 s8) {
        this.zzm = s8;
        this.zzi |= 8;
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
            return new GL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", j52, "zzp", j52, "zzu", j52});
        }
        if (iC == 3) {
            return new C1947u9();
        }
        if (iC == 4) {
            return new C1893t9(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzw;
        if (cl != null) {
            return cl;
        }
        synchronized (C1947u9.class) {
            try {
                c1042dL = zzw;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzv);
                    zzw = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
