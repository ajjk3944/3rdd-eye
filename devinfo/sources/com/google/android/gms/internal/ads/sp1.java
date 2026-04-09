package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sp1 extends qn1 {
    private static final sp1 zzd;
    private static volatile po1 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        sp1 sp1Var = new sp1();
        zzd = sp1Var;
        qn1.u(sp1.class, sp1Var);
    }

    public static rp1 A() {
        return (rp1) zzd.r();
    }

    public final /* synthetic */ void B(int i4) {
        this.zza = i4;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new sp1();
        }
        if (iC == 4) {
            return new rp1(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zze;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (sp1.class) {
            try {
                pn1Var = zze;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzd);
                    zze = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
