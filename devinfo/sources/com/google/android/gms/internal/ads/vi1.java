package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vi1 extends qn1 {
    private static final vi1 zzd;
    private static volatile po1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        vi1 vi1Var = new vi1();
        zzd = vi1Var;
        qn1.u(vi1.class, vi1Var);
    }

    public static ui1 D() {
        return (ui1) zzd.r();
    }

    public static vi1 E() {
        return zzd;
    }

    public final fh1 A() {
        fh1 fh1VarA = fh1.a(this.zza);
        return fh1VarA == null ? fh1.UNRECOGNIZED : fh1VarA;
    }

    public final fh1 B() {
        fh1 fh1VarA = fh1.a(this.zzb);
        return fh1VarA == null ? fh1.UNRECOGNIZED : fh1VarA;
    }

    public final int C() {
        return this.zzc;
    }

    public final /* synthetic */ void F(fh1 fh1Var) {
        this.zza = fh1Var.b();
    }

    public final /* synthetic */ void G(fh1 fh1Var) {
        this.zzb = fh1Var.b();
    }

    public final /* synthetic */ void H(int i4) {
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new vi1();
        }
        if (iC == 4) {
            return new ui1(zzd);
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
        synchronized (vi1.class) {
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
