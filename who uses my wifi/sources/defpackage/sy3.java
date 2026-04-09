package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sy3 extends p54 {
    private static final sy3 zza;
    private static volatile n64 zzb;

    static {
        sy3 sy3Var = new sy3();
        zza = sy3Var;
        p54.u(sy3.class, sy3Var);
    }

    public static void A(a54 a54Var, h54 h54Var) {
    }

    public static sy3 B() {
        return zza;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zza, "\u0000\u0000", null);
        }
        if (iS == 3) {
            return new sy3();
        }
        if (iS == 4) {
            return new jy1(zza);
        }
        if (iS == 5) {
            return zza;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzb;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (sy3.class) {
            try {
                o54Var = zzb;
                if (o54Var == null) {
                    o54Var = new o54(zza);
                    zzb = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
