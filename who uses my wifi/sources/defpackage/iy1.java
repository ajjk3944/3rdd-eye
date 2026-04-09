package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iy1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final iy1 zzh;
    private static volatile n64 zzi;
    private int zzd;
    private int zze = 1000;
    private xx1 zzf;
    private sx1 zzg;

    static {
        iy1 iy1Var = new iy1();
        zzh = iy1Var;
        p54.u(iy1.class, iy1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", tq1.w, "zzf", "zzg"});
        }
        if (iS == 3) {
            return new iy1();
        }
        if (iS == 4) {
            return new vq1(zzh);
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
        synchronized (iy1.class) {
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
