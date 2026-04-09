package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uh1 extends qn1 {
    private static final uh1 zzf;
    private static volatile po1 zzg;
    private int zza;
    private oh1 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        uh1 uh1Var = new uh1();
        zzf = uh1Var;
        qn1.u(uh1.class, uh1Var);
    }

    public static th1 E() {
        return (th1) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final oh1 B() {
        oh1 oh1Var = this.zzb;
        return oh1Var == null ? oh1.E() : oh1Var;
    }

    public final int C() {
        return this.zzd;
    }

    public final ii1 D() {
        ii1 ii1VarA = ii1.a(this.zze);
        return ii1VarA == null ? ii1.UNRECOGNIZED : ii1VarA;
    }

    public final /* synthetic */ void F(oh1 oh1Var) {
        this.zzb = oh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i4) {
        this.zzd = i4;
    }

    public final /* synthetic */ void H(ii1 ii1Var) {
        this.zze = ii1Var.b();
    }

    public final int I() {
        int i4 = this.zzc;
        int i10 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void J(int i4) {
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
            return new to1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new uh1();
        }
        if (iC == 4) {
            return new th1(zzf);
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
        synchronized (uh1.class) {
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
