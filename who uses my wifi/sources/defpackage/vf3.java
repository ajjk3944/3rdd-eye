package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vf3 extends p54 {
    private static final vf3 zzx;
    private static volatile n64 zzy;
    private int zza;
    private int zzb;
    private boolean zze;
    private ag3 zzf;
    private boolean zzg;
    private cg3 zzj;
    private boolean zzv;
    private boolean zzw;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 200;
    private long zzl = 200;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;

    static {
        vf3 vf3Var = new vf3();
        zzx = vf3Var;
        p54.u(vf3.class, vf3Var);
    }

    public static uf3 U() {
        return (uf3) zzx.r();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zza |= 65536;
        this.zzv = z;
    }

    public final int B() {
        int i;
        int i2 = this.zzb;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? i2 != 3 ? 0 : 4 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final boolean D() {
        return this.zzc;
    }

    public final String E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final ag3 G() {
        ag3 ag3Var = this.zzf;
        return ag3Var == null ? ag3.F() : ag3Var;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final long J() {
        return this.zzi;
    }

    public final cg3 K() {
        cg3 cg3Var = this.zzj;
        return cg3Var == null ? cg3.F() : cg3Var;
    }

    public final long L() {
        return this.zzk;
    }

    public final long M() {
        return this.zzl;
    }

    public final long N() {
        return this.zzm;
    }

    public final String O() {
        return this.zzn;
    }

    public final String P() {
        return this.zzo;
    }

    public final long Q() {
        return this.zzp;
    }

    public final long R() {
        return this.zzu;
    }

    public final boolean S() {
        return this.zzv;
    }

    public final boolean T() {
        return this.zzw;
    }

    public final /* synthetic */ void V(boolean z) {
        this.zza |= 2;
        this.zzc = z;
    }

    public final /* synthetic */ void W(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void X(ag3 ag3Var) {
        this.zzf = ag3Var;
        this.zza |= 16;
    }

    public final /* synthetic */ void Y(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void a0(cg3 cg3Var) {
        this.zzj = cg3Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void b0(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzx, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011", new Object[]{"zza", "zzb", tq1.z, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw"});
        }
        if (iS == 3) {
            return new vf3();
        }
        if (iS == 4) {
            return new uf3(zzx);
        }
        if (iS == 5) {
            return zzx;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzy;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (vf3.class) {
            try {
                o54Var = zzy;
                if (o54Var == null) {
                    o54Var = new o54(zzx);
                    zzy = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
