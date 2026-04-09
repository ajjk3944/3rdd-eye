package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class F8 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final F8 zzf;
    private static volatile CL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        F8 f8 = new F8();
        zzf = f8;
        AbstractC1096eL.u(F8.class, f8);
    }

    public static E8 A() {
        return (E8) zzf.r();
    }

    public final void B(int i) {
        this.zzd = AbstractC2984e.c(i);
        this.zzc |= 1;
    }

    public final void C(int i) {
        int i3 = 1;
        if (i == 1) {
            i3 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i3 = 2;
            }
        }
        this.zze = i3;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", J5.f9247r, "zze", J5.f9246q});
        }
        if (iC == 3) {
            return new F8();
        }
        if (iC == 4) {
            return new E8(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (F8.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
