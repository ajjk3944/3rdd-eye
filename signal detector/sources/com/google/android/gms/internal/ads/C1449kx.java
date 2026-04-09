package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449kx extends AbstractC1096eL {
    private static final C1449kx zzn;
    private static volatile CL zzo;
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
    private InterfaceC1420kL zzk;
    private InterfaceC1420kL zzl;
    private InterfaceC1420kL zzm;

    static {
        C1449kx c1449kx = new C1449kx();
        zzn = c1449kx;
        AbstractC1096eL.u(C1449kx.class, c1449kx);
    }

    public C1449kx() {
        C1851sL c1851sL = C1851sL.f16708e;
        this.zzk = c1851sL;
        this.zzl = c1851sL;
        this.zzm = c1851sL;
    }

    public static C1449kx R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j6) {
        InterfaceC1420kL interfaceC1420kL = this.zzl;
        if (!((GK) interfaceC1420kL).f8358a) {
            this.zzl = AbstractC1096eL.k(interfaceC1420kL);
        }
        ((C1851sL) this.zzl).c(j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j6) {
        InterfaceC1420kL interfaceC1420kL = this.zzm;
        if (!((GK) interfaceC1420kL).f8358a) {
            this.zzm = AbstractC1096eL.k(interfaceC1420kL);
        }
        ((C1851sL) this.zzm).c(j6);
    }

    public final void C() {
        this.zzm = C1851sL.f16708e;
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

    public final InterfaceC1420kL M() {
        return this.zzk;
    }

    public final int N() {
        return ((C1851sL) this.zzk).size();
    }

    public final int O() {
        return ((C1851sL) this.zzl).size();
    }

    public final InterfaceC1420kL P() {
        return this.zzm;
    }

    public final int Q() {
        return ((C1851sL) this.zzm).size();
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void T(long j6) {
        this.zza |= 1;
        this.zzc = j6;
    }

    public final /* synthetic */ void U(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void V() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void W(boolean z6) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void X(long j6) {
        this.zza |= 16;
        this.zzg = j6;
    }

    public final /* synthetic */ void Y(long j6) {
        this.zzh = j6;
    }

    public final /* synthetic */ void Z(long j6) {
        this.zza |= 32;
        this.zzi = j6;
    }

    public final /* synthetic */ void a0(long j6) {
        this.zza |= 64;
        this.zzj = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(long j6) {
        InterfaceC1420kL interfaceC1420kL = this.zzk;
        if (!((GK) interfaceC1420kL).f8358a) {
            this.zzk = AbstractC1096eL.k(interfaceC1420kL);
        }
        ((C1851sL) this.zzk).c(j6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new C1449kx();
        }
        if (iC == 4) {
            return new C1395jx(zzn);
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
        synchronized (C1449kx.class) {
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
