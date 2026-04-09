package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.vM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014vM extends AbstractC1096eL {
    private static final C2014vM zze;
    private static volatile CL zzf;
    private int zza;
    private QK zzb;
    private QK zzc;
    private byte zzd = 2;

    static {
        C2014vM c2014vM = new C2014vM();
        zze = c2014vM;
        AbstractC1096eL.u(C2014vM.class, c2014vM);
    }

    public C2014vM() {
        OK ok = QK.f10609b;
        this.zzb = ok;
        this.zzc = ok;
    }

    public static C1960uM A() {
        return (C1960uM) zze.r();
    }

    public final /* synthetic */ void B(OK ok) {
        this.zza |= 1;
        this.zzb = ok;
    }

    public final /* synthetic */ void C(QK qk) {
        this.zza |= 2;
        this.zzc = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        switch (AbstractC2984e.c(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = abstractC1096eL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new GL(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new C2014vM();
            case 4:
                return new C1960uM(zze);
            case 5:
                return zze;
            case 6:
                CL cl = zzf;
                if (cl != null) {
                    return cl;
                }
                synchronized (C2014vM.class) {
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
            default:
                throw null;
        }
    }
}
