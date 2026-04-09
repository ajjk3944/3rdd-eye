package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w2 extends w5 {
    private static final w2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        w5.l(w2.class, w2Var);
    }

    public static v2 m() {
        return (v2) zzb.g();
    }

    public static /* synthetic */ void n(w2 w2Var, i2 i2Var) {
        w2Var.zzf = i2Var;
        w2Var.zze = 38;
    }

    public static /* synthetic */ void o(w2 w2Var, long j) {
        w2Var.zzd |= 1;
        w2Var.zzg = j;
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", y3.class, "zzg", k4.class, c3.class, h1.class, n3.class, n1.class, u2.class, k1.class, u1.class, f3.class, h3.class, a5.class, f4.class, h5.class, "zzh", g5.class, n4.class, x1.class, w4.class, u4.class, o1.class, j5.class, b5.class, i2.class});
        }
        if (i10 == 3) {
            return new w2();
        }
        if (i10 == 4) {
            return new v2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
