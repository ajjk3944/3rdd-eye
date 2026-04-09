package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g94 extends p54 {
    private static final g94 zzp;
    private static volatile n64 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private x54 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private x54 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        g94 g94Var = new g94();
        zzp = g94Var;
        p54.u(g94.class, g94Var);
    }

    public g94() {
        q64 q64Var = q64.j;
        this.zze = q64Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = q64Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", v74.t, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", f94.class, "zzc", "zzk", v74.s, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iS == 3) {
            return new g94();
        }
        if (iS == 4) {
            return new c84(zzp);
        }
        if (iS == 5) {
            return zzp;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzu;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (g94.class) {
            try {
                o54Var = zzu;
                if (o54Var == null) {
                    o54Var = new o54(zzp);
                    zzu = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
