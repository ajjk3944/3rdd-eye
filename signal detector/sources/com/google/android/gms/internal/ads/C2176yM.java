package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.yM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176yM extends AbstractC1096eL {
    private static final C2176yM zzh;
    private static volatile CL zzi;
    private int zza;
    private C2122xM zzb;
    private QK zzd;
    private QK zze;
    private int zzf;
    private byte zzg = 2;
    private InterfaceC1474lL zzc = FL.f8088e;

    static {
        C2176yM c2176yM = new C2176yM();
        zzh = c2176yM;
        AbstractC1096eL.u(C2176yM.class, c2176yM);
    }

    public C2176yM() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
    }

    public static C2068wM A() {
        return (C2068wM) zzh.r();
    }

    public final void B(C2014vM c2014vM) {
        InterfaceC1474lL interfaceC1474lL = this.zzc;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzc = interfaceC1474lL.B(size + size);
        }
        this.zzc.add(c2014vM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        switch (AbstractC2984e.c(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = abstractC1096eL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new GL(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", C2014vM.class, "zzd", "zze", "zzf"});
            case 3:
                return new C2176yM();
            case 4:
                return new C2068wM(zzh);
            case 5:
                return zzh;
            case 6:
                CL cl = zzi;
                if (cl != null) {
                    return cl;
                }
                synchronized (C2176yM.class) {
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
            default:
                throw null;
        }
    }
}
