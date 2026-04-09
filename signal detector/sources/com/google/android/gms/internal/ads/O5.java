package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class O5 extends AbstractC1096eL {
    private static final O5 zzg;
    private static volatile CL zzh;
    private int zza;
    private boolean zzb;
    private int zzc = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        O5 o5 = new O5();
        zzg = o5;
        AbstractC1096eL.u(O5.class, o5);
    }

    public static O5 F() {
        return zzg;
    }

    public final boolean A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzc;
    }

    public final boolean C() {
        return this.zzd;
    }

    public final boolean D() {
        return this.zze;
    }

    public final boolean E() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new O5();
        }
        if (iC == 4) {
            return new L5(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzh;
        if (cl != null) {
            return cl;
        }
        synchronized (O5.class) {
            try {
                c1042dL = zzh;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzg);
                    zzh = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
