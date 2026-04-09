package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kz3 extends p54 {
    private static final kz3 zze;
    private static volatile n64 zzf;
    private int zza;
    private mz3 zzb;
    private int zzc;
    private int zzd;

    static {
        kz3 kz3Var = new kz3();
        zze = kz3Var;
        p54.u(kz3.class, kz3Var);
    }

    public static kz3 D(a54 a54Var, h54 h54Var) {
        return (kz3) p54.m(zze, a54Var, h54Var);
    }

    public static jz3 E() {
        return (jz3) zze.r();
    }

    public static kz3 F() {
        return zze;
    }

    public final mz3 A() {
        mz3 mz3Var = this.zzb;
        return mz3Var == null ? mz3.D() : mz3Var;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(mz3 mz3Var) {
        this.zzb = mz3Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iS == 3) {
            return new kz3();
        }
        if (iS == 4) {
            return new jz3(zze);
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
        synchronized (kz3.class) {
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
