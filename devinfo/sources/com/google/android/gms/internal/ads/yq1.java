package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yq1 extends qn1 {
    private static final yq1 zzj;
    private static volatile po1 zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        yq1 yq1Var = new yq1();
        zzj = yq1Var;
        qn1.u(yq1.class, yq1Var);
    }

    public static xq1 A() {
        return (xq1) zzj.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void D(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", wp1.f18131m, "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new yq1();
        }
        if (iC == 4) {
            return new xq1(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzk;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (yq1.class) {
            try {
                pn1Var = zzk;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzj);
                    zzk = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
