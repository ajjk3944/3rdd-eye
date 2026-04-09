package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qr1 extends qn1 {
    private static final qr1 zzl;
    private static volatile po1 zzm;
    private int zza;
    private bn1 zzb = bn1.f9729b;
    private un1 zzc;
    private long zzd;
    private un1 zze;
    private xn1 zzf;
    private String zzg;
    private xn1 zzh;
    private rr1 zzi;
    private sr1 zzj;
    private wl1 zzk;

    static {
        qr1 qr1Var = new qr1();
        zzl = qr1Var;
        qn1.u(qr1.class, qr1Var);
    }

    public qr1() {
        rn1 rn1Var = rn1.f15714e;
        this.zzc = rn1Var;
        this.zze = rn1Var;
        so1 so1Var = so1.f16499e;
        this.zzf = so1Var;
        this.zzg = "";
        this.zzh = so1Var;
    }

    public static qr1 A(byte[] bArr, jn1 jn1Var) throws ao1 {
        qn1 qn1VarY = qn1.y(zzl, bArr, bArr.length, jn1Var);
        qn1.z(qn1VarY);
        return (qr1) qn1VarY;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", lr1.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iC == 3) {
            return new qr1();
        }
        if (iC == 4) {
            return new bq1(zzl);
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
        synchronized (qr1.class) {
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
