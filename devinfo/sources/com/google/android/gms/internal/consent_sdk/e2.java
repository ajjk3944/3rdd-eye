package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e2 extends w5 {
    private static final e2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        w5.l(e2.class, e2Var);
    }

    public static d2 m() {
        return (d2) zzb.g();
    }

    public static /* synthetic */ void n(e2 e2Var, String str) {
        e2Var.zzd |= 2;
        e2Var.zzf = str;
    }

    public static /* synthetic */ void o(e2 e2Var, long j) {
        e2Var.zzd |= 4;
        e2Var.zzg = j;
    }

    public static /* synthetic */ void p(e2 e2Var, int i4) {
        e2Var.zze = i4 - 2;
        e2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new e2();
        }
        if (i10 == 4) {
            return new d2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
