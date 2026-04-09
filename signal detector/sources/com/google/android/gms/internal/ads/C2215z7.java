package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2215z7 extends AbstractC1096eL {
    private static final C2215z7 zzg;
    private static volatile CL zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        C2215z7 c2215z7 = new C2215z7();
        zzg = c2215z7;
        AbstractC1096eL.u(C2215z7.class, c2215z7);
    }

    public static C2215z7 F(OK ok) {
        C2215z7 c2215z7 = zzg;
        XK xk = XK.f12412a;
        int i = JK.f9277a;
        AbstractC1096eL abstractC1096eLM = AbstractC1096eL.m(c2215z7, ok, XK.f12413b);
        AbstractC1096eL.z(abstractC1096eLM);
        return (C2215z7) abstractC1096eLM;
    }

    public static C2215z7 G(OK ok, XK xk) {
        return (C2215z7) AbstractC1096eL.m(zzg, ok, xk);
    }

    public static C2161y7 H() {
        return (C2161y7) zzg.r();
    }

    public static C2215z7 I() {
        return zzg;
    }

    public final String A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void L(long j6) {
        this.zza |= 4;
        this.zzd = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zza |= 8;
        this.zze = j6;
    }

    public final /* synthetic */ void N(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new C2215z7();
        }
        if (iC == 4) {
            return new C2161y7(zzg);
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
        synchronized (C2215z7.class) {
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
