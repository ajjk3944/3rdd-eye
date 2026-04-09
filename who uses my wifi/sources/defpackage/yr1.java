package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yr1 extends p54 {
    private static final yr1 zzh;
    private static volatile n64 zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        yr1 yr1Var = new yr1();
        zzh = yr1Var;
        p54.u(yr1.class, yr1Var);
    }

    public static xr1 A() {
        return (xr1) zzh.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void G(long j) {
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
            return new r64(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iS == 3) {
            return new yr1();
        }
        if (iS == 4) {
            return new xr1(zzh);
        }
        if (iS == 5) {
            return zzh;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzi;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (yr1.class) {
            try {
                o54Var = zzi;
                if (o54Var == null) {
                    o54Var = new o54(zzh);
                    zzi = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
