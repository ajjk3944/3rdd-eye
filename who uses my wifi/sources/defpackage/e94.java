package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e94 extends p54 {
    private static final e94 zzh;
    private static volatile n64 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private t54 zzd = q54.j;
    private x54 zzf = q64.j;
    private a54 zzg = a54.g;

    static {
        e94 e94Var = new e94();
        zzh = e94Var;
        p54.u(e94.class, e94Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", d94.class, "zzg"});
        }
        if (iS == 3) {
            return new e94();
        }
        if (iS == 4) {
            return new c84(zzh);
        }
        if (iS == 5) {
            return zzh;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzi;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (e94.class) {
            try {
                o54Var = zzi;
                if (o54Var == null) {
                    o54Var = new o54(zzh);
                    zzi = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
