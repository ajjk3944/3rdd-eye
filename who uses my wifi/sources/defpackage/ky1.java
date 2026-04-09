package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ky1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final ky1 zzn;
    private static volatile n64 zzo;
    private int zzg;
    private int zzh = 1000;
    private xx1 zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        ky1 ky1Var = new ky1();
        zzn = ky1Var;
        p54.u(ky1.class, ky1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", tq1.w, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iS == 3) {
            return new ky1();
        }
        if (iS == 4) {
            return new jy1(zzn);
        }
        if (iS == 5) {
            return zzn;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzo;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (ky1.class) {
            try {
                o54Var = zzo;
                if (o54Var == null) {
                    o54Var = new o54(zzn);
                    zzo = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
