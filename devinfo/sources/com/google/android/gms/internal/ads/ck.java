package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ck extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final ck zzl;
    private static volatile po1 zzm;
    private int zzf;
    private String zzg = "";
    private xn1 zzh = so1.f16499e;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        ck ckVar = new ck();
        zzl = ckVar;
        qn1.u(ck.class, ckVar);
    }

    public static ck A() {
        return zzl;
    }

    public final void B(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            qc qcVar = qc.f15310x;
            return new to1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zj.class, "zzi", qcVar, "zzj", qcVar, "zzk", qcVar});
        }
        if (iC == 3) {
            return new ck();
        }
        if (iC == 4) {
            return new bk(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzm;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ck.class) {
            try {
                pn1Var = zzm;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzl);
                    zzm = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
