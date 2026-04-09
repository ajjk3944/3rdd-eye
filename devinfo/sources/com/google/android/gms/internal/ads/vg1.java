package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vg1 extends qn1 {
    private static final vg1 zzd;
    private static volatile po1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        vg1 vg1Var = new vg1();
        zzd = vg1Var;
        qn1.u(vg1.class, vg1Var);
    }

    public static ug1 B() {
        return (ug1) zzd.r();
    }

    public static vg1 C() {
        return zzd;
    }

    public final fh1 A() {
        fh1 fh1VarA = fh1.a(this.zza);
        return fh1VarA == null ? fh1.UNRECOGNIZED : fh1VarA;
    }

    public final /* synthetic */ void D(fh1 fh1Var) {
        this.zza = fh1Var.b();
    }

    public final int E() {
        int i4 = this.zzb;
        int i10 = i4 != 0 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int F() {
        int i4 = this.zzc;
        int i10 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void G(int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzb = i4 - 2;
    }

    public final void H(int i4) {
        if (i4 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzc = i4 - 2;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new vg1();
        }
        if (iC == 4) {
            return new ug1(zzd);
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
        synchronized (vg1.class) {
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
