package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yx1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final yx1 zzj;
    private static volatile n64 zzk;
    private int zze;
    private ux1 zzf;
    private int zzg = 1000;
    private xx1 zzh;
    private sx1 zzi;

    static {
        yx1 yx1Var = new yx1();
        zzj = yx1Var;
        p54.u(yx1.class, yx1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", tq1.w, "zzh", "zzi"});
        }
        if (iS == 3) {
            return new yx1();
        }
        if (iS == 4) {
            return new vq1(zzj);
        }
        if (iS == 5) {
            return zzj;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzk;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (yx1.class) {
            try {
                o54Var = zzk;
                if (o54Var == null) {
                    o54Var = new o54(zzj);
                    zzk = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
