package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h3 extends p1 {
    private static final h3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        p1.k(h3.class, h3Var);
    }

    public static /* synthetic */ void n(h3 h3Var, int i4) {
        h3Var.zzd |= 128;
        h3Var.zzl = i4;
    }

    public static /* synthetic */ void o(h3 h3Var, int i4) {
        h3Var.zzd |= 256;
        h3Var.zzm = i4;
    }

    public static /* synthetic */ void p(h3 h3Var, int i4) {
        h3Var.zzd |= 8;
        h3Var.zzh = i4;
    }

    public static /* synthetic */ void q(h3 h3Var, long j) {
        h3Var.zzd |= 16;
        h3Var.zzi = j;
    }

    public static /* synthetic */ void r(h3 h3Var, long j) {
        h3Var.zzd |= 32;
        h3Var.zzj = j;
    }

    public static /* synthetic */ void s(h3 h3Var) {
        h3Var.zzd |= 512;
        h3Var.zzn = 772604006L;
    }

    public static /* synthetic */ void t(h3 h3Var, String str) {
        str.getClass();
        h3Var.zzd |= 4;
        h3Var.zzg = str;
    }

    public static /* synthetic */ void u(h3 h3Var) {
        h3Var.zzd |= 64;
        h3Var.zzk = false;
    }

    public static /* synthetic */ void v(h3 h3Var) {
        h3Var.zzd |= 1;
        h3Var.zze = "8.0.0";
    }

    public static /* synthetic */ void w(h3 h3Var, String str) {
        h3Var.zzd |= 2;
        h3Var.zzf = str;
    }

    public static g3 x() {
        return (g3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i10 == 3) {
            return new h3();
        }
        if (i10 == 4) {
            return new g3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
