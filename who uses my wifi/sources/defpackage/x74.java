package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x74 extends p54 {
    private static final x74 zzy;
    private static volatile n64 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private x54 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private x54 zzo;
    private boolean zzp;
    private long zzu;
    private t54 zzv;
    private boolean zzw;
    private t54 zzx;

    static {
        x74 x74Var = new x74();
        zzy = x74Var;
        p54.u(x74.class, x74Var);
    }

    public x74() {
        q64 q64Var = q64.j;
        this.zze = q64Var;
        this.zzj = "";
        this.zzo = q64Var;
        q54 q54Var = q54.j;
        this.zzv = q54Var;
        this.zzx = q54Var;
    }

    @Override // defpackage.p54
    public final Object w(int i, p54 p54Var) {
        n64 o54Var;
        int iS = ex0.s(i);
        if (iS == 0) {
            return (byte) 1;
        }
        if (iS == 2) {
            return new r64(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", v74.e, "zzc", "zzd", "zze", "zzf", v74.c, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", w74.class, "zzp", "zzu", "zzv", tq1.E, "zzw", "zzx", v74.d});
        }
        if (iS == 3) {
            return new x74();
        }
        if (iS == 4) {
            return new jy1(zzy);
        }
        if (iS == 5) {
            return zzy;
        }
        if (iS != 6) {
            throw null;
        }
        n64 n64Var = zzz;
        if (n64Var != null) {
            return n64Var;
        }
        synchronized (x74.class) {
            try {
                o54Var = zzz;
                if (o54Var == null) {
                    o54Var = new o54(zzy);
                    zzz = o54Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }
}
