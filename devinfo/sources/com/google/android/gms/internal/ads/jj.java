package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jj extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final jj zzh;
    private static volatile po1 zzi;
    private int zzd;
    private int zze;
    private mj zzf;
    private oj zzg;

    static {
        jj jjVar = new jj();
        zzh = jjVar;
        qn1.u(jj.class, jjVar);
    }

    public static ij B() {
        return (ij) zzh.r();
    }

    public final void A(oj ojVar) {
        this.zzg = ojVar;
        this.zzd |= 4;
    }

    public final void C() {
        this.zze = i3.e.c(2);
        this.zzd |= 1;
    }

    public final void D(mj mjVar) {
        mjVar.getClass();
        this.zzf = mjVar;
        this.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", qc.f15307u, "zzf", "zzg"});
        }
        if (iC == 3) {
            return new jj();
        }
        if (iC == 4) {
            return new ij(zzh);
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
        synchronized (jj.class) {
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
