package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pr1 extends p54 {
    private static final pr1 zzj;
    private static volatile n64 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        pr1 pr1Var = new pr1();
        zzj = pr1Var;
        p54.u(pr1.class, pr1Var);
    }

    public static or1 A() {
        return (or1) zzj.r();
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iS == 3) {
            return new pr1();
        }
        if (iS == 4) {
            return new or1(zzj);
        }
        if (iS == 5) {
            return zzj;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzk;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (pr1.class) {
            try {
                o54Var = zzk;
                if (o54Var == null) {
                    o54Var = new o54(zzj);
                    zzk = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
