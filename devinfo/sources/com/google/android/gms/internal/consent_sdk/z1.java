package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z1 extends w5 {
    private static final z1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        w5.l(z1.class, z1Var);
    }

    public static y1 m() {
        return (y1) zzb.g();
    }

    public static /* synthetic */ void n(z1 z1Var, String str) {
        str.getClass();
        z1Var.zzd |= 1;
        z1Var.zze = str;
    }

    public static /* synthetic */ void o(z1 z1Var, String str) {
        str.getClass();
        z1Var.zzd |= 2;
        z1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new z1();
        }
        if (i10 == 4) {
            return new y1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
