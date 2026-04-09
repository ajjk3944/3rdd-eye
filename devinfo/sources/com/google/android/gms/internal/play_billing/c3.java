package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c3 extends p1 {
    private static final c3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        c3 c3Var = new c3();
        zzb = c3Var;
        p1.k(c3.class, c3Var);
    }

    public static /* synthetic */ void n(c3 c3Var, String str) {
        c3Var.zzd |= 8;
        c3Var.zzh = str;
    }

    public static /* synthetic */ void o(c3 c3Var, String str) {
        str.getClass();
        c3Var.zzd |= 2;
        c3Var.zzf = str;
    }

    public static /* synthetic */ void p(c3 c3Var, int i4) {
        c3Var.zzd |= 16;
        c3Var.zzi = i4;
    }

    public static void q(c3 c3Var, int i4) {
        c3Var.zzg = d7.g(i4);
        c3Var.zzd |= 4;
    }

    public static /* synthetic */ void r(c3 c3Var, int i4) {
        c3Var.zzd |= 1;
        c3Var.zze = i4;
    }

    public static b3 s() {
        return (b3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", a1.f20075d, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new c3();
        }
        if (i10 == 4) {
            return new b3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
