package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m3 extends p1 {
    private static final m3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        p1.k(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", a1.f20078h, "zzf"});
        }
        if (i10 == 3) {
            return new m3();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
