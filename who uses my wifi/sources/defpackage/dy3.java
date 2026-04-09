package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dy3 extends p54 {
    private static final dy3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private hy3 zzc;
    private a54 zzd = a54.g;

    static {
        dy3 dy3Var = new dy3();
        zze = dy3Var;
        p54.u(dy3.class, dy3Var);
    }

    public static dy3 D(a54 a54Var, h54 h54Var) {
        return (dy3) p54.m(zze, a54Var, h54Var);
    }

    public static cy3 E() {
        return (cy3) zze.r();
    }

    public static n64 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final hy3 B() {
        hy3 hy3Var = this.zzc;
        return hy3Var == null ? hy3.C() : hy3Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(hy3 hy3Var) {
        this.zzc = hy3Var;
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
            return new dy3();
        }
        if (iS == 4) {
            return new cy3(zze);
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
        synchronized (dy3.class) {
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
