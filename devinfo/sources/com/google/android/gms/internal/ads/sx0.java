package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sx0 extends qn1 {
    private static volatile po1 zzA;
    private static final sx0 zzz;
    private int zza;
    private int zzb;
    private vx0 zzf;
    private boolean zzg;
    private xx0 zzj;
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
        sx0 sx0Var = new sx0();
        zzz = sx0Var;
        qn1.u(sx0.class, sx0Var);
    }

    public static rx0 Y() {
        return (rx0) zzz.r();
    }

    public final /* synthetic */ void A(xx0 xx0Var) {
        this.zzj = xx0Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void C(boolean z3) {
        this.zza |= 65536;
        this.zzv = z3;
    }

    public final int D() {
        int i4;
        int i10 = this.zzb;
        if (i10 != 0) {
            i4 = 2;
            if (i10 != 1) {
                i4 = i10 != 2 ? i10 != 3 ? 0 : 4 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final /* synthetic */ void E(int i4) {
        this.zzb = i4 - 1;
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

    public final vx0 I() {
        vx0 vx0Var = this.zzf;
        return vx0Var == null ? vx0.F() : vx0Var;
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

    public final xx0 M() {
        xx0 xx0Var = this.zzj;
        return xx0Var == null ? xx0.I() : xx0Var;
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

    public final /* synthetic */ void Z(boolean z3) {
        this.zza |= 2;
        this.zzc = z3;
    }

    public final /* synthetic */ void a0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void b0(vx0 vx0Var) {
        this.zzf = vx0Var;
        this.zza |= 16;
    }

    public final /* synthetic */ void c0(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    public final /* synthetic */ void d0(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", qc.A, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        if (iC == 3) {
            return new sx0();
        }
        if (iC == 4) {
            return new rx0(zzz);
        }
        if (iC == 5) {
            return zzz;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzA;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (sx0.class) {
            try {
                pn1Var = zzA;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzz);
                    zzA = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
