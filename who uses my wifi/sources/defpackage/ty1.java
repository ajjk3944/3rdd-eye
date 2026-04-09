package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ty1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final ty1 zzl;
    private static volatile n64 zzm;
    private int zzf;
    private String zzg = "";
    private x54 zzh = q64.j;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        ty1 ty1Var = new ty1();
        zzl = ty1Var;
        p54.u(ty1.class, ty1Var);
    }

    public static ty1 A() {
        return zzl;
    }

    public final void B(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            tq1 tq1Var = tq1.w;
            return new r64(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", qy1.class, "zzi", tq1Var, "zzj", tq1Var, "zzk", tq1Var});
        }
        if (iS == 3) {
            return new ty1();
        }
        if (iS == 4) {
            return new sy1(zzl);
        }
        if (iS == 5) {
            return zzl;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzm;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (ty1.class) {
            try {
                o54Var = zzm;
                if (o54Var == null) {
                    o54Var = new o54(zzl);
                    zzm = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
