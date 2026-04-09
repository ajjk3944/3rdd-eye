package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x04 extends p54 {
    private static final x04 zzj;
    private static volatile n64 zzk;
    private int zza;
    private int zzb;
    private z04 zzc;
    private a54 zzd;
    private a54 zze;
    private a54 zzf;
    private a54 zzg;
    private a54 zzh;
    private a54 zzi;

    static {
        x04 x04Var = new x04();
        zzj = x04Var;
        p54.u(x04.class, x04Var);
    }

    public x04() {
        y44 y44Var = a54.g;
        this.zzd = y44Var;
        this.zze = y44Var;
        this.zzf = y44Var;
        this.zzg = y44Var;
        this.zzh = y44Var;
        this.zzi = y44Var;
    }

    public static x04 I(a54 a54Var, h54 h54Var) {
        return (x04) p54.m(zzj, a54Var, h54Var);
    }

    public static w04 J() {
        return (w04) zzj.r();
    }

    public static n64 K() {
        return zzj.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final z04 B() {
        z04 z04Var = this.zzc;
        return z04Var == null ? z04.G() : z04Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final a54 D() {
        return this.zze;
    }

    public final a54 E() {
        return this.zzf;
    }

    public final a54 F() {
        return this.zzg;
    }

    public final a54 G() {
        return this.zzh;
    }

    public final a54 H() {
        return this.zzi;
    }

    public final /* synthetic */ void L() {
        this.zzb = 0;
    }

    public final /* synthetic */ void M(z04 z04Var) {
        this.zzc = z04Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void N(y44 y44Var) {
        this.zzd = y44Var;
    }

    public final /* synthetic */ void O(y44 y44Var) {
        this.zze = y44Var;
    }

    public final /* synthetic */ void P(y44 y44Var) {
        this.zzf = y44Var;
    }

    public final /* synthetic */ void Q(y44 y44Var) {
        this.zzg = y44Var;
    }

    public final /* synthetic */ void R(y44 y44Var) {
        this.zzh = y44Var;
    }

    public final /* synthetic */ void S(y44 y44Var) {
        this.zzi = y44Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iS == 3) {
            return new x04();
        }
        if (iS == 4) {
            return new w04(zzj);
        }
        if (iS == 5) {
            return zzj;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzk;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (x04.class) {
            try {
                o54Var = zzk;
                if (o54Var == null) {
                    o54Var = new o54(zzj);
                    zzk = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
