package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s74 extends p54 {
    private static final s74 zzd;
    private static volatile n64 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        s74 s74Var = new s74();
        zzd = s74Var;
        p54.u(s74.class, s74Var);
    }

    public static r74 A() {
        return (r74) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void C(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zzc = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iS == 3) {
            return new s74();
        }
        if (iS == 4) {
            return new r74(zzd);
        }
        if (iS == 5) {
            return zzd;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zze;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (s74.class) {
            try {
                o54Var = zze;
                if (o54Var == null) {
                    o54Var = new o54(zzd);
                    zze = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
