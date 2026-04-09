package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class er1 extends p54 {
    public static final /* synthetic */ int a = 0;
    private static final er1 zzg;
    private static volatile n64 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        er1 er1Var = new er1();
        zzg = er1Var;
        p54.u(er1.class, er1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iS == 3) {
            return new er1();
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
        synchronized (er1.class) {
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
