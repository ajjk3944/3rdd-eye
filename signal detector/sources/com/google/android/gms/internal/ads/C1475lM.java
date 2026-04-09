package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.lM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475lM extends AbstractC1096eL {
    private static final C1475lM zzy;
    private static volatile CL zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private InterfaceC1474lL zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private InterfaceC1474lL zzo;
    private boolean zzp;
    private long zzu;
    private InterfaceC1314iL zzv;
    private boolean zzw;
    private InterfaceC1314iL zzx;

    static {
        C1475lM c1475lM = new C1475lM();
        zzy = c1475lM;
        AbstractC1096eL.u(C1475lM.class, c1475lM);
    }

    public C1475lM() {
        FL fl = FL.f8088e;
        this.zze = fl;
        this.zzj = "";
        this.zzo = fl;
        C1151fL c1151fL = C1151fL.f14062e;
        this.zzv = c1151fL;
        this.zzx = c1151fL;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", C1421kM.f15113c, "zzc", "zzd", "zze", "zzf", J5.f9231E, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C1367jM.class, "zzp", "zzu", "zzv", J5.f9229C, "zzw", "zzx", C1421kM.f15112b});
        }
        if (iC == 3) {
            return new C1475lM();
        }
        if (iC == 4) {
            return new C1194g9(zzy);
        }
        if (iC == 5) {
            return zzy;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzz;
        if (cl != null) {
            return cl;
        }
        synchronized (C1475lM.class) {
            try {
                c1042dL = zzz;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzy);
                    zzz = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
