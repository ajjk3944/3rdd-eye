package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cg3 extends p54 {
    private static final cg3 zzi;
    private static volatile n64 zzj;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        cg3 cg3Var = new cg3();
        zzi = cg3Var;
        p54.u(cg3.class, cg3Var);
    }

    public static bg3 E() {
        return (bg3) zzi.r();
    }

    public static cg3 F() {
        return zzi;
    }

    public final boolean A() {
        return this.zzd;
    }

    public final long B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final long D() {
        return this.zzh;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iS == 3) {
            return new cg3();
        }
        if (iS == 4) {
            return new bg3(zzi);
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
        synchronized (cg3.class) {
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
