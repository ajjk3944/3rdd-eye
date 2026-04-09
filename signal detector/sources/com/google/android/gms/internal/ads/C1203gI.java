package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203gI extends AbstractC1096eL {
    private static final C1203gI zzf;
    private static volatile CL zzg;
    private int zza;
    private C0875aI zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C1203gI c1203gI = new C1203gI();
        zzf = c1203gI;
        AbstractC1096eL.u(C1203gI.class, c1203gI);
    }

    public static C1148fI E() {
        return (C1148fI) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C0875aI B() {
        C0875aI c0875aI = this.zzb;
        return c0875aI == null ? C0875aI.E() : c0875aI;
    }

    public final int C() {
        return this.zzd;
    }

    public final EnumC1956uI D() {
        EnumC1956uI enumC1956uIB = EnumC1956uI.b(this.zze);
        return enumC1956uIB == null ? EnumC1956uI.UNRECOGNIZED : enumC1956uIB;
    }

    public final /* synthetic */ void F(C0875aI c0875aI) {
        this.zzb = c0875aI;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void H(EnumC1956uI enumC1956uI) {
        this.zze = enumC1956uI.a();
    }

    public final int I() {
        int i = this.zzc;
        int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final void J(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new C1203gI();
        }
        if (iC == 4) {
            return new C1148fI(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (C1203gI.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
