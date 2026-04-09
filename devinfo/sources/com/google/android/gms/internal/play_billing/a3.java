package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a3 extends p1 {
    private static final a3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        a3 a3Var = new a3();
        zzb = a3Var;
        p1.k(a3.class, a3Var);
    }

    public static void o(a3 a3Var, e3 e3Var) {
        a3Var.zzh = e3Var.f20115a;
        a3Var.zzd |= 2;
    }

    public static /* synthetic */ void p(a3 a3Var, n3 n3Var) {
        a3Var.zzf = n3Var;
        a3Var.zze = 4;
    }

    public static /* synthetic */ void q(a3 a3Var, v3 v3Var) {
        a3Var.zzf = v3Var;
        a3Var.zze = 3;
    }

    public static /* synthetic */ void r(a3 a3Var, int i4) {
        a3Var.zzg = i4 - 1;
        a3Var.zzd |= 1;
    }

    public static z2 s() {
        return (z2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", a1.f20074c, j3.class, v3.class, n3.class, "zzh", a1.f20076e});
        }
        if (i10 == 3) {
            return new a3();
        }
        if (i10 == 4) {
            return new z2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final n3 n() {
        return this.zze == 4 ? (n3) this.zzf : n3.o();
    }
}
