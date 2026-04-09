package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qi extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final qi zzf;
    private static volatile po1 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        qi qiVar = new qi();
        zzf = qiVar;
        qn1.u(qi.class, qiVar);
    }

    public static pi A() {
        return (pi) zzf.r();
    }

    public final void B(int i4) {
        this.zzd = i3.e.c(i4);
        this.zzc |= 1;
    }

    public final void C(int i4) {
        int i10 = 1;
        if (i4 == 1) {
            i10 = 0;
        } else if (i4 != 2) {
            if (i4 != 3) {
                i10 = 4;
                if (i4 != 4) {
                    throw null;
                }
            } else {
                i10 = 2;
            }
        }
        this.zze = i10;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", qc.f15304r, "zze", qc.f15303q});
        }
        if (iC == 3) {
            return new qi();
        }
        if (iC == 4) {
            return new pi(zzf);
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
        synchronized (qi.class) {
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
