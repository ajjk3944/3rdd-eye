package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wy1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final wy1 zzv;
    private static volatile n64 zzw;
    private int zzi;
    private sx1 zzk;
    private int zzl;
    private ux1 zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        wy1 wy1Var = new wy1();
        zzv = wy1Var;
        p54.u(wy1.class, wy1Var);
    }

    public static wy1 A() {
        return zzv;
    }

    public final void B(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void C(ux1 ux1Var) {
        this.zzm = ux1Var;
        this.zzi |= 8;
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
            return new r64(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", tq1Var, "zzp", tq1Var, "zzu", tq1Var});
        }
        if (iS == 3) {
            return new wy1();
        }
        if (iS == 4) {
            return new vy1(zzv);
        }
        if (iS == 5) {
            return zzv;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzw;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (wy1.class) {
            try {
                o54Var = zzw;
                if (o54Var == null) {
                    o54Var = new o54(zzv);
                    zzw = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
