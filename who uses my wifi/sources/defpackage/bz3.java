package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bz3 extends p54 {
    private static final bz3 zzb;
    private static volatile n64 zzc;
    private int zza;

    static {
        bz3 bz3Var = new bz3();
        zzb = bz3Var;
        p54.u(bz3.class, bz3Var);
    }

    public static bz3 B(a54 a54Var, h54 h54Var) {
        return (bz3) p54.m(zzb, a54Var, h54Var);
    }

    public static bz3 C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iS == 3) {
            return new bz3();
        }
        if (iS == 4) {
            return new jy1(zzb);
        }
        if (iS == 5) {
            return zzb;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzc;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (bz3.class) {
            try {
                o54Var = zzc;
                if (o54Var == null) {
                    o54Var = new o54(zzb);
                    zzc = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
