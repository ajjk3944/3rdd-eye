package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s3 extends p1 {
    private static final s3 zzb;
    private int zzd;
    private c3 zze;
    private long zzf;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        p1.k(s3.class, s3Var);
    }

    public static /* synthetic */ void n(s3 s3Var, c3 c3Var) {
        s3Var.zze = c3Var;
        s3Var.zzd |= 1;
    }

    public static /* synthetic */ void o(s3 s3Var, long j) {
        s3Var.zzd |= 2;
        s3Var.zzf = j;
    }

    public static r3 p() {
        return (r3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new s3();
        }
        if (i10 == 4) {
            return new r3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
