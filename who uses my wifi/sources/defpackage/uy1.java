package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uy1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final uy1 zzn;
    private static volatile n64 zzo;
    private int zzg;
    private int zzh;
    private sx1 zzi;
    private sx1 zzj;
    private sx1 zzk;
    private x54 zzl = q64.j;
    private int zzm;

    static {
        uy1 uy1Var = new uy1();
        zzn = uy1Var;
        p54.u(uy1.class, uy1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", sx1.class, "zzm"});
        }
        if (iS == 3) {
            return new uy1();
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
        synchronized (uy1.class) {
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
