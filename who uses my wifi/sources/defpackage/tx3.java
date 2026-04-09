package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tx3 extends p54 {
    private static final tx3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private xx3 zzc;
    private iz3 zzd;

    static {
        tx3 tx3Var = new tx3();
        zze = tx3Var;
        p54.u(tx3.class, tx3Var);
    }

    public static tx3 D(a54 a54Var, h54 h54Var) {
        return (tx3) p54.m(zze, a54Var, h54Var);
    }

    public static sx3 E() {
        return (sx3) zze.r();
    }

    public static n64 F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final xx3 B() {
        xx3 xx3Var = this.zzc;
        return xx3Var == null ? xx3.E() : xx3Var;
    }

    public final iz3 C() {
        iz3 iz3Var = this.zzd;
        return iz3Var == null ? iz3.F() : iz3Var;
    }

    public final /* synthetic */ void G(xx3 xx3Var) {
        this.zzc = xx3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(iz3 iz3Var) {
        this.zzd = iz3Var;
        this.zza |= 2;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new tx3();
        }
        if (iS == 4) {
            return new sx3(zze);
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
        synchronized (tx3.class) {
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
