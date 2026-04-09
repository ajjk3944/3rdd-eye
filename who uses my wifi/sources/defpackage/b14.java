package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b14 extends p54 {
    private static final b14 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private f14 zzc;
    private a54 zzd = a54.g;

    static {
        b14 b14Var = new b14();
        zze = b14Var;
        p54.u(b14.class, b14Var);
    }

    public static b14 D(a54 a54Var, h54 h54Var) {
        return (b14) p54.m(zze, a54Var, h54Var);
    }

    public static a14 E() {
        return (a14) zze.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final f14 B() {
        f14 f14Var = this.zzc;
        return f14Var == null ? f14.C() : f14Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(f14 f14Var) {
        this.zzc = f14Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        this.zzd = a54Var;
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
            return new b14();
        }
        if (iS == 4) {
            return new a14(zze);
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
        synchronized (b14.class) {
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
