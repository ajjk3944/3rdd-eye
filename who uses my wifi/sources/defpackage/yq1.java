package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yq1 extends p54 {
    private static final yq1 zzg;
    private static volatile n64 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        yq1 yq1Var = new yq1();
        zzg = yq1Var;
        p54.u(yq1.class, yq1Var);
    }

    public static yq1 F() {
        return zzg;
    }

    public final boolean A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzc;
    }

    public final boolean C() {
        return this.zzd;
    }

    public final boolean D() {
        return this.zze;
    }

    public final boolean E() {
        return this.zzf;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iS == 3) {
            return new yq1();
        }
        if (iS == 4) {
            return new vq1(zzg);
        }
        if (iS == 5) {
            return zzg;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzh;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (yq1.class) {
            try {
                o54Var = zzh;
                if (o54Var == null) {
                    o54Var = new o54(zzg);
                    zzh = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
