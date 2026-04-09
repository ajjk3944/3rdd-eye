package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wa3 extends p54 {
    private static final wa3 zze;
    private static volatile n64 zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        wa3 wa3Var = new wa3();
        zze = wa3Var;
        p54.u(wa3.class, wa3Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new wa3();
        }
        if (iS == 4) {
            return new jy1(zze);
        }
        if (iS == 5) {
            return zze;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzf;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (wa3.class) {
            try {
                o54Var = zzf;
                if (o54Var == null) {
                    o54Var = new o54(zze);
                    zzf = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
