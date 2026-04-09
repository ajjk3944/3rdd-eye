package com.google.android.gms.internal.ads;

import android.os.Build;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.s7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837s7 extends AbstractC1096eL {
    private static final C1837s7 zzh;
    private static volatile CL zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private QK zzb = QK.f10609b;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        C1837s7 c1837s7 = new C1837s7();
        zzh = c1837s7;
        AbstractC1096eL.u(C1837s7.class, c1837s7);
    }

    public static C1783r7 A() {
        return (C1783r7) zzh.r();
    }

    public final /* synthetic */ void B(OK ok) {
        this.zza |= 1;
        this.zzb = ok;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
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
            return new GL(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iC == 3) {
            return new C1837s7();
        }
        if (iC == 4) {
            return new C1783r7(zzh);
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
        synchronized (C1837s7.class) {
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
