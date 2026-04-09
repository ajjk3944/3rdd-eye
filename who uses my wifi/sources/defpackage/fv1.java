package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fv1 extends p54 {
    private static final fv1 zzg;
    private static volatile n64 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        fv1 fv1Var = new fv1();
        zzg = fv1Var;
        p54.u(fv1.class, fv1Var);
    }

    public static fv1 F(y44 y44Var) {
        fv1 fv1Var = zzg;
        h54 h54Var = h54.a;
        int i = u44.a;
        p54 p54VarM = p54.m(fv1Var, y44Var, h54.b);
        p54.z(p54VarM);
        return (fv1) p54VarM;
    }

    public static fv1 G(y44 y44Var, h54 h54Var) {
        return (fv1) p54.m(zzg, y44Var, h54Var);
    }

    public static ev1 H() {
        return (ev1) zzg.r();
    }

    public static fv1 I() {
        return zzg;
    }

    public final String A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iS == 3) {
            return new fv1();
        }
        if (iS == 4) {
            return new ev1(zzg);
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
        synchronized (fv1.class) {
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
