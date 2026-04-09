package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r04 extends p54 {
    private static final r04 zzf;
    private static volatile n64 zzg;
    private int zza;
    private int zzb;
    private n04 zzc;
    private a54 zzd;
    private a54 zze;

    static {
        r04 r04Var = new r04();
        zzf = r04Var;
        p54.u(r04.class, r04Var);
    }

    public r04() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
    }

    public static r04 E(a54 a54Var, h54 h54Var) {
        return (r04) p54.m(zzf, a54Var, h54Var);
    }

    public static q04 F() {
        return (q04) zzf.r();
    }

    public static r04 G() {
        return zzf;
    }

    public static n64 H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final n04 B() {
        n04 n04Var = this.zzc;
        return n04Var == null ? n04.C() : n04Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final a54 D() {
        return this.zze;
    }

    public final /* synthetic */ void I(n04 n04Var) {
        this.zzc = n04Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(y44 y44Var) {
        this.zzd = y44Var;
    }

    public final /* synthetic */ void K(y44 y44Var) {
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
            return new r04();
        }
        if (iS == 4) {
            return new q04(zzf);
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
        synchronized (r04.class) {
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
