package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t04 extends p54 {
    private static final t04 zze;
    private static volatile n64 zzf;
    private int zza;
    private v04 zzb;
    private int zzc;
    private a54 zzd = a54.g;

    static {
        t04 t04Var = new t04();
        zze = t04Var;
        p54.u(t04.class, t04Var);
    }

    public static t04 D(a54 a54Var, h54 h54Var) {
        return (t04) p54.m(zze, a54Var, h54Var);
    }

    public static s04 E() {
        return (s04) zze.r();
    }

    public final v04 A() {
        v04 v04Var = this.zzb;
        return v04Var == null ? v04.E() : v04Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(v04 v04Var) {
        this.zzb = v04Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
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
            return new r64(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new t04();
        }
        if (iS == 4) {
            return new s04(zze);
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
        synchronized (t04.class) {
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
