package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ry1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ry1 zzh;
    private static volatile n64 zzi;
    private int zzd;
    private String zze = "";
    private x54 zzf = q64.j;
    private int zzg;

    static {
        ry1 ry1Var = new ry1();
        zzh = ry1Var;
        p54.u(ry1.class, ry1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", qy1.class, "zzg", tq1.w});
        }
        if (iS == 3) {
            return new ry1();
        }
        if (iS == 4) {
            return new jy1(zzh);
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
        synchronized (ry1.class) {
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
