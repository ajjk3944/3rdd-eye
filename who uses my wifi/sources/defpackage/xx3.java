package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xx3 extends p54 {
    private static final xx3 zze;
    private static volatile n64 zzf;
    private int zza;
    private int zzb;
    private by3 zzc;
    private a54 zzd = a54.g;

    static {
        xx3 xx3Var = new xx3();
        zze = xx3Var;
        p54.u(xx3.class, xx3Var);
    }

    public static wx3 D() {
        return (wx3) zze.r();
    }

    public static xx3 E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final by3 B() {
        by3 by3Var = this.zzc;
        return by3Var == null ? by3.C() : by3Var;
    }

    public final a54 C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(by3 by3Var) {
        this.zzc = by3Var;
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
            return new xx3();
        }
        if (iS == 4) {
            return new wx3(zze);
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
        synchronized (xx3.class) {
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
