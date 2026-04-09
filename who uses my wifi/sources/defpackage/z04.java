package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z04 extends p54 {
    private static final z04 zzf;
    private static volatile n64 zzg;
    private int zza;
    private int zzb;
    private v04 zzc;
    private a54 zzd;
    private a54 zze;

    static {
        z04 z04Var = new z04();
        zzf = z04Var;
        p54.u(z04.class, z04Var);
    }

    public z04() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
    }

    public static z04 E(a54 a54Var, h54 h54Var) {
        return (z04) p54.m(zzf, a54Var, h54Var);
    }

    public static y04 F() {
        return (y04) zzf.r();
    }

    public static z04 G() {
        return zzf;
    }

    public static n64 H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final v04 B() {
        v04 v04Var = this.zzc;
        return v04Var == null ? v04.E() : v04Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final a54 D() {
        return this.zze;
    }

    public final /* synthetic */ void I(int i) {
        this.zzb = 0;
    }

    public final /* synthetic */ void J(v04 v04Var) {
        this.zzc = v04Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void K(y44 y44Var) {
        this.zzd = y44Var;
    }

    public final /* synthetic */ void L(y44 y44Var) {
        this.zze = y44Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iS == 3) {
            return new z04();
        }
        if (iS == 4) {
            return new y04(zzf);
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
        synchronized (z04.class) {
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
