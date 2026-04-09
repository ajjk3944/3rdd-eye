package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class VM extends AbstractC1096eL {
    private static final VM zzp;
    private static volatile CL zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private InterfaceC1474lL zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private InterfaceC1474lL zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        VM vm = new VM();
        zzp = vm;
        AbstractC1096eL.u(VM.class, vm);
    }

    public VM() {
        FL fl = FL.f8088e;
        this.zze = fl;
        this.zzf = "";
        this.zzg = "";
        this.zzj = fl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", C1421kM.f15127r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", UM.class, "zzc", "zzk", C1421kM.f15126q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iC == 3) {
            return new VM();
        }
        if (iC == 4) {
            return new C1691pM(zzp);
        }
        if (iC == 5) {
            return zzp;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzu;
        if (cl != null) {
            return cl;
        }
        synchronized (VM.class) {
            try {
                c1042dL = zzu;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzp);
                    zzu = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
