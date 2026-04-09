package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k94 extends p54 {
    private static final k94 zzn;
    private static volatile n64 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private m94 zzk;
    private j94 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        k94 k94Var = new k94();
        zzn = k94Var;
        p54.u(k94.class, k94Var);
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", v74.w, "zze", v74.v, "zzf", "zzg", "zzh", "zzi", "zzj", v74.u, "zzk", "zzl", "zzm"});
        }
        if (iS == 3) {
            return new k94();
        }
        if (iS == 4) {
            return new c84(zzn);
        }
        if (iS == 5) {
            return zzn;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzo;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (k94.class) {
            try {
                o54Var = zzo;
                if (o54Var == null) {
                    o54Var = new o54(zzn);
                    zzo = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
