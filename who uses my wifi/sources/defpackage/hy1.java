package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hy1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final hy1 zzl;
    private static volatile n64 zzm;
    private int zzf;
    private int zzg = 1000;
    private xx1 zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        hy1 hy1Var = new hy1();
        zzl = hy1Var;
        p54.u(hy1.class, hy1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", tq1.w, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iS == 3) {
            return new hy1();
        }
        if (iS == 4) {
            return new vq1(zzl);
        }
        if (iS == 5) {
            return zzl;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzm;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (hy1.class) {
            try {
                o54Var = zzm;
                if (o54Var == null) {
                    o54Var = new o54(zzl);
                    zzm = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
