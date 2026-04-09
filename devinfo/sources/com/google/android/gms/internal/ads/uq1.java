package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uq1 extends qn1 {
    private static final uq1 zzf;
    private static volatile po1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private bn1 zzd;
    private bn1 zze;

    static {
        uq1 uq1Var = new uq1();
        zzf = uq1Var;
        qn1.u(uq1.class, uq1Var);
    }

    public uq1() {
        zm1 zm1Var = bn1.f9729b;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static tq1 A() {
        return (tq1) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void C(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final /* synthetic */ void D(int i4) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", wp1.j, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new uq1();
        }
        if (iC == 4) {
            return new tq1(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzg;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (uq1.class) {
            try {
                pn1Var = zzg;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzf);
                    zzg = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
