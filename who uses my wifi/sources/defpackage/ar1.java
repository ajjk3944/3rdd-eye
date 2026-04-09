package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ar1 extends p54 {
    private static final ar1 zzi;
    private static volatile n64 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        ar1 ar1Var = new ar1();
        zzi = ar1Var;
        p54.u(ar1.class, ar1Var);
    }

    public static zq1 A() {
        return (zq1) zzi.r();
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", tq1.e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iS == 3) {
            return new ar1();
        }
        if (iS == 4) {
            return new zq1(zzi);
        }
        if (iS == 5) {
            return zzi;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzj;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (ar1.class) {
            try {
                o54Var = zzj;
                if (o54Var == null) {
                    o54Var = new o54(zzi);
                    zzj = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
