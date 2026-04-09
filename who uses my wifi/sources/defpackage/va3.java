package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class va3 extends p54 {
    private static final va3 zzb;
    private static volatile n64 zzc;
    private x54 zza = q64.j;

    static {
        va3 va3Var = new va3();
        zzb = va3Var;
        p54.u(va3.class, va3Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", ua3.class});
        }
        if (iS == 3) {
            return new va3();
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
        synchronized (va3.class) {
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
