package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Y8 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final Y8 zzh;
    private static volatile CL zzi;
    private int zzd;
    private int zze;
    private C0921b9 zzf;
    private C1030d9 zzg;

    static {
        Y8 y8 = new Y8();
        zzh = y8;
        AbstractC1096eL.u(Y8.class, y8);
    }

    public static X8 B() {
        return (X8) zzh.r();
    }

    public final void A(C1030d9 c1030d9) {
        this.zzg = c1030d9;
        this.zzd |= 4;
    }

    public final void C() {
        this.zze = AbstractC2984e.c(2);
        this.zzd |= 1;
    }

    public final void D(C0921b9 c0921b9) {
        c0921b9.getClass();
        this.zzf = c0921b9;
        this.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", J5.f9250u, "zzf", "zzg"});
        }
        if (iC == 3) {
            return new Y8();
        }
        if (iC == 4) {
            return new X8(zzh);
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
        synchronized (Y8.class) {
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
