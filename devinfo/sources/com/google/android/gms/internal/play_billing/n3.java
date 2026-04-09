package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n3 extends p1 {
    private static final n3 zzb;
    private int zzd;
    private t1 zze = j2.f20161e;
    private String zzf = "";
    private boolean zzg;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        p1.k(n3.class, n3Var);
    }

    public static /* synthetic */ void n(n3 n3Var, boolean z3) {
        n3Var.zzd |= 2;
        n3Var.zzg = z3;
    }

    public static n3 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", m3.class, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new n3();
        }
        if (i10 == 4) {
            return new l3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
