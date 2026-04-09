package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dz3 extends p54 {
    private static final dz3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private a54 zzc = a54.g;
    private fz3 zzd;

    static {
        dz3 dz3Var = new dz3();
        zze = dz3Var;
        p54.u(dz3.class, dz3Var);
    }

    public static dz3 D(a54 a54Var, h54 h54Var) {
        return (dz3) p54.m(zze, a54Var, h54Var);
    }

    public static cz3 E() {
        return (cz3) zze.r();
    }

    public static n64 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final a54 B() {
        return this.zzc;
    }

    public final fz3 C() {
        fz3 fz3Var = this.zzd;
        return fz3Var == null ? fz3.E() : fz3Var;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        this.zzc = a54Var;
    }

    public final /* synthetic */ void H(fz3 fz3Var) {
        this.zzd = fz3Var;
        this.zza |= 1;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new dz3();
        }
        if (iS == 4) {
            return new cz3(zze);
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
        synchronized (dz3.class) {
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
