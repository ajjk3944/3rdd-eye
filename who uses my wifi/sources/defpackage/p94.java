package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p94 extends p54 {
    private static final p94 zzj;
    private static volatile n64 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private x54 zzd;
    private x54 zze;
    private x54 zzf;
    private int zzg;
    private i94 zzh;
    private String zzi;

    static {
        p94 p94Var = new p94();
        zzj = p94Var;
        p54.u(p94.class, p94Var);
    }

    public p94() {
        q64 q64Var = q64.j;
        this.zzd = q64Var;
        this.zze = q64Var;
        this.zzf = q64Var;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", k94.class, "zze", n94.class, "zzg", "zzb", "zzf", s94.class, "zzi", "zzh"});
        }
        if (iS == 3) {
            return new p94();
        }
        if (iS == 4) {
            return new c84(zzj);
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
        synchronized (p94.class) {
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
