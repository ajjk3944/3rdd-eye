package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ta3 extends p54 {
    private static final ta3 zzg;
    private static volatile n64 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        ta3 ta3Var = new ta3();
        zzg = ta3Var;
        p54.u(ta3.class, ta3Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iS == 3) {
            return new ta3();
        }
        if (iS == 4) {
            return new jy1(zzg);
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
        synchronized (ta3.class) {
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
