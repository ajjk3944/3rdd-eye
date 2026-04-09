package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class px1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final px1 zzf;
    private static volatile n64 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        px1 px1Var = new px1();
        zzf = px1Var;
        p54.u(px1.class, px1Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new px1();
        }
        if (iS == 4) {
            return new vq1(zzf);
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
        synchronized (px1.class) {
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
