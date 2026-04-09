package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pv0 extends qn1 {
    private static final pv0 zzf;
    private static volatile po1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private nv0 zze;

    static {
        pv0 pv0Var = new pv0();
        zzf = pv0Var;
        qn1.u(pv0.class, pv0Var);
    }

    public static ov0 A() {
        return (ov0) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void C(nv0 nv0Var) {
        this.zze = nv0Var;
        this.zza |= 8;
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
            return new to1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", qc.f15312z, "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new pv0();
        }
        if (iC == 4) {
            return new ov0(zzf);
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
        synchronized (pv0.class) {
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
