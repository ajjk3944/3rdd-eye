package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class G5 extends AbstractC1096eL {
    private static final G5 zzj;
    private static volatile CL zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private O5 zzg;
    private R5 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        G5 g52 = new G5();
        zzj = g52;
        AbstractC1096eL.u(G5.class, g52);
    }

    public static F5 E() {
        return (F5) zzj.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return this.zze;
    }

    public final O5 C() {
        O5 o5 = this.zzg;
        return o5 == null ? O5.F() : o5;
    }

    public final void D() {
        if (this.zzh == null) {
            int i = R5.f10844a;
        }
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void G(boolean z6) {
        this.zza |= 8;
        this.zze = z6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", J5.f9232b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new G5();
        }
        if (iC == 4) {
            return new F5(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzk;
        if (cl != null) {
            return cl;
        }
        synchronized (G5.class) {
            try {
                c1042dL = zzk;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzj);
                    zzk = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
