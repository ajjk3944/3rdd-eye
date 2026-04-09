package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xc extends qn1 {
    private static final xc zzi;
    private static volatile po1 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        xc xcVar = new xc();
        zzi = xcVar;
        qn1.u(xc.class, xcVar);
    }

    public static wc A() {
        return (wc) zzi.r();
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void H(int i4) {
        this.zzd = i4 - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", qc.f15293e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new xc();
        }
        if (iC == 4) {
            return new wc(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzj;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (xc.class) {
            try {
                pn1Var = zzj;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzi);
                    zzj = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
