package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class Xx extends AbstractC1096eL {
    private static volatile CL zzA;
    private static final Xx zzz;
    private int zza;
    private int zzb;
    private C1182fy zzf;
    private boolean zzg;
    private C1290hy zzj;
    private boolean zzy;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zze = true;
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 10;
    private long zzl = 100;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;
    private boolean zzv = true;
    private boolean zzw = true;
    private boolean zzx = true;

    static {
        Xx xx = new Xx();
        zzz = xx;
        AbstractC1096eL.u(Xx.class, xx);
    }

    public static Wx Y() {
        return (Wx) zzz.r();
    }

    public final /* synthetic */ void A(C1290hy c1290hy) {
        this.zzj = c1290hy;
        this.zza |= 256;
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 32768;
        this.zzu = j6;
    }

    public final /* synthetic */ void C(boolean z6) {
        this.zza |= 65536;
        this.zzv = z6;
    }

    public final int D() {
        int i;
        int i3 = this.zzb;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1) {
                i = i3 != 2 ? i3 != 3 ? 0 : 4 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final boolean F() {
        return this.zzc;
    }

    public final String G() {
        return this.zzd;
    }

    public final boolean H() {
        return this.zze;
    }

    public final C1182fy I() {
        C1182fy c1182fy = this.zzf;
        return c1182fy == null ? C1182fy.F() : c1182fy;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final long K() {
        return this.zzh;
    }

    public final long L() {
        return this.zzi;
    }

    public final C1290hy M() {
        C1290hy c1290hy = this.zzj;
        return c1290hy == null ? C1290hy.I() : c1290hy;
    }

    public final long N() {
        return this.zzk;
    }

    public final long O() {
        return this.zzl;
    }

    public final long P() {
        return this.zzm;
    }

    public final String Q() {
        return this.zzn;
    }

    public final String R() {
        return this.zzo;
    }

    public final long S() {
        return this.zzp;
    }

    public final long T() {
        return this.zzu;
    }

    public final boolean U() {
        return this.zzv;
    }

    public final boolean V() {
        return this.zzw;
    }

    public final boolean W() {
        return this.zzx;
    }

    public final boolean X() {
        return this.zzy;
    }

    public final /* synthetic */ void Z(boolean z6) {
        this.zza |= 2;
        this.zzc = z6;
    }

    public final /* synthetic */ void a0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void b0(C1182fy c1182fy) {
        this.zzf = c1182fy;
        this.zza |= 16;
    }

    public final /* synthetic */ void c0(long j6) {
        this.zza |= 64;
        this.zzh = j6;
    }

    public final /* synthetic */ void d0(long j6) {
        this.zza |= 128;
        this.zzi = j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", J5.f9227A, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        if (iC == 3) {
            return new Xx();
        }
        if (iC == 4) {
            return new Wx(zzz);
        }
        if (iC == 5) {
            return zzz;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzA;
        if (cl != null) {
            return cl;
        }
        synchronized (Xx.class) {
            try {
                c1042dL = zzA;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzz);
                    zzA = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
