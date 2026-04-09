package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v3 extends p1 {
    private static final v3 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        v3 v3Var = new v3();
        zzb = v3Var;
        p1.k(v3.class, v3Var);
    }

    public static /* synthetic */ void n(v3 v3Var, boolean z3) {
        v3Var.zzd |= 8;
        v3Var.zzh = z3;
    }

    public static /* synthetic */ void o(v3 v3Var) {
        v3Var.zzd |= 16;
        v3Var.zzi = 0;
    }

    public static /* synthetic */ void p(v3 v3Var, long j) {
        v3Var.zzd |= 4;
        v3Var.zzg = j;
    }

    public static /* synthetic */ void q(v3 v3Var) {
        v3Var.zzd |= 2;
        v3Var.zzf = true;
    }

    public static u3 r() {
        return (u3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new v3();
        }
        if (i10 == 4) {
            return new u3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
