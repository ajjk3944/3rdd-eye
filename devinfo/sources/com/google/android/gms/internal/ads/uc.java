package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uc extends qn1 {
    private static final uc zzo;
    private static volatile po1 zzp;
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
    private xn1 zzm = so1.f16499e;

    static {
        uc ucVar = new uc();
        zzo = ucVar;
        qn1.u(uc.class, ucVar);
    }

    public static rc A() {
        return (rc) zzo.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
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
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzl = str;
    }

    public final /* synthetic */ void H(int i4) {
        this.zzn = i4 - 1;
        this.zza |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", tc.class, "zzn", qc.f15291c});
        }
        if (iC == 3) {
            return new uc();
        }
        if (iC == 4) {
            return new rc(zzo);
        }
        if (iC == 5) {
            return zzo;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzp;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (uc.class) {
            try {
                pn1Var = zzp;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzo);
                    zzp = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
