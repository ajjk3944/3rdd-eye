package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xy1 extends p54 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final xy1 zzj;
    private static volatile n64 zzk;
    private int zze;
    private int zzf;
    private ux1 zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        xy1 xy1Var = new xy1();
        zzj = xy1Var;
        p54.u(xy1.class, xy1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", tq1.v, "zzg", "zzh", "zzi"});
        }
        if (iS == 3) {
            return new xy1();
        }
        if (iS == 4) {
            return new jy1(zzj);
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
        synchronized (xy1.class) {
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
