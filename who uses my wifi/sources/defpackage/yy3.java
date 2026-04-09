package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yy3 extends p54 {
    private static final yy3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private az3 zzc;
    private a54 zzd = a54.g;

    static {
        yy3 yy3Var = new yy3();
        zze = yy3Var;
        p54.u(yy3.class, yy3Var);
    }

    public static yy3 D(a54 a54Var, h54 h54Var) {
        return (yy3) p54.m(zze, a54Var, h54Var);
    }

    public static xy3 E() {
        return (xy3) zze.r();
    }

    public static n64 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final az3 B() {
        az3 az3Var = this.zzc;
        return az3Var == null ? az3.G() : az3Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(az3 az3Var) {
        this.zzc = az3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(y44 y44Var) {
        this.zzd = y44Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new yy3();
        }
        if (iS == 4) {
            return new xy3(zze);
        }
        if (iS == 5) {
            return zze;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzf;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (yy3.class) {
            try {
                o54Var = zzf;
                if (o54Var == null) {
                    o54Var = new o54(zze);
                    zzf = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
