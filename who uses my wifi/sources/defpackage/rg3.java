package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rg3 extends p54 {
    private static final rg3 zzc;
    private static volatile n64 zzd;
    private int zza;
    private sq1 zzb;

    static {
        rg3 rg3Var = new rg3();
        zzc = rg3Var;
        p54.u(rg3.class, rg3Var);
    }

    public static qg3 A() {
        return (qg3) zzc.r();
    }

    public final /* synthetic */ void B(sq1 sq1Var) {
        this.zzb = sq1Var;
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
            return new r64(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iS == 3) {
            return new rg3();
        }
        if (iS == 4) {
            return new qg3(zzc);
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
        synchronized (rg3.class) {
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
