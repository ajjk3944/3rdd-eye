package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class N5 extends AbstractC1096eL {
    private static final N5 zzo;
    private static volatile CL zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private InterfaceC1474lL zzm = FL.f8088e;

    static {
        N5 n52 = new N5();
        zzo = n52;
        AbstractC1096eL.u(N5.class, n52);
    }

    public static K5 A() {
        return (K5) zzo.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", M5.class, "zzn", J5.f9233c});
        }
        if (iC == 3) {
            return new N5();
        }
        if (iC == 4) {
            return new K5(zzo);
        }
        if (iC == 5) {
            return zzo;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzp;
        if (cl != null) {
            return cl;
        }
        synchronized (N5.class) {
            try {
                c1042dL = zzp;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzo);
                    zzp = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
