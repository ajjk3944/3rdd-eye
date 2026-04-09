package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p3 extends p1 {
    private static final p3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private h3 zzg;
    private i3 zzh;

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        p1.k(p3.class, p3Var);
    }

    public static /* synthetic */ void n(p3 p3Var, y2 y2Var) {
        p3Var.zzf = y2Var;
        p3Var.zze = 2;
    }

    public static /* synthetic */ void o(p3 p3Var, a3 a3Var) {
        p3Var.zzf = a3Var;
        p3Var.zze = 3;
    }

    public static /* synthetic */ void p(p3 p3Var, d3 d3Var) {
        d3Var.getClass();
        p3Var.zzf = d3Var;
        p3Var.zze = 7;
    }

    public static /* synthetic */ void q(p3 p3Var, h3 h3Var) {
        h3Var.getClass();
        p3Var.zzg = h3Var;
        p3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(p3 p3Var, s3 s3Var) {
        p3Var.zzf = s3Var;
        p3Var.zze = 8;
    }

    public static /* synthetic */ void s(p3 p3Var, t3 t3Var) {
        p3Var.zzf = t3Var;
        p3Var.zze = 4;
    }

    public static o3 t() {
        return (o3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", y2.class, a3.class, t3.class, f3.class, "zzh", d3.class, s3.class});
        }
        if (i10 == 3) {
            return new p3();
        }
        if (i10 == 4) {
            return new o3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
