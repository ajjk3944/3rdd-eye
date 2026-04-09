package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l04 extends p54 {
    private static final l04 zze;
    private static volatile n64 zzf;
    private int zza;
    private n04 zzb;
    private int zzc;
    private a54 zzd = a54.g;

    static {
        l04 l04Var = new l04();
        zze = l04Var;
        p54.u(l04.class, l04Var);
    }

    public static l04 D(a54 a54Var, h54 h54Var) {
        return (l04) p54.m(zze, a54Var, h54Var);
    }

    public static k04 E() {
        return (k04) zze.r();
    }

    public final n04 A() {
        n04 n04Var = this.zzb;
        return n04Var == null ? n04.C() : n04Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(n04 n04Var) {
        this.zzb = n04Var;
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
            return new l04();
        }
        if (iS == 4) {
            return new k04(zze);
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
        synchronized (l04.class) {
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
