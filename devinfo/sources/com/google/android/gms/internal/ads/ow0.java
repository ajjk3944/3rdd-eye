package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ow0 extends qn1 {
    private static final ow0 zzn;
    private static volatile po1 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private wn1 zzk;
    private wn1 zzl;
    private wn1 zzm;

    static {
        ow0 ow0Var = new ow0();
        zzn = ow0Var;
        qn1.u(ow0.class, ow0Var);
    }

    public ow0() {
        fo1 fo1Var = fo1.f11247e;
        this.zzk = fo1Var;
        this.zzl = fo1Var;
        this.zzm = fo1Var;
    }

    public static ow0 R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j) {
        wn1 wn1Var = this.zzl;
        if (!((rm1) wn1Var).f15707a) {
            this.zzl = qn1.k(wn1Var);
        }
        ((fo1) this.zzl).d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j) {
        wn1 wn1Var = this.zzm;
        if (!((rm1) wn1Var).f15707a) {
            this.zzm = qn1.k(wn1Var);
        }
        ((fo1) this.zzm).d(j);
    }

    public final void C() {
        this.zzm = fo1.f11247e;
    }

    public final String D() {
        return this.zzb;
    }

    public final long E() {
        return this.zzc;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final long I() {
        return this.zzg;
    }

    public final long J() {
        return this.zzh;
    }

    public final long K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zza & 64) != 0;
    }

    public final wn1 M() {
        return this.zzk;
    }

    public final int N() {
        return ((fo1) this.zzk).size();
    }

    public final int O() {
        return ((fo1) this.zzl).size();
    }

    public final wn1 P() {
        return this.zzm;
    }

    public final int Q() {
        return ((fo1) this.zzm).size();
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void T(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void U(int i4) {
        this.zza |= 2;
        this.zzd = i4;
    }

    public final /* synthetic */ void V() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void W(boolean z3) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void a0(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(long j) {
        wn1 wn1Var = this.zzk;
        if (!((rm1) wn1Var).f15707a) {
            this.zzk = qn1.k(wn1Var);
        }
        ((fo1) this.zzk).d(j);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new ow0();
        }
        if (iC == 4) {
            return new nw0(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzo;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ow0.class) {
            try {
                pn1Var = zzo;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzn);
                    zzo = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
