package com.google.android.gms.internal.ads;

import android.os.Build;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pc extends qn1 {
    private static final pc zzn;
    private static volatile po1 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private xn1 zzb = so1.f16499e;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        pc pcVar = new pc();
        zzn = pcVar;
        qn1.u(pc.class, pcVar);
    }

    public static oc A() {
        return (oc) zzn.r();
    }

    public final void B(xc xcVar) {
        xn1 xn1Var = this.zzb;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzb = xn1Var.n(size + size);
        }
        this.zzb.add(xcVar);
    }

    public final void C() {
        this.zzb = so1.f16499e;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 1;
        this.zzc = j;
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

    public final /* synthetic */ void I(long j) {
        this.zza |= 64;
        this.zzi = j;
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

    public final /* synthetic */ void L(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= Segment.SHARE_MINIMUM;
        this.zzm = j;
    }

    public final /* synthetic */ void N(int i4) {
        this.zzg = i4 - 1;
        this.zza |= 16;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", xc.class, "zzc", "zzd", "zze", "zzf", "zzg", qc.f15292d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new pc();
        }
        if (iC == 4) {
            return new oc(zzn);
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
        synchronized (pc.class) {
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
