package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c2 extends w5 {
    private static final c2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        c2 c2Var = new c2();
        zzb = c2Var;
        w5.l(c2.class, c2Var);
    }

    public static b2 m() {
        return (b2) zzb.g();
    }

    public static /* synthetic */ void n(c2 c2Var, int i4) {
        c2Var.zzd |= 8;
        c2Var.zzh = i4;
    }

    public static /* synthetic */ void o(c2 c2Var) {
        String str = Build.MODEL;
        str.getClass();
        c2Var.zzd |= 4;
        c2Var.zzg = str;
    }

    public static /* synthetic */ void p(c2 c2Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        c2Var.zzd |= 2;
        c2Var.zzf = str;
    }

    public static /* synthetic */ void q(c2 c2Var) {
        c2Var.zze = 1;
        c2Var.zzd = 1 | c2Var.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new c2();
        }
        if (i10 == 4) {
            return new b2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
