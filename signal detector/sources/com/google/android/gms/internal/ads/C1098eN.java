package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.eN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098eN extends AbstractC1096eL {
    private static final C1098eN zzj;
    private static volatile CL zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private InterfaceC1474lL zzd;
    private InterfaceC1474lL zze;
    private InterfaceC1474lL zzf;
    private int zzg;
    private XM zzh;
    private String zzi;

    static {
        C1098eN c1098eN = new C1098eN();
        zzj = c1098eN;
        AbstractC1096eL.u(C1098eN.class, c1098eN);
    }

    public C1098eN() {
        FL fl = FL.f8088e;
        this.zzd = fl;
        this.zze = fl;
        this.zzf = fl;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", ZM.class, "zze", C0989cN.class, "zzg", "zzb", "zzf", C1316iN.class, "zzi", "zzh"});
        }
        if (iC == 3) {
            return new C1098eN();
        }
        if (iC == 4) {
            return new C1691pM(zzj);
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
        synchronized (C1098eN.class) {
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
