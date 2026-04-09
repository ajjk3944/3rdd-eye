package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class NM extends AbstractC1096eL {
    private static final NM zzf;
    private static volatile CL zzg;
    private int zza;
    private String zzb = "";
    private InterfaceC1474lL zzc;
    private InterfaceC1474lL zzd;
    private String zze;

    static {
        NM nm = new NM();
        zzf = nm;
        AbstractC1096eL.u(NM.class, nm);
    }

    public NM() {
        FL fl = FL.f8088e;
        this.zzc = fl;
        this.zzd = fl;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new NM();
        }
        if (iC == 4) {
            return new C1691pM(zzf);
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
        synchronized (NM.class) {
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
