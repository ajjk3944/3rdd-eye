package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nx3 extends p54 {
    private static final nx3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private a54 zzc = a54.g;
    private rx3 zzd;

    static {
        nx3 nx3Var = new nx3();
        zze = nx3Var;
        p54.u(nx3.class, nx3Var);
    }

    public static nx3 D(a54 a54Var, h54 h54Var) {
        return (nx3) p54.m(zze, a54Var, h54Var);
    }

    public static mx3 E() {
        return (mx3) zze.r();
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

    public final rx3 C() {
        rx3 rx3Var = this.zzd;
        return rx3Var == null ? rx3.C() : rx3Var;
    }

    public final /* synthetic */ void G(a54 a54Var) {
        this.zzc = a54Var;
    }

    public final /* synthetic */ void H(rx3 rx3Var) {
        this.zzd = rx3Var;
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
            return new nx3();
        }
        if (iS == 4) {
            return new mx3(zze);
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
        synchronized (nx3.class) {
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
