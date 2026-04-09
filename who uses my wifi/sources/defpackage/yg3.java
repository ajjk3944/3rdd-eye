package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yg3 extends p54 {
    private static final yg3 zzf;
    private static volatile n64 zzg;
    private int zza;
    private jh3 zzb;
    private a54 zzc;
    private a54 zzd;
    private int zze;

    static {
        yg3 yg3Var = new yg3();
        zzf = yg3Var;
        p54.u(yg3.class, yg3Var);
    }

    public yg3() {
        y44 y44Var = a54.g;
        this.zzc = y44Var;
        this.zzd = y44Var;
    }

    public static xg3 D() {
        return (xg3) zzf.r();
    }

    public final jh3 A() {
        jh3 jh3Var = this.zzb;
        return jh3Var == null ? jh3.E() : jh3Var;
    }

    public final a54 B() {
        return this.zzc;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(jh3 jh3Var) {
        this.zzb = jh3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(a54 a54Var) {
        a54Var.getClass();
        this.zza |= 2;
        this.zzc = a54Var;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        a54Var.getClass();
        this.zza |= 4;
        this.zzd = a54Var;
    }

    public final int H() {
        int iT = yb.t(this.zze);
        if (iT == 0) {
            return 1;
        }
        return iT;
    }

    public final /* synthetic */ void I(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", tq1.A});
        }
        if (iS == 3) {
            return new yg3();
        }
        if (iS == 4) {
            return new xg3(zzf);
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
        synchronized (yg3.class) {
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
