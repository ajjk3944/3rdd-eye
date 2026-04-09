package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q74 extends p54 {
    private static final q74 zzc;
    private static volatile n64 zzd;
    private t54 zza;
    private t54 zzb;

    static {
        q74 q74Var = new q74();
        zzc = q74Var;
        p54.u(q74.class, q74Var);
    }

    public q74() {
        q54 q54Var = q54.j;
        this.zza = q54Var;
        this.zzb = q54Var;
    }

    public static q74 A(byte[] bArr, h54 h54Var) {
        return (q74) p54.n(zzc, bArr, h54Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new q74();
        }
        if (iS == 4) {
            return new jy1(zzc);
        }
        if (iS == 5) {
            return zzc;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzd;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (q74.class) {
            try {
                o54Var = zzd;
                if (o54Var == null) {
                    o54Var = new o54(zzc);
                    zzd = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
