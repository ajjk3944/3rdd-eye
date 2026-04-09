package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qq1 extends p54 {
    private static final qq1 zzj;
    private static volatile n64 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private yq1 zzg;
    private er1 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        qq1 qq1Var = new qq1();
        zzj = qq1Var;
        p54.u(qq1.class, qq1Var);
    }

    public static pq1 E() {
        return (pq1) zzj.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return this.zze;
    }

    public final yq1 C() {
        yq1 yq1Var = this.zzg;
        return yq1Var == null ? yq1.F() : yq1Var;
    }

    public final void D() {
        if (this.zzh == null) {
            int i = er1.a;
        }
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", tq1.b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iS == 3) {
            return new qq1();
        }
        if (iS == 4) {
            return new pq1(zzj);
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
        synchronized (qq1.class) {
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
