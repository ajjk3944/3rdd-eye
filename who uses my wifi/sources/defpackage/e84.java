package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e84 extends p54 {
    private static final e84 zzf;
    private static volatile n64 zzg;
    private int zza;
    private d84 zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        e84 e84Var = new e84();
        zzf = e84Var;
        p54.u(e84.class, e84Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new e84();
        }
        if (iS == 4) {
            return new jy1(zzf);
        }
        if (iS == 5) {
            return zzf;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzg;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (e84.class) {
            try {
                o54Var = zzg;
                if (o54Var == null) {
                    o54Var = new o54(zzf);
                    zzg = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
