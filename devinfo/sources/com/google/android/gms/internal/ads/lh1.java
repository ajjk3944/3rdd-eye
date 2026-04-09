package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lh1 extends qn1 {
    private static final lh1 zzc;
    private static volatile po1 zzd;
    private int zza;
    private int zzb;

    static {
        lh1 lh1Var = new lh1();
        zzc = lh1Var;
        qn1.u(lh1.class, lh1Var);
    }

    public static kh1 C() {
        return (kh1) zzc.r();
    }

    public static lh1 D() {
        return zzc;
    }

    public final fh1 A() {
        fh1 fh1VarA = fh1.a(this.zza);
        return fh1VarA == null ? fh1.UNRECOGNIZED : fh1VarA;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(fh1 fh1Var) {
        this.zza = fh1Var.b();
    }

    public final /* synthetic */ void F(int i4) {
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new lh1();
        }
        if (iC == 4) {
            return new kh1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzd;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (lh1.class) {
            try {
                pn1Var = zzd;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzc);
                    zzd = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
