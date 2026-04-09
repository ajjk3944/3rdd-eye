package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i2 extends w5 {
    private static final i2 zzb;
    private int zzd;
    private e2 zze;
    private h2 zzg;
    private c2 zzh;
    private z1 zzi;
    private String zzf = "";
    private z5 zzj = o6.f19454e;

    static {
        i2 i2Var = new i2();
        zzb = i2Var;
        w5.l(i2.class, i2Var);
    }

    public static a2 m() {
        return (a2) zzb.g();
    }

    public static void n(i2 i2Var, String str) {
        str.getClass();
        z5 z5Var = i2Var.zzj;
        if (!((m5) z5Var).f19438a) {
            int size = z5Var.size();
            i2Var.zzj = z5Var.e(size + size);
        }
        i2Var.zzj.add(str);
    }

    public static /* synthetic */ void o(i2 i2Var, String str) {
        i2Var.zzd |= 2;
        i2Var.zzf = str;
    }

    public static /* synthetic */ void p(i2 i2Var, z1 z1Var) {
        i2Var.zzi = z1Var;
        i2Var.zzd |= 16;
    }

    public static /* synthetic */ void q(i2 i2Var, c2 c2Var) {
        i2Var.zzh = c2Var;
        i2Var.zzd |= 8;
    }

    public static /* synthetic */ void r(i2 i2Var, e2 e2Var) {
        i2Var.zze = e2Var;
        i2Var.zzd |= 1;
    }

    public static /* synthetic */ void s(i2 i2Var, h2 h2Var) {
        i2Var.zzg = h2Var;
        i2Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new i2();
        }
        if (i10 == 4) {
            return new a2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
