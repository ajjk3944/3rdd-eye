package com.google.android.gms.internal.ads;

import android.os.Build;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class I5 extends AbstractC1096eL {
    private static final I5 zzn;
    private static volatile CL zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private InterfaceC1474lL zzb = FL.f8088e;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        I5 i52 = new I5();
        zzn = i52;
        AbstractC1096eL.u(I5.class, i52);
    }

    public static H5 A() {
        return (H5) zzn.r();
    }

    public final void B(Q5 q52) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(q52);
    }

    public final void C() {
        this.zzb = FL.f8088e;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 1;
        this.zzc = j6;
    }

    public final /* synthetic */ void E(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void I(long j6) {
        this.zza |= 64;
        this.zzi = j6;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void L(long j6) {
        this.zza |= 512;
        this.zzl = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zza |= 1024;
        this.zzm = j6;
    }

    public final /* synthetic */ void N(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", Q5.class, "zzc", "zzd", "zze", "zzf", "zzg", J5.f9234d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new I5();
        }
        if (iC == 4) {
            return new H5(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzo;
        if (cl != null) {
            return cl;
        }
        synchronized (I5.class) {
            try {
                c1042dL = zzo;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzn);
                    zzo = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
