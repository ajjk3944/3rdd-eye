package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hx1 extends p54 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final hx1 zzf;
    private static volatile n64 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        hx1 hx1Var = new hx1();
        zzf = hx1Var;
        p54.u(hx1.class, hx1Var);
    }

    public static gx1 A() {
        return (gx1) zzf.r();
    }

    public final void B(int i) {
        this.zzd = ex0.s(i);
        this.zzc |= 1;
    }

    public final void C(int i) {
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i2 = 2;
            }
        }
        this.zze = i2;
        this.zzc |= 2;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", tq1.q, "zze", tq1.p});
        }
        if (iS == 3) {
            return new hx1();
        }
        if (iS == 4) {
            return new gx1(zzf);
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
        synchronized (hx1.class) {
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
