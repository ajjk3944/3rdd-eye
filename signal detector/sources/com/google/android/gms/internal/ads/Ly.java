package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Ly extends AbstractC1096eL {
    private static final Ly zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        Ly ly = new Ly();
        zze = ly;
        AbstractC1096eL.u(Ly.class, ly);
    }

    public static Ly D(OK ok) {
        Ly ly = zze;
        XK xk = XK.f12412a;
        int i = JK.f9277a;
        AbstractC1096eL abstractC1096eLM = AbstractC1096eL.m(ly, ok, XK.f12413b);
        AbstractC1096eL.z(abstractC1096eLM);
        return (Ly) abstractC1096eLM;
    }

    public static Ky E() {
        return (Ky) zze.r();
    }

    public static Ly F() {
        return zze;
    }

    public final C2215z7 A() {
        return this.zzb == 1 ? (C2215z7) this.zzc : C2215z7.I();
    }

    public final C2107x7 B() {
        return this.zzb == 2 ? (C2107x7) this.zzc : C2107x7.D();
    }

    public final EnumC1945u7 C() {
        EnumC1945u7 enumC1945u7B = EnumC1945u7.b(this.zzd);
        return enumC1945u7B == null ? EnumC1945u7.UNSUPPORTED : enumC1945u7B;
    }

    public final /* synthetic */ void G(C2215z7 c2215z7) {
        c2215z7.getClass();
        this.zzc = c2215z7;
        this.zzb = 1;
    }

    public final /* synthetic */ void H(C2107x7 c2107x7) {
        c2107x7.getClass();
        this.zzc = c2107x7;
        this.zzb = 2;
    }

    public final void I(EnumC1945u7 enumC1945u7) {
        this.zzd = enumC1945u7.f17066a;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", C2215z7.class, C2107x7.class, "zzd", J5.f9244o});
        }
        if (iC == 3) {
            return new Ly();
        }
        if (iC == 4) {
            return new Ky(zze);
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
        synchronized (Ly.class) {
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
