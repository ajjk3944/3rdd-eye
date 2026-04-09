package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sd extends qn1 {
    private static final sd zzh;
    private static volatile po1 zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        sd sdVar = new sd();
        zzh = sdVar;
        qn1.u(sd.class, sdVar);
    }

    public static rd A() {
        return (rd) zzh.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iC == 3) {
            return new sd();
        }
        if (iC == 4) {
            return new rd(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzi;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (sd.class) {
            try {
                pn1Var = zzi;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzh);
                    zzi = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
