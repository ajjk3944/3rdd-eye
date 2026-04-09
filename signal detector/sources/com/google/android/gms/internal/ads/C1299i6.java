package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299i6 extends AbstractC1096eL {
    private static final C1299i6 zzf;
    private static volatile CL zzg;
    private int zza;
    private QK zzb;
    private QK zzc;
    private QK zzd;
    private QK zze;

    static {
        C1299i6 c1299i6 = new C1299i6();
        zzf = c1299i6;
        AbstractC1096eL.u(C1299i6.class, c1299i6);
    }

    public C1299i6() {
        OK ok = QK.f10609b;
        this.zzb = ok;
        this.zzc = ok;
        this.zzd = ok;
        this.zze = ok;
    }

    public static C1299i6 E(byte[] bArr, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zzf, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C1299i6) abstractC1096eLY;
    }

    public static C1245h6 F() {
        return (C1245h6) zzf.r();
    }

    public final QK A() {
        return this.zzb;
    }

    public final QK B() {
        return this.zzc;
    }

    public final QK C() {
        return this.zzd;
    }

    public final QK D() {
        return this.zze;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zza |= 1;
        this.zzb = qk;
    }

    public final /* synthetic */ void H(OK ok) {
        this.zza |= 2;
        this.zzc = ok;
    }

    public final /* synthetic */ void I(QK qk) {
        this.zza |= 4;
        this.zzd = qk;
    }

    public final /* synthetic */ void J(OK ok) {
        this.zza |= 8;
        this.zze = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new C1299i6();
        }
        if (iC == 4) {
            return new C1245h6(zzf);
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
        synchronized (C1299i6.class) {
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
